package script;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import config.Constant;
import entity.Patch;
import lombok.extern.slf4j.Slf4j;
import main.ObtainMethods4All;
import service.ObtainPatches;
import util.FileIO;

@Slf4j
public class ConstructData {

    public static void moveTestData() {
        String targetDir = Constant.HOME + "/Patches/DataSet/testSet/";
        Map<String, List<Patch>> patchMap = ObtainMethods4All.readTestPatches();
        String problemPatches =
                "Math88b_Patch74, Lang46b_Patch22, Math97b_Patch77, Math22b_PatchHDRepair3, Math4b_Patch155, "
                        + "Chart13b_Patch9, Lang57b_PatchHDRepair1, Time11b_Patch182, Time12b_Patch183, "
                        + "Time12b_Patch183, Time12b_Patch183, Time12b_Patch183";
        Set<String> patchSet = Arrays.stream(problemPatches.split(", ")).collect(Collectors.toSet());
        JSONObject jsonObject = new JSONObject();
        for (Entry<String, List<Patch>> entry : patchMap.entrySet()) {
            for (Patch patch : entry.getValue()) {
                if (!patchSet.contains(patch.getPatchName())) {
                    try {
                        FileUtils.copyFile(new File(patch.getPatchPath()), new File(targetDir + patch.getPatchName()));
                    } catch (IOException exception) {
                        exception.printStackTrace();
                    }
                    List<String> list = new LinkedList<>();
                    list.add(patch.getBugid());
                    list.add(patch.getLable());

                    jsonObject.put(patch.getPatchName(), list);
                }
            }
        }
        FileIO.writeStringToFile("./info", JSON.toJSONString(jsonObject));

    }

    public static void deDuplicate4Wen() {
        //Map<String, List<Patch>> patchMap = ObtainMethods4All.readCorrectPatch4Wen();
        // Map<String, List<Patch>> patchMap = ObtainMethods4All.readInCorrectPatch4Wen();

        List<Patch> trainPatch = ObtainPatches.readTrainPatches();

        JSONObject jsonObject = new JSONObject();
        String targetDir = Constant.HOME + "/Patches/DataSet/trainSet/";

        List<Patch> testPatch = ObtainPatches.readTestPatches();
        Set<String> testContentPatch = testPatch.stream().map(patch ->
                patch.getBugid() + "#" + processPatch(FileIO.readFileToString(patch.getPatchPath())))
                .collect(Collectors.toSet());
        log.info("List size: {}, Set Size:{}", testPatch.size(), testContentPatch.size());
        List<Patch> duplicatePatches = new LinkedList<>();
        //for (Entry<String, List<Patch>> entry : patchMap.entrySet()) {
        for (Patch patch : trainPatch) {
            String match = patch.getBugid() + "#" + processPatch(FileIO.readFileToString(patch.getPatchPath()));
            if (!testContentPatch.contains(match)) {
                try {
                    FileUtils.copyFile(new File(patch.getPatchPath()), new File
                            (targetDir + patch.getPatchName()));
                } catch (IOException exception) {
                    exception.printStackTrace();
                }
                List<String> list = new LinkedList<>();
                list.add(patch.getBugid());
                list.add(patch.getLable());
                jsonObject.put(patch.getPatchName(), list);
            } else {
                duplicatePatches.add(patch);
            }
        }
        // }
        FileIO.writeStringToFile("./train.info", JSON.toJSONString(jsonObject));
        log.info("duplicatePatches size: {}", duplicatePatches.size());
    }

