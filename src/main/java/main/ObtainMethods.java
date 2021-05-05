package main;

import java.io.File;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import config.Constant;
import entity.Method;
import entity.Patch4Wen;
import entity.Subject;
import instrument.MethodLinesVisitor;
import lombok.extern.slf4j.Slf4j;
import util.BuildPath;
import util.CombineVersion;
import util.FileIO;

@Slf4j
public class ObtainMethods {
    public static void obtainPatchFiles(String path, List<File> fileList) {
        for (File f : new File(path).listFiles()) {
            if (f.isFile() && f.getName().endsWith("patch")) {
                fileList.add(f);
            } else if (f.isDirectory()) {
                obtainPatchFiles(f.getAbsolutePath(), fileList);
            } else {
                //System.out.println(f.getAbsolutePath());
            }
        }

    }

    public static Map<String, List<Patch4Wen>> readPatches(File patchDir) {
        List<File> fileList = new LinkedList<>();
        obtainPatchFiles(patchDir.getAbsolutePath(), fileList);
        Map<String, List<Patch4Wen>> subjectPatchMap = new LinkedHashMap<>();

        for (File patchFile : fileList) {
            if (!patchFile.getName().endsWith("patch")) {
                continue;
            }
            String[] name = patchFile.getName().split("-");
            String subStr = name[1] + "-" + name[2];
            Patch4Wen patch = new Patch4Wen(patchFile.getAbsolutePath(), patchFile.getName());
            patch.recordLines();

            if (subjectPatchMap.containsKey(subStr)) {
                subjectPatchMap.get(subStr).add(patch);
            } else {
                List<Patch4Wen> list = new LinkedList<>();
                list.add(patch);
                subjectPatchMap.put(subStr, list);
            }
        }

        log.info("Totol Subject {}", subjectPatchMap.size());
        int size = 0;
        for (List<Patch4Wen> patches : subjectPatchMap.values()) {
            size = size + patches.size();
        }
        log.info("Total Patches {}", size);
        return subjectPatchMap;
    }

    public static List<Method> getMethodInfoByraverse(String fixedFile, Subject subject) {
        List<Method> methodList = new LinkedList<>();

        MethodLinesVisitor methodVisitor = new MethodLinesVisitor();
        CompilationUnit compilationUnit = FileIO.genASTFromSource(FileIO.readFileToString(fixedFile),
                ASTParser.K_COMPILATION_UNIT);
        compilationUnit.accept(methodVisitor);
        methodList = methodVisitor.getMethodList();
        return methodList;
    }

    public static List<Method> getMethodInfo(String fixedFile, Subject subject, boolean isBuggy) {
        String methodFile = BuildPath.buildMethodsFile(subject, isBuggy);
        List<Method> methodList = new LinkedList<>();

        // fixedFile 需要重新找，否则有问题
        if (!isBuggy) {
            if (new File(methodFile).exists()) {
                new File(methodFile).deleteOnExit();
            }
            MethodLinesVisitor methodVisitor = new MethodLinesVisitor();
            CompilationUnit compilationUnit = FileIO.genASTFromSource(FileIO.readFileToString(fixedFile),
                    ASTParser.K_COMPILATION_UNIT);
            compilationUnit.accept(methodVisitor);
            methodList = methodVisitor.getMethodList();
            return methodList;
        }
        if (!new File(methodFile).exists()) {
            MethodLinesVisitor methodVisitor = new MethodLinesVisitor();
            CompilationUnit compilationUnit = FileIO.genASTFromSource(FileIO.readFileToString(fixedFile),
                    ASTParser.K_COMPILATION_UNIT);
            compilationUnit.accept(methodVisitor);
            methodList = methodVisitor.getMethodList();
            // write 2 json
            JSONObject jsonObject = new JSONObject();
            jsonObject.put(fixedFile, methodList);
            FileIO.writeStringToFile(methodFile, JSON.toJSONString(jsonObject));
        } else {
            boolean isFind = false;
            // read json
            for (String line : FileIO.readFileToString(methodFile).split("\n")) {
                if (StringUtils.isEmpty(line)) {
                    continue;
                }
                JSONObject jsonObject = JSON.parseObject(line);
                if (!jsonObject.isEmpty() && jsonObject.containsKey(fixedFile)) {
                    JSONArray jsonArray = jsonObject.getJSONArray(fixedFile);
                    methodList = Objects.isNull(jsonArray) || jsonArray.isEmpty() ? Collections.emptyList()
                                                                                  : jsonArray.toJavaList(Method.class);
                    isFind = true;
                    break;
                }
            }
            if (!isFind) {
                MethodLinesVisitor methodVisitor = new MethodLinesVisitor();
                CompilationUnit compilationUnit = FileIO.genASTFromSource(FileIO.readFileToString(fixedFile),
                        ASTParser.K_COMPILATION_UNIT);
                compilationUnit.accept(methodVisitor);
                methodList = methodVisitor.getMethodList();
                // write 2 json
                JSONObject jsonObject = new JSONObject();
                jsonObject.put(fixedFile, methodList);
                FileIO.writeStringToFile(methodFile, "\n", true);
                FileIO.writeStringToFile(methodFile, JSON.toJSONString(jsonObject), true);
            }
        }
        return methodList;
    }

