package script;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.slf4j.Slf4j;
import util.FileIO;

@Slf4j
public class checklog {
    public static void main(String[] args) {
        String filename = args[0];
        String content = FileIO.readFileToString(filename);
        List<String> failList = new LinkedList<>();
        List<String> passList = new LinkedList<>();
        for(String line: content.split("\n")){
            if(line.contains("Should Pass!")){
                failList.add(line.split("Patch",2)[1].split(", Should Pass!")[0]);
            }
            if(line.contains("Should Fail!")){
                passList.add(line.split("Patch",2)[1].split(", Should Fail!")[0]);
            }
        }
        log.info("PassList: {}", passList.stream().collect(Collectors.joining(",")));
        log.info("FailList: {}", failList.stream().collect(Collectors.joining(",")));
    }
}
