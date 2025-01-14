package datasetinfo;


import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;

import com.alibaba.fastjson.JSON;

import config.Constant;
import entity.PatchJson;
import lombok.extern.slf4j.Slf4j;
import util.FileIO;

/*
这个文件 划分不同的数据集
 */
@Slf4j
public class DataPartition {

    public static String[] allData = {"correctSet_unpurify", "testSet_unpurify", "trainSet_unpurify"};

    public static void obtainTestSetPatches() {
        String[] illegalPatch =
                {"Closure_32.src.patch", "Closure_110.src.patch", "Math_55.src.patch", "Lang_5.src.patch",
                        "Math_29.src.patch", "Closure_65.src.patch"};
        String patchdir = Constant.HOME + "/Patches/DataSet/patchTest/";
        String infodir = Constant.HOME + "/result/crosspatch3/";
        List<String> testSet = JSON.parseArray(FileIO.readFileToString(infodir + "testSet"), PatchJson.class).stream()
                .map(PatchJson::getPatchName).filter(patchname -> {
                    return Arrays.asList(illegalPatch).contains(patchname) || patchname.contains("Closure-92")
                            || patchname
                            .contains("Closure-93");
                }).collect(Collectors.toList());
        String[] datas = {"correctSet", "testSet", "trainSet"};
        int num = 0;

        //        for (String data : datas) {
        //            String dir = Constant.HOME + "/Patches/DataSet/" + data;
        //            for (File f : new File(dir).listFiles()) {
        //                if (testSet.contains(f.getName())) {
        //                    num++;
        //                    try {
        //                        FileUtils.copyFile(f, new File(patchdir + data + "/" + f.getName()));
        //                    } catch (IOException e) {
        //                        e.printStackTrace();
        //                    }
        //                }
        //
        //            }
        //        }
        log.info("num: " + num);
        log.info(testSet.toString());
    }


    public static void crossPatch3() {


        String patchInfoPath = Constant.HOME + "/result/combineInfo/";
        List<PatchJson> allDatas = new LinkedList<>();
        Long correcNumber, InCorrecNumber;
        List<PatchJson> testSet =
                JSON.parseArray(FileIO.readFileToString(patchInfoPath + "testSet_unpurify"), PatchJson.class).stream()
                        .filter(Objects::nonNull)
                        .collect(Collectors.toList());


        List<PatchJson> correctSet =
                JSON.parseArray(FileIO.readFileToString(patchInfoPath + "correctSet_unpurify"), PatchJson.class)
                        .stream()
                        .filter(Objects::nonNull)
                        .collect(Collectors.toList());
        List<PatchJson> trainSet =
                JSON.parseArray(FileIO.readFileToString(patchInfoPath + "trainSet_unpurify"), PatchJson.class)
                        .stream()
                        .filter(Objects::nonNull)
                        .collect(Collectors.toList());
        allDatas.addAll(testSet);
        allDatas.addAll(trainSet);
        allDatas.addAll(correctSet);

        log.info("All Datas {}", allDatas.size());

        Collections.shuffle(allDatas, new Random(19940910L));
        testSet = new LinkedList<>();
        trainSet = new LinkedList<>();
        int i = 0;
        for (PatchJson patchJson : allDatas) {
            if (i < 120) {
                testSet.add(patchJson);
            } else {
                trainSet.add(patchJson);
            }
            i++;
        }

        log.info("TrainSet {} ", trainSet.size());
        correcNumber = trainSet.stream().filter(patchJson -> patchJson.getLabel().equals("1")).count();
        InCorrecNumber = trainSet.stream().filter(patchJson -> patchJson.getLabel().equals("0")).count();
        log.info("correct {}, inCorrect {}", correcNumber, InCorrecNumber);
        //FileIO.writeStringToFile(Constant.HOME + "/result/crosspatch3/trainSet", JSON.toJSONString(trainSet));

        log.info("TestSet {} ", testSet.size());
        //FileIO.writeStringToFile(Constant.HOME + "/result/crosspatch3/testSet", JSON.toJSONString(testSet));
        correcNumber = testSet.stream().filter(patchJson -> patchJson.getLabel().equals("1")).count();
        InCorrecNumber = testSet.stream().filter(patchJson -> patchJson.getLabel().equals("0")).count();
        log.info("correct {}, inCorrect {}", correcNumber, InCorrecNumber);


    }


