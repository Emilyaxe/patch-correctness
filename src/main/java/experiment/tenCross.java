package experiment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Iterables;

import entity.Patch;
import lombok.extern.slf4j.Slf4j;
import service.ObtainPatches;
import util.FileIO;

@Slf4j
public class tenCross {

    private static final Random RANDOM = new Random(789456321);

    public static void main(String[] args) {
        List<Patch> testPatches = ObtainPatches.readTestPatches();
        List<Patch> trainPatches = ObtainPatches.readTrainPatches();
        List<Patch> correctPatches = ObtainPatches.readCorPatches();
        List<Patch> allPatches = new LinkedList<>();
        allPatches.addAll(testPatches);
        allPatches.addAll(trainPatches);
        allPatches.addAll(correctPatches);

        Map<String, List<Patch>> subjectpatchMap =
                allPatches.stream().collect(Collectors.groupingBy(Patch::getBugid));

        List<String> keyList = new ArrayList<>(subjectpatchMap.keySet());

        Collections.shuffle(keyList, RANDOM);

        Iterable<List<String>> iterables = Iterables.partition(keyList,
                keyList.size() / 10 + 1);

        List<Map<String, List<Patch>>> result = new ArrayList<>();

        JSONObject jsonObject = new JSONObject();

        int i = 0;
        for (List<String> keyGroup : iterables) {
            //            Map<String, List<Patch>> groupMap = new HashMap<>();
            //            keyGroup.forEach(key -> groupMap.put(key, subjectpatchMap.get(key)));
            //            result.add(groupMap);
            List<String> oneList = new LinkedList<>();
            keyGroup.forEach(key -> oneList
                    .addAll(subjectpatchMap.get(key).stream().map(Patch::getPatchName).collect(Collectors.toList())));
            jsonObject.put(String.valueOf(i), oneList);
            log.info("oneList: {}", oneList.size());
            i++;
        }
        FileIO.writeStringToFile("./tenCross", JSON.toJSONString(jsonObject));

        log.info("group size {}", result.size());
    }
}
