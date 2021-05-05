package entity;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import util.FileIO;

@Slf4j
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Patch4Train {

    String fixedFile;
    String combinedMethod;
    String lable;
    String tool;
    String patchName;
    String patchPath;
    boolean deleteAll = false;

    private Set<Integer> changeLines = new LinkedHashSet<>();
    //    private LinkedHashMap<String, String> buggyLines = new LinkedHashMap<>();
    //    private LinkedHashMap<String, List<String>> insertFixedLines = new LinkedHashMap<>();

    public Patch4Train(String absolutePath, String name) {
        this.patchPath = absolutePath;
        this.patchName = name;
    }

    public void initFixedFileAndChanges() {
        String constant = FileIO.readFileToString(patchPath);
        String[] diffFiles = constant.split("---");
        String diffFile = diffFiles[1];
        String[] diffParagraphs = diffFile.split("@@ -");
        String firstParagraphs = diffParagraphs[0];
        String[] lines = firstParagraphs.split("\n");
        fixedFile = lines[0].trim();
        for (int i = 1; i < diffParagraphs.length; i++) {
            String diffParagraph = diffParagraphs[i];
            lines = diffParagraph.split("\n");
            int lineNumber = Integer.parseInt(lines[0].split(",")[0]);
            int addLineNumber = Integer.parseInt(lines[0].split("\\+")[1].split(",")[0]);
            if (lineNumber == 1 && addLineNumber == 0) {
                deleteAll = true;
            }
            for (int j = 1; j < lines.length; j++) {
                String line = lines[j];
                if (line.startsWith("+")) {
                    changeLines.add(lineNumber);
                } else if (line.startsWith("-")) {
                    changeLines.add(lineNumber);
                    lineNumber++;
                } else {
                    lineNumber++;
                }
            }

        }

    }


    public Map<Integer, String> recordChanges() {
        String constant = FileIO.readFileToString(patchPath);
        String[] diffFiles = constant.split("---");
        String diffFile = diffFiles[1];
        String[] diffParagraphs = diffFile.split("@@ -");

        Map<Integer, String> patchRecord = new LinkedHashMap<>();
        for (int i = 1; i < diffParagraphs.length; i++) {
            String diffParagraph = diffParagraphs[i];
            String[] lines = diffParagraph.split("\n");
            int lineNumber = Integer.parseInt(lines[0].split(",")[0]);
            patchRecord.put(lineNumber, diffParagraph.split("\n", 2)[1]);
        }
        return patchRecord;
    }

    //    public void recordChangeLines() {
    //
    //        String constant = FileIO.readFileToString(patchPath);
    //        String[] diffFiles = constant.split("---");
    //        // for (String diffFile : diffFiles) {
    //        String diffFile = diffFiles[1];
    //        String[] diffParagraphs = diffFile.split("@@ -");
    //        String firstParagraphs = diffParagraphs[0];
    //        String[] lines = firstParagraphs.split("\n");
    //        fixedFile = lines[0].trim();
    //        for (int i = 1; i < diffParagraphs.length; i++) {
    //            String diffParagraph = diffParagraphs[i];
    //            lines = diffParagraph.split("\n");
    //            int lineNumber = Integer.parseInt(lines[0].split(",")[0]);
    //            for (int j = 1; j < lines.length; j++) {
    //                String line = lines[j];
    //                if (line.startsWith("+")) {
    //                    changeLines.add(lineNumber);
    //                    String key = fixedFile + Constant.LINENUMBER_SEGMENT + lineNumber;
    //                    if (insertFixedLines.containsKey(key)) {
    //                        insertFixedLines.get(key).add(line.split("\\+", 2)[1]);
    //                    } else {
    //                        insertFixedLines
    //                                .put(key, new LinkedList<String>(Collections.singleton(line.split("\\+", 2)[1])));
    //                    }
    //                } else if (line.startsWith("-")) {
    //                    changeLines.add(lineNumber);
    //                    buggyLines
    //                            .put(fixedFile + Constant.LINENUMBER_SEGMENT + lineNumber, line.split("-", 2)[1]);
    //                    lineNumber++;
    //                } else {
    //                    lineNumber++;
    //                }
    //            }
    //
    //        }
    //    }

    public static void main(String[] args) {
        String patchFile =
                "/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/Patches/experiment3"
                        + "/TrainingSet/ARJA_Chart-14_P_Patch_972_738.txt";
        Patch4Train patch4Train = new Patch4Train(patchFile, "FixMiner_Chart-3_P_Patch_583_267.txt");
        Map<Integer, String> map = patch4Train.recordChanges();
        //patch4Test.recordChangeLines();
        log.info("" + patch4Train.getChangeLines().size());

    }
}