    private static void selfdeduplicate4Wen() {
        JSONObject jsonObject = new JSONObject();
        List<Patch> duplicatePatches = new LinkedList<>();
        String targetDir = Constant.HOME + "/Patches/DataSet/newtrainSet/";
        List<Patch> trainPatch = ObtainPatches.readTrainPatches();
        Set<String> trainContentPatch = new LinkedHashSet<>();
        //                trainPatch.stream().map(patch ->
        //                patch.getBugid() + "#" + processPatch(FileIO.readFileToString(patch.getPatchPath())))
        //                .collect(Collectors.toSet());
        for (Patch patch : trainPatch) {
            if (!trainContentPatch
                    .contains(patch.getBugid() + "#" + processPatch(FileIO.readFileToString(patch.getPatchPath())))) {
                trainContentPatch
                        .add(patch.getBugid() + "#" + processPatch(FileIO.readFileToString(patch.getPatchPath())));
                //                try {
                //
                //                                        FileUtils.copyFile(new File(patch.getPatchPath()), new File
                //                                                (targetDir + patch.getPatchName()));
                //                } catch (IOException exception) {
                //                    exception.printStackTrace();
                //                }
                List<String> list = new LinkedList<>();
                list.add(patch.getBugid());
                list.add(patch.getLable());
                jsonObject.put(patch.getPatchName(), list);
            } else {
                duplicatePatches.add(patch);
            }
        }
        // FileIO.writeStringToFile("./train.info", JSON.toJSONString(jsonObject));
        log.info("duplicatePatches size: {}", duplicatePatches.size());
    }

