package service;

import static util.AsyExecutor.EXECUTOR;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.zip.GZIPInputStream;

import org.apache.commons.lang3.StringUtils;

import config.Constant;
import entity.Patch;
import entity.Subject;
import lombok.extern.slf4j.Slf4j;
import util.FileIO;

@Slf4j
public class ObtainPassingTests {

    private static String readFromGZFile(String file) {
        InputStream in = null;
        try {
            in = new GZIPInputStream(new FileInputStream(file));
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        Scanner sc = new Scanner(in);
        List<String> lines = new ArrayList();
        while (sc.hasNextLine()) {
            lines.add(sc.nextLine().split("\t")[0]);
        }
        return StringUtils.join(lines, "\n");
    }

    public static String readFileByLines(String fileName) {
        File file = new File(fileName);
        BufferedReader reader = null;
        List<String> lines = new ArrayList();
        try {
            //System.out.println("以行为单位读取文件内容，一次读一整行：");
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            // int line = 1;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                // 显示行号
                lines.add(tempString.split("\t")[0]);
                //                System.out.println("line " + line + ": " + tempString);
                //                line++;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
        return StringUtils.join(lines, "\n");
    }

    public static void obtainTest() {
        List<CompletableFuture<Void>> futureList = new LinkedList<>();
        List<Patch> testPatches = ObtainPatches.readTestPatches();
        List<Patch> trainPatches = ObtainPatches.readTrainPatches();
        List<Patch> correctPatches = ObtainPatches.readCorPatches();
        Set<String> subjects = new LinkedHashSet<>();
        subjects.addAll(testPatches.stream().map(Patch::getBugid).collect(Collectors.toSet()));
        subjects.addAll(trainPatches.stream().map(Patch::getBugid).collect(Collectors.toSet()));
        subjects.addAll(correctPatches.stream().map(Patch::getBugid).collect(Collectors.toSet()));
        for (String str : subjects) {
            futureList.add(CompletableFuture.runAsync(() -> {
                try {
                    obtainTest4subject(str);
                } catch (Exception e) {
                    log.error("obtain trace failed! subject {}", str, e);
                }
            }, EXECUTOR));
        }
        CompletableFuture.allOf(futureList.toArray(new CompletableFuture[0])).join();
        log.info("finish obtain test!");
    }

    public static void obtainRelevantTests() {
        List<CompletableFuture<Void>> futureList = new LinkedList<>();
        List<Patch> testPatches = ObtainPatches.readTestPatches();
        List<Patch> trainPatches = ObtainPatches.readTrainPatches();
        List<Patch> correctPatches = ObtainPatches.readCorPatches();
        Set<String> subjects = new LinkedHashSet<>();
        subjects.addAll(testPatches.stream().map(Patch::getBugid).collect(Collectors.toSet()));
        subjects.addAll(trainPatches.stream().map(Patch::getBugid).collect(Collectors.toSet()));
        subjects.addAll(correctPatches.stream().map(Patch::getBugid).collect(Collectors.toSet()));
        for (String str : subjects) {
            futureList.add(CompletableFuture.runAsync(() -> {
                try {
                    //obtainTest4subject(str);
                    obtainRelevantTest4Subject(str);
                } catch (Exception e) {
                    log.error("obtain trace failed! subject {}", str, e);
                }
            }, EXECUTOR));
        }
        CompletableFuture.allOf(futureList.toArray(new CompletableFuture[0])).join();
        log.info("finish obtain test!");
    }

    private static void obtainRelevantTest4Subject(String str) {
        log.info("Start process Subject {}", str);
        Subject subject = new Subject(str.split("-")[0], Integer.parseInt(str.split("-")[1]));
        List<String> allPassings = passingTests(subject);

        String relevantFile =
                Constant.D4J_HOME + "/framework/projects/" + subject.get_name() + "/relevant_tests/" + subject.get_id();
        List<String> files = Arrays.asList(FileIO.readFileToString(relevantFile).split("\n"));
        List<String> relevantPassings =
                allPassings.stream().filter(line -> files.contains(line.split("::")[0])).collect(Collectors.toList());
        String newRelevanFile =
                Constant.PROJ_INFO + "/relevant_passing_tests/" + subject.get_name() + "/" + subject.get_id();
        FileIO.writeStringToFile(newRelevanFile, StringUtils.join(relevantPassings, "\n"));
    }


    public static void obtainTest4subject(String str) {

        log.info("Start process Subject {}", str);
        String coverageInfoDir = "/home/emily/WorkSpace/Project/PatchCorrectness/tmp/";

        Subject subject = new Subject(str.split("-")[0], Integer.parseInt(str.split("-")[1]));
        String newRelevanFile =
                Constant.PROJ_INFO + "/passing_tests/" + subject.get_name() + "/" + subject.get_id();

        if (new File(newRelevanFile).exists()) {
            return;
        }

        List<String> failingTests = subject.getFailingTests();
        List<String> passTests = new LinkedList<>();
        List<String> allTests = new LinkedList<>();

        String content = "";
        String coverageFile = coverageInfoDir + subject.get_name() + "/" + subject.get_id() + ".txt";
        if (subject.get_name().equals("Closure")) {
            coverageFile = coverageFile + ".gz";
            content = readFromGZFile(coverageFile);

        } else {
            content = readFileByLines(coverageFile);
        }

        for (String line : content.split("\n")) {
            String[] test = line.split("\\(")[0].split("\\.");
            StringBuilder stringBuilder = new StringBuilder(test[0]);
            for (int i = 1; i <= test.length - 2; i++) {
                stringBuilder.append(".").append(test[i]);
            }
            stringBuilder.append("::").append(test[test.length - 1]);
            allTests.add(stringBuilder.toString());
        }

        for (String test : allTests) {
            if (!failingTests.contains(test)) {
                passTests.add(test);
            }
        }
        log.info("Subject {} has {} passing tests", subject.toString(), passTests.size());
        FileIO.writeStringToFile(newRelevanFile, StringUtils.join(passTests, "\n"));
    }

    public static List<String> passingTests(Subject subject) {
        String newRelevanFile =
                Constant.PROJ_INFO + "/passing_tests/" + subject.get_name() + "/" + subject.get_id();
        return Arrays.asList(FileIO.readFileToString(newRelevanFile).split("\n"));
    }

    public static void main(String[] args) {
        //String relevantTest = Constant.HOME + "/d4j-info/relevant_tests";
        obtainTest();
        //obtainRelevantTests();
    }
}
