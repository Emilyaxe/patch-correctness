package script;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
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

    private static String processPatch(String content) {
        String line = content.split("@@ -", 2)[1].split(",")[0];
        String result = content.split("@@ -", 2)[1].split("\n", 2)[1].replace(" ", "")
                .replace("\n", "").replace("\t", "").replace("\r", "");
        return line + "#" + result;
    }

    public static void main(String[] args) {
        //moveTestData();
        //deDuplicate4Wen();
        selfdeduplicate4Wen();
        // List<Patch> testPatch = ObtainPatches.readTrainPatches();
        log.info("finish");
    }


}
