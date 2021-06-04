package script;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import lombok.extern.slf4j.Slf4j;
import util.FileIO;

@Slf4j
public class checkCover {
    public static void main(String[] args) {
        int corDiff0 = 0;
        int corDiff1 = 0;
        int inCorDiff0 = 0;
        int inCorDiff1 = 0;
        String[] fileSet = {"correctSet_purify.info", "testSet_purify.info", "trainSet_purify.info"};
        for (String data : fileSet) {
            String file = "./result/" + data;
            String content = FileIO.readFileToString(file);
            JSONObject jsonObject = JSON.parseObject(content);
            for (String key : jsonObject.keySet()) {
                JSONObject value = (JSONObject) jsonObject.get(key);
                String label = value.getString("label");
                int diffNum = value.getIntValue("pdiff");
                if (label.equals("0")) {
                    if (diffNum == 0) {
                        inCorDiff0++;
                    } else {
                        inCorDiff1++;
                    }
                } else {
                    if (diffNum == 0) {
                        corDiff0++;
                    } else {
                        corDiff1++;
                    }
                }
            }
            log.info("{} corDiff0: {} corDiff1: {} inCorDiff0: {} inCorDiff1: {}", data, corDiff0, corDiff1, inCorDiff0,
                    inCorDiff1);
        }
    }
}
