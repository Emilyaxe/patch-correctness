package entity;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import util.FileIO;

@Slf4j
@Data
@Builder
public class Patch4Test {
    String fixedFile;
    String combinedMethod;
    String lable;
    String tool;
    String patchName;
    String patchPath;
    String bugid;
    boolean deleteAll = false;

    private Set<Integer> changeLines = new LinkedHashSet<>();
    //    private LinkedHashMap<String, String> buggyLines = new LinkedHashMap<>();
    //    private LinkedHashMap<String, List<String>> insertFixedLines = new LinkedHashMap<>();

    public Patch4Test(String absolutePath, String name) {
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


    public static void main(String[] args) {
        String patchFile =
                "/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/Patches/experiment3"
                        + "/TestSet/Patch5";
        Patch4Test patch4Test = new Patch4Test(patchFile, "Patch5");
        Map<Integer, String> map = patch4Test.recordChanges();
        //patch4Test.recordChangeLines();
        log.info("" + patch4Test.getChangeLines().size());

    }
}
