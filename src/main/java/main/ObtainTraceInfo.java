package main;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

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

    public static void compileAndRun(Subject subject, String oneTest) {
        log.info("Running Tests .....");
        String srcPath = subject.getHome() + subject.get_ssrc();
        try {
            FileUtils.copyDirectory(new File(Constant.DUMPER_HOME), new File(srcPath + "/auxiliary"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (Runner.compileSubject(subject)) {
            Runner.JUnitTestSubject(subject, oneTest);
        }

    }

    public static void obtainTrace(Map<String, List<Patch>> subjectPatchMap, boolean reverse){
       // Map<String, List<Patch>> subjectPatchMap =
        for(Entry<String, List<Patch>> entry :subjectPatchMap.entrySet()){
            String sub[] = entry.getKey().split("-");
            Subject subject = new Subject(sub[0], Integer.parseInt(sub[1]));
            for(Patch patch: entry.getValue()){
                // apply patches in all fixed files, and obtain buggy & fixed version
                ProcessPatch.createCombinedBuggy4AllFiles(patch, reverse);
                // obtain the instrumented fixed file and changes lines
                int fixedLine = ProcessPatch.getOneChangeLine(subject, patch, reverse);

                // run failing tests on buggy version
                for(String test: subject.getFailingTests()){
                    String writeFile = BuildPath.buildDymicFile(subject, test, true);
                    IntruMethodsVisitors visitor  = new IntruMethodsVisitors();
                    visitor.setWriteFile(writeFile);
                    visitor.setFixedMethodStartLine(fixedLine);
                    String subjectPath = Constant.PROJECT_HOME + "/" + subject.get_name() + "/" + subject.get_name() + subject.get_id();
                    CompilationUnit compilationUnit = FileIO.genASTFromSource(FileIO.readFileToString(subjectPath + patch.getFixedFile().trim()),
                            ASTParser.K_COMPILATION_UNIT);
                    compilationUnit.accept(visitor);

                    compileAndRun(subject, test);

                }
                ProcessPatch.createCombinedFixed4AllFiles(patch, reverse);

                // change to fixed version run failing tests on fixed version
                for(String test: subject.getFailingTests()){
                    String writeFile = BuildPath.buildDymicFile(subject, test, false);
                    IntruMethodsVisitors visitor  = new IntruMethodsVisitors();
                    visitor.setWriteFile(writeFile);
                    visitor.setFixedMethodStartLine(fixedLine);
                    String subjectPath = Constant.PROJECT_HOME + "/" + subject.get_name() + "/" + subject.get_name() + subject.get_id();
                    CompilationUnit compilationUnit = FileIO.genASTFromSource(FileIO.readFileToString(subjectPath + patch.getFixedFile().trim()),
                            ASTParser.K_COMPILATION_UNIT);
                    compilationUnit.accept(visitor);
                    compileAndRun(subject, test);
                }
            }
        }





    }
    public static void main(String[] args) {
        obtainTrace(ObtainMethods4All.readCorrectPatch4Wen(), false);

    }
}
