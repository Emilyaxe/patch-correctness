package main;

import static main.ObtainMethods4All.getMethodInfoByraverse;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import config.Constant;
import entity.Method;
import entity.Patch;
import entity.Patch4Test;
import entity.Subject;
import lombok.extern.slf4j.Slf4j;
import util.BuildPath;
import util.FileIO;

@Slf4j
public class ObtainMethods4Test {

    public static List<Patch> readSummayFile() {
        List<Patch> patches = new LinkedList<>();
        String filePath = "/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/Patches"
                + "/experiment3/kui_data_for_cc2v.txt";
        String[] content = FileIO.readFileToString(filePath).split("\n");
        for (int i = 0; i <= 129; i++) {
            String line = content[i];
            String label = String.valueOf(line.charAt(0));
            String info = line.split("ppp")[1].split(" ")[0];
            String[] infoArray = info.split("_");
            patches.add(Patch.builder().lable(label)
                    .patchName(infoArray[1]).bugid(infoArray[0]).build());
        }
        return patches;
    }

    public static Map<String, List<Patch4Test>> readPatches(List<Patch> patches) {

        String patchDir =
                "/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/Patches/experiment3/TestSet";
        Map<String, List<Patch4Test>> subjectPatchMap = new LinkedHashMap<>();
        for (Patch patch : patches) {
            String patchFile = patchDir + "/" + patch.getPatchName();
            Patch4Test patch4Test = new Patch4Test(patchFile, patch.getPatchName());
            patch4Test.setBugid(patch.getBugid());
            if (subjectPatchMap.containsKey(patch.getBugid())) {
                subjectPatchMap.get(patch.getBugid()).add(patch4Test);
            } else {
                List<Patch4Test> list = new LinkedList<>();
                list.add(patch4Test);
                subjectPatchMap.put(patch.getBugid(), list);
            }
        }

        log.info("Totol Subject {}", subjectPatchMap.size());
        int size = 0;
        for (List<Patch4Test> patch1 : subjectPatchMap.values()) {
            size = size + patch1.size();
        }
        log.info("Total Patches {}", size);
        return subjectPatchMap;
    }


    private static void findMethods(Map<String, List<Patch4Test>> subjectPatchMap, String testSet) {
        List<JSONObject> resultList = new LinkedList<>();
        int patchid = 0;
        for (Entry<String, List<Patch4Test>> entry : subjectPatchMap.entrySet()) {

            String id = StringUtils.getDigits(entry.getKey());
            String name = entry.getKey().split(id)[0];

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

            for (Patch4Test patch : entry.getValue()) {
                patchid++;
                //log.info("{} Process patch {}", patchid, patch.getPatchPath());
                //                if (!patch.getPatchName().equals("ACS_Math-3_C_Patch_1_1.txt")) {
                //                    continue;
                //                }

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
        FileIO.writeStringToFile(BuildPath.buildMethodReFile(testSet), JSON.toJSONString(resultList));
    }

    public static void createCombinedBuggyFiles(String fixedFile, Patch4Test patch4Test) {
        String fixedContent = FileIO.readFileToString(fixedFile);
        Map<Integer, String> patchMap = patch4Test.recordChanges();
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

    public static String getMethodContent(String fixedFile, Integer startLine, Integer endLine,
            Patch4Test patch4Test) {
        StringBuilder method = new StringBuilder();

        FileIO.backupFile(fixedFile);
        String fixedContent = FileIO.readFileToString(fixedFile);
        Map<Integer, String> patchMap = patch4Test.recordChanges();
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

    public static void main(String[] args) {
        Map<String, List<Patch4Test>> subjectPatchMap = readPatches(readSummayFile());
        findMethods(subjectPatchMap, "trainingSet");

    }

}