    public static String getMethodContent(String fixedFile, Integer startLine, Integer endLine) {
        StringBuilder result = new StringBuilder();
        String[] content = FileIO.readFileToString(fixedFile).split("\n");
        for (int i = startLine; i <= endLine; i++) {
            result.append(content[i - 1]).append("\n");
        }
        return result.toString();
    }

    public static void findMethods(Map<String, List<Patch4Wen>> subjectPatchMap, String label) {
        // patches that remove a method
        String[] patches = {"patch1-Chart-25-TBar-plausible.patch", "patch1-Chart-25-AVATAR-plausible.patch",
                "patch1-Chart-15-TBar-plausible.patch", "patch1-Chart-15-AVATAR-plausible.patch",
                "patch1-Lang-13-TBar-plausible.patch",
                "patch1-Lang-13-AVATAR-plausible.patch"};

        //Map<String, List<String>> map = new LinkedHashMap();
        List<JSONObject> resultList = new LinkedList<>();
        int patchid = 0;
        for (Entry<String, List<Patch4Wen>> entry : subjectPatchMap.entrySet()) {

            String name = entry.getKey().split("-")[0];
            String id = entry.getKey().split("-")[1];
            if (name.equals("Closure") && (id.equals("63") || id.equals("93"))) {
                patchid = patchid + entry.getValue().size();
                log.warn("patch --");
                continue;
            }
            if (name.equals("Lang") && id.equals("2")) {
                patchid = patchid + entry.getValue().size();
                log.warn("patch --");
                continue;
            }
            if (name.equals("Time") && id.equals("21")) {
                patchid = patchid + entry.getValue().size();
                log.warn("patch --");
                continue;
            }

            Subject subject = new Subject(name, Integer.parseInt(id));
            String subjectPath = Constant.PROJECT_HOME + "/" + name + "/" + name + id;

            for (Patch4Wen patch : entry.getValue()) {
                patchid++;
                if (patch.getPatchName().equals("patch1-Chart-19-ACS.patch")) {
                    log.warn("patch1-Chart-19-ACS.patch patch --");
                    continue;
                }
                if (!patch.getPatchName().equals("patch1-Closure-22-Arja-plausible.patch")) {
                    continue;
                }
                // log.info("{} Process patch {}", patchid, patch.getPatchPath());
                String fixedFile = subjectPath + patch.getFixedFile().trim();
                FileIO.backupFile(fixedFile);

                CombineVersion.createCombinedFiles(fixedFile, patch);

                List<Method> methodList = getMethodInfoByraverse(fixedFile, subject);
                //getMethodInfo(fixedFile, subject , true);
                for (Integer lnumber : patch.getFixedLines()) {
                    Method findMethod = methodList.stream().filter(Objects::nonNull).filter(method ->
                            lnumber >= method.get_startLine() && lnumber <= method.get_endLine()).findAny()
                            .orElse(null);
                    if (Objects.isNull(findMethod)) {
                        continue;
                    }
                    String combinedMethod =
                            getMethodContent(fixedFile, findMethod.get_startLine(), findMethod.get_endLine());
                    //patch.setBuggyMethod(buggyMethod);
                    patch.setCombinedMethod(combinedMethod);
                    break;
                }
                if (!StringUtils.isEmpty(patch.getCombinedMethod())) {
                    JSONObject patchMethodJson = new JSONObject();
                    patchMethodJson.put(patch.getPatchName(), patch.getCombinedMethod());
                    resultList.add(patchMethodJson);
                } else {
                    log.error("Patch {} obtain method failed ", patch.getPatchPath());
                }

                FileIO.writeStringToFile(BuildPath.buildMethodReFile(label), JSON.toJSONString(resultList));
                //           FileIO.backupFile(fixedFile);

                //                   // does not work
                //               if(!Runner.patchFile(fixedFile, patch.getPatchPath())){
                //                   log.error("Patch {} patched failed", patch.getPatchPath());
                //                   break;
                //               }
                //CombineVersion.createFixedFiles(fixedFile,patch);


                //               methodList = getMethodInfoByraverse(fixedFile, subject);
                //                       //getMethodInfo(fixedFile, subject , false);
                //               for(Integer lnumber: patch.getFixedLines()){
                //                   Method findMethod =  methodList.stream().filter(Objects::nonNull).filter(method ->
                //                           lnumber >= method.get_startLine() && lnumber <= method.get_endLine())
                //                           .findAny().orElse(null);
                //                   if(Objects.isNull(findMethod)){
                //                       continue;
                //                   }
                //                   String fixedMethod = getMethodContent(fixedFile, findMethod.get_startLine(),
                //                   findMethod.get_endLine());
                //                   patch.setFixedMethod(fixedMethod);
                //                   break;
                //               }
                //               if(! StringUtils.isEmpty(patch.getCombinedMethod()) ){

                //                   List<String> list = new LinkedList<>();
                //                   list.add(patch.getBuggyMethod());
                //                   list.add(patch.getFixedMethod());
                //                   if(map.containsKey(patch.getPatchName())){
                //                       log.error("Check the patch name {}", patch.getPatchName());
                //                   }
                //                   map.put(patch.getPatchName(), list);
                //               }else if (Arrays.asList(patches).contains( patch.getPatchName())){
                //                   List<String> list = new LinkedList<>();
                //                   list.add(patch.getBuggyMethod());
                //                   list.add(patch.getFixedMethod());
                //                   map.put(patch.getPatchName(), list);
                //              }
                //               else{
                //                   log.error("Patch {} obtain method failed ", patch.getPatchPath());
                //               }
            }
        }
        //log.info( "Error: patch number {}" , map.size());
        //   FileIO.writeStringToFile(BuildPath.buildMethodReFile(label),JSON.toJSONString(map));

    }

