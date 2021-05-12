package script;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import config.Constant;
import entity.Patch;
import lombok.extern.slf4j.Slf4j;
import service.ObtainPatches;
import util.FileIO;

@Slf4j
public class checkData {

    private static final String summaryFile =
            "/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/Patches/experiment3"
                    + "/kui_data_for_cc2v.txt";
    private static final String testPatchInfoDir =
            "/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/Patches/experiment3/TestSet"
                    + "/INFO";
    private static final String testPatchDir =
            "/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/Patches/experiment3/TestSet";

    private static final String trainPatchDir =
            "/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/Patches/experiment3/TrainingSet";


    public static void mainProcess() {

        String[] content = FileIO.readFileToString(summaryFile).split("\n");
        List<Patch> testPatchInfoList = new LinkedList<>();
        List<Patch> trainPatchInfoList = new LinkedList<>();
        for (int index = 0; index < content.length; ++index) {
            if (index < 130) {
                String line = content[index];
                String label = String.valueOf(line.charAt(0));
                String info = line.split("ppp")[1].trim().split(" ")[0];
                String[] infoArray = info.split("_");
                String id = StringUtils.getDigits(infoArray[0]);
                String name = infoArray[0].split(id)[0];
                JSONObject jsonObject =
                        JSON.parseObject(FileIO.readFileToString(testPatchInfoDir + "/" + infoArray[1] + ".json"));
                Patch.PatchBuilder builder = Patch.builder().lable(label).patchName(infoArray[1])
                        .bugid(name + "-" + id).patchPath(testPatchDir + "/" + infoArray[1]).id(index + 1);
                if (!jsonObject.isEmpty()) {
                    builder.tool(jsonObject.getString("tool"))
                            .correctness(jsonObject.getString("correctness"));
                }
                testPatchInfoList.add(builder.build());
            } else if (index < 644) {
                String[] line = content[index].split("<ml>");
                String label = line[0];
                String info = line[1];
                String[] infoArray = info.split("_");

                String bugId = infoArray[1];
                trainPatchInfoList.add(Patch.builder().lable(label).patchName(infoArray[1])
                        .bugid(bugId).patchPath(trainPatchDir + "/" + info).id(index + 1)
                        .tool(infoArray[0]).correctness(label.equals("0") ? "Incorrect" : "Correct")
                        .build());
            }
        }
        Map<String, List<Patch>> testPatchMap =
                testPatchInfoList.stream().filter(Objects::nonNull).filter(patch -> patch.getTool().equals("ACS"))
                        .collect(Collectors.groupingBy(patch -> patch.getBugid() + patch.getTool()));
        Map<String, List<Patch>> trainPatchMap =
                trainPatchInfoList.stream().filter(Objects::nonNull).filter(patch -> patch.getTool().equals("ACS"))
                        .collect(Collectors.groupingBy(patch -> patch.getBugid() + patch.getTool()));
        Set<String> intersection = new HashSet<>(trainPatchMap.keySet());
        intersection.retainAll(testPatchMap.keySet());
        Map<String, Map<String, List<Patch>>> totalMap = new HashMap<>();
        totalMap.put("test", testPatchMap.entrySet().stream()
                .filter(entry -> intersection.contains(entry.getKey()))
                .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (v1, v2) -> v2)));
        totalMap.put("train", trainPatchMap.entrySet().stream()
                .filter(entry -> intersection.contains(entry.getKey()))
                .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (v1, v2) -> v2)));
        log.info("intersection: {}", JSON.toJSONString(totalMap));
    }

    public static void main(String[] args) {
        checkTrainDynamicInfo();
    }

    private static void checkTrainDynamicInfo() {
        List<Patch> patches = ObtainPatches.readTrainPatches();
        Set<String> patchesSet = patches.stream().map(patch -> patch.getPatchName()).collect(Collectors.toSet());
        log.info("Patches Size: {}, Patches Name Size {} ", patches.size(), patchesSet.size());
        for (Patch patch : patches) {
            String dynamicDir = Constant.dynamicResult + "/trainSet" + "/" + patch.getPatchName();
            if (!new File(dynamicDir).exists()) {
                log.error(patch.getPatchName());
            }
        }
        log.info("Dir size {} ", new File(Constant.dynamicResult + "/trainSet").listFiles().length);
        for (File f : new File(Constant.dynamicResult + "/trainSet").listFiles()) {
            if (!patchesSet.contains(f.getName())) {
                log.error("Rebundant File {}", f.getName());
            }
        }
    }
}