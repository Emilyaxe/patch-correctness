package script;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;

import com.alibaba.fastjson.JSON;

import entity.PatchJson;
import lombok.extern.slf4j.Slf4j;
import util.FileIO;

@Slf4j
public class MakeTestSet {


    public static void main(String[] args) {
        String DataSet = "./Patches/DataSet/";
        String[] dirs = {"correctSet", "testSet", "trainSet"};
        List<File> fileLidt = new LinkedList<>();
        for (String dir : dirs) {
            fileLidt.addAll(Arrays.asList(new File(DataSet + dir).listFiles()));
        }
        Map<String, List<File>> map = fileLidt.stream().collect(Collectors.groupingBy(File::getName));

        List<PatchJson> testPatch =
                JSON.parseArray(FileIO.readFileToString("./result/dataSetPartition/testSet"),
                        PatchJson.class);


        List<String> nameList = testPatch.stream().map(PatchJson::getPatchName).collect(Collectors.toList());
        for (String name : nameList) {
            if (map.containsKey(name)) {
                if (map.get(name).size() > 1) {
                    log.error("Patch File has more than 1 ! {}", name);
                } else {
                    try {
                        FileUtils.copyFile(map.get(name).get(0), new File(DataSet + "patchTest/" + name));
                    } catch (IOException e) {
                        log.error("Patch File error ! {}", name);
                    }
                }

            } else {
                log.error("Patch File Not Find ! {}", name);
            }
        }

    }
}