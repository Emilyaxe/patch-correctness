package main;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;

import config.Constant;
import entity.Patch;
import entity.Subject;
import instrument.IntruMethodsVisitors;
import service.ProcessPatch;
import util.FileIO;

public class ObtainTraceInfo {

    public static void obtainTrace(){
        Map<String, List<Patch>> subjectPatchMap =  ObtainMethods4All.readCorrectPatch4Wen();
        for(Entry<String, List<Patch>> entry :subjectPatchMap.entrySet()){
            String sub[] = entry.getKey().split("-");
            Subject subject = new Subject(sub[0], Integer.parseInt(sub[1]));
            for(Patch patch: entry.getValue()){
                // apply patches in all fixed files, and obtain buggy & fixed version
                ProcessPatch.createCombinedBuggy4AllFiles(patch, false);
                // obtain the instrumented fixed file and changes lines
                int fixedLine = ProcessPatch.getOneChangeLine(subject, patch, false);

                String writeFile = "tmpWriteFile";
                IntruMethodsVisitors visitor  = new IntruMethodsVisitors();
                visitor.setWriteFile(writeFile);
                visitor.setFixedMethodStartLine(fixedLine);
                //String subjectPath = Constant.PROJECT_HOME + "/" + name + "/" + name + bugid;
                CompilationUnit compilationUnit = FileIO.genASTFromSource(FileIO.readFileToString(patch.getFixedFile()),
                        ASTParser.K_COMPILATION_UNIT);
                compilationUnit.accept(visitor);

                // run failing tests on buggy version

                // change to fixed version run failing tests on fixed version
            }
        }





    }
    public static void main(String[] args) {


    }
}
