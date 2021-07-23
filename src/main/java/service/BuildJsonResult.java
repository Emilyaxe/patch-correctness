package service;

import static util.AsyExecutor.EXECUTOR;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
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

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;

import config.Constant;
import entity.PatchJson;
import lombok.extern.slf4j.Slf4j;
import util.BuildPath;
import util.FileIO;

@Slf4j
public class BuildJsonResult {

    public static Map<String, String> failingTestProblemList = new ConcurrentHashMap<>();
    public static Map<String, String> traceProblemList = new ConcurrentHashMap<>();
    //public static Map<String, String> skipPatches = new ConcurrentHashMap<>();

    private static Gson gson = new Gson();

    public static void BuildPatchJson(String dir) {
        List<PatchJson> patches = new LinkedList<>();
        JSONObject jsonObject = JSON
                .parseObject(FileIO.readFileToString(BuildPath.buildMethodReFile(dir)));
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
            patches.add(PatchJson.builder().patchName(patchName).bugId(bugid).label(label)
                    .combinedMethod(combinedMethod).build());
        }
        log.info("Obtain Dynamic Info ...");
        List<CompletableFuture<Void>> completableFutures = new LinkedList<>();
        for (PatchJson patchJson : patches) {
            //            if (!patchJson.getPatchName().equals("Math93b_Patch207")) {
            //                continue;
            //            }
            completableFutures.add(CompletableFuture.runAsync(() -> {
                log.info("Patch {} dynamic info collecting ...", patchJson.getPatchName());
                String buggyLine = BuildPath.buildDymicAllFile(dir, patchJson.getPatchName(), true);
                String fixedLine = BuildPath.buildDymicAllFile(dir, patchJson.getPatchName(),
                        false);
                String failingTestContent = FileIO.readFileToString(
                        BuildPath.buildDymicAllFile(dir, patchJson.getPatchName(), true)
                                + ".failing");
                patchJson.setFailingTests(
                        Arrays.stream(failingTestContent.split("\n")).filter(Objects::nonNull)
                                .filter(StringUtils::isNotBlank).collect(Collectors.toSet()));
                String passingTest = FileIO.readFileToString(
                        Constant.PROJ_INFO + "/passing_tests/" + patchJson.getBugId().split("-")[0]
                                + "/" + patchJson.getBugId().split("-")[1]);
                Set<String> testSet = new LinkedHashSet<>(Arrays.asList(passingTest.split("\n")));
                testSet.addAll(patchJson.getFailingTests());
                Map<String, List<String>> buggyMap, fixedMap;
                try {
                    if (new File(buggyLine).length() / 1024.0 / 1024.0 / 1024.0 > 3.0) {
                        buggyMap = obtainTraceByFile(buggyLine, testSet);
                    } else {
                        buggyMap = obtainTrace(FileIO.readFileToString(buggyLine), testSet);
                    }
                    if (new File(fixedLine).length() / 1024.0 / 1024.0 / 1024.0 > 3.0) {
                        fixedMap = obtainTraceByFile(fixedLine, testSet);
                    } else {
                        fixedMap = obtainTrace(FileIO.readFileToString(fixedLine), testSet);
                    }
                    patchJson.setBuggyTraceInfo(buggyMap);
                    patchJson.setFixedTraceInfo(fixedMap);
                } catch (OutOfMemoryError error) {
                    log.error("patch {} out of memory error!", patchJson.getPatchName(), error);
                    traceProblemList.put(patchJson.getPatchName(), "");
                }
            }, EXECUTOR));
        }
        CompletableFuture.allOf(completableFutures.toArray(new CompletableFuture[0])).join();
        // FileIO.writeStringToFile("../result/combineInfo/" + dir + "_unpurify_list", gson.toJson(patches));

        for (PatchJson patchJson : patches) {
            FileIO.writeStringToFile("../result/combineInfo/" + dir + "_unpurify_list",
                    JSON.toJSONString(patchJson), true);
        }