    public static void crossBugNoVal() {
        String patchInfoPath = Constant.HOME + "/result/dataSetPartition/";
        Long correcNumber, InCorrecNumber;
        List<PatchJson> testSet =
                JSON.parseArray(FileIO.readFileToString(patchInfoPath + "testSet"), PatchJson.class).stream()
                        .filter(Objects::nonNull)
                        .collect(Collectors.toList());
        log.info("TestSet {} ", testSet.size());

        FileIO.writeStringToFile(Constant.HOME + "/result/crossbug/testSet", JSON.toJSONString(testSet));
        correcNumber = testSet.stream().filter(patchJson -> patchJson.getLabel().equals("1")).count();
        InCorrecNumber = testSet.stream().filter(patchJson -> patchJson.getLabel().equals("0")).count();
        log.info("correct {}, inCorrect {}", correcNumber, InCorrecNumber);

        List<PatchJson> allDatas = new LinkedList<>();
        List<PatchJson> correctSet =
                JSON.parseArray(FileIO.readFileToString(patchInfoPath + "validateSet"), PatchJson.class)
                        .stream()
                        .filter(Objects::nonNull)
                        .collect(Collectors.toList());
        List<PatchJson> trainSet =
                JSON.parseArray(FileIO.readFileToString(patchInfoPath + "trainSet"), PatchJson.class)
                        .stream()
                        .filter(Objects::nonNull)
                        .collect(Collectors.toList());
        allDatas.addAll(trainSet);
        allDatas.addAll(correctSet);
        log.info("TrainSet {} ", allDatas.size());

        correcNumber = allDatas.stream().filter(patchJson -> patchJson.getLabel().equals("1")).count();
        InCorrecNumber = allDatas.stream().filter(patchJson -> patchJson.getLabel().equals("0")).count();
        log.info("correct {}, inCorrect {}", correcNumber, InCorrecNumber);
        FileIO.writeStringToFile(Constant.HOME + "/result/crossbug/trainSet", JSON.toJSONString(allDatas));
    }

    public static void crossPatchNoVal() {
        String patchInfoPath = Constant.HOME + "/result/combineInfo/";

        Long correcNumber, InCorrecNumber;
        List<PatchJson> testSet =
                JSON.parseArray(FileIO.readFileToString(patchInfoPath + "testSet_unpurify"), PatchJson.class).stream()
                        .filter(Objects::nonNull)
                        .collect(Collectors.toList());
        log.info("TestSet {} ", testSet.size());

        FileIO.writeStringToFile(Constant.HOME + "/result/crosspatch2/testSet", JSON.toJSONString(testSet));
        correcNumber = testSet.stream().filter(patchJson -> patchJson.getLabel().equals("1")).count();
        InCorrecNumber = testSet.stream().filter(patchJson -> patchJson.getLabel().equals("0")).count();
        log.info("correct {}, inCorrect {}", correcNumber, InCorrecNumber);

        List<PatchJson> allDatas = new LinkedList<>();
        List<PatchJson> correctSet =
                JSON.parseArray(FileIO.readFileToString(patchInfoPath + "correctSet_unpurify"), PatchJson.class)
                        .stream()
                        .filter(Objects::nonNull)
                        .collect(Collectors.toList());
        List<PatchJson> trainSet =
                JSON.parseArray(FileIO.readFileToString(patchInfoPath + "trainSet_unpurify"), PatchJson.class)
                        .stream()
                        .filter(Objects::nonNull)
                        .collect(Collectors.toList());
        allDatas.addAll(trainSet);
        allDatas.addAll(correctSet);
        log.info("TrainSet {} ", allDatas.size());

        correcNumber = allDatas.stream().filter(patchJson -> patchJson.getLabel().equals("1")).count();
        InCorrecNumber = allDatas.stream().filter(patchJson -> patchJson.getLabel().equals("0")).count();
        log.info("correct {}, inCorrect {}", correcNumber, InCorrecNumber);
        FileIO.writeStringToFile(Constant.HOME + "/result/crosspatch2/trainSet", JSON.toJSONString(allDatas));

    }

