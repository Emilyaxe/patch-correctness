package script;

import static util.AsyExecutor.EXECUTOR;

import java.io.File;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import config.Constant;
import lombok.extern.slf4j.Slf4j;
import run.Executor;
import run.Runner;
import util.FileIO;

@Slf4j
public class MulThreadTest {
    public static JSONObject jsonObject = new JSONObject();

    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Chart", 26);
        map.put("Closure", 133);
        map.put("Math", 106);
        map.put("Lang", 65);
        map.put("Time", 27);
        List<CompletableFuture<Void>> futureList = new LinkedList<>();
        for (Entry<String, Integer> entry : map.entrySet()) {
            String name = entry.getKey();
            Integer end = entry.getValue();
            for (int i = 1; i <= end; i++) {
                int index = i;
                futureList.add(CompletableFuture.runAsync(() -> {
                    //Subject subject = new Subject(name, index);
                    downloadProject(name, String.valueOf(index));
                }, EXECUTOR));
            }
        }
        CompletableFuture.allOf(futureList.toArray(new CompletableFuture[0])).join();
        FileIO.writeStringToFile("./fixedVersion", JSON.toJSONString(jsonObject));
        log.info("finish all subject!");
    }

    private static void downloadProject(String name, String id) {
        log.info("Downloading {} ...", name + id);
        String home = Constant.env + "/WorkSpace/Data/Defects4J/projects_fixed/" + name + "/" + name + id;
        File file = new File(home);
        if (!file.exists()) {
            file.getParentFile().mkdirs();
        }
        List<String> message = Collections.emptyList();
        try {
            String stringBuilder =
                    Constant.COMMAND_D4J + " checkout -p " + name + " -v " + id
                            + "f -w " + home;
            message = Executor.execute(new String[] {"/bin/bash", "-c", stringBuilder});
        } catch (Exception e) {
        }
        log.info(String.join("\n", message));

        runTests(name, id);
        //        return CollectionUtils.isNotEmpty(message) || message.stream().filter(Objects::nonNull)
        //                .noneMatch(element -> element.contains("Version id does not exist:"));
    }

    private static void runTests(String name, String id) {
        List<String> message = null;
        try {
            log.info("TESTING : " + name + "_" + id);
            String home = Constant.env + "/WorkSpace/Data/Defects4J/projects_fixed/" + name + "/" + name + id;

            StringBuilder stringBuilder =
                    new StringBuilder(Constant.COMMAND_CD).append(home).append(" && ");
            //            if (timeout > 0) {
            //                stringBuilder.append(Constant.COMMAND_TIMEOUT).append(timeout).append(" ");
            //            }
            stringBuilder.append(Constant.COMMAND_D4J).append("test");
            message = Executor.execute(new String[] {"/bin/bash", "-c", stringBuilder.toString()});
            List<String> result = processMessage(message);
            if (Objects.nonNull(result)) {
                jsonObject.put(name + id, result);
            }
        } catch (Exception e) {
            // LevelLogger.fatal(__name__ + "#buildSubject run test single test case failed !", e);
        }
    }

    private static List<String> processMessage(List<String> message) {
        List<String> failingTest = new LinkedList<>();
        if (message.size() < 3) {
            failingTest.add("TimeOut");
        } else if (message.get(2).trim().equals(Runner.SUCCESSTEST)) {
            return null;
        } else {
            failingTest =
                    message.stream().filter(line -> line.trim().startsWith("-")).map(line -> line.split("-", 2)[1])
                            .collect(Collectors.toList());
        }
        return failingTest;
    }
}
