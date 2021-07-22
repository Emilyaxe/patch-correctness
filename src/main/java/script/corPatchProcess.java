package script;

import java.io.File;

import config.Constant;
import lombok.extern.slf4j.Slf4j;
import util.FileIO;

/*
process correct patches according to icse18
 */
@Slf4j
public class corPatchProcess {

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

    public static void mainProcess() {
        String dir = Constant.HOME + "/Patches/DataSet/patchTest/";
        String tarDir = Constant.HOME + "/Patches/DataSet/patchTest_correctPatch/";
        for (File file : new File(dir).listFiles()) {
            if (file.getName().endsWith(".src.patch")) {
                StringBuffer newContent = new StringBuffer();
                String content = FileIO.readFileToString(file);
                for (String line : content.split("\n")) {
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
                FileIO.writeStringToFile(tarDir + file.getName(), newContent.toString());
            }
        }

    }

    public static void main(String[] args) {
        mainProcess();
    }
}
