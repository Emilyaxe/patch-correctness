package service;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
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
            lines.add(sc.nextLine());
        }
        return StringUtils.join(lines, "\n");
    }

    public static void obtainTest() {
        List<Patch> testPatches = ObtainPatches.readTestPatches();
        List<Patch> trainPatches = ObtainPatches.readTrainPatches();
        Set<String> subjects = new LinkedHashSet<>();
        subjects.addAll(testPatches.stream().map(Patch::getBugid).collect(Collectors.toSet()));
        subjects.addAll(trainPatches.stream().map(Patch::getBugid).collect(Collectors.toSet()));
        String coverageInfoDir = "/Volumes/My Passport" + Constant.HOME + "/tmp/";
        for (String str : subjects) {
            //            if (!str.equals("Closure-33")) {
            //                continue;
            //            }
            Subject subject = new Subject(str.split("-")[0], Integer.parseInt(str.split("-")[1]));
            String newRelevanFile =
                    Constant.PROJ_INFO + "/relevant_tests/" + subject.get_name() + "/" + subject.get_id();

            List<String> failingTests = subject.getFailingTests();
            List<String> passTests = new LinkedList<>();
            List<String> allTests = new LinkedList<>();

            String content = "";
            String coverageFile = coverageInfoDir + subject.get_name() + "/" + subject.get_id() + ".txt";
            if (subject.get_name().equals("Closure")) {
                coverageFile = coverageFile + ".gz";
                content = readFromGZFile(coverageFile);
            } else {
                content = FileIO.readFileToString(coverageFile);
            }
            for (String line : content.split("\n")) {
                String[] test = line.split("\t")[0].split("\\(")[0].split("\\.");
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
    }

    public static List<String> passingTests(Subject subject) {
        String newRelevanFile =
                Constant.PROJ_INFO + "/relevant_tests/" + subject.get_name() + "/" + subject.get_id();
        return Arrays.asList(FileIO.readFileToString(newRelevanFile).split("\n"));
    }

    public static void main(String[] args) {
        //String relevantTest = Constant.HOME + "/d4j-info/relevant_tests";
        obtainTest();
    }
}
