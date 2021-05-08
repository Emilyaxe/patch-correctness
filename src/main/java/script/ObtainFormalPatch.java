package script;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.io.FileUtils;

import entity.Patch;
import lombok.extern.slf4j.Slf4j;
import util.FileIO;

@Slf4j
public class ObtainFormalPatch {
    public static void moveTrainSet(String summaryFile) {
        String patchesDir =
                "/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/Patches/Patches_ICSE3";
        List<Patch> wenPatchList = new LinkedList<>();
        for (File f : new File(patchesDir).listFiles()) {
            if (f.isFile()) {
                continue;
            }
            String label = f.getName();
            for (File patchFile : f.listFiles()) {
                if (!patchFile.getName().endsWith("patch")) {
                    log.warn("ignore file {}", patchFile.getName());
                    continue;
                }
                String fileName[] = patchFile.getName().split(".patch")[0].split("-");
                String subject = fileName[1] + "-" + fileName[2];
                String tool = fileName[3];
                Patch patch = Patch.builder().lable(label).tool(tool).bugid(subject)
                        .patchName(patchFile.getName()).build();
                patch.setPatchPath(patchFile.getAbsolutePath());
                wenPatchList.add(patch);
            }
        }
        log.info("wenList size: {}", wenPatchList.size());

        String patchLines = FileIO.readFileToString(summaryFile);
        List<Patch> trainPatches = new LinkedList<>();
        int i = 1;
        for (String patch : patchLines.split("\n")) {
            String title[] = patch.split("<ml>");
            String lable = title[0].equals("0") ? "P" : "C";

            String patchName = title[1];
            if (i > 130 && i < 665) {
                String tool = patchName.split("_")[0];
                String subject = patchName.split("_")[1];
                Patch patch1 = Patch.builder().lable(lable).tool(tool).bugid(subject)
                        .patchName(patchName).build();
                trainPatches.add(patch1);
            }
            i++;
        }
        log.info("TrainPatches size: {}", trainPatches.size());

        Map<String, List<Patch>> map = new LinkedHashMap<>();
        List<Patch> notFindPatches = new LinkedList<>();
        for (Patch patch : trainPatches) {
            String tool = patch.getTool();
            if (tool.equals("ARJA")) {
                tool = "Arja";
            } else if (tool.equals("GenProg-A")) {
                tool = "GenProg";
            } else if (tool.equals("Kali-A")) {
                tool = "Kali";
            } else if (tool.equals("RSRepair-A")) {
                tool = "RSRepair";
            } else if (tool.equals("Cardumem")) {
                tool = "Cardumen";
            }
            boolean findOne = false;

            for (Patch wPatch : wenPatchList) {
                if (wPatch.getTool().equals(tool) && wPatch.getLable().equals(patch.getLable()) && wPatch.getBugid()
                        .equals(patch.getBugid())) {
                    if (map.containsKey(patch.getPatchName())) {
                        log.info("patch {} has multiple corresponding files", patch.toString());

                        map.get(patch.getPatchName()).add(wPatch);
                    } else {
                        List<Patch> wPatchName = new LinkedList<>();
                        wPatchName.add(wPatch);
                        map.put(patch.getPatchName(), wPatchName);
                    }
                    findOne = true;
                }
            }
            if (!findOne) {
                notFindPatches.add(patch);
            }
        }
        log.info("map size:{}", map.size());
        String targetDir =
                "/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/Patches/experiment3"
                        + "/TrainingSet";
        for (Entry<String, List<Patch>> entry : map.entrySet()) {
            String keyName = entry.getKey();
            for (Patch patch : entry.getValue()) {
                String fileName = patch.getPatchPath();
                try {
                    FileUtils.copyFile(new File(fileName), new File(targetDir + "/" + keyName));
                } catch (IOException exception) {
                    exception.printStackTrace();
                }
            }
        }

    }


    public static void readPatch() {

        String summaryFile =
                "/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/Patches/experiment3"
                        + "/kui_data_for_cc2v.txt";

        moveTrainSet(summaryFile);
    }

    public static void main(String[] args) {
        readPatch();
    }
}
