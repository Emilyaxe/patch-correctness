package service;

import java.util.Arrays;
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

        Map<String, PatchJson> patchMap =
                Stream.of(testFileList, trainFileList, correctFileList)
                        .flatMap(List::stream).collect(
                        Collectors.toMap(PatchJson::getPatchName, Function.identity(), (v1, v2) -> v2));

        String[] problemPatchList = problemPatches.split(",");

        // 1. all tests have no trace
        String allTestNoTrace = Arrays.stream(problemPatchList).map(patchMap::get).filter(Objects::nonNull)
                .filter(patchJson -> MapUtils.isEmpty(patchJson.getBuggyTraceInfo()) || MapUtils
                        .isEmpty(patchJson.getFixedTraceInfo())).map(PatchJson::getPatchName)
                .collect(Collectors.joining(","));
        log.error("all test have no trace: {}", allTestNoTrace);

        // 2. all failing tests have no trace
        String allFailingTestNoTrace = Arrays.stream(problemPatchList).map(patchMap::get).filter(Objects::nonNull)
                .filter(patchJson -> MapUtils.isEmpty(patchJson.getFixedTraceInfo())).map(PatchJson::getPatchName)
                .collect(Collectors.joining(","));
        log.error("all failing test have no trace: {}", allFailingTestNoTrace);

        // 3. patch has multiple modification
        String multipleModification =
                Arrays.stream(problemPatchList).map(patchMap::get).filter(Objects::nonNull)
                        .filter(patchJson -> FileIO.readFileToString(patchJson.getPatchPath()).split("--- ").length > 1)
                        .map(PatchJson::getPatchName).collect(Collectors.joining(","));
        log.error("multiple modification test have no trace: {}", multipleModification);

        // 4. other
        // failing test has no trace
        String other = Arrays.stream(problemPatchList).map(patchMap::get).filter(Objects::nonNull)
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

    public static String problemPatches =
            "Math_77.src.patch,Chart14b_Patch188,patch1-Chart-4-SOFix.patch,Math_39.src.patch,Lang_36.src.patch,"
                    + "patch1-Lang-10-jKali.patch,patch1-Chart-4-kPAR.patch,patch1-Math-35-ACS.patch,"
                    + "patch21-Math-53-Jaid-plausible.patch,Chart_19.src.patch,patch1-Chart-19-AVATAR.patch,"
                    + "Math35b_Patch199,Lang_20.src.patch,patch1-Math-53-jGenProg.patch,"
                    + "patch1-Math-6-AVATAR-plausible.patch,patch1-Lang-59-SOFix.patch,Math69b_Patch169,Math_31"
                    + ".src.patch,Lang_50.src.patch,patch1-Math-80-Arja-plausible.patch,patch1-Lang-57-TBar"
                    + ".patch,patch1-Math-49-AVATAR-plausible.patch,patch1-Math-35-Arja-plausible.patch,"
                    + "Closure_79.src.patch,Closure_47.src.patch,Math_1.src.patch,Math_41.src.patch,Time_22.src"
                    + ".patch,Math_54.src.patch,patch1-Math-41-SimFix.patch,Lang_15.src.patch,"
                    + "patch1-Lang-57-kPAR-plausible.patch,Math49b_Patch165,Closure_46.src.patch,Math_102.src"
                    + ".patch,patch1-Math-4-AVATAR.patch,patch1-Math-53-CapGen.patch,"
                    + "patch1-Chart-25-TBar-plausible.patch,patch1-Math-49-Kali-plausible.patch,"
                    + "patch1-Math-4-ACS-plausible.patch,patch1-Chart-25-Arja-plausible.patch,"
                    + "patch1-Math-29-jKali-plausible.patch,Lang_60.src.patch,patch1-Math-53-Jaid-plausible"
                    + ".patch,patch1-Math-20-FixMiner-plausible.patch,patch1-Math-6-SimFix-plausible.patch,"
                    + "patch1-Math-53-Jaid.patch,Lang_35.src.patch,Math41b_Patch162,Lang_48.src.patch,"
                    + "patch1-Lang-7-Arja-plausible.patch,patch1-Lang-10-kPAR-plausible.patch,"
                    + "patch1-Math-15-kPAR-plausible.patch,Lang_42.src.patch,Math_37.src.patch,Chart19b_Patch189,"
                    + "patch1-Math-69-Nopol-plausible.patch,patch1-Math-41-DynaMoth-plausible.patch,"
                    + "patch1-Lang-57-AVATAR.patch,Lang_47.src.patch,patch1-Lang-13-AVATAR-plausible.patch,"
                    + "Chart_8.src.patch,patch1-Chart-14-Arja-plausible.patch,Closure_106.src.patch,Time_6.src"
                    + ".patch,patch1-Lang-13-RSRepair-plausible.patch,Lang_10.src.patch,patch1-Closure-46-AVATAR"
                    + ".patch,patch1-Lang-20-Arja-plausible.patch,patch1-Lang-10-TBar.patch,Math53b_Patch47,"
                    + "Math_36.src.patch,Math_6.src.patch,Closure_60.src.patch,patch2-Lang-57-CapGen.patch,"
                    + "Math4b_Patch195,Closure_89.src.patch,Time_12.src.patch,patch1-Chart-14-ACS.patch,"
                    + "patch1-Lang-57-CapGen.patch,Lang_8.src.patch,Chart_2.src.patch,Math_22.src.patch,"
                    + "patch3-Math-53-Jaid-plausible.patch,Math_29.src.patch,Math_67.src.patch,"
                    + "patch1-Math-49-DynaMoth-plausible.patch,Math_35.src.patch,patch1-Math-49-Nopol-plausible"
                    + ".patch,Math28b_Patch158,Lang57b_PatchHDRepair1,patch2-Math-53-CapGen-plausible.patch,"
                    + "Math_53.src.patch,Chart_22.src.patch,Lang_30.src.patch,Closure_27.src.patch,"
                    + "patch1-Math-41-Nopol-plausible.patch,Math_49.src.patch,patch1-Math-53-SimFix.patch,Lang_41"
                    + ".src.patch,Math_15.src.patch,Chart_25.src.patch,Math_4.src.patch,patch1-Chart-8-CapGen"
                    + ".patch,patch1-Lang-35-ACS-plausible.patch,patch1-Math-15-TBar-plausible.patch,"
                    + "patch2-Math-53-Jaid-plausible.patch,Math_71.src.patch,Lang35b_Patch192,Math_101.src.patch,"
                    + "Chart_15.src.patch,patch1-Math-31-GenProg-plausible.patch,Closure_80.src.patch,"
                    + "patch1-Chart-15-TBar-plausible.patch,Chart_4.src.patch,Math_69.src.patch,"
                    + "patch1-Chart-12-GenProg-plausible.patch,Lang_9.src.patch,Math_43.src.patch,Time_3.src"
                    + ".patch,patch3-Lang-57-CapGen.patch,Lang_13.src.patch";
}
