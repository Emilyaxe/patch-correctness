package entity;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import config.Constant;
import instrument.MethodLinesVisitor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import util.BuildPath;
import util.FileIO;

@Slf4j
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Patch {

    private Integer id;
    private String lable;
    private String tool;
    private String bugid;
    private String patchName;
    private String content;
    private String patchPath;
    private String combinedMethod;
    private String fixedFile;
    private boolean deleteAll = false;
    private Set<Integer> changeLines;
    private String correctness;

    // for instrument in methods
    private Set<String> changeLines4All;
    private Set<String> fixedFiles4All;
    private Integer fixedMethodStartLine;

    public static void initFixedFileAndChanges(Patch patch) {
        String constant = FileIO.readFileToString(patch.getPatchPath());
        String[] diffFiles = constant.split("---");
        String diffFile = diffFiles[1];
        String[] diffParagraphs = diffFile.split("@@ -");
        String firstParagraphs = diffParagraphs[0];
        String[] lines = firstParagraphs.split("\n");
        String prefix = patch.getBugid().replaceAll("-", "");
        if (lines[0].trim().startsWith(prefix)) {
            String fixedFile = Arrays.stream(lines[0].split("\\.java")[0].split("/"))
                    .filter(StringUtils::isNotBlank).skip(1)
                    .collect(Collectors.joining("/", "/", ".java"));
            patch.setFixedFile(fixedFile);
        } else if(lines[0].trim().startsWith("a")){
            String fixedfile = lines[0].trim().split("\\.java")[0].split("a", 2)[1] + ".java";
            patch.setFixedFile(fixedfile);
        } else {
            lines[0] = lines[0].trim().split("\\.java")[0] + ".java";
            patch.setFixedFile(lines[0].startsWith("/") ? lines[0] : "/" + lines[0]);
        }
        patch.setChangeLines(new LinkedHashSet<>());
        for (int i = 1; i < diffParagraphs.length; i++) {
            String diffParagraph = diffParagraphs[i];
            lines = diffParagraph.split("\n");
            int lineNumber = Integer.parseInt(lines[0].split(",")[0]);
            int addLineNumber = Integer.parseInt(lines[0].split("\\+")[1].split(",")[0]);
            if (lineNumber == 1 && addLineNumber == 0) {
                patch.setDeleteAll(true);
            }
            for (int j = 1; j < lines.length; j++) {
                String line = lines[j];
                if (line.startsWith("+")) {
                    patch.getChangeLines().add(lineNumber);
                } else if (line.startsWith("-")) {
                    patch.getChangeLines().add(lineNumber);
                    lineNumber++;
                } else {
                    lineNumber++;
                }
            }
        }
    }

    public static Map<Integer, String> recordChanges(Patch patch, boolean reverse) {
        String constant = FileIO.readFileToString(patch.getPatchPath());
        String[] diffFiles = constant.split("---");
        String diffFile = diffFiles[1];
        String[] diffParagraphs = diffFile.split("@@ -");

        Map<Integer, String> patchRecord = new LinkedHashMap<>();
        for (int i = 1; i < diffParagraphs.length; i++) {
            String diffParagraph = diffParagraphs[i];
            String[] lines = diffParagraph.split("\n");
            String patchInfo;
            int lineNumber = Integer.parseInt(lines[0].split(",")[0]);
            patchInfo = diffParagraph.split("\n", 2)[1];
            if (reverse) {
                lineNumber = Integer.parseInt(lines[0].split(",")[1].split("\\+")[1]);
                String[] patchArray = patchInfo.split("\n");
                StringBuilder result = new StringBuilder();
                for (String patchLine : patchArray) {
                    if (patchLine.startsWith("-")) {
                        result.append("+").append(patchLine.substring(1));
                    } else if (patchLine.startsWith("+")) {
                        result.append("-").append(patchLine.substring(1));
                    } else {
                        result.append(patchLine);
                    }
                }
                patchInfo = result.toString();
            }
            patchRecord.put(lineNumber, patchInfo);
        }
        return patchRecord;
    }

    public static void findMethods(Map<String, List<Patch>> subjectPatchMap, String methodOutPutDir, boolean reverse) {
        List<JSONObject> resultList = new LinkedList<>();
        int patchid = 0;
        Map<String, List<String>> nameValueMap = new LinkedHashMap<>();
        for (Entry<String, List<Patch>> entry : subjectPatchMap.entrySet()) {

            String name = entry.getKey().split("-")[0];
            String id = entry.getKey().split("-")[1];
            Subject subject = new Subject(name, Integer.parseInt(id));
            String subjectPath = Constant.PROJECT_HOME + "/" + name + "/" + name + id;

            for (Patch patch : entry.getValue()) {
                patchid++;
                //log.info("{} Process patch {}", patchid, patch.getPatchPath());
//                if(! patch.getPatchName().equals("Chart25b_Patch92")){
//                    continue;
//                }

                initFixedFileAndChanges(patch);
                if (patch.isDeleteAll()) {
                    patch.setCombinedMethod(constructMethod("deleteAllFile"));
                    List<String> tmpList = new LinkedList<>();
                    tmpList.add(patch.getLable());
                    tmpList.add(patch.getCombinedMethod());
                    nameValueMap.put(patch.getPatchName(), tmpList);
                    continue;
                }

                String fixedFile = subjectPath + patch.getFixedFile().trim();
                FileIO.backupFile(fixedFile);

                createCombinedBuggyFiles(fixedFile, patch, reverse);

                List<Method> methodList = getMethodInfoByraverse(fixedFile, subject);

                for (Integer lnumber : patch.getChangeLines()) {
                    Method findMethod = methodList.stream().filter(Objects::nonNull).filter(method ->
                            lnumber >= method.get_startLine() && lnumber <= method.get_endLine()).findAny()
                            .orElse(null);

                    if (Objects.isNull(findMethod)) {
                        continue;
                    }
                    String combinedMethod =
                            getMethodContent(fixedFile, findMethod.get_startLine(), findMethod.get_endLine(), patch, reverse);

                    patch.setFixedMethodStartLine(lnumber);
                    patch.setCombinedMethod(findMethod.get_startLine() == lnumber ? constructMethod("deleteAllMethod") : combinedMethod);
                    break;
                }
                if((patch.getPatchName().equals("Math_104.src.patch")  )
                        || (patch.getPatchName().equals("Math_12.src.patch") )){
                    patch.setCombinedMethod(constructMethod("fixedField"));
                }else if((patch.getPatchName().equals("Lang_56.src.patch") )
                        || (patch.getPatchName().equals("Closure_28.src.patch") )){
                    patch.setCombinedMethod(constructMethod("addAMethod"));
                }
                if (!StringUtils.isEmpty(patch.getCombinedMethod())) {
                    List<String> tmpList = new LinkedList<>();
                    tmpList.add(patch.getLable());
                    tmpList.add(patch.getCombinedMethod());
                    nameValueMap.put(patch.getPatchName(), tmpList);
//                    JSONObject patchMethodJson =
//                            (JSONObject) JSON.toJSON(Patch.builder().patchName(patch.getPatchName()).lable(patch.getLable())
//                                    .combinedMethod(patch.getCombinedMethod()).build());
                            //new JSONObject();
                    //patchMethodJson.put(patch.getPatchName(), patch.getCombinedMethod());
                   // resultList.add(patchMethodJson);
                }  else {
                    log.error("Patch {} obtain method failed ", patch.getPatchPath());
                }
            }
        }
        log.info("JsonMap size: {}", nameValueMap.size());
        FileIO.writeStringToFile(BuildPath.buildMethodReFile(methodOutPutDir), JSON.toJSONString(nameValueMap));
//        log.info("JsonList size: {}", resultList.size());
//        FileIO.writeStringToFile(BuildPath.buildMethodReFile(methodOutPutDir), JSON.toJSONString(resultList));
    }

    public static List<Method> getMethodInfoByraverse(String fixedFile, Subject subject) {
        MethodLinesVisitor methodVisitor = new MethodLinesVisitor();
        CompilationUnit compilationUnit = FileIO.genASTFromSource(FileIO.readFileToString(fixedFile),
                ASTParser.K_COMPILATION_UNIT);
        compilationUnit.accept(methodVisitor);
        return methodVisitor.getMethodList();
    }

    public static void createCombinedBuggyFiles(String fixedFile, Patch patch, boolean reverse) {
        String fixedContent = FileIO.readFileToString(fixedFile);
        Map<Integer, String> patchMap = recordChanges(patch, reverse);
        String[] contentArray = fixedContent.split("\n");
        StringBuilder result = new StringBuilder();
        int index = 0;
        while (index < contentArray.length) {
            if (!patchMap.containsKey(index + 1)) {
                result.append(contentArray[index]).append("\n");
                ++index;
                continue;
            }
            String patchContent = patchMap.get(index + 1);
            String[] patchArray = patchContent.split("\n");
            for (String patchLine : patchArray) {
                if (patchLine.startsWith("+")) {
                    result.append("//").append(patchLine).append("\n");
                } else {
                    result.append(contentArray[index]).append("\n");
                    ++index;
                }
            }
        }
        FileIO.writeStringToFile(fixedFile, result.toString());
    }

    public static String getMethodContent(String fixedFile, Integer startLine, Integer endLine,
            Patch patch, boolean reverse) {
        StringBuilder method = new StringBuilder();
        FileIO.backupFile(fixedFile);
        String fixedContent = FileIO.readFileToString(fixedFile);
        Map<Integer, String> patchMap = recordChanges(patch, reverse);
        String[] contentArray = fixedContent.split("\n");
        StringBuilder result = new StringBuilder();
        int index = 0;
        while (index < contentArray.length) {
            if (!patchMap.containsKey(index + 1)) {
                result.append(contentArray[index]).append("\n");
                ++index;
                continue;
            }
            String patchContent = patchMap.get(index + 1);
            String[] patchArray = patchContent.split("\n");
            for (String patchLine : patchArray) {
                if (patchLine.startsWith("+")) {
                    result.append(patchLine).append("\n");
                } else if (patchLine.startsWith("-")) {
                    result.append(patchLine).append("\n");
                    ++index;
                } else {
                    result.append(contentArray[index]).append("\n");
                    ++index;
                }
            }
        }

        String[] content = result.toString().split("\n");
        for (int i = startLine; i <= endLine; i++) {
            method.append(content[i - 1]).append("\n");
        }
        // corner case: add } in last line
        if(content[endLine].startsWith("+")){
            method.append(content[endLine]).append("\n");
        }
        return method.toString();
    }
    private static String constructMethod(String argu){
        String dummyMethod = "public static void dummyMethod(){\n"
                + "        String info = \"%s\";\n"
                + "}";
        return String.format(dummyMethod, argu);
    }

    public static void main(String[] args) {
        String patchFile =
                "/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/Patches/experiment3"
                        + "/TestSet/Patch5";
        Patch patch = Patch.builder().patchPath(patchFile).patchName("Chart5").build();
        Map<Integer, String> map = recordChanges(patch, false);
        //patch4Test.recordChangeLines();
        log.info("" + patch.getChangeLines().size());
    }
}
