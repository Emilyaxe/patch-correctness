package entity;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import config.Constant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import util.FileIO;

//不在使用
@Slf4j
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Patch4Kui {
    private String patchPath;
    private String label;
    private String combinedMethod;
    private String patchName;
    private String fixedFile;

    private Set<Integer> changeLines = new LinkedHashSet<>();
    private LinkedHashMap<String, String> buggyLines = new LinkedHashMap<>();
    private LinkedHashMap<String, List<String>> insertFixedLines = new LinkedHashMap<>();

    public Patch4Kui(String patchPath) {
        this.patchPath = patchPath;
    }

    public void recordChangeLines() {

        String constant = FileIO.readFileToString(patchPath);
        String[] diffFiles = constant.split("diff --git");
        String diffFile = diffFiles[1];

        String[] diffParagraphs = diffFile.split("@@ -");
        String firstParagraphs = diffParagraphs[0];
        String[] lines = firstParagraphs.split("\n");

        for (String line : lines) {
            if (line.startsWith("--- a")) {
                fixedFile = line.split("--- a")[1];
            }
        }
        for (int i = 1; i < diffParagraphs.length; i++) {

            String diffParagraph = diffParagraphs[i];
            lines = diffParagraph.split("\n");
            int lineNumber = Integer.parseInt(lines[0].split(",")[0]);
            for (int j = 1; j < lines.length; j++) {
                String line = lines[j];
                if (line.startsWith("+")) {
                    changeLines.add(lineNumber);
                    String key = fixedFile + Constant.LINENUMBER_SEGMENT + lineNumber;
                    if (insertFixedLines.containsKey(key)) {
                        insertFixedLines.get(key).add(line.split("\\+", 2)[1]);
                    } else {
                        insertFixedLines
                                .put(key, new LinkedList<String>(Collections.singleton(line.split("\\+", 2)[1])));
                    }

                } else if (line.startsWith("-")) {
                    changeLines.add(lineNumber);
                    buggyLines
                            .put(fixedFile + Constant.LINENUMBER_SEGMENT + lineNumber, line.split("-", 2)[1]);
                    lineNumber++;
                } else {
                    lineNumber++;
                }
            }

        }
    }

    public static void main(String[] args) {

        String patchFile =
                "/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/Patches/experiment3"
                        + "/TrainingSet/FixMiner_Chart-3_P_Patch_583_267.txt";
        Patch4Kui patch4Kui = new Patch4Kui(patchFile);
        patch4Kui.recordChangeLines();

    }

}
