package service;

import java.io.File;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.alibaba.fastjson.JSON;

import entity.PatchJson;
import lombok.extern.slf4j.Slf4j;
import util.BuildPath;
import util.FileIO;

@Slf4j
public class BuildJsonResult4Randoop {
    public static void BuildPatchJson(String dir) {
        List<PatchJson> patches =
                JSON.parseArray(FileIO.readFileToString("./result/combineInfo/" + dir + "_unpurify"), PatchJson.class);
        log.info("Obtain Dynamic Info ...");


        for (PatchJson patchJson : patches) {
            if (!(patchJson.getPatchName().equals("Math93b_Patch207") || patchJson.getPatchName()
                    .equals("Lang58b_Patch26"))) {
                continue;
            }


            String buggyLine = BuildPath.buildRandoopFile(dir, patchJson.getPatchName(), true);
            String fixedLine = BuildPath.buildRandoopFile(dir, patchJson.getPatchName(),
                    false);

            Set<String> testSet = new LinkedHashSet<>();
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

            patchJson.getBuggyTraceInfo().putAll(buggyMap);
            patchJson.getFixedTraceInfo().putAll(fixedMap);
            log.info("end!");
        }
        //FileIO.writeStringToFile("./result/" + dir + "_unpurify", JSON.toJSONString(patches));
        log.info("Build Patch Set: {} for Dir {}", patches.size(), dir);
    }

    public static void main(String[] args) {
        BuildPatchJson("testSet");
    }
}
