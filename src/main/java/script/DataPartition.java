package script;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSON;

import entity.PatchJson;
import lombok.extern.slf4j.Slf4j;
import util.FileIO;

@Slf4j
public class DataPartition {
    public static String[] allData = {"correctSet_unpurify_list", "testSet_unpurify_list", "trainSet_unpurify_list"};


    public static void mianProcess() {
        List<PatchJson> allPatches = new LinkedList<>();
        String patchInfoPath = "./result/combineInfo/";
        for (String file : allData) {
            //            String content = FileIO.readFileToString(patchInfoPath + file);
            //            List<PatchJson> patchJsonList = JSON.parseArray(content, PatchJson.class);
            List<PatchJson> patchJsonList = Arrays.stream(FileIO.readFileToString(patchInfoPath + file).split("\n"))
                    .filter(Objects::nonNull).filter(StringUtils::isNotBlank)
                    .map(line -> JSON.parseObject(line, PatchJson.class)).collect(
                            Collectors.toList());
            if (CollectionUtils.isEmpty(patchJsonList)) {
                continue;
            }
            patchJsonList.stream().filter(Objects::nonNull).forEach(allPatches::add);
            log.info("Process {}", file);
        }
        Map<String, List<PatchJson>> bugPatchMap =
                allPatches.stream().collect(Collectors.groupingBy(PatchJson::getBugId));
        List<String> bugIdList = new ArrayList<>(bugPatchMap.keySet());
        Collections.shuffle(bugIdList, new Random(12345798L));
        int total = allPatches.size();
        int most = total * 8 / 10;
        int last1 = total / 10;
        int last2 = total - most - last1;
        List<PatchJson> mostPatchList = new LinkedList<>();
        List<PatchJson> last1PatchList = new LinkedList<>();
        List<PatchJson> last2PatchList = new LinkedList<>();
        Set<String> processBudIdSet = new HashSet<>(bugIdList.size());
        for (String bugId : bugIdList) {
            List<PatchJson> currentBugPatchList = bugPatchMap.getOrDefault(bugId, Collections.emptyList());
            if (most >= 0) {
                mostPatchList.addAll(currentBugPatchList);
                most -= currentBugPatchList.size();
                processBudIdSet.add(bugId);
            } else if (last1 >= 0) {
                last1PatchList.addAll(currentBugPatchList);
                last1 -= currentBugPatchList.size();
                processBudIdSet.add(bugId);
            } else if (last2 >= 0) {
                last2PatchList.addAll(currentBugPatchList);
                last2 -= currentBugPatchList.size();
                processBudIdSet.add(bugId);
            }
        }
        if (processBudIdSet.size() < bugIdList.size()) {
            log.info("remain patch {}",
                    bugIdList.stream().filter(id -> !processBudIdSet.contains(id)).collect(Collectors.joining(",")));
        }
        FileIO.writeStringToFile("./result/dataSetPartition/trainSet_list", JSON.toJSONString(mostPatchList));
        FileIO.writeStringToFile("./result/dataSetPartition/testSet_list", JSON.toJSONString(last1PatchList));
        FileIO.writeStringToFile("./result/dataSetPartition/validateSet_list", JSON.toJSONString(last2PatchList));
        log.info("trainSet : {}", mostPatchList.size());
        log.info("testSet : {}", last1PatchList.size());
        log.info("validateSet: {}", last2PatchList.size());
    }

    public static void calculateRatio() {
        //List<PatchJson> allPatches = new LinkedList<>();
        String patchInfoPath = "./result/dataSetPartition/";
        String[] allData = {"trainSet_list", "testSet_list", "validateSet_list"};

        for (String file : allData) {
            //            String content = FileIO.readFileToString(patchInfoPath + file);
            //            List<PatchJson> patchJsonList = JSON.parseArray(content, PatchJson.class);
            List<PatchJson> patchJsonList = Arrays.stream(FileIO.readFileToString(patchInfoPath + file).split("\n"))
                    .filter(Objects::nonNull).filter(StringUtils::isNotBlank)
                    .map(line -> JSON.parseObject(line, PatchJson.class)).collect(
                            Collectors.toList());
            
            if (CollectionUtils.isEmpty(patchJsonList)) {
                continue;
            }
            long corNumber = patchJsonList.stream().filter(patchJson -> patchJson.getLabel().equals("1")).count();
            long inCorNumber = patchJsonList.stream().filter(patchJson -> patchJson.getLabel().equals("0")).count();
            log.info("{}, cor {}, inCor {}", file, corNumber, inCorNumber);
        }
        //        patchInfoPath = "./result/combineInfo/";
        //        String[] initData = {"correctSet_unpurify", "testSet_unpurify", "trainSet_unpurify"};
        //        for (String file : initData) {
        //            String content = FileIO.readFileToString(patchInfoPath + file);
        //            List<PatchJson> patchJsonList = JSON.parseArray(content, PatchJson.class);
        //            if (CollectionUtils.isEmpty(patchJsonList)) {
        //                continue;
        //            }
        //            long corNumber = patchJsonList.stream().filter(patchJson -> patchJson.getLabel().equals("1"))
        //            .count();
        //            long inCorNumber = patchJsonList.stream().filter(patchJson -> patchJson.getLabel().equals("0"))
        //            .count();
        //            log.info("{}, cor {}, inCor {}", file, corNumber, inCorNumber);
        //        }

    }

    public static void main(String[] args) {
        mianProcess();
        calculateRatio();
    }

}
