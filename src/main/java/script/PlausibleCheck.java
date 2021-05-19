package script;

import static main.ObtainTraceInfo.compile;
import static util.AsyExecutor.EXECUTOR;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import config.Constant;
import entity.Patch;
import entity.Subject;
import lombok.extern.slf4j.Slf4j;
import main.ObtainTraceInfo;
import run.Runner;
import service.ObtainPatches;
import service.ProcessPatch;
import util.FileIO;

@Slf4j
public class PlausibleCheck {

    public static Map<String, String> inplausiblePatches = new ConcurrentHashMap<>();

    public static void moveTestSet() {
        String[] testSet = { "Math88b_Patch74", "Lang46b_Patch22", "Math79b_Patch77",
                "Math22b_PatchHDRepair3", "Math4b_Patch155", "Chart13b_Patch9",
                "Lang57b_PatchHDRepair1", "Time11b_Patch182", "Time12b_Patch183" };
        String sourceDir = Constant.HOME + "/Patches/experiment3/TestSet/";
        String targetDir = Constant.HOME + "/Patches/DataSet/tmp/";
        for (String patch : testSet) {
            String sourceFile = sourceDir + patch.split("_")[1];
            String targetFile = targetDir + patch;
            try {
                FileUtils.copyFile(new File(sourceFile), new File(targetFile));
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }

    public static void moveTrainSet() {
        String trainPatches = "patch1-Math-72-SimFix-plausible.patch,patch1-Math-71-SimFix.patch,"
                + "patch1-Lang-60-SimFix-plausible.patch,patch1-Chart-3-SimFix-plausible.patch,"
                + "patch1-Math-69-SimFix-plausible.patch,patch1-Closure-6-SimFix.patch,patch1-Math-22-FixMiner.patch,"
                + "patch1-Math-1-SimFix-plausible.patch,patch1-Lang-41-SimFix-plausible.patch,"
                + "patch1-Chart-25-SimFix-plausible.patch,patch1-Math-98-Arja.patch,patch1-Math-31-Kali-plausible"
                + ".patch,patch1-Closure-106-SimFix-plausible.patch,patch1-Lang-20-AVATAR-plausible.patch,"
                + "patch1-Chart-25-kPAR-plausible.patch,patch1-Chart-18-DynaMoth-plausible.patch,"
                + "patch1-Lang-20-kPAR-plausible.patch,patch1-Chart-14-AVATAR-plausible.patch,"
                + "patch1-Lang-9-SimFix-plausible.patch,patch1-Closure-26-SimFix-plausible.patch,"
                + "patch1-Chart-20-SimFix.patch,patch1-Chart-14-TBar-plausible.patch,patch1-Lang-41-TBar-plausible"
                + ".patch,patch1-Math-57-jMutRepair-plausible.patch,patch1-Lang-47-TBar.patch,"
                + "patch1-Chart-18-SimFix-plausible.patch,patch1-Math-103-RSRepair-plausible.patch,"
                + "patch1-Lang-61-SimFix-plausible.patch,patch1-Math-4-Nopol-plausible.patch,"
                + "patch1-Math-80-jMutRepair-plausible.patch,patch1-Math-43-SimFix-plausible.patch,"
                + "patch1-Math-71-DynaMoth-plausible.patch,patch1-Chart-14-FixMiner-plausible.patch,"
                + "patch1-Closure-126-SimFix-plausible.patch,patch1-Lang-1-SimFix-plausible.patch,"
                + "patch1-Closure-109-SimFix-plausible.patch,patch1-Math-20-Nopol-plausible.patch,"
                + "patch1-Chart-22-SimFix-plausible.patch,patch1-Lang-10-SimFix-plausible.patch,"
                + "patch1-Lang-20-TBar-plausible.patch,patch1-Lang-12-SimFix-plausible.patch,"
                + "patch1-Lang-50-SimFix-plausible.patch,patch1-Lang-53-kPAR-plausible.patch,"
                + "patch1-Math-43-kPAR-plausible.patch";
        String sourceDircor = Constant.HOME + "/Patches/ASE20/Correct/";
        String sourceDirIncor = Constant.HOME + "/Patches/ASE20/Overfitting/";
        String targetDir = Constant.HOME + "/Patches/DataSet/tmp/";
        for (String patch : trainPatches.split(",")) {

            String sourceFile = !patch.contains("plausible") ? sourceDircor + patch : sourceDirIncor
                    + patch;
            String targetFile = targetDir + patch;
            try {
                FileUtils.copyFile(new File(sourceFile), new File(targetFile));
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }

    public static void checkPlausible() {
        Map<String, List<Patch>> subjectPatchMap = patchCollection();
        List<CompletableFuture<Void>> futureList = new LinkedList<>();
        for (Entry<String, List<Patch>> entry : subjectPatchMap.entrySet()) {
            futureList.add(CompletableFuture.runAsync(() -> {
                try {
                    testPlausible(entry);
                } catch (Exception e) {
                    log.error("obtain trace failed! subject {}", entry.getKey(), e);
                }
            }, EXECUTOR));
        }
        CompletableFuture.allOf(futureList.toArray(new CompletableFuture[0])).join();
        log.info("inplausible patches {}", StringUtils.join(inplausiblePatches.values(), "\n"));
    }

    private static void testPlausible(Entry<String, List<Patch>> entry) {
        String[] sub = entry.getKey().split("-");
        Subject subject = new Subject(sub[0], Integer.parseInt(sub[1]));
        for (Patch patch : entry.getValue()) {
            //            if (!patch.getPatchName().equals("patch1-Math-53-Jaid-plausible.patch")) {
            //                continue;
            //            }
            ObtainTraceInfo.cleanSubject(subject.getHome() + subject.get_ssrc());
            log.info("Process for Patch {}", patch.getPatchName());
            try {
                ProcessPatch.createCombinedFixed4AllFiles(patch, false);
                if (!compile(subject)) {
                    log.error("Patch {}, Compile Error on fixed version!", patch.getPatchName());
                    continue;
                }
                List<String> message = Runner.runTestSuite(subject);
                //log.info(StringUtils.join(message, "\n"));
                if (CollectionUtils.isEmpty(message) || message.stream().filter(Objects::nonNull)
                        .noneMatch(element -> element.contains(Runner.SUCCESSTEST))) {
                    inplausiblePatches.put(patch.getPatchName(), patch.getPatchPath());
                    log.error("Patch {}, Should Pass! \n {} ", patch.getPatchName(),
                            StringUtils.join(message, "\n"));
                }
            } catch (Exception e) {
                log.error("process test on fixed version failed! subject {} patch {}",
                        subject.get_name() + subject.get_id(), patch.getPatchName(), e);
            }
        }
    }

    public static Map<String, List<Patch>> patchCollection() {
        List<Patch> trainPatch = ObtainPatches.readTrainPatches();
        List<Patch> testPatch = ObtainPatches.readTestPatches();
        List<Patch> tmpPatch = new LinkedList<>();
        String targetDir = Constant.HOME + "/Patches/DataSet/tmp/";
        for (File f : new File(targetDir).listFiles()) {
            String fileName = f.getName();
            String filePath = f.getAbsolutePath();
            if (fileName.contains("_")) {
                String res = fileName.split("b_")[0];
                String id = StringUtils.getDigits(res);
                String name = res.split(id)[0];
                String bugid = name + "-" + id;
                tmpPatch.add(Patch.builder().patchName(fileName).patchPath(filePath).bugid(bugid)
                        .build());
            } else {
                String[] result = fileName.split("-");
                String bugid = result[1] + "-" + result[2];
                tmpPatch.add(Patch.builder().patchName(fileName).patchPath(filePath).bugid(bugid)
                        .build());
            }
        }
        List<Patch> allPatches = new LinkedList<>();
        allPatches.addAll(trainPatch);
        allPatches.addAll(testPatch);
        allPatches.addAll(tmpPatch);
        log.info("All Patches {}", allPatches.size());
        return allPatches.stream().collect(Collectors.groupingBy(Patch::getBugid));
    }

    private static void checkResult() {
        String file = "./log/inplausible";
        String file18 = "./log/inplausible18.log";
        String content18 = FileIO.readFileToString(file18);
        String content = FileIO.readFileToString(file);
        Set<String> contentOnly = Arrays.stream(content.split("\n"))
                .filter(line -> !content18.contains(line)).collect(Collectors.toSet());
        Set<String> content18Only = Arrays.stream(content18.split("\n"))
                .filter(line -> !content.contains(line)).collect(Collectors.toSet());
        //        Set<String> tmpPatch =
        //                Arrays.stream(content.split("\n")).filter(line -> line.contains("tmp")).collect(Collectors
        //                .toSet());
        //        Set<String> trainPatch =
        //                Arrays.stream(content.split("\n")).filter(line -> line.contains("trainSet"))
        //                        .collect(Collectors.toSet());
        //        Set<String> testPatch = Arrays.stream(content.split("\n")).filter(line -> line.contains("testSet"))
        //                .collect(Collectors.toSet());
        log.info("finish!");

    }

    public static void main(String[] args) {
        //moveTestSet();
        // moveTrainSet();
        //checkPlausible();
        checkResult();
    }
}
