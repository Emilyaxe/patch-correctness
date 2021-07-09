package service;

import static util.AsyExecutor.EXECUTOR;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import org.apache.commons.collections4.CollectionUtils;

import com.alibaba.fastjson.JSON;

import config.Constant;
import entity.Patch;
import entity.PatchJson;
import entity.Subject;
import lombok.extern.slf4j.Slf4j;
import util.FileIO;


@Slf4j
public class ObtainPatchedFile {

    public static String[] allData = {"correctSet", "testSet", "trainSet"};


    public static void mainProcess() {
        //String patchDir = "./result/dataSetPartition/";
        for (String file : allData) {
            log.info("Process {}", file);
            String content = FileIO.readFileToString(Constant.patchesPartitionResult + "/" + file);
            List<PatchJson> patchJsonList = JSON.parseArray(content, PatchJson.class);
            if (CollectionUtils.isEmpty(patchJsonList)) {
                continue;
            }
            Map<String, List<PatchJson>> subjectPatchMap =
                    patchJsonList.stream().collect(Collectors.groupingBy(PatchJson::getBugId));
            //obtainPairFile(subjectPatchMap);
        }
    }

    public static void obtainPairFile(Map<String, List<Patch>> subjectPatchMap) {
        List<CompletableFuture<Void>> futureList = new LinkedList<>();
        for (Entry<String, List<Patch>> entry : subjectPatchMap.entrySet()) {
            futureList.add(CompletableFuture.runAsync(() -> {
                try {
                    processFile(entry);
                } catch (Exception e) {
                    log.error("obtain trace failed! subject {}", entry.getKey(), e);
                }
            }, EXECUTOR));
        }
        CompletableFuture.allOf(futureList.toArray(new CompletableFuture[0])).join();

    }


    public static void processFile(Entry<String, List<Patch>> entry) {

        String[] sub = entry.getKey().split("-");
        Subject subject = new Subject(sub[0], Integer.parseInt(sub[1]));
        for (Patch patch : entry.getValue()) {

        }
    }

    public static void main(String[] args) {

    }
}