    public static void crossPatch() {
        String patchInfoPath = Constant.HOME + "/result/combineInfo/";
        List<PatchJson> testSet =
                JSON.parseArray(FileIO.readFileToString(patchInfoPath + "testSet_unpurify"), PatchJson.class).stream()
                        .filter(Objects::nonNull)
                        .map(line -> PatchJson.builder().patchName(line.getPatchName()).label(line.getLabel()).build())
                        .collect(Collectors.toList());
        log.info("TestSet {} ", JSON.toJSONString(testSet));
        FileIO.writeStringToFile(Constant.HOME + "/result/crosspatch/testSet.info", JSON.toJSONString(testSet));
        Long correcNumber = testSet.stream().filter(patchJson -> patchJson.getLabel().equals("1")).count();
        Long InCorrecNumber = testSet.stream().filter(patchJson -> patchJson.getLabel().equals("0")).count();
        log.info("correct {}, inCorrect {}", correcNumber, InCorrecNumber);


        List<PatchJson> otherSet = new LinkedList<>();
        List<PatchJson> correctSet =
                JSON.parseArray(FileIO.readFileToString(patchInfoPath + "correctSet_unpurify"), PatchJson
                        .class)
                        .stream()
                        .filter(Objects::nonNull)
                        .map(line -> PatchJson.builder().patchName(line.getPatchName()).label(line.getLabel
                                ()).build())
                        .collect(Collectors.toList());
        List<PatchJson> trainSet =
                JSON.parseArray(FileIO.readFileToString(patchInfoPath + "trainSet_unpurify"), PatchJson.class)
                        .stream()
                        .filter(Objects::nonNull)
                        .map(line -> PatchJson.builder().patchName(line.getPatchName()).label(line.getLabel
                                ()).build())
                        .collect(Collectors.toList());
        correctSet.stream().filter(Objects::nonNull).forEach(otherSet::add);
        trainSet.stream().filter(Objects::nonNull).forEach(otherSet::add);
        Collections.shuffle(otherSet, new Random(12345798L));

        int corNumber = 0, inCorNumber = 0;
        List<PatchJson> validateSet = new LinkedList<>();
        List<PatchJson> trainSetNew = new LinkedList<>();
        for (PatchJson patchJson : otherSet) {
            if (patchJson.getLabel().equals("1") && corNumber < 30) {
                validateSet.add(patchJson);
                corNumber++;
                continue;
            }
            if (patchJson.getLabel().equals("0") && inCorNumber < 90) {
                validateSet.add(patchJson);
                inCorNumber++;
                continue;
            }
            trainSetNew.add(patchJson);
        }

        log.info("ValidateSet {} ", JSON.toJSONString(validateSet));
        FileIO.writeStringToFile(Constant.HOME + "/result/crosspatch/validateSet.info", JSON.toJSONString(validateSet));
        correcNumber = validateSet.stream().filter(patchJson -> patchJson.getLabel().equals("1")).count();
        InCorrecNumber = validateSet.stream().filter(patchJson -> patchJson.getLabel().equals("0")).count();
        log.info("correct {}, inCorrect {}", correcNumber, InCorrecNumber);

        log.info("TrainSet {} ", JSON.toJSONString(trainSetNew));
        FileIO.writeStringToFile(Constant.HOME + "/result/crosspatch/trainSet.info", JSON.toJSONString(trainSetNew));
        correcNumber = trainSetNew.stream().filter(patchJson -> patchJson.getLabel().equals("1")).count();
        InCorrecNumber = trainSetNew.stream().filter(patchJson -> patchJson.getLabel().equals("0")).count();
        log.info("correct {}, inCorrect {}", correcNumber, InCorrecNumber);

    }

    public static void moveInfo() {
        String[] datas = {"testSet", "trainSet", "validateSet"};
        String patchInfoPath = Constant.HOME + "/result/combineInfo/";
        List<PatchJson> allDatas = new LinkedList<>();
        for (String data : allData) {
            List<PatchJson> datalist = JSON.parseArray(FileIO.readFileToString(patchInfoPath + data), PatchJson.class);
            datalist.stream().forEach(allDatas::add);
        }
        for (String data : datas) {
            List<String> datalist =
                    JSON.parseArray(FileIO.readFileToString(Constant.HOME + "/result/crosspatch/" + data + ".info"),
                            PatchJson.class).stream().map(patchJson -> patchJson.getPatchName())
                            .collect(Collectors.toList());
            List<PatchJson> list =
                    allDatas.stream().filter(patchJson -> datalist.contains(patchJson.getPatchName())).collect(
                            Collectors.toList());
            log.info("{}, Size {}", data, list.size());
            // FileIO.writeStringToFile(Constant.HOME + "/result/crosspatch/" + data, JSON.toJSONString(list));
        }

        /*
        2021-08-15 14:47:15.209 INFO     main (DataPartition.java:107) - testSet, Size 119
2021-08-15 14:47:15.502 INFO     main (DataPartition.java:107) - trainSet, Size 830
2021-08-15 14:47:20.145 INFO     main (DataPartition.java:107) - validateSet, Size 120
         */
    }

    //
    //    // dataSetPartition
    //    public static void crossBug() {
    //        String[] datas = {"testSet", "trainSet", "validateSet"};
    //        String patchInfoPath = Constant.HOME + "/result/dataSetPartition/";
    //
    //
    //    }


    public static void main(String[] args) {
        // crossPatch();
        //moveInfo();
        //crossPatchNoVal();
        // crossBugNoVal();
        //crossPatch3();
        obtainTestSetPatches();
    }
}
