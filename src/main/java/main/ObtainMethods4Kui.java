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
import entity.Patch4Kui;
import entity.Subject;
import instrument.MethodLinesVisitor;
import lombok.extern.slf4j.Slf4j;
import run.Runner;
import util.BuildPath;
import util.FileIO;

@Slf4j
public class ObtainMethods4Kui {

    public static Map<String, List<Patch4Kui>> readPatches(File patchDir) {

        Map<String, List<Patch4Kui>> subjectPatchMap = new LinkedHashMap<>();
        for (File patchFile : patchDir.listFiles()) {
            if (!patchFile.getName().endsWith("txt")) {
                continue;
            }
            String[] name = patchFile.getName().split("_");
            String subStr = name[1];
            String lable = name[2];
            Patch4Kui patch = new Patch4Kui(patchFile.getAbsolutePath());
            patch.setPatchName(patchFile.getName());
            patch.setLable(lable);
            //patch.recordChangeLines();

            if (subjectPatchMap.containsKey(subStr)) {
                subjectPatchMap.get(subStr).add(patch);
            } else {
                List<Patch4Kui> list = new LinkedList<>();
                list.add(patch);
                subjectPatchMap.put(subStr, list);
            }
        }

        log.info("Totol Subject {}", subjectPatchMap.size());
        int size = 0;
        for (List<Patch4Kui> patches : subjectPatchMap.values()) {
            size = size + patches.size();
        }
        log.info("Total Patches {}", size);
        return subjectPatchMap;
    }

    public static List<Method> getMethodInfoByraverse(String fixedFile, Subject subject) {
        List<Method> methodList;

        MethodLinesVisitor methodVisitor = new MethodLinesVisitor();
        CompilationUnit compilationUnit = FileIO.genASTFromSource(FileIO.readFileToString(fixedFile),
                ASTParser.K_COMPILATION_UNIT);
        compilationUnit.accept(methodVisitor);
        methodList = methodVisitor.getMethodList();
        return methodList;
    }

    public static String getMethodContent(String fixedFile, Integer startLine, Integer endLine) {
        StringBuilder result = new StringBuilder();
        String[] content = FileIO.readFileToString(fixedFile).split("\n");
        for (int i = startLine; i <= endLine; i++) {
            result.append(content[i - 1]).append("\n");
        }
        return result.toString();
    }

    public static void findMethods(Map<String, List<Patch4Kui>> subjectPatchMap, String label) {
        // patches that remove a method
        //        String patches[] = {"patch1-Chart-25-TBar-plausible.patch", "patch1-Chart-25-AVATAR-plausible.patch",
        //                "patch1-Chart-15-TBar-plausible.patch", "patch1-Chart-15-AVATAR-plausible.patch",
        //                "patch1-Lang-13-TBar-plausible.patch",
        //                "patch1-Lang-13-AVATAR-plausible.patch"};
        List<JSONObject> resultList = new LinkedList<>();
        int patchid = 0;
        for (Entry<String, List<Patch4Kui>> entry : subjectPatchMap.entrySet()) {

            String name = entry.getKey().split("-")[0];
            String id = entry.getKey().split("-")[1];
            if (name.equals("Closure") && (id.equals("63") || id.equals("93"))) {
                patchid = patchid + entry.getValue().size();
                log.warn("patch --");
                continue;
            }
            if (name.equals("Lang") && id.equals("2")) {
                patchid = patchid + entry.getValue().size();
                log.warn("patch --");
                continue;
            }
            if (name.equals("Time") && id.equals("21")) {
                patchid = patchid + entry.getValue().size();
                log.warn("patch --");
                continue;
            }

            Subject subject = new Subject(name, Integer.parseInt(id));
            String subjectPath = Constant.PROJECT_HOME + "/" + name + "/" + name + id;

            for (Patch4Kui patch : entry.getValue()) {
                patchid++;
                log.info("{} Process patch {}", patchid, patch.getPatchPath());


                //                if(!patch.getPatchName().equals("patch1-Closure-22-Arja-plausible.patch")){
                //                    continue;
                //                }

                patch.recordChangeLines();
                String fixedFile = subjectPath + patch.getFixedFile().trim();
                FileIO.backupFile(fixedFile);

                //CombineVersion.createCombinedFiles(fixedFile,patch);
                // does not work
                if (!Runner.patchFile(fixedFile, patch.getPatchPath())) {
                    log.error("Patch {} patched failed", patch.getPatchPath());
                    break;
                }

                List<Method> methodList = getMethodInfoByraverse(fixedFile, subject);
                for (Integer lnumber : patch.getChangeLines()) {
                    Method findMethod = methodList.stream().filter(Objects::nonNull).filter(method ->
                            lnumber >= method.get_startLine() && lnumber <= method.get_endLine()).findAny()
                            .orElse(null);
                    if (Objects.isNull(findMethod)) {
                        continue;
                    }
                    String combinedMethod =
                            getMethodContent(fixedFile, findMethod.get_startLine(), findMethod.get_endLine());
                    patch.setCombinedMethod(combinedMethod);
                    break;
                }
                if (!StringUtils.isEmpty(patch.getCombinedMethod())) {
                    JSONObject patchMethodJson = new JSONObject();
                    patchMethodJson.put(patch.getPatchName(), patch.getCombinedMethod());
                    resultList.add(patchMethodJson);
                } else {
                    log.error("Patch {} obtain method failed ", patch.getPatchPath());
                }
                FileIO.writeStringToFile(BuildPath.buildMethodReFile(label), JSON.toJSONString(resultList));
            }
        }

    }

    public static void main(String[] args) {
        String patchDir =
                "/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/Patches/experiment3"
                        + "/TrainingSet";
        Map<String, List<Patch4Kui>> subjectPatchMap = readPatches(new File(patchDir));
        findMethods(subjectPatchMap, "kui-trainSet");

    }
}
