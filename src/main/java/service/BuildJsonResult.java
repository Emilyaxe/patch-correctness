package service;

import static util.AsyExecutor.EXECUTOR;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import entity.PatchJson;
import lombok.extern.slf4j.Slf4j;
import util.BuildPath;
import util.FileIO;

@Slf4j
public class BuildJsonResult {
    static Map<String, String> failingTestProblemList = new ConcurrentHashMap<>();
    static Map<String, String> traceProblemList = new ConcurrentHashMap<>();

    public static void BuildPatchJson(String dir) {
        List<PatchJson> patches = new LinkedList<>();
        JSONObject jsonObject =
                JSON.parseObject(FileIO.readFileToString(BuildPath.buildMethodReFile(dir)));
        for (Entry<String, Object> entry : jsonObject.entrySet()) {
            String patchName = entry.getKey();
            String bugid = "", label = "", combinedMethod = "";
            if (entry.getValue() instanceof List) {
                bugid = ((List<String>) entry.getValue()).get(0);
                label = ((List<String>) entry.getValue()).get(1);
                combinedMethod = ((List<String>) entry.getValue()).get(2);
            } else {
                log.error(entry.getValue().toString());
            }
            patches.add(
                    PatchJson.builder().patchName(patchName).bugid(bugid).lable(label).combinedMethod(combinedMethod)
                            .build());
        }
        for (PatchJson patchJson : patches) {
            if (!patchJson.getPatchName().equals("patch1-Math-78-Nopol-plausible.patch")) {
                continue;
            }

            String buggyLine = BuildPath.buildDymicAllFile(dir, patchJson.getPatchName(), true);
            String fixedFile = BuildPath.buildDymicAllFile(dir, patchJson.getPatchName(), false);
            String failingTestContent = FileIO.readFileToString(
                    BuildPath.buildDymicAllFile(dir, patchJson.getPatchName(), true) + ".failing");
            patchJson.setFailingTests(Arrays.stream(failingTestContent.split("\n")).filter(Objects::nonNull).collect(
                    Collectors.toList()));
            patchJson.setBuggyTraceInfo(obtainTrace(FileIO.readFileToString(buggyLine)));
            patchJson.setFixedTraceInfo(obtainTrace(FileIO.readFileToString(fixedFile)));
        }
        //FileIO.writeStringToFile("./" + dir, JSON.toJSONString(patches));
        multiPcoessCheck(patches);
    }

    public static void multiPcoessCheck(List<PatchJson> patches) {
        List<CompletableFuture<Void>> futureList = new LinkedList<>();

        futureList.add(CompletableFuture.runAsync(() -> {
            checkPatches(patches);
        }, EXECUTOR));

        CompletableFuture.allOf(futureList.toArray(new CompletableFuture[0])).join();
    }

    private static void checkPatches(List<PatchJson> patchJsons) {


        for (PatchJson patchJson : patchJsons) {
            //            if (!patchJson.getPatchName().equals("patch1-Math-78-Nopol-plausible.patch")) {
            //                continue;
            //            }
            // check all failing tests have traces
            List<String> failingTest = patchJson.getFailingTests();
            Map<String, Set<String>> buggyMap = patchJson.getBuggyTraceInfo();
            Map<String, Set<String>> fixedMap = patchJson.getFixedTraceInfo();
            if (failingTest.stream().anyMatch(line -> !buggyMap.containsKey(line) || !fixedMap.containsKey(line))) {
                failingTestProblemList.putIfAbsent(patchJson.getPatchName(), "");
            }

            String combineMethod = patchJson.getCombinedMethod();
            if (!(checkMapTrace(combineMethod,
                    buggyMap.values().stream().flatMap(Set::stream).collect(Collectors.toSet()), true) &&
                    checkMapTrace(combineMethod,
                            fixedMap.values().stream().flatMap(Set::stream).collect(Collectors.toSet()), false))) {
                traceProblemList.put(patchJson.getPatchName(), "");
            }
        }
    }

    private static boolean checkMapTrace(String combinedMethod, Set<String> trace, boolean isbuggy) {
        String[] methods = combinedMethod.split("\n");
        String illegalStart = isbuggy ? "+" : "-";
        for (String line : trace) {
            Integer lineNumber = Integer.parseInt(line.split("#")[1]);
            if (lineNumber >= methods.length || methods[lineNumber].startsWith("//") || methods[lineNumber]
                    .startsWith(illegalStart)) {
                return false;
            }
        }
        return true;
    }

    private static Map<String, Set<String>> obtainTrace(String content) {
        Map<String, Set<String>> map = new LinkedHashMap<>();
        for (String line : content.split("\n")) {
            if (StringUtils.isEmpty(line.trim())) {
                continue;
            }
            String key = line.split("\t", 2)[0].split("#")[0];
            Set<String> values =
                    Arrays.stream(line.split("\t", 2)[1].split("\t")).filter(Objects::nonNull)
                            .filter(StringUtils::isNotBlank).collect(
                            Collectors.toSet());
            if (values.size() > 0) {
                map.put(key, values);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        BuildPatchJson("trainSet");
        BuildPatchJson("testSet");
        BuildPatchJson("correctSet");

        log.info("failingTestProblemList: {}", StringUtils.join(failingTestProblemList.keySet(), ","));
        log.info("traceProblemList: {}", StringUtils.join(traceProblemList.keySet(), ","));
        //        String trainStatic = FileIO.readFileToString(BuildPath.buildMethodReFile("trainSet"));
        //        String correctStatic = FileIO.readFileToString(BuildPath.buildMethodReFile("correctSet"));
    }
}
