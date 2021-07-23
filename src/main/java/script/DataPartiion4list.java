package script;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSON;

import config.Constant;
import entity.PatchJson;
import lombok.extern.slf4j.Slf4j;
import util.FileIO;

@Slf4j
public class DataPartiion4list {
    public static String[] allData = {"correctSet_unpurify_list", "testSet_unpurify_list", "trainSet_unpurify_list"};
    // public static String[] dataSet = {"testSet", "trainSet", "validateSet"};

    public static void mainProcess() {
        // obtain patches name for each set
        String dir = Constant.HOME + "/result/dataSetPartition/";
        List<String> testSet = JSON.parseArray(FileIO.readFileToString(dir + "testSet"), PatchJson.class).stream()
                .map(PatchJson::getPatchName).collect(
                        Collectors.toList());

        List<String> trainSet = JSON.parseArray(FileIO.readFileToString(dir + "trainSet"), PatchJson.class).stream()
                .map(PatchJson::getPatchName).collect(
                        Collectors.toList());

        List<String> validateSet =
                JSON.parseArray(FileIO.readFileToString(dir + "validateSet"), PatchJson.class).stream()
                        .map(PatchJson::getPatchName).collect(
                        Collectors.toList());

        String combineInfo = Constant.HOME + "/result/combineInfo/";
        for (String data : allData) {
            try {
                FileInputStream inputStream = null;
                try {
                    inputStream = new FileInputStream(combineInfo + data);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

                String str = null;
                while ((str = bufferedReader.readLine()) != null) {
                    if (StringUtils.isNotBlank(str)) {
                        PatchJson patchJson = JSON.parseObject(str, PatchJson.class);
                        log.info("Process " + patchJson.getPatchName());
                        if (testSet.contains(patchJson.getPatchName())) {
                            FileIO.writeStringToFile(dir + "testSet_list", JSON.toJSONString(patchJson) + "\n", true);
                        } else if (trainSet.contains(patchJson.getPatchName())) {
                            FileIO.writeStringToFile(dir + "trainSet_list", JSON.toJSONString(patchJson) + "\n", true);
                        } else if (validateSet.contains(patchJson.getPatchName())) {
                            FileIO.writeStringToFile(dir + "validateSet_list", JSON.toJSONString(patchJson) + "\n",
                                    true);
                        } else {
                            log.error(patchJson.getPatchName() + " does not have category");
                        }
                    }
                }
                //close
                inputStream.close();
                bufferedReader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            //            String content = FileIO.readFileToString(combineInfo + data);
            //            List<PatchJson> patchJsons =
            //                    Arrays.stream(content.split("\n")).filter(StringUtils::isNotBlank)
            //                            .map(line -> JSON.parseObject(line, PatchJson.class)).collect(
            //                            Collectors.toList());
            //            for (PatchJson patchJson : patchJsons) {
            //                log.info(patchJson.getPatchName());
            //                if (testSet.contains(patchJson.getPatchName())) {
            //                    FileIO.writeStringToFile(dir + "testSet_list", JSON.toJSONString(patchJson) + "\n",
            //                    true);
            //                } else if (trainSet.contains(patchJson.getPatchName())) {
            //                    FileIO.writeStringToFile(dir + "trainSet_list", JSON.toJSONString(patchJson) +
            //                    "\n", true);
            //                } else if (validateSet.contains(patchJson.getPatchName())) {
            //                    FileIO.writeStringToFile(dir + "validateSet_list", JSON.toJSONString(patchJson) +
            //                    "\n", true);
            //                } else {
            //                    log.error(patchJson.getPatchName() + " does not have category");
            //                }
            //            }
        }

    }

    public static void main(String[] args) {
        mainProcess();
    }
}
