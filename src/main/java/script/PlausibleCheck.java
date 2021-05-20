package script;

import static util.AsyExecutor.EXECUTOR;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
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
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

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

    public static void moveTestSet() {
        String[] testSet = {"Math88b_Patch74", "Lang46b_Patch22", "Math79b_Patch77",
                "Math22b_PatchHDRepair3", "Math4b_Patch155", "Chart13b_Patch9",
                "Lang57b_PatchHDRepair1", "Time11b_Patch182", "Time12b_Patch183"};
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

    public static void checkPlausiblebySingle() {
        Map<String, List<Patch>> subjectPatchMap = patchCollection();
        Map<String, String> inplausiblePatches = new ConcurrentHashMap<>();
        for (Entry<String, List<Patch>> entry : subjectPatchMap.entrySet()) {
            testPlausible(entry, inplausiblePatches);
        }
        log.info("inplausible patches {}", StringUtils.join(inplausiblePatches.values(), "\n"));
    }

    public static void checkPlausible() {
        Map<String, List<Patch>> subjectPatchMap = patchCollection();
        List<CompletableFuture<Void>> futureList = new LinkedList<>();
        Map<String, String> inplausiblePatches = new ConcurrentHashMap<>();
        for (Entry<String, List<Patch>> entry : subjectPatchMap.entrySet()) {
            futureList.add(CompletableFuture.runAsync(() -> {
                try {
                    testPlausible(entry, inplausiblePatches);
                } catch (Exception e) {
                    log.error("obtain trace failed! subject {}", entry.getKey(), e);
                }
            }, EXECUTOR));
        }
        CompletableFuture.allOf(futureList.toArray(new CompletableFuture[0])).join();
        log.info("inplausible patches \n {}", StringUtils.join(inplausiblePatches.values(), "\n"));
    }

    private static void deleteSubject(Subject subject) {
        try {
            if (new File(subject.getHome()).exists()) {
                FileUtils.deleteDirectory(new File(subject.getHome()));
            }
        } catch (IOException exception) {
            log.error("Delete Subject {} with exception {}", subject, exception.getMessage());
        }
        subject.download();
    }

    private static void testPlausible(Entry<String, List<Patch>> entry,
            Map<String, String> inplausiblePatches) {
        String[] sub = entry.getKey().split("-");
        Subject subject = new Subject(sub[0], Integer.parseInt(sub[1]));
        for (Patch patch : entry.getValue()) {
            try {
                log.info("Process for Patch {}", patch.getPatchName());
                //  deleteSubject(subject);
                ObtainTraceInfo.cleanSubject(subject.getHome() + subject.get_ssrc());
                ProcessPatch.createCombinedFixed4AllFiles(patch, false);
                TimeUnit.SECONDS.sleep(10);
                //                if (!compile(subject)) {
                //                    log.error("Patch {}, Compile Error on fixed version!", patch.getPatchName());
                //                    continue;
                //                }
                //                Runner.runTestSuite(subject);
                //                TimeUnit.SECONDS.sleep(10);
                List<String> message = Runner.runTestSuite(subject);
                if (CollectionUtils.isEmpty(message) || message.stream().filter(Objects::nonNull)
                        .noneMatch(element -> element.contains(Runner.SUCCESSTEST))) {
                    inplausiblePatches.putIfAbsent(patch.getPatchName(), patch.getPatchPath());
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
        String filePath = "./log/inplausible19-%s.log";
        Map<String, Set<String>> inPlausibleMap = new LinkedHashMap<>();
        String maxLengthFile = String.format(filePath, 3);
        for (int i = 3; i <= 9; ++i) {
            String currentFile = String.format(filePath, i);
            String content = FileIO.readFileToString(currentFile);
            Set<String> patchSet = new HashSet<>(Arrays.asList(content.split("\n")));
            inPlausibleMap.put(currentFile, patchSet);
            if (patchSet.size() > inPlausibleMap.get(maxLengthFile).size()) {
                maxLengthFile = currentFile;
            }
        }
        Set<String> totalInPlausibleSet =
                inPlausibleMap.values().stream().flatMap(Set::stream).collect(Collectors.toSet());

        Set<String> commonInPlausibleSet = new HashSet<>();

        for (String patch : inPlausibleMap.get(maxLengthFile)) {
            if (Stream.iterate(3, x -> ++x).limit(7).map(i -> String.format(filePath, i))
                    .allMatch(file -> inPlausibleMap.get(file).contains(patch))) {
                commonInPlausibleSet.add(patch);
            }
        }

        Map<String, Set<String>> retainMap = new LinkedHashMap<>();

        for (int i = 3; i <= 9; ++i) {
            String currentFile = String.format(filePath, i);
            retainMap.put(currentFile,
                    inPlausibleMap.get(currentFile).stream().filter(patch -> !commonInPlausibleSet.contains(patch))
                            .collect(Collectors.toSet()));
        }
        Set<String> unstableSet = new LinkedHashSet<>();
        retainMap.values().stream().forEach(set -> unstableSet.addAll(set));

        log.info("total map {} common map {} retain map {}", totalInPlausibleSet.size(), commonInPlausibleSet.size(),
                retainMap.size());

        String inplausibleDir =
                "/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/Patches/DataSet"
                        + "/inplausible/";
        for (String patchPath : commonInPlausibleSet) {
            patchPath = patchPath.replaceAll("/home/jjliang", "/Users/liangjingjing");
            String[] result = patchPath.split("/");
            new File(patchPath).renameTo(new File(inplausibleDir + result[result.length - 1]));
        }
        //        Set<String> tmpPatch =
        //                Arrays.stream(content.split("\n")).filter(line -> line.contains("tmp")).collect(Collectors
        //                .toSet());
        //        Set<String> trainPatch =
        //                Arrays.stream(content.split("\n")).filter(line -> line.contains("trainSet"))
        //                        .collect(Collectors.toSet());
        //        Set<String> testPatch = Arrays.stream(content.split("\n")).filter(line -> line.contains("testSet"))
        //                .collect(Collectors.toSet());
    }

    public static void updateInfo() {
        JSONArray allInfo = new JSONArray();
        JSONObject correctObject =
                JSON.parseObject(FileIO.readFileToString(Constant.HOME + "/Patches" + "/DataSet/correct.info"));
        JSONObject testObject =
                JSON.parseObject(FileIO.readFileToString(Constant.HOME + "/Patches" + "/DataSet/test.info"));
        JSONObject trainObject =
                JSON.parseObject(FileIO.readFileToString(Constant.HOME + "/Patches" + "/DataSet/train.info"));
        allInfo.add(correctObject);

        JSONObject newTestObject = new JSONObject();
        JSONObject newTrainObject = new JSONObject();
        JSONObject inplausibleObject = new JSONObject();
        for (File testPatch : new File(Constant.HOME + "/Patches/DataSet/testSet").listFiles()) {
            String fileName = testPatch.getName();
            if (testObject.containsKey(fileName)) {
                newTestObject.put(fileName, testObject.get(fileName));
            }
        }

        for (File trainPatch : new File(Constant.HOME + "/Patches/DataSet/trainSet").listFiles()) {
            String fileName = trainPatch.getName();
            if (trainObject.containsKey(fileName)) {
                newTrainObject.put(fileName, trainObject.get(fileName));
            }
        }

        List<Patch> patches = new LinkedList<>();
        String filePath = Constant.HOME + "/Patches"
                + "/experiment3/kui_data_for_cc2v.txt";
        String patchDir =
                Constant.HOME + "/Patches/experiment3/TestSet";
        String[] content = FileIO.readFileToString(filePath).split("\n");
        for (int i = 0; i <= 129; i++) {
            String line = content[i];
            String label = String.valueOf(line.charAt(0));
            String info = line.split("ppp")[1].trim().split(" ")[0];
            String[] infoArray = info.split("_");

            String id = StringUtils.getDigits(infoArray[0]);
            String name = infoArray[0].split(id)[0];

            patches.add(Patch.builder().lable(label).patchName(info)
                    .bugid(name + "-" + id).patchPath(patchDir + "/" + infoArray[1]).id(i)
                    .build());
        }


        for (File patch : new File(Constant.HOME + "/Patches/DataSet/inplausible").listFiles()) {
            String fileName = patch.getName();
            if (trainObject.containsKey(fileName)) {
                inplausibleObject.put(fileName, trainObject.get(fileName));
            } else if (testObject.containsKey(fileName)) {
                inplausibleObject.put(fileName, testObject.get(fileName));
            } else {
                if (fileName.contains("_")) {
                    for (Patch patch1 : patches) {
                        if (patch1.getPatchName().equals(fileName)) {
                            List<String> list = new LinkedList<>();
                            list.add(patch1.getBugid());
                            list.add(patch1.getLable());
                            inplausibleObject.put(fileName, list);
                            break;
                        }
                    }
                } else {
                    List<String> list = new LinkedList<>();
                    String bugid = fileName.split("-")[1] + "-" + fileName.split("-")[2];
                    String label = fileName.contains("plausible") ? "0" : "1";
                    list.add(bugid);
                    list.add(label);
                    inplausibleObject.put(fileName, list);
                }
                //log.info(fileName);
            }
        }

        allInfo.add(newTestObject);
        allInfo.add(newTrainObject);
        allInfo.add(inplausibleObject);

        FileIO.writeStringToFile("./test.info", JSON.toJSONString(newTestObject));
        FileIO.writeStringToFile("./train.info", JSON.toJSONString(newTrainObject));
        FileIO.writeStringToFile("./all.info", JSON.toJSONString(allInfo));

    }


    public static void main(String[] args) {
        //moveTestSet();
        // moveTrainSet();
        //checkPlausible();
        //checkPlausiblebySingle();
        //checkResult();
        updateInfo();
    }
}
