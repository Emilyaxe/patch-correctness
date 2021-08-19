package service;

import static util.AsyExecutor.EXECUTOR;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import org.apache.commons.collections4.CollectionUtils;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;

import com.alibaba.fastjson.JSON;

import config.Constant;
import entity.PatchJson;
import entity.Subject;
import lombok.extern.slf4j.Slf4j;
import main.ObtainTraceInfo;
import util.FileIO;


@Slf4j
public class ObtainPairFile {

    public static String[] allData = {"testSet", "trainSet"};


    public static void mainProcess() {
        //String patchDir = "./result/dataSetPartition/";
        for (String file : allData) {
            log.info("Process {}", file);
            String content = FileIO.readFileToString(Constant.HOME + "/result/crosspatch2" + "/" + file);
            List<PatchJson> patchJsonList = JSON.parseArray(content, PatchJson.class);
            if (CollectionUtils.isEmpty(patchJsonList)) {
                continue;
            }
            Map<String, List<PatchJson>> subjectPatchMap =
                    patchJsonList.stream().collect(Collectors.groupingBy(PatchJson::getBugId));
            obtainPairFile(subjectPatchMap, file);
        }
    }

    public static void obtainPairFile(Map<String, List<PatchJson>> subjectPatchMap, String resDir) {
        List<CompletableFuture<Void>> futureList = new LinkedList<>();
        for (Entry<String, List<PatchJson>> entry : subjectPatchMap.entrySet()) {
            futureList.add(CompletableFuture.runAsync(() -> {
                try {
                    processFile(entry, resDir);
                } catch (Exception e) {
                    log.error("obtain trace failed! subject {}", entry.getKey(), e);
                }
            }, EXECUTOR));
        }
        CompletableFuture.allOf(futureList.toArray(new CompletableFuture[0])).join();
    }


    public static void processFile(Entry<String, List<PatchJson>> entry, String resDir) {

        String[] sub = entry.getKey().split("-");
        Subject subject = new Subject(sub[0], Integer.parseInt(sub[1]));
        //JSONArray jsonArray = new JSONArray();
        String resultDir = Constant.HOME + "/result/PairFiles_crosspatch/" + resDir;
        //int i = 0;
        for (PatchJson patchJson : entry.getValue()) {
            ObtainTraceInfo.cleanSubject(subject.getHome() + subject.get_ssrc());
            log.info("Process for Patch {}", patchJson.getPatchName());
            String buggyFile = ProcessPatch.createCombinedBuggy4OneFile(patchJson);
            String fixedFile = ProcessPatch.createCombinedFixed4OneFile(patchJson);
            if (!checkClass(buggyFile) || !checkClass(fixedFile)) {
                log.error("Patch {} has error in checkfile", patchJson.getPatchName());
            }
            Map<String, String> onepatch = new LinkedHashMap<>();
            onepatch.put("patchName", patchJson.getPatchName());
            onepatch.put("label", patchJson.getLabel());
            onepatch.put("buggFile", buggyFile);
            onepatch.put("fixedFile", fixedFile);
            FileIO.writeStringToFile(
                    resultDir + "/" + entry.getKey() + "/" + patchJson.getPatchName() + "/" + entry.getKey() + "_"
                            + patchJson
                            .getPatchName() + "_s.java",
                    buggyFile);
            FileIO.writeStringToFile(
                    resultDir + "/" + entry.getKey() + "/" + patchJson.getPatchName() + "/" + entry.getKey() + "_"
                            + patchJson
                            .getPatchName() + "_t.java",
                    fixedFile);
            //i++;
            //onepatch.put("bugid", patchJson.getBugId());
            //jsonArray.add(onepatch);
        }


        // FileIO.writeStringToFile(resultDir + "/" + entry.getKey(), JSON.toJSONString(jsonArray));
    }

    private static boolean checkClass(String classFile) {
        CompilationUnit unit = FileIO.genASTFromSource(classFile, ASTParser.K_COMPILATION_UNIT);
        return unit.getProblems().length <= 0;
    }

    public static void main(String[] args) {
        mainProcess();
    }
}
