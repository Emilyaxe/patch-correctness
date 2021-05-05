package util;

import java.util.LinkedHashMap;
import java.util.List;

import config.Constant;
import entity.Patch4Wen;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CombineVersion {

    // creat fixed file, which keeps fixed lines and annotates buggy lines
    public static void createCombinedFiles(String fixedFile, Patch4Wen patch) {
        //log.info("Create Fixed Files...");
        patch.recordFixedandBuggyLines();
        LinkedHashMap<String, String> buggyLines = patch.getBuggyLines();
        LinkedHashMap<String, List<String>> insertFixedLines = patch.getInsertFixedLines();
            String[] contents = FileIO.readFileToString(fixedFile).split("\n");
            StringBuilder newContent = new StringBuilder();
            for (int i = 0; i < contents.length; i++) {
                int lineNumber = i + 1;
                String key = patch.getFixedFile() + Constant.LINENUMBER_SEGMENT + lineNumber;
                if (insertFixedLines.containsKey(key)) {
                    for (String line : insertFixedLines.get(key)) {
                        newContent.append("+\t").append(line).append("\n");
                    }
                }
                if (buggyLines.containsKey(key)) {
                    newContent.append("-\t").append(contents[i]).append("\n");
                } else {
                    newContent.append(contents[i]).append("\n");
                }
            }
            FileIO.writeStringToFile(fixedFile, newContent.toString());
        }
}
