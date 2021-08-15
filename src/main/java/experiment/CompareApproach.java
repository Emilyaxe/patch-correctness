package experiment;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.alibaba.fastjson.JSON;

import config.Constant;
import entity.PatchJson;
import lombok.extern.slf4j.Slf4j;
import util.FileIO;

@Slf4j
public class CompareApproach {
    public static List<PatchJson> readCrossPatchTestSet() {
        List<PatchJson> testSet =
                JSON.parseArray(FileIO.readFileToString(Constant.HOME + "/result/crosspatch/testSet"), PatchJson.class);
        return testSet;

    }

    // 统计 ICSE18在现有数据集上的recall
    public static void icseRecall() {
        String originalResult = "1, 2, 4, 8, 9, 13, 15, 16, 17, 19, 22, 23, 32, 33, 34, 36, 38, 48, 53, 55, 58, 65, "
                + "66, 67, 68, 69, 72, 74, 77, 79, 80, 81, 84, 88, 92, 93, 150, 151, 154, 157, 158, 159, 160, 163, "
                + "167, 169, 170, 174, 176, 181, 183, 184, 185, 186, 187, 193, 198, 208, HDRepair5, HDRepair6, "
                + "HDRepair8, HDRepair9";

        //List<Patch> testPatches = ObtainPatches.readTestPatches();
        List<PatchJson> testPatches = readCrossPatchTestSet();
        Set<String> incorPatches = testPatches.stream().filter(patch -> patch.getLabel().equals("0"))
                .map(patch -> patch.getPatchName().split("_")[1].split("Patch")[1]).collect(
                        Collectors.toSet());
        Set<String> result = new LinkedHashSet<>();
        for (String patchid : originalResult.split(", ")) {
            if (incorPatches.contains(patchid)) {
                result.add(patchid);
            }
        }
        log.info("ALl Incorrect: {}", incorPatches.size());
        log.info("Patch-SIM size: {}", result.size());
    }

    public static void main(String[] args) {
        icseRecall();
    }
}