    private static void rmInplausible4Wen() {
        String inplausiblePatches =
                "patch1-Lang-20-AVATAR-plausible.patch,patch1-Math-57-jMutRepair-plausible.patch,"
                        + "patch1-Lang-10-SimFix-plausible.patch,patch1-Math-1-SimFix-plausible.patch,"
                        + "patch1-Lang-20-TBar-plausible.patch,patch1-Lang-10-SimFix-plausible.patch,"
                        + "patch1-Math-43-SimFix-plausible.patch,patch1-Lang-12-SimFix-plausible.patch,"
                        + "patch1-Math-43-SimFix-plausible.patch,patch1-Math-22-FixMiner.patch,"
                        + "patch1-Lang-20-kPAR-plausible.patch,patch1-Math-43-SimFix-plausible.patch,"
                        + "patch1-Math-103-RSRepair-plausible.patch,patch1-Math-20-Nopol-plausible.patch,"
                        + "patch1-Math-43-SimFix-plausible.patch,patch1-Lang-41-SimFix-plausible.patch,"
                        + "patch1-Math-4-Nopol-plausible.patch,patch1-Math-31-Kali-plausible.patch,"
                        + "patch1-Lang-41-TBar-plausible.patch,patch1-Lang-53-kPAR-plausible.patch,"
                        + "patch1-Closure-6-SimFix.patch,patch1-Lang-50-SimFix-plausible.patch,"
                        + "patch1-Math-43-kPAR-plausible.patch,patch1-Math-43-kPAR-plausible.patch,"
                        + "patch1-Closure-6-SimFix.patch,patch1-Math-43-kPAR-plausible.patch,"
                        + "patch1-Chart-3-SimFix-plausible.patch,patch1-Math-98-Arja.patch,"
                        + "patch1-Math-43-kPAR-plausible.patch,patch1-Lang-47-TBar.patch,"
                        + "patch1-Lang-60-SimFix-plausible.patch,patch1-Math-71-SimFix.patch,"
                        + "patch1-Math-69-SimFix-plausible.patch,patch1-Math-69-SimFix-plausible.patch,"
                        + "patch1-Math-71-SimFix.patch,patch1-Math-72-SimFix-plausible.patch,"
                        + "patch1-Lang-61-SimFix-plausible.patch,patch1-Math-71-DynaMoth-plausible.patch,"
                        + "patch1-Lang-9-SimFix-plausible.patch,patch1-Lang-1-SimFix-plausible.patch,"
                        + "patch1-Lang-9-SimFix-plausible.patch,patch1-Math-80-jMutRepair-plausible.patch,"
                        + "patch1-Closure-109-SimFix-plausible.patch,patch1-Closure-106-SimFix-plausible.patch,"
                        + "patch1-Closure-106-SimFix-plausible.patch,patch1-Closure-106-SimFix-plausible.patch,"
                        + "patch1-Chart-25-kPAR-plausible.patch,patch1-Chart-25-kPAR-plausible.patch,"
                        + "patch1-Chart-20-SimFix.patch,patch1-Chart-25-kPAR-plausible.patch,"
                        + "patch1-Chart-25-kPAR-plausible.patch,patch1-Chart-22-SimFix-plausible.patch,"
                        + "patch1-Chart-22-SimFix-plausible.patch,patch1-Chart-22-SimFix-plausible.patch,"
                        + "patch1-Chart-22-SimFix-plausible.patch,patch1-Chart-22-SimFix-plausible.patch,"
                        + "patch1-Chart-22-SimFix-plausible.patch,patch1-Closure-26-SimFix-plausible.patch,"
                        + "patch1-Closure-26-SimFix-plausible.patch,patch1-Chart-18-SimFix-plausible.patch,"
                        + "patch1-Closure-26-SimFix-plausible.patch,patch1-Chart-18-SimFix-plausible.patch,"
                        + "patch1-Closure-26-SimFix-plausible.patch,patch1-Closure-26-SimFix-plausible.patch,"
                        + "patch1-Chart-18-DynaMoth-plausible.patch,patch1-Chart-14-AVATAR-plausible.patch,"
                        + "patch1-Chart-18-DynaMoth-plausible.patch,patch1-Chart-14-AVATAR-plausible.patch,"
                        + "patch1-Chart-18-DynaMoth-plausible.patch,patch1-Chart-14-AVATAR-plausible.patch,"
                        + "patch1-Chart-14-TBar-plausible.patch,patch1-Chart-14-TBar-plausible.patch,"
                        + "patch1-Chart-14-TBar-plausible.patch,patch1-Chart-14-FixMiner-plausible.patch,"
                        + "patch1-Chart-14-FixMiner-plausible.patch,patch1-Chart-14-FixMiner-plausible.patch,"
                        + "patch1-Closure-126-SimFix-plausible.patch,patch1-Chart-25-SimFix-plausible.patch,"
                        + "patch1-Chart-25-SimFix-plausible.patch";
        Set<String> set = Arrays.asList(inplausiblePatches.split(",")).stream().collect(Collectors.toSet());
        //        // delete patch file
        //        String patchesDir = Constant.HOME + "/Patches/DataSet/trainSet/";
        //        for (File f : new File(patchesDir).listFiles()) {
        //            if (set.contains(f.getName())) {
        //                try {
        //                    FileUtils.forceDelete(f);
        //                } catch (IOException exception) {
        //                    log.error("File {} delete error", f.getName());
        //                }
        //            }
        //        }
        //
        //        // update train.info
        //
        //        String filePath = Constant.HOME + "/Patches"
        //                + "/DataSet/train.info";
        //
        //        JSONObject newJsonObject = new JSONObject();
        //        JSONObject jsonObject = JSON.parseObject(FileIO.readFileToString(filePath));
        //
        //        for (Entry<String, Object> entry : jsonObject.entrySet()) {
        //            String patchName = entry.getKey();
        //            if (!set.contains(patchName)) {
        //                newJsonObject.put(patchName, entry.getValue());
        //            }
        //        }
        //        FileIO.writeStringToFile("./train.info", JSON.toJSONString(newJsonObject));

        // delete dynamic info
        for (String patchName : set) {
            String dynamicDir = Constant.dynamicResult + "/trainSet" + "/" + patchName;
            try {
                FileUtils.deleteDirectory(new File(dynamicDir));
            } catch (IOException exception) {
                log.error("Dir {} delete error", dynamicDir);
            }
        }

    }

    private static String processPatch(String content) {
        String line = content.split("@@ -", 2)[1].split(",")[0];
        String result = content.split("@@ -", 2)[1].split("\n", 2)[1].replace(" ", "")
                .replace("\n", "").replace("\t", "").replace("\r", "");
        return line + "#" + result;
    }

    private static String processCorPatch(String content) {
        String line = content.split("@@ -", 2)[1].split(",")[0];
        String result = content.split("@@ -", 2)[1].split("\n", 2)[1];
        String newResult = Arrays.stream(result.split("\n")).map(patchline -> {
            if (patchline.startsWith("-")) {
                patchline.replaceAll("-", "\\+");
            } else if (patchline.startsWith("+")) {
                patchline.replaceAll("\\+", "-");
            }
            return patchline;
        }).collect(Collectors.joining("\n")).replace(" ", "")
                .replace("\n", "").replace("\t", "").replace("\r", "");
        return line + "#" + newResult;
    }

