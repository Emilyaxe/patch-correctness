package service;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;

import config.Constant;
import entity.Patch;
import entity.Subject;
import instrument.TestFileVisitor;
import lombok.extern.slf4j.Slf4j;
import util.FileIO;

@Slf4j
public class ObtainPassingTests {


    public static void obtainTest() {
        List<Patch> testPatches = ObtainPatches.readTestPatches();
        List<Patch> trainPatches = ObtainPatches.readTrainPatches();
        Set<String> subjects = new LinkedHashSet<>();
        subjects.addAll(testPatches.stream().map(Patch::getBugid).collect(Collectors.toSet()));
        subjects.addAll(trainPatches.stream().map(Patch::getBugid).collect(Collectors.toSet()));
        for (String str : subjects) {
            //            if (!str.equals("Closure-33")) {
            //                continue;
            //            }
            Subject subject = new Subject(str.split("-")[0], Integer.parseInt(str.split("-")[1]));
            String testDir = subject.getHome() + subject.get_tsrc();
            String relevanFile =
                    Constant.PROJ_INFO + "/relevant_file_tests/" + subject.get_name() + "/" + subject.get_id();
            String newRelevanFile =
                    Constant.PROJ_INFO + "/relevant_tests/" + subject.get_name() + "/" + subject.get_id();
            List<String> failingTests = subject.getFailingTests();
            List<String> passTests = new LinkedList<>();
            List<String> allTests = new LinkedList<>();
            for (String onetestFile : FileIO.readFileToString(relevanFile).split("\n")) {
                if (StringUtils.isEmpty(onetestFile)) {
                    continue;
                }
                if (onetestFile.contains("$")) {
                    onetestFile = onetestFile.split("\\$")[0];
                }
                String testFile = testDir + "/" + onetestFile.replaceAll("\\.", "\\/") + ".java";

                TestFileVisitor testFileVisitor = new TestFileVisitor();
                CompilationUnit compilationUnit = FileIO.genASTFromSource(FileIO.readFileToString(testFile),
                        ASTParser.K_COMPILATION_UNIT);
                compilationUnit.accept(testFileVisitor);
                allTests.addAll(testFileVisitor.getTestsSet());

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