        log.info("Build Patch Set: {} for Dir {}", patches.size(), dir);
        log.info("Out of Memory: {}", StringUtils.join("\n", traceProblemList.keySet()));
        //multiPcoessCheck(patches);
    }

    public static Map<String, List<String>> obtainTraceByFile(String file, Set<String> testSet)
            throws OutOfMemoryError {
        Map<String, List<String>> map = new LinkedHashMap<>();
        try (FileInputStream inputStream = new FileInputStream(file);
                BufferedReader bufferedReader = new BufferedReader(
                        new InputStreamReader(inputStream))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (StringUtils.isEmpty(line.trim())) {
                    continue;
                }
                String[] lineArray = line.split("\t", 2);
                String key = lineArray[0].split("#")[0];
                if (StringUtils.isBlank(checkTest(testSet, key))) {
                    continue;
                }
                if (StringUtils.isBlank(lineArray[1])) {
                    boolean find = false;
                    String str;
                    while ((str = bufferedReader.readLine()) != null) {
                        String[] currentLineArray = str.split("\t", 2);
                        String currentKey = checkTest(testSet, currentLineArray[0].split("#")[0]);
                        if (StringUtils.isNotBlank(currentKey)) {
                            break;
                        } else {
                            if (StringUtils.isNotBlank(currentLineArray[1])) {
                                find = true;
                                break;
                            }
                        }
                    }
                    if (find) {
                        List<String> values = Arrays.stream(line.split("\t", 2)[1].split("\t"))
                                .filter(Objects::nonNull).filter(StringUtils::isNotBlank)
                                .map(lineNumber -> lineNumber.split("#")[1])
                                .collect(Collectors.toList());
                        if (values.size() > 0) {
                            map.put(checkTest(testSet, key), values);
                        }
                    }
                } else {
                    List<String> values = Arrays.stream(line.split("\t", 2)[1].split("\t"))
                            .filter(Objects::nonNull).filter(StringUtils::isNotBlank)
                            .map(lineNumber -> lineNumber.split("#")[1])
                            .collect(Collectors.toList());
                    if (values.size() > 0) {
                        map.put(checkTest(testSet, key), values);
                    }
                }
            }

        } catch (Exception e) {
            log.error("file {} obtain trace failed!", file, e);
        }
        return map;
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
            //            if (!patchJson.getPatchName().equals("patch1-Math-31-Kali-plausible.patch")) {
            //                continue;
            //            }
            // check all failing tests have traces
            log.info("Check Patch {}", patchJson.getPatchName());
            Set<String> failingTest = patchJson.getFailingTests();
            Map<String, List<String>> buggyMap = patchJson.getBuggyTraceInfo();
            Map<String, List<String>> fixedMap = patchJson.getFixedTraceInfo();

            //            if (!failingTest.stream().allMatch(line -> buggyMap.containsKey(line) && fixedMap
            //            .containsKey(line))) {
            //                log.error("Patch {} does not have failing test trace", patchJson.getPatchName());
            //                failingTestProblemList.putIfAbsent(patchJson.getPatchName(), "");
            //            }
            String combineMethod = patchJson.getCombinedMethod();
            if (!(checkMapTrace(combineMethod,
                    buggyMap.values().stream().flatMap(List::stream).collect(Collectors.toSet()),
                    true)
                    && checkMapTrace(combineMethod, fixedMap.values().stream().flatMap(List::stream)
                    .collect(Collectors.toSet()), false))) {
                log.error("Patch {} has a wrong map", patchJson.getPatchName());
                traceProblemList.put(patchJson.getPatchName(), "");
            }
        }
    }

    private static boolean checkMapTrace(String combinedMethod, Set<String> trace,
            boolean isbuggy) {
        String[] methods = combinedMethod.split("\n");
        String illegalStart = isbuggy ? "+" : "-";
        for (String line : trace) {
            int lineNumber = Integer.parseInt(line.split("#")[1]);
            if (lineNumber >= methods.length || methods[lineNumber].startsWith("//")
                    || methods[lineNumber].startsWith(illegalStart)) {
                return false;
            }
        }
        return true;
    }

    public static Map<String, List<String>> obtainTrace(String content, Set<String> testSet) {
        Map<String, List<String>> map = new LinkedHashMap<>();
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
                    List<String> values = Arrays.stream(line.split("\t", 2)[1].split("\t"))
                            .filter(Objects::nonNull).filter(StringUtils::isNotBlank)
                            .map(lineNumber -> lineNumber.split("#")[1])
                            .collect(Collectors.toList());
                    if (values.size() > 0) {
                        map.put(checkTest(testSet, key), values);
                    }
                }
            } else {
                List<String> values = Arrays.stream(line.split("\t", 2)[1].split("\t"))
                        .filter(Objects::nonNull).filter(StringUtils::isNotBlank)
                        .map(lineNumber -> lineNumber.split("#")[1])
                        .collect(Collectors.toList());
                if (values.size() > 0) {
                    map.put(checkTest(testSet, key), values);
                }
                ++i;
            }
        }
        return map;
    }

    private static String checkTest(Set<String> testSet, String testLine) {
        // for randoop case which does not have testSet
        if (testSet.isEmpty()) {
            return testLine;
        }
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
        //                BuildPatchJson("trainSet");
        //                BuildPatchJson("testSet");
        //BuildPatchJson("correctSet");
        processCornerCase();

        log.info("failingTestProblemList: {}",
                StringUtils.join(failingTestProblemList.keySet(), ","));
        log.info("traceProblemList: {}", StringUtils.join(traceProblemList.keySet(), ","));
        //        String trainStatic = FileIO.readFileToString(BuildPath.buildMethodReFile("trainSet"));
        //        String correctStatic = FileIO.readFileToString(BuildPath.buildMethodReFile("correctSet"));
    }

    private static Map<String, List<String>> updateLineNumber(Map<String, List<String>> map) {
        return map.entrySet().stream().peek(entry -> entry.setValue(entry.getValue().stream()
                .map(line -> line.split("#")[0] + "#" + (Integer.parseInt(line.split("#")[1]) + 1))
                .collect(Collectors.toList())))
                .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (v1, v2) -> v2));
    }

    private static void processCornerCase() {
        String content = FileIO.readFileToString(Constant.HOME +
                "/result/combineInfo/correctSet_unpurify_list");

        List<PatchJson> patchJsons =
                Arrays.stream(content.split("\n"))
                        .filter(Objects::nonNull)
                        .filter(StringUtils::isNotBlank)
                        .map(line -> gson.fromJson(line, PatchJson.class))
                        .collect(Collectors.toList());

        patchJsons.stream().filter(patchJson -> patchJson.getPatchName().equals("Closure_16.src.patch"))
                .forEach(patchJson -> {
                    patchJson.setBuggyTraceInfo(updateLineNumber(patchJson.getBuggyTraceInfo()));
                    patchJson.setFixedTraceInfo(updateLineNumber(patchJson.getFixedTraceInfo()));
                });

        if (new File(Constant.HOME + "/result/combineInfo/correctSet_unpurify_list").exists()) {
            try {
                FileUtils.forceDelete(new File(Constant.HOME +
                        "/result/combineInfo/correctSet_unpurify_list"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        for (PatchJson patchJson : patchJsons) {
            FileIO.writeStringToFile(Constant.HOME + "/result/combineInfo/correctSet_unpurify_list",
                    JSON.toJSONString(patchJson), true);
        }

        //        try {
        //
        //            FileInputStream inputStream = null;
        //            try {
        //                inputStream = new FileInputStream(Constant.HOME +
        //                        "/result/combineInfo/correctSet_unpurify_list");
        //            } catch (FileNotFoundException e) {
        //                e.printStackTrace();
        //            }
        //            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        //
        //            String str = null;
        //            while ((str = bufferedReader.readLine()) != null) {
        //                //System.out.println(str);
        //                if (StringUtils.isNotBlank(str)) {
        //                    PatchJson patchJson = JSON.parseObject(str, PatchJson.class);
        //                    if (!patchJson.getPatchName().equals("Closure_16.src.patch")) {
        //                        continue;
        //                    }
        //                    patchJson.setBuggyTraceInfo(updateLineNumber(patchJson.getBuggyTraceInfo()));
        //                }
        //            }
        //
        //            //close
        //            inputStream.close();
        //            bufferedReader.close();
        //        } catch (Exception e) {
        //            e.printStackTrace();
        //        }


        //        List<PatchJson> patchJsons =
        //                JSON.parseArray(FileIO.readFileToString(Constant.HOME +
        //                "/result/combineInfo/correctSet_unpurify_list"),
        //                        PatchJson.class);

        //        FileIO.writeStringToFile(Constant.HOME + "/result/combineInfo/correctSet_unpurify_list",
        //                JSON.toJSONString(patchJsons));

        log.info("finish process corner case");
    }
}