    private static void checkCorrectPatches() {
        String correctDir = Constant.D4J_HOME + "/framework/projects";
        String targetDir = Constant.HOME + "/Patches/DataSet/correctSet/";
        List<Patch> testSet = ObtainPatches.readTestPatches();
        List<Patch> trainSet = ObtainPatches.readTrainPatches();
        Set<String> testContentPatch = testSet.stream().map(patch ->
                patch.getBugid() + "#" + processPatch(FileIO.readFileToString(patch.getPatchPath())))
                .collect(Collectors.toSet());
        Set<String> trainContentPatch = trainSet.stream().map(patch ->
                patch.getBugid() + "#" + processPatch(FileIO.readFileToString(patch.getPatchPath())))
                .collect(Collectors.toSet());
        Set<String> allContent = new LinkedHashSet<>();
        allContent.addAll(testContentPatch);
        allContent.addAll(trainContentPatch);

        log.info("testSet {} trainSet {} allSet {}", testContentPatch.size(), trainContentPatch.size(),
                allContent.size());

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Chart", 26);
        map.put("Closure", 133);
        map.put("Math", 106);
        map.put("Lang", 65);
        map.put("Time", 27);
        JSONObject jsonObject = new JSONObject();
        for (Entry<String, Integer> entry : map.entrySet()) {
            String name = entry.getKey();
            Integer end = entry.getValue();
            for (int i = 1; i <= end; i++) {
                String patchFile = correctDir + "/" + name + "/patches/" + i + ".src.patch";
                String bugId = name + "-" + i;
                if (!allContent.contains(bugId + "#" + processCorPatch(FileIO.readFileToString(patchFile)))) {
                    allContent.add(bugId + "#" + processCorPatch(FileIO.readFileToString(patchFile)));
                    List<String> list = new LinkedList<>();
                    list.add(bugId);
                    list.add("1");
                    String patchName = name + i + "_" + i + ".src.patch";
                    jsonObject.put(patchName, list);
                    try {
                        FileUtils.copyFile(new File(patchFile), new File(targetDir + patchName));
                    } catch (IOException exception) {
                        log.error(patchFile);
                    }
                }
            }
        }
        FileIO.writeStringToFile("./correct.info", JSON.toJSONString(jsonObject));
        log.info("finish all subject!");
    }


    public static void readCorrectPatches() {
        List<Patch> patches = new LinkedList<>();
        String filePath = Constant.HOME + "/Patches/experiment3/kui_data_for_cc2v.txt";
        String correctDir = Constant.D4J_HOME + "/framework/projects";
        String[] content = FileIO.readFileToString(filePath).split("\n");
        JSONObject jsonObject = new JSONObject();
        String targetDir = Constant.HOME + "/Patches/DataSet/correctSet/";
        for (int i = 662; i < 998; i++) {
            String[] line = content[i].split("<ml>");
            String label = line[0];
            String info = line[1];
            String[] infoArray = info.split("_");

            String id = infoArray[1].split("\\.")[0];
            String name = infoArray[0];

            List<String> list = new LinkedList<>();
            list.add(name + "-" + id);
            list.add("1");
            String patchName = name + "_" + id + ".src.patch";
            jsonObject.put(patchName, list);

            String patchFile = correctDir + "/" + name + "/patches/" + id + ".src.patch";

            try {
                FileUtils.copyFile(new File(patchFile), new File(targetDir + patchName));
            } catch (IOException exception) {
                log.error(patchFile);
            }
        }
        FileIO.writeStringToFile("./correct.info", JSON.toJSONString(jsonObject));
    }

    public static void main(String[] args) {
        //moveTestData();
        //deDuplicate4Wen();
        //selfdeduplicate4Wen();
        // List<Patch> testPatch = ObtainPatches.readTrainPatches();
        //rmInplausible4Wen();
        readCorrectPatches();
        log.info("finish");
    }


}
