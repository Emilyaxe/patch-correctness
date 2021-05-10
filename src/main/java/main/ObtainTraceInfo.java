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
    public static  int illeglePatch = 0;

    public static void compileAndRun(Subject subject, String oneTest) {
        String srcPath = subject.getHome() + subject.get_ssrc();
        try {
            FileUtils.copyDirectory(new File(Constant.DUMPER_HOME),
                    new File(srcPath + "/auxiliary"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (Runner.compileSubject(subject)) {
            Runner.JUnitTestSubject(subject, oneTest, true);
        }
    }

    public static void obtainTrace(Map<String, List<Patch>> subjectPatchMap, boolean reverse,
            String reDir) {
        // Map<String, List<Patch>> subjectPatchMap =
        List<CompletableFuture<Void>> futureList = new LinkedList<>();
        for (Entry<String, List<Patch>> entry : subjectPatchMap.entrySet()) {
            String[] sub = entry.getKey().split("-");
            CompletableFuture
                    .runAsync(() -> processTrace(reverse, reDir, entry, sub), EXECUTOR).join();
        }
        CompletableFuture.allOf(futureList.toArray(new CompletableFuture[0])).join();
        log.info("Illegle Patches: {}", illeglePatch);
        log.info("finish obtain trace!");
    }

    private static void processTrace(boolean reverse, String reDir,
            Entry<String, List<Patch>> entry, String[] sub) {
        Subject subject = new Subject(sub[0], Integer.parseInt(sub[1]));

        for (Patch patch : entry.getValue()) {
//                        if(! patch.getPatchName().equals("Chart26b_Patch18")){
//                            continue;
//                        }

            log.info("Process Dir {} for Patch {}", reDir, patch.getPatchName());
            // apply patches in all fixed files, and obtain buggy & fixed version
            // obtain the instrumented fixed file and changes lines
            int fixedLine = ProcessPatch.getOneChangeLine(subject, patch, reverse);

            if (fixedLine == 0) {
                illeglePatch++;
                continue;
            }
            // run failing tests on buggy version
            for (String test : subject.getFailingTests()) {
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
                compilationUnit.accept(visitor);
                FileIO.writeStringToFile(oneFixedFile, compilationUnit.toString());
                compileAndRun(subject, test);
            }

            // change to fixed version run failing tests on fixed version
            for (String test : subject.getFailingTests()) {
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
                compilationUnit.accept(visitor);
                FileIO.writeStringToFile(oneFixedFile, compilationUnit.toString());
                compileAndRun(subject, test);
            }
        }
    }

    public static void main(String[] args) {
//        obtainTrace(ObtainMethods4All.readCorrectPatch4Wen(), false, "Correct4Wen");
//        obtainTrace(ObtainMethods4All.readInCorrectPatch4Wen(), false, "Overfitting4Wen");
//        obtainTrace(ObtainMethods4All.readTrainPatches(), false, "TrainSet4Kui");
        obtainTrace(ObtainMethods4All.readTestPatches(), false, "testSet4Kui");
 //       obtainTrace(ObtainMethods4All.readCorrectPatches(), true, "correctSet4Kui");
    }
}
