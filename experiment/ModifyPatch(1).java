package experiment;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import util.FileIO;

/**
 * @author houyaozong <houyaozong@kuaishou.com>
 * Created on 2021-08-22
 */
public class ModifyPatch {

    private static final String HOME = "/Users/houyaozong/workspace/patch-correctness";

    // 只处理第一种情况
    public static void processFirst() {
        String sourceDir = HOME + "/Patches/patchTest/correctSet/";
        String resultDir = HOME + "/Patches/patchTestResult/correctSet/";
        for (File file : new File(sourceDir).listFiles()) {
            //            if (!file.getName().equalsIgnoreCase("Closure_16.src.patch")) {
            //                continue;
            //            }
            String patchName = file.getName().split("\\.")[0].replace("_", "");
            String resultFile = resultDir + file.getName();
            String content = FileIO.readFileToString(file);
            String[] array = content.split("\n");
            LinkedList<List<String>> diffFile = new LinkedList<>();
            for (String line : array) {
                if (line.startsWith("diff --git")) {
                    List<String> contentList = new LinkedList<>();
                    contentList.add(line);
                    diffFile.add(contentList);
                } else {
                    diffFile.getLast().add(line);
                }
            }
            FileIO.deleteFile(resultFile);
            for (List<String> partDiffFile : diffFile) {
                // 先替换加减号
                List<String> newContent = processMinusPlus(partDiffFile);
                newContent = processFormat(patchName, newContent);
                FileIO.writeStringToFile(resultFile, String.join("\n", newContent), true);
                FileIO.writeStringToFile(resultFile, "\n", true);
            }
        }
    }

    public static void processSecond() {
        String sourceDir = HOME + "/Patches/patchTest/trainSet/";
        String resultDir = HOME + "/Patches/patchTestResult/trainSet/";
        for (File file : new File(sourceDir).listFiles()) {
            //            if (!file.getName().equalsIgnoreCase("patch2-Lang-33-Jaid.patch")) {
            //                continue;
            //            }
            String[] fileNameArray = file.getName().split("-");
            String patchName1 = Arrays.stream(fileNameArray).skip(1).limit(2)
                    .collect(Collectors.joining()) + "b";
            String patchName2 = (patchName1 + "_" + captureName(fileNameArray[0]) + "_"
                    + fileNameArray[3]).split("\\.")[0];
            String resultFile = resultDir + file.getName();
            String content = FileIO.readFileToString(file);
            String[] array = content.split("\n");
            LinkedList<String> result = new LinkedList<>();
            String first = "";
            String second = "";
            for (String line : array) {
                if (line.startsWith("--- ")) {
                    first = line.substring(4);
                    result.add("--- " + patchName1 + first);
                    continue;
                }
                if (line.startsWith("+++ ")) {
                    second = line.substring(4);
                    result.add("+++ " + patchName2 + second);
                    continue;
                }
                result.add(line);
            }
            result.addFirst("diff -w -u -r " + patchName1 + first + " " + patchName2 + second);
            FileIO.writeStringToFile(resultFile, String.join("\n", result));
        }
    }

    private static List<String> processFormat(String patchName, List<String> list) {
        List<String> result = new ArrayList<>(list.size());
        for (String line : list) {
            if (line.startsWith("index ")) {
                continue;
            }
            if (line.startsWith("diff --git")) {
                String[] array = line.split(" ");
                StringBuilder newLine = new StringBuilder("diff -w -u -r ");
                Arrays.stream(array).forEach(element -> {
                    if (element.startsWith("a/")) {
                        newLine.append(patchName).append("b").append(element.substring(1))
                                .append(" ");
                    }
                    if (element.startsWith("b/")) {
                        newLine.append(patchName).append("b_srcPatch").append(element.substring(1));
                    }
                });
                result.add(newLine.toString());
                continue;
            }
            if (line.startsWith("--- a")) {
                result.add("--- " + patchName + "b" + line.substring(5));
                continue;
            }
            if (line.startsWith("+++ b")) {
                result.add("+++ " + patchName + "b_srcPatch" + line.substring(5));
                continue;
            }
            if (line.startsWith("@@ ")) {
                int last = line.lastIndexOf("@@");
                result.add(line.substring(0, last + 2));
                continue;
            }
            result.add(line);
        }
        return result;
    }

    private static List<String> processMinusPlus(List<String> array) {
        StringBuilder newContent = new StringBuilder();
        for (String line : array) {
            if (line.startsWith("@@")) {
                newContent.append(processLineNumber(line)).append("\n");
            } else if (line.startsWith("-") && !line.startsWith("---")) {
                newContent.append("+").append(line.split("-", 2)[1]).append("\n");
            } else if (line.startsWith("+") && !line.startsWith("+++")) {
                newContent.append("-").append(line.split("\\+", 2)[1]).append("\n");
            } else {
                newContent.append(line).append("\n");
            }
        }
        return Arrays.asList(newContent.toString().split("\n"));
    }

    private static String processLineNumber(String line) {
        //@@ -211,15 +211,16 @@
        //@@ -211,16 +211,15 @@
        String a, b, c, d;
        String tmp1 = line.split(" ")[1];
        String tmp2 = line.split(" ")[2];
        a = tmp1.split("-")[1].split(",")[0];
        b = tmp1.split(",")[1];
        c = tmp2.split("\\+")[1].split(",")[0];
        d = tmp2.split(",")[1];

        return "@@ -" + c + "," + d + " +" + a + "," + b + " @@";

    }

    /** 
     * 将字符串的首字母转大写 
     * @param str 需要转换的字符串
     * */
    private static String captureName(String str) { // 进行字母的ascii编码前移，效率要高于截取字符串进行转换的操作 
        char[] cs = str.toCharArray();
        cs[0] -= 32;
        return String.valueOf(cs);
    }

    public static void main(String[] args) {
        processFirst();
        //processSecond();
    }
}
