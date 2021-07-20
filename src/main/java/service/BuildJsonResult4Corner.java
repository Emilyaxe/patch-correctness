package service;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSON;

import config.Constant;
import entity.Patch;
import entity.PatchJson;
import lombok.extern.slf4j.Slf4j;
import util.BuildPath;
import util.FileIO;

@Slf4j
public class BuildJsonResult4Corner {
    public static void BuildPatchJson(String dir) {
        List<PatchJson> patches =
                JSON.parseArray(FileIO.readFileToString("./result/combineInfo/" + dir + "_unpurify.bak"),
                        PatchJson.class);
        log.info("Obtain Dynamic Info ...");


        for (PatchJson patchJson : patches) {
            if (!patchJson.getPatchName().equals("Math93b_Patch207")) {
                continue;
            }
            List<Patch> testPatches = ObtainPatches.readTestPatches();
            Map<String, List<Patch>> testSubjectPatchMap =
                    testPatches.stream().collect(Collectors.groupingBy(Patch::getBugId));
            String combinedMethod = Patch.findMethods4Corner(testSubjectPatchMap, "testSet", false);
            patchJson.setCombinedMethod(combinedMethod);


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

            Map<String, List<String>> buggyMap = Collections.emptyMap(),
                    fixedMap = Collections.emptyMap();
            if (new File(buggyLine).length() / 1024.0 / 1024.0 / 1024.0 > 3.0) {
                try {
                    buggyMap = BuildJsonResult.obtainTraceByFile(buggyLine, testSet);
                } catch (OutOfMemoryError e) {
                    //traceProblemList.put(patchJson.getPatchName(), "");
                }
            } else {
                try {
                    buggyMap = BuildJsonResult.obtainTrace(FileIO.readFileToString(buggyLine), testSet);
                } catch (OutOfMemoryError e) {
                    //traceProblemList.put(patchJson.getPatchName(), "");
                }
            }
            if (new File(fixedLine).length() / 1024.0 / 1024.0 / 1024.0 > 3.0) {
                try {
                    fixedMap = BuildJsonResult.obtainTraceByFile(fixedLine, testSet);
                } catch (OutOfMemoryError e) {
                    //traceProblemList.put(patchJson.getPatchName(), "");
                }
            } else {
                try {
                    fixedMap = BuildJsonResult.obtainTrace(FileIO.readFileToString(fixedLine), testSet);
                } catch (OutOfMemoryError e) {
                    //traceProblemList.put(patchJson.getPatchName(), "");
                }
            }
            patchJson.setBuggyTraceInfo(buggyMap);
            patchJson.setFixedTraceInfo(fixedMap);

        }
        FileIO.writeStringToFile("./result/" + dir + "_unpurify", JSON.toJSONString(patches));
        log.info("Build Patch Set: {} for Dir {}", patches.size(), dir);
    }

    public static void main(String[] args) {
        BuildPatchJson("testSet");
    }
}
