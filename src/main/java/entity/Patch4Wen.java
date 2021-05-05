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

@Slf4j
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Patch4Wen {

    String patchPath;
    String patchName;
    String fixedFile;
    Set<Integer> fixedLines = new LinkedHashSet<>();
    String buggyMethod;
    String fixedMethod;
    String combinedMethod;
    boolean multiFiles = false;
    private LinkedHashMap<String, String> buggyLines = new LinkedHashMap<>();
    private LinkedHashMap<String, List<String>> insertFixedLines = new LinkedHashMap<>();

    public Patch4Wen(String patchPath,String patchName){
        this.patchPath = patchPath;
        this.patchName = patchName;
    }
    /*
    record the changed lineNumber.
     */
    public void recordLines() {
        String constant = FileIO.readFileToString(patchPath);
        String[] diffFiles = constant.split("---");
        if(diffFiles.length > 2){
            //log.warn("Patch {} has multiple fixed files", patchPath);
            //return;
            multiFiles = true;
        }
         fixedFile = constant.split("\n")[0].split("--- ")[1];
            String[] diffParagraphs = diffFiles[1].split("@@ -");

           // String fixedFile = lines[0].split("--- ")[1];
            for (int i = 1; i < diffParagraphs.length; i++) {
                String diffParagraph = diffParagraphs[i];
              String lines[] = diffParagraph.split("\n");
                int lineNumber = Integer.parseInt(lines[0].split(",")[1].split(" +")[1]);
                for (int j = 1; j < lines.length; j++) {
                    String line = lines[j];
                    if (line.startsWith("-")) {
                        fixedLines.add(lineNumber);
                        //addMap(fixedFile, lineNumber);
                    } else if (line.startsWith("+")) {
                        //addMap(fixedFile, lineNumber);
                        fixedLines.add(lineNumber);
                       lineNumber++;
                    } else {
                        lineNumber++;
                    }
                }
            }


    }
    /*
record the buggy and fixed line numbers.
 */
    public void recordFixedandBuggyLines() {
        String constant = FileIO.readFileToString(patchPath);
        String[] diffFiles = constant.split("---");
       // for (String diffFile : diffFiles) {
        String diffFile = diffFiles[1];
//            if (diffFile.equals("")) {
//                continue;
//            }
            String[] diffParagraphs = diffFile.split("@@ -");
            String firstParagraphs = diffParagraphs[0];
            String[] lines = firstParagraphs.split("\n");

            for (int i = 1; i < diffParagraphs.length; i++) {

                String diffParagraph = diffParagraphs[i];
                lines = diffParagraph.split("\n");
                int lineNumber = Integer.parseInt(lines[0].split(",")[0]);
                for (int j = 1; j < lines.length; j++) {
                    String line = lines[j];
                    if (line.startsWith("+")) {
                        String key = fixedFile + Constant.LINENUMBER_SEGMENT + lineNumber;
                        if (insertFixedLines.containsKey(key)) {
                            insertFixedLines.get(key).add(line.split("\\+", 2)[1]);
                        } else {
                            insertFixedLines
                                    .put(key, new LinkedList<String>(Collections.singleton(line.split("\\+", 2)[1])));
                        }

                    } else if (line.startsWith("-")) {
                        buggyLines
                                .put(fixedFile + Constant.LINENUMBER_SEGMENT + lineNumber, line.split("-", 2)[1]);
                        lineNumber++;
                    } else {
                        lineNumber++;
                    }
                }

            }
       // }

    }

//public void addMap(String fixedFile, Integer lineNumber){
//    if(fixedMap.containsKey(fixedFile)){
//        fixedMap.get(fixedFile).add(lineNumber);
//    }else{
//       Set set = new LinkedHashSet();
//       set.add(lineNumber);
//        fixedMap.put(fixedFile, set);
//    }
//}


    public static void main(String[] args) {
       // Subject subject = new Subject("Chart", 15);
        String patchFile = "/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/Patches"
                + "/Patches_ICSE/Ddifferent/ACS/Lang/patch1-Lang-35-ACS.patch";
        Patch4Wen patch = new Patch4Wen(patchFile, "patch1-Lang-35-ACS.patch");
        patch.recordLines();
        //patch.getFixedMap().size();
        //patch.initFixedFileSet();
      //  System.out.println(patch.getInsertFixedLines().size());
       // System.out.println(patch.getBuggyLines().size());

    }
}
