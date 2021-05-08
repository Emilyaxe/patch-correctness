package service;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSONObject;

import config.Constant;
import entity.Method;
import entity.Patch;
import entity.Subject;
import lombok.extern.slf4j.Slf4j;
import util.FileIO;

@Slf4j
public class ProcessPatch {

    private static String obtainOneFixedFile(String line, String prefix){
        String fixedFile = "";
        if (line.trim().startsWith(prefix)) {
            fixedFile = Arrays.stream(line.split("\\.java")[0].split("/"))
                    .filter(StringUtils::isNotBlank).skip(1)
                    .collect(Collectors.joining("/", "/", ".java"));
        } else if(line.trim().startsWith("a")){
            fixedFile = line.trim().split("\\.java")[0].split("a", 2)[1] + ".java";
        } else {
            fixedFile = line.trim().split("\\.java")[0] + ".java";
        }
        return fixedFile;
    }
    public static Map<String, String> recordChanges4AllFiles(Patch patch, boolean reverse) {
        String constant = FileIO.readFileToString(patch.getPatchPath());
        String[] diffFiles = constant.split("---");
        Map<String, String> patchRecord = new LinkedHashMap<>();

        for (String diffFile : diffFiles) {
            String prefix = patch.getBugid().replaceAll("-", "");
            String oneFixedFile = obtainOneFixedFile(diffFile.split("\n")[0], prefix);
            String[] diffParagraphs = diffFile.split("@@ -");
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
                patchRecord.put(oneFixedFile + Constant.LINENUMBER_SEGMENT + lineNumber, patchInfo);
            }
        }
        return patchRecord;
    }

    public static void createCombinedBuggy4AllFiles( Patch patch, boolean reverse) {
        Map<String, String> patchMap = recordChanges4AllFiles(patch, reverse);

        Map<String, Set<Integer>> fileLineMap = patchMap.keySet().stream().filter(Objects::nonNull)
                .collect(Collectors.groupingBy(line->line.split("#")[0],
                        Collectors.mapping(line-> Integer.parseInt(line.split("#")[1]), Collectors.toSet())));
        for(Entry<String, Set<Integer>> entry : fileLineMap.entrySet()) {
            String fixedFile = Constant.PROJECT_HOME + entry.getKey();
            FileIO.backupFile(fixedFile);

            String fixedContent = FileIO.readFileToString(fixedFile);
            String[] contentArray = fixedContent.split("\n");
            StringBuilder result = new StringBuilder();
            int index = 0;
            while (index < contentArray.length) {
                if(!entry.getValue().contains(index+1)){
                    result.append(contentArray[index]).append("\n");
                    ++index;
                    continue;
                }
                String line = entry.getKey() + "#" + (index+1);

                String patchContent = patchMap.get(line);
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

    }
    public static int getOneChangeLine(Subject subject, Patch patch, boolean reverse){

        int result = 0;
        int bugid = 0;
            String name = subject.get_name();
            String id = String.valueOf(subject.get_id());
            if (name.equals("Closure") && (id.equals("63") || id.equals("93"))) {
                // patchid = patchid + entry.getValue().size();
                bugid = Integer.parseInt(id) - 1;
            } else {
                bugid = Integer.parseInt(id);
            }

            String subjectPath = Constant.PROJECT_HOME + "/" + name + "/" + name + bugid;
                Patch.initFixedFileAndChanges(patch);
                if (patch.isDeleteAll()) {
                    return result;
                }

                String fixedFile = subjectPath + patch.getFixedFile().trim(); //  already in combined version
                List<Method> methodList = Patch.getMethodInfoByraverse(fixedFile, subject);

                for (Integer lnumber : patch.getChangeLines()) {
                    Method findMethod = methodList.stream().filter(Objects::nonNull).filter(method ->
                            lnumber >= method.get_startLine() && lnumber <= method.get_endLine()).findAny()
                            .orElse(null);

                    if (Objects.isNull(findMethod)) {
                        continue;
                    }
                     return lnumber;
                }
                if((patch.getPatchName().equals("Math_104.src.patch") )
                        || (patch.getPatchName().equals("Math_12.src.patch") )){
                    return result;
                }else if((patch.getPatchName().equals("Lang_56.src.patch")  )
                        || (patch.getPatchName().equals("Closure_28.src.patch") )){
                    return result;
                }
                if (StringUtils.isEmpty(patch.getCombinedMethod())) {
                    log.error("Patch {} obtain method failed ", patch.getPatchPath());
                }
                return result;
    }

    public static void createCombinedFixed4AllFiles( Patch patch, boolean reverse) {
        Map<String, String> patchMap = recordChanges4AllFiles(patch, reverse);

        Map<String, Set<Integer>> fileLineMap = patchMap.keySet().stream().filter(Objects::nonNull)
                .collect(Collectors.groupingBy(line->line.split("#")[0],
                        Collectors.mapping(line-> Integer.parseInt(line.split("#")[1]), Collectors.toSet())));
        for(Entry<String, Set<Integer>> entry : fileLineMap.entrySet()) {
            String fixedFile = Constant.PROJECT_HOME + entry.getKey();
            FileIO.backupFile(fixedFile);

            String fixedContent = FileIO.readFileToString(fixedFile);
            String[] contentArray = fixedContent.split("\n");
            StringBuilder result = new StringBuilder();
            int index = 0;
            while (index < contentArray.length) {
                if(!entry.getValue().contains(index+1)){
                    result.append(contentArray[index]).append("\n");
                    ++index;
                    continue;
                }
                String line = entry.getKey() + "#" + (index+1);

                String patchContent = patchMap.get(line);
                String[] patchArray = patchContent.split("\n");
                for (String patchLine : patchArray) {
                    if(patchLine.startsWith("-")){
                        result.append("//").append(contentArray[index]).append("\n");
                        ++index;
                    }else if (patchLine.startsWith("+")) {
                        result.append(patchLine.split("\\+")[1]).append("\n");
                    } else {
                        result.append(contentArray[index]).append("\n");
                        ++index;
                    }
                }
            }
            FileIO.writeStringToFile(fixedFile, result.toString());
        }
    }

    public static void main(String[] args) {

    }
}
