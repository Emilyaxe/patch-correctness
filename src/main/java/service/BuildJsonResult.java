package service;

import static util.AsyExecutor.EXECUTOR;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
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

import config.Constant;
import entity.PatchJson;
import lombok.extern.slf4j.Slf4j;
import util.BuildPath;
import util.FileIO;

@Slf4j
public class BuildJsonResult {
    public static Map<String, String> failingTestProblemList = new ConcurrentHashMap<>();
    public static Map<String, String> traceProblemList = new ConcurrentHashMap<>();

    public static void BuildPatchJson(String dir) {
        List<PatchJson> patches = new LinkedList<>();
        JSONObject jsonObject =
                JSON.parseObject(FileIO.readFileToString(BuildPath.buildMethodReFile(dir)));
        log.info("Obtain Static Info ...");
        for (Entry<String, Object> entry : jsonObject.entrySet()) {
            String patchName = entry.getKey();
            String bugid = "", label = "", combinedMethod = "";
            if (entry.getValue() instanceof List) {
                bugid = ((List<String>) entry.getValue()).get(1);
                label = ((List<String>) entry.getValue()).get(0);
                combinedMethod = ((List<String>) entry.getValue()).get(2);
            } else {
                log.error(entry.getValue().toString());
            }
            patches.add(
                    PatchJson.builder().patchName(patchName).bugId(bugid).label(label).combinedMethod(combinedMethod)
                            .build());
        }
        log.info("Obtain Dynamic Info ...");
        List<CompletableFuture<Void>> completableFutures = new LinkedList<>();
        for (PatchJson patchJson : patches) {
            //            if (!patchJson.getPatchName().equals("patch1-Lang-10-kPAR-plausible.patch")) {
            //                continue;
            //            }
            completableFutures.add(CompletableFuture.runAsync(() -> {
                log.info("Patch {} dynamic info collecting ...", patchJson.getPatchName());
                String buggyLine = BuildPath.buildDymicAllFile(dir, patchJson.getPatchName(), true);
                String fixedLine = BuildPath.buildDymicAllFile(dir, patchJson.getPatchName(), false);
                String failingTestContent = FileIO.readFileToString(
                        BuildPath.buildDymicAllFile(dir, patchJson.getPatchName(), true) + ".failing");
                patchJson.setFailingTests(
                        Arrays.stream(failingTestContent.split("\n")).filter(Objects::nonNull)
                                .filter(StringUtils::isNotBlank)
                                .collect(Collectors.toSet()));
                String passingTest =
                        FileIO.readFileToString(Constant.PROJ_INFO + "/passing_tests/" + patchJson.getBugId()
                                .split("-")[0] + "/" + patchJson.getBugId().split("-")[1]);
                Set<String> testSet = new LinkedHashSet<>(Arrays.asList(passingTest.split("\n")));
                testSet.addAll(patchJson.getFailingTests());
                Map<String, Set<String>> buggyMap = obtainTrace(FileIO.readFileToString(buggyLine), testSet);
                Map<String, Set<String>> fixedMap = obtainTrace(FileIO.readFileToString(fixedLine), testSet);
                patchJson.setBuggyTraceInfo(buggyMap);
                patchJson.setFixedTraceInfo(fixedMap);
            }, EXECUTOR));
            CompletableFuture.allOf(completableFutures.toArray(new CompletableFuture[0])).join();
        }
        FileIO.writeStringToFile("./" + dir, JSON.toJSONString(patches));
        log.info("Build Patch Set: {} for Dir {}", patches.size(), dir);
        //multiPcoessCheck(patches);
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
            //            if (!patchJson.getPatchName().equals("patch1-Lang-10-kPAR-plausible.patch")) {
            //                continue;
            //            }
            // check all failing tests have traces
            log.info("Check Patch {}", patchJson.getPatchName());
            Set<String> failingTest = patchJson.getFailingTests();
            Map<String, Set<String>> buggyMap = patchJson.getBuggyTraceInfo();
            Map<String, Set<String>> fixedMap = patchJson.getFixedTraceInfo();

            //            if (!failingTest.stream().allMatch(line -> buggyMap.containsKey(line) && fixedMap
            //            .containsKey(line))) {
            //                log.error("Patch {} does not have failing test trace", patchJson.getPatchName());
            //                failingTestProblemList.putIfAbsent(patchJson.getPatchName(), "");
            //            }
            String combineMethod = patchJson.getCombinedMethod();
            if (!(checkMapTrace(combineMethod,
                    buggyMap.values().stream().flatMap(Set::stream).collect(Collectors.toSet()), true) &&
                    checkMapTrace(combineMethod,
                            fixedMap.values().stream().flatMap(Set::stream).collect(Collectors.toSet()), false))) {
                log.error("Patch {} has a wrong map", patchJson.getPatchName());
                traceProblemList.put(patchJson.getPatchName(), "");
            }
        }
    }

    private static boolean checkMapTrace(String combinedMethod, Set<String> trace, boolean isbuggy) {
        String[] methods = combinedMethod.split("\n");
        String illegalStart = isbuggy ? "+" : "-";
        for (String line : trace) {
            int lineNumber = Integer.parseInt(line.split("#")[1]);
            if (lineNumber >= methods.length || methods[lineNumber].startsWith("//") || methods[lineNumber]
                    .startsWith(illegalStart)) {
                return false;
            }
        }
        return true;
    }

    private static Map<String, Set<String>> obtainTrace(String content, Set<String> testSet) {
        Map<String, Set<String>> map = new LinkedHashMap<>();
        if (StringUtils.isEmpty(content)) {
            return map;
        }
        String[] contentArray = content.split("\n");
        int i = 0;
        while (i < contentArray.length) {
            String line = contentArray[i];
            if (StringUtils.isEmpty(line.trim())) {
                ++i;
                continue;
            }
            String[] lineArray = line.split("\t", 2);
            String key = lineArray[0].split("#")[0];
            if (StringUtils.isBlank(checkTest(testSet, key))) {
                ++i;
                continue;
            }
            if (StringUtils.isBlank(lineArray[1])) {
                ++i;
                boolean find = false;
                while (i < contentArray.length) {
                    line = contentArray[i];
                    String[] currentLineArray = line.split("\t", 2);
                    String currentKey = checkTest(testSet, currentLineArray[0].split("#")[0]);
                    if (StringUtils.isNotBlank(currentKey)) {
                        break;
                    } else {
                        if (StringUtils.isBlank(currentLineArray[1])) {
                            ++i;
                        } else {
                            find = true;
                            break;
                        }
                    }
                }
                if (find) {
                    Set<String> values = Arrays.stream(line.split("\t", 2)[1].split("\t")).filter(Objects::nonNull)
                            .filter(StringUtils::isNotBlank).collect(
                                    Collectors.toSet());
                    if (values.size() > 0) {
                        map.put(checkTest(testSet, key), values);
                    }
                }
            } else {
                Set<String> values =
                        Arrays.stream(line.split("\t", 2)[1].split("\t")).filter(Objects::nonNull)
                                .filter(StringUtils::isNotBlank).collect(
                                Collectors.toSet());
                if (values.size() > 0) {
                    map.put(checkTest(testSet, key), values);
                }
                ++i;
            }
        }
        return map;
    }

    private static String checkTest(Set<String> testSet, String testLine) {
        if (testSet.contains(testLine)) {
            return testLine;
        }
        if (!testLine.contains("$")) {
            return "";
        }
        String test = testLine.split("\\$")[0] + "::" + testLine.split("::")[1];
        return testSet.contains(test) ? test : "";
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
