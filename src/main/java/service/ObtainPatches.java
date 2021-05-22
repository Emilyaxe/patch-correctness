package service;

import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import config.Constant;
import entity.Patch;
import lombok.extern.slf4j.Slf4j;
import util.FileIO;

@Slf4j
public class ObtainPatches {

    public static List<Patch> readTestPatches() {
        List<Patch> patches = new LinkedList<>();
        String filePath = Constant.HOME + "/Patches" + "/DataSet/test.info";
        String patchDir = Constant.HOME + "/Patches/DataSet/testSet/";

        JSONObject jsonObject = JSON.parseObject(FileIO.readFileToString(filePath));
        for (Entry<String, Object> entry : jsonObject.entrySet()) {
            String patchName = entry.getKey();
            String bugid = "", label = "";
            if (entry.getValue() instanceof List) {
                bugid = ((List<String>) entry.getValue()).get(0);
                label = ((List<String>) entry.getValue()).get(1);
            } else {
                log.error(entry.getValue().toString());
            }
            patches.add(Patch.builder().patchName(patchName).bugId(bugid).label(label)
                    .patchPath(patchDir + patchName).build());
        }

        //        Map<String, List<Patch>> subjectPatchMap =
        //                patches.stream().collect(Collectors.groupingBy(Patch::getBugid));
        //        log.info("Totol Subject {}", subjectPatchMap.size());
        //        log.info("Total Patches {}", subjectPatchMap.values().stream().mapToLong(List::size).sum());
        return patches;
    }

    public static List<Patch> readTrainPatches() {
        List<Patch> patches = new LinkedList<>();
        String filePath = Constant.HOME + "/Patches/DataSet/train.info";
        String patchDir = Constant.HOME + "/Patches/DataSet/trainSet/";

        //String[] content = FileIO.readFileToString(filePath).split("\n");
        JSONObject jsonObject = JSON.parseObject(FileIO.readFileToString(filePath));
        for (Entry<String, Object> entry : jsonObject.entrySet()) {
            String patchName = entry.getKey();
            String bugid = "", label = "";
            if (entry.getValue() instanceof List) {
                bugid = ((List<String>) entry.getValue()).get(0);
                label = ((List<String>) entry.getValue()).get(1);
            } else {
                log.error(entry.getValue().toString());
            }
            patches.add(Patch.builder().patchName(patchName).bugId(bugid).label(label)
                    .patchPath(patchDir + patchName).build());
        }

        //        Map<String, List<Patch>> subjectPatchMap =
        //                patches.stream().collect(Collectors.groupingBy(Patch::getBugid));
        //        log.info("Totol Subject {}", subjectPatchMap.size());
        //        log.info("Total Patches {}", subjectPatchMap.values().stream().mapToLong(List::size).sum());
        return patches;
    }

    public static List<Patch> readCorPatches() {
        List<Patch> patches = new LinkedList<>();
        String filePath = Constant.HOME + "/Patches" + "/DataSet/correct.info";
        String patchDir = Constant.HOME + "/Patches/DataSet/correctSet/";

        //String[] content = FileIO.readFileToString(filePath).split("\n");
        JSONObject jsonObject = JSON.parseObject(FileIO.readFileToString(filePath));
        for (Entry<String, Object> entry : jsonObject.entrySet()) {
            String patchName = entry.getKey();
            String bugid = "", label = "";
            if (entry.getValue() instanceof List) {
                bugid = ((List<String>) entry.getValue()).get(0);
                label = ((List<String>) entry.getValue()).get(1);
            } else {
                log.error(entry.getValue().toString());
            }
            patches.add(Patch.builder().patchName(patchName).bugId(bugid).label(label)
                    .patchPath(patchDir + patchName).build());
        }
        return patches;
    }

    public static void main(String[] args) {
        readTestPatches();
    }
}
