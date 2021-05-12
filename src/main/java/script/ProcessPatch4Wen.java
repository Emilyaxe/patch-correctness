package script;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import config.Constant;
import lombok.extern.slf4j.Slf4j;
import util.FileIO;

@Slf4j
public class ProcessPatch4Wen {


    public static void mainProcess() {
        //String patches = Constant.HOME + "/Patches/Patches_ICSE";
        List<File> icseFileList = new LinkedList<>();
        List<File> otherFileList = new LinkedList<>();
        List<File> totalFile = new LinkedList<>();
        countAllFiles(Constant.HOME + "/Patches/Patches_ICSE", icseFileList);
        countAllFiles(Constant.HOME + "/Patches/Patches_others", otherFileList);
        totalFile.addAll(icseFileList);
        totalFile.addAll(otherFileList);

        String targetCorrect = Constant.HOME + "/Patches/ASE20/Correct/";
        String targetIncorrect = Constant.HOME + "/Patches/ASE20/Overfitting/";
        String patchClassfication = Constant.HOME + "/Patches/records";
        String content = FileIO.readFileToString(patchClassfication);

        Map<String, String> correctPatchMap = new LinkedHashMap<>();
        Map<String, String> IncorrectPatchMap = new LinkedHashMap<>();
        List<String> formatPatchName = new LinkedList<>();


        for (String line : content.split("\n")) {
            //            if(StringUtils.isEmpty(line.trim())){
            //                continue;
            //            }
            String c = line.split("\t")[0];
            if (!StringUtils.isEmpty(c)) {
                correctPatchMap.put(c, processName(c, true));
            }
            String ic = line.split("\t")[1];
            if (!StringUtils.isEmpty(ic)) {
                IncorrectPatchMap.put(ic, processName(ic, false));
            }
        }
        List<String> errorPatchName = new LinkedList<>();
        Set<String> totalFileList = totalFile.stream().map(File::getName).collect(Collectors.toSet());
        log.info("totalFile size {}, totalFileList size{}", totalFile.size(), totalFileList.size());
        for (Entry<String, String> entry : correctPatchMap.entrySet()) {
            String originalName = entry.getKey();
            String patchName = entry.getValue();
            if (!totalFileList.contains(patchName)) {
                errorPatchName.add(originalName);
            }
            for (File f : totalFile) {
                if (f.getName().equals(patchName)) {
                    moveFile(f.getAbsolutePath(), targetCorrect + patchName);
                    break;
                }
            }
        }
        for (Entry<String, String> entry : IncorrectPatchMap.entrySet()) {
            String originalName = entry.getKey();
            String patchName = entry.getValue();
            if (!totalFileList.contains(patchName)) {
                errorPatchName.add(originalName);
            }
            for (File f : totalFile) {
                if (f.getName().equals(patchName)) {
                    moveFile(f.getAbsolutePath(), targetIncorrect + patchName);
                    //formatPatchName.add(patchName);
                    break;
                }
            }
        }
        log.info("e " + errorPatchName.size());

        //        log.info(cPatchMap.size() + "");
        //        log.info(incPatchMap.size() + "");

    }

    public static void moveFile(String source, String target) {
        try {
            FileUtils.copyFile(new File(source), new File(target));
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    private static String processName(String name, boolean isCorrect) {
        StringBuilder result = new StringBuilder();
        if (isCorrect) {
            String[] patchName = name.split("-");
            if (patchName.length == 4) {
                result.append(name);
            } else if (patchName.length == 3) {
                result.append("patch1-").append(patchName[1]).append("-")
                        .append(patchName[2]).append("-").append(patchName[0]);
            } else {
                log.error("Process PatchName Failed {}, correct", name);
            }
        } else {
            String[] patchName = name.split("-");
            if (patchName.length == 4) {
                result.append(name).append("-").append("plausible");
            } else if (patchName.length == 3) {
                result.append("patch1-").append(patchName[1]).append("-").append(patchName[2]).append("-")
                        .append(patchName[0]).append("-").append("plausible");
            } else if (patchName.length == 5) {
                result.append(name);
            } else {
                log.error("Process PatchName Failed {}, correct", name);
            }

        }
        return result.append(".patch").toString();
    }

    public static void countAllFiles(String path, List<File> fileList) {
        for (File f : new File(path).listFiles()) {
            if (f.isFile() && f.getName().endsWith(".patch")) {
                fileList.add(f);
            } else if (f.isDirectory()) {
                countAllFiles(f.getAbsolutePath(), fileList);
            } else {
                //System.out.println(f.getAbsolutePath());
            }
        }
    }

    public static void main(String[] args) {
        mainProcess();
    }
}
