package service;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.collections4.MapUtils;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.ImmutableMap;

import config.Constant;
import entity.PatchJson;
import lombok.extern.slf4j.Slf4j;
import util.FileIO;

@Slf4j
public class CheckResult {

    public static void mainProcess() {
        // read patches
        String testFile = Constant.HOME + "/result/testSet";
        List<PatchJson> testFileList = JSON.parseArray(FileIO.readFileToString(testFile), PatchJson.class);
        testFileList.forEach(patchJson -> patchJson
                .setPatchPath(Constant.HOME + "/Patches/DataSet/testSet/" + patchJson.getPatchName()));

        String trainFile = Constant.HOME + "/result/trainSet";
        List<PatchJson> trainFileList = JSON.parseArray(FileIO.readFileToString(trainFile), PatchJson.class);
        trainFileList.forEach(patchJson -> patchJson
                .setPatchPath(Constant.HOME + "/Patches/DataSet/trainSet/" + patchJson.getPatchName()));

        String correctFile = Constant.HOME + "/result/correctSet";
        List<PatchJson> correctFileList = JSON.parseArray(FileIO.readFileToString(correctFile), PatchJson.class);
        correctFileList.forEach(patchJson -> patchJson
                .setPatchPath(Constant.HOME + "/Patches/DataSet/correctSet/" + patchJson.getPatchName()));
        List<PatchJson> patchJsons = Stream.of(testFileList, trainFileList, correctFileList)
                .flatMap(List::stream).collect(Collectors.toList());

        log.info("All Patches: {}", patchJsons.size());
        Map<String, PatchJson> patchMap =
                Stream.of(testFileList, trainFileList, correctFileList)
                        .flatMap(List::stream).collect(
                        Collectors.toMap(PatchJson::getPatchName, Function.identity(), (v1, v2) -> v2));

        //String[] problemPatchList = problemPatches.split(",");

        // 1. all tests have no trace
        String allTestNoTrace = patchJsons.stream().filter(Objects::nonNull)
                .filter(patchJson -> MapUtils.isEmpty(patchJson.getBuggyTraceInfo())).map(PatchJson::getPatchName)
                .collect(Collectors.joining(","));
        log.error("all test have no trace on buggy version: {}", allTestNoTrace);

        // 2. all  tests have no trace
        String allTestNoTraceFixed = patchJsons.stream().filter(Objects::nonNull)
                .filter(patchJson -> MapUtils.isEmpty(patchJson.getFixedTraceInfo())).map(PatchJson::getPatchName)
                .collect(Collectors.joining(","));
        log.error("all test have no trace on fixed version: {}", allTestNoTraceFixed);


        // 1. all failing tests have no trace
        String allFailingTestNoTrace = patchJsons.stream().filter(Objects::nonNull)
                .filter(patchJson -> patchJson.getFailingTests().stream()
                        .noneMatch(test -> patchJson.getBuggyTraceInfo().containsKey(test)))
                .map(PatchJson::getPatchName)
                .collect(Collectors.joining(","));
        log.error("all falling test have no trace on buggy version: {}", allFailingTestNoTrace);

        // 2. all  failing tests have no trace
        String allFailingTestNoTraceFixed = patchJsons.stream().filter(Objects::nonNull)
                .filter(patchJson -> patchJson.getFailingTests().stream()
                        .noneMatch(test -> patchJson.getFixedTraceInfo().containsKey(test)))
                .map(PatchJson::getPatchName)
                .collect(Collectors.joining(","));
        log.error("all falling test have no trace on fixed version: {}", allFailingTestNoTraceFixed);


        // 1. all passing tests have no trace
        String allPassingTestNoTrace = patchJsons.stream().filter(Objects::nonNull)
                .filter(patchJson -> patchJson.getBuggyTraceInfo().keySet().stream()
                        .allMatch(test -> patchJson.getFailingTests().contains(test)))
                .map(PatchJson::getPatchName)
                .collect(Collectors.joining(","));
        log.error("all passing test have no trace on buggy version: {}", allPassingTestNoTrace);

        // 2. all  passing tests have no trace
        String allPassingTestNoTraceFixed = patchJsons.stream().filter(Objects::nonNull)
                .filter(patchJson -> patchJson.getFixedTraceInfo().keySet().stream()
                        .allMatch(test -> patchJson.getFailingTests().contains(test)))
                .map(PatchJson::getPatchName)
                .collect(Collectors.joining(","));
        log.error("all passing test have no trace on fixed version: {}", allPassingTestNoTraceFixed);

        // 3. patch has multiple modification
        String multipleModification =
                patchJsons.stream().filter(Objects::nonNull)
                        .filter(patchJson -> FileIO.readFileToString(patchJson.getPatchPath()).split("--- ").length > 1)
                        .map(PatchJson::getPatchName).collect(Collectors.joining(","));
        log.error("multiple modification test have no trace: {}", multipleModification);

        // 4. other
        // failing test has no trace
        String other = patchJsons.stream().map(patchMap::get).filter(Objects::nonNull)
                .filter(patchJson -> patchJson.getBuggyTraceInfo().keySet().containsAll(patchJson.getFailingTests())
                        && patchJson.getFixedTraceInfo().keySet().containsAll(patchJson.getFailingTests()))
                .map(patchJson -> JSON
                        .toJSONString(ImmutableMap.of(patchJson.getPatchName(), patchJson.getFailingTests().stream()
                                .filter(test -> !patchJson.getBuggyTraceInfo().containsKey(test) || !patchJson
                                        .getFixedTraceInfo().containsKey(test)).collect(
                                        Collectors.toList())))).collect(Collectors.joining(","));
        log.error("other test have no trace: {}", other);
    }

    public static void main(String[] args) {
        mainProcess();
    }


}
