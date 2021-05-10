package main;

import static util.AsyExecutor.EXECUTOR;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;

import org.apache.commons.io.FileUtils;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;

import config.Constant;
import entity.Patch;
import entity.Subject;
import instrument.IntruMethodsVisitors;
import lombok.extern.slf4j.Slf4j;
import run.Runner;
import service.ProcessPatch;
import util.BuildPath;
import util.FileIO;

@Slf4j
public class ObtainTraceInfo {

    public static List<String> illeglePatches = new LinkedList<>();

    public static final Object lock = new Object();

    public static boolean compileAndRun(Subject subject, String oneTest) {
        String srcPath = subject.getHome() + subject.get_ssrc();
        try {
            FileUtils.copyDirectory(new File(Constant.DUMPER_HOME),
                    new File(srcPath + "/auxiliary"));
        } catch (IOException e) {
            log.error("subject {} process test {} copy dumper failed!",
                    subject.get_name() + subject.get_id(), oneTest);
        }

        if (Runner.compileSubject(subject)) {
            return Runner.testSingleTest(subject, oneTest);
            //Runner.JUnitTestSubject(subject, oneTest, true);
        }
        return false;
    }

    public static void obtainTrace(Map<String, List<Patch>> subjectPatchMap, boolean reverse,
            String reDir) {
        // Map<String, List<Patch>> subjectPatchMap =
        List<CompletableFuture<Void>> futureList = new LinkedList<>();
        for (Entry<String, List<Patch>> entry : subjectPatchMap.entrySet()) {
            futureList.add(CompletableFuture.runAsync(() -> {
                try {
                    processTrace(reverse, reDir, entry);
                } catch (Exception e) {
                    log.error("obtain trace failed! subject {}", entry.getKey(), e);
                }
            }, EXECUTOR));
        }
        CompletableFuture.allOf(futureList.toArray(new CompletableFuture[0])).join();
        log.info("Illegle Patches: {}", String.join(",", illeglePatches));
        log.info("finish obtain trace!");
    }

    //    public static void obtainTrace(Map<String, List<Patch>> subjectPatchMap, boolean reverse,
    //                     String reDir){
    //        for (Entry<String, List<Patch>> entry : subjectPatchMap.entrySet()) {
    //            String[] sub = entry.getKey().split("-");
    //            processTrace(reverse, reDir, entry, sub);
    //        }
    //    }
    private static void cleanSubject(String srcPath) {
        log.info("Clean subject ....");
        List<File> list = new LinkedList<>();
        FileIO.getAllFile(new File(srcPath), list);
        for (File f : list) {
            if (new File(f.getAbsolutePath() + ".bak").exists()) {
                try {
                    FileUtils.copyFile(new File(f.getAbsolutePath() + ".bak"), f);
                } catch (IOException exception) {
                    exception.printStackTrace();
                }
            }
        }
    }

    private static void processTrace(boolean reverse, String reDir,
            Entry<String, List<Patch>> entry) {
        String[] sub = entry.getKey().split("-");
        Subject subject = new Subject(sub[0], Integer.parseInt(sub[1]));

        for (Patch patch : entry.getValue()) {
            cleanSubject(subject.getHome() + subject.get_ssrc());
//                                    if (!patch.getPatchName().equals("jGenProg_Chart-13_P_Patch_2461_1666.txt")) {
//                                        continue;
//                                    }
            log.info("Process Dir {} for Patch {}", reDir, patch.getPatchName());
            int fixedLine = ProcessPatch.getOneChangeLine(subject, patch, reverse);
            if (fixedLine == 0) {
                illeglePatches.add(patch.getPatchName());
                continue;
            }
            // run failing tests on buggy version
            for (String test : subject.getFailingTests()) {
                try {
                    String writeFile = BuildPath.buildDymicFile(reDir, patch.getPatchName(), test,
                            true);
                    IntruMethodsVisitors visitor = new IntruMethodsVisitors();
                    visitor.setWriteFile(writeFile);
                    visitor.setFixedMethodStartLine(fixedLine);
                    String oneFixedFile = Constant.PROJECT_HOME + "/" + subject.get_name() + "/"
                            + subject.get_name() + subject.get_id() + patch.getFixedFile().trim();
                    ProcessPatch.createCombinedBuggy4AllFiles(patch, reverse);
                    CompilationUnit compilationUnit = FileIO.genASTFromSource(
                            FileIO.readFileToString(oneFixedFile), ASTParser.K_COMPILATION_UNIT);
                    synchronized (lock) {
                        compilationUnit.accept(visitor);
                    }
                    FileIO.writeStringToFile(oneFixedFile, compilationUnit.toString());
                    if (compileAndRun(subject, test)) {
                        log.error("compile Patch {}, Should Fail!", patch.getPatchName());
                    }
                } catch (Exception e) {
                    log.error(
                            "process failing test on buggy version failed! subject {} patch {} test {}",
                            subject.get_name() + subject.get_id(), patch.getPatchName(), test, e);
                }
            }

            // change to fixed version run failing tests on fixed version
            for (String test : subject.getFailingTests()) {
                try {
                    String writeFile = BuildPath.buildDymicFile(reDir, patch.getPatchName(), test,
                            false);
                    IntruMethodsVisitors visitor = new IntruMethodsVisitors();
                    visitor.setWriteFile(writeFile);
                    visitor.setFixedMethodStartLine(fixedLine);
                    String oneFixedFile = Constant.PROJECT_HOME + "/" + subject.get_name() + "/"
                            + subject.get_name() + subject.get_id() + patch.getFixedFile().trim();
                    ProcessPatch.createCombinedFixed4AllFiles(patch, reverse);
                    CompilationUnit compilationUnit = FileIO.genASTFromSource(
                            FileIO.readFileToString(oneFixedFile), ASTParser.K_COMPILATION_UNIT);
                    synchronized (lock) {
                        compilationUnit.accept(visitor);
                    }
                    FileIO.writeStringToFile(oneFixedFile, compilationUnit.toString());
                    if (!compileAndRun(subject, test)) {
                        log.error("Patch {}, Should Pass!", patch.getPatchName());
                    }
                } catch (Exception e) {
                    log.error(
                            "process failing test on fixed version failed! subject {} patch {} test {}",
                            subject.get_name() + subject.get_id(), patch.getPatchName(), test, e);
                }
            }
            // obtain the instrumented fixed file and changes lines

        }
    }

    public static void main(String[] args) {
        //        obtainTrace(ObtainMethods4All.readCorrectPatch4Wen(), false, "Correct4Wen");
        //        obtainTrace(ObtainMethods4All.readInCorrectPatch4Wen(), false, "Overfitting4Wen");
       // obtainTrace(ObtainMethods4All.readTrainPatches(), false, "TrainSet4Kui");
        // obtainTrace(ObtainMethods4All.readTestPatches(), false, "testSet4Kui");
        obtainTrace(ObtainMethods4All.readCorrectPatches(), true, "correctSet4Kui");
    }
}
