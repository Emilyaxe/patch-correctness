package main;


import java.io.File;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import config.Constant;
import entity.Method;
import entity.Patch4Train;
import entity.Subject;
import instrument.MethodLinesVisitor;
import lombok.extern.slf4j.Slf4j;
import util.BuildPath;
import util.FileIO;

@Slf4j
public class ObtainMethods4All {

    public static Map<String, List<Patch4Train>> readPatches(File patchDir) {

        Map<String, List<Patch4Train>> subjectPatchMap = new LinkedHashMap<>();

        for (File patchFile : patchDir.listFiles()) {
            if (!patchFile.getName().endsWith(".txt")) {
                log.info("ignore file {}", patchFile.getName());
                continue;
            }
            String[] name = patchFile.getName().split("_");
            String subStr = name[1];
            Patch4Train patch = new Patch4Train(patchFile.getAbsolutePath(), patchFile.getName());

            if (subjectPatchMap.containsKey(subStr)) {
                subjectPatchMap.get(subStr).add(patch);
            } else {
                List<Patch4Train> list = new LinkedList<>();
                list.add(patch);
                subjectPatchMap.put(subStr, list);
            }
        }

        log.info("Totol Subject {}", subjectPatchMap.size());
        int size = 0;
        for (List<Patch4Train> patches : subjectPatchMap.values()) {
            size = size + patches.size();
        }
        log.info("Total Patches {}", size);
        return subjectPatchMap;
    }

    public static void findMethods(Map<String, List<Patch4Train>> subjectPatchMap, String label) {
        List<JSONObject> resultList = new LinkedList<>();
        int patchid = 0;
        for (Entry<String, List<Patch4Train>> entry : subjectPatchMap.entrySet()) {

            String name = entry.getKey().split("-")[0];
            String id = entry.getKey().split("-")[1];

            if (name.equals("Lang") && id.equals("2")) {
                patchid = patchid + entry.getValue().size();
                log.warn("patch -- {}", entry.getValue().size());
                continue;
            }
            if (name.equals("Time") && id.equals("21")) {
                patchid = patchid + entry.getValue().size();
                log.warn("patch -- {}", entry.getValue().size());
                continue;
            }
            int bugid = 0;
            if (name.equals("Closure") && (id.equals("63") || id.equals("93"))) {
                // patchid = patchid + entry.getValue().size();
                bugid = Integer.parseInt(id) - 1;
            } else {
                bugid = Integer.parseInt(id);
            }

            Subject subject = new Subject(name, bugid);
            String subjectPath = Constant.PROJECT_HOME + "/" + name + "/" + name + bugid;

            for (Patch4Train patch : entry.getValue()) {
                patchid++;
                //log.info("{} Process patch {}", patchid, patch.getPatchPath());
                if (!patch.getPatchName().equals("ACS_Math-3_C_Patch_1_1.txt")) {
                    continue;
                }

                patch.initFixedFileAndChanges();
                if (patch.isDeleteAll()) {
                    patch.setCombinedMethod("deleteAllFile");
                    JSONObject patchMethodJson = new JSONObject();
                    patchMethodJson.put(patch.getPatchName(), patch.getCombinedMethod());
                    resultList.add(patchMethodJson);
                    continue;
                }

                String fixedFile = subjectPath + patch.getFixedFile().trim();
                FileIO.backupFile(fixedFile);

                createCombinedBuggyFiles(fixedFile, patch);

                List<Method> methodList = getMethodInfoByraverse(fixedFile, subject);
                for (Integer lnumber : patch.getChangeLines()) {
                    Method findMethod = methodList.stream().filter(Objects::nonNull).filter(method ->
                            lnumber >= method.get_startLine() && lnumber <= method.get_endLine()).findAny()
                            .orElse(null);

                    if (Objects.isNull(findMethod)) {
                        //log.error("Patch {} obtain methods failed", patch.getPatchName());
                        continue;
                    }
                    String combinedMethod =
                            getMethodContent(fixedFile, findMethod.get_startLine(), findMethod.get_endLine(), patch);
                    patch.setCombinedMethod(findMethod.get_startLine() == lnumber ? "deleteAllMethod" : combinedMethod);
                    break;
                }
                if (!StringUtils.isEmpty(patch.getCombinedMethod())) {
                    JSONObject patchMethodJson = new JSONObject();
                    patchMethodJson.put(patch.getPatchName(), patch.getCombinedMethod());
                    resultList.add(patchMethodJson);
                } else {
                    log.error("Patch {} obtain method failed ", patch.getPatchPath());
                }
            }
        }
        log.info("JsonList size: {}", resultList.size());
        FileIO.writeStringToFile(BuildPath.buildMethodReFile(label), JSON.toJSONString(resultList));

    }

    public static List<Method> getMethodInfoByraverse(String fixedFile, Subject subject) {
        MethodLinesVisitor methodVisitor = new MethodLinesVisitor();
        CompilationUnit compilationUnit = FileIO.genASTFromSource(FileIO.readFileToString(fixedFile),
                ASTParser.K_COMPILATION_UNIT);
        compilationUnit.accept(methodVisitor);
        return methodVisitor.getMethodList();
    }

    public static String getMethodContent(String fixedFile, Integer startLine, Integer endLine,
            Patch4Train patch4Train) {
        StringBuilder method = new StringBuilder();

        FileIO.backupFile(fixedFile);
        String fixedContent = FileIO.readFileToString(fixedFile);
        Map<Integer, String> patchMap = patch4Train.recordChanges();
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
            for (String patch : patchArray) {
                if (patch.startsWith("+")) {
                    result.append(patch).append("\n");
                } else if (patch.startsWith("-")) {
                    result.append(patch).append("\n");
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
        return method.toString();
    }

    public static void createCombinedBuggyFiles(String fixedFile, Patch4Train patch4Train) {
        String fixedContent = FileIO.readFileToString(fixedFile);
        Map<Integer, String> patchMap = patch4Train.recordChanges();
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
            for (String patch : patchArray) {
                if (patch.startsWith("+")) {
                    result.append("//").append(patch).append("\n");
                } else {
                    result.append(contentArray[index]).append("\n");
                    ++index;
                }
            }
        }
        FileIO.writeStringToFile(fixedFile, result.toString());
    }


    public static void main(String[] args) {
        String patchDir =
                "/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/Patches/experiment3"
                        + "/TrainingSet";
        Map<String, List<Patch4Train>> subjectPatchMap = readPatches(new File(patchDir));
        findMethods(subjectPatchMap, "trainingSet");
    }
}