    public static void main(String[] args) {
        String Ddifferent = Constant.patchesICSE + "/Ddifferent";
        String Doverfitting = Constant.patchesICSE + "/Doverfitting";
        String Dsame = Constant.patchesICSE + "/Dsame";
        String Error = Constant.patchesICSE + "/Error";
        String Dcorrect = Constant.patchesOther + "/Dcorrect";
        String Doverfitting2 = Constant.patchesOther + "/Doverfitting";


        //        Map<String, List<Patch>> subjectPatchMap = readPatches(new File(Dcorrect));
        //        findMethods(subjectPatchMap, "Dcorrect" );


        //        Map<String, List<Patch>> subjectPatchMap = readPatches(new File(Ddifferent));
        //        findMethods(subjectPatchMap, "Ddifferent" );
        //
        Map<String, List<Patch4Wen>> subjectPatchMap = readPatches(new File(Doverfitting));
        findMethods(subjectPatchMap, "Doverfitting");
        //
        //        subjectPatchMap = readPatches(new File(Dsame));
        //        findMethods(subjectPatchMap, "Dsame" );
        //
        //        subjectPatchMap = readPatches(new File(Error));
        //        findMethods(subjectPatchMap, "Error" );
        //
        //
        //        subjectPatchMap = readPatches(new File(Doverfitting2));
        //        findMethods(subjectPatchMap, "Doverfitting2" );

    }
}
