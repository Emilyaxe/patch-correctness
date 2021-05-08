package script;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;

import entity.Patch;
import lombok.extern.slf4j.Slf4j;
import util.FileIO;

@Slf4j
public class CountNumber {

    //    static String plausibleCheck[] = {"Kali-Closure-133", "kPAR-Chart-12", "FixMiner-Chart-12", "patch1-Lang-6-SketchFix-plausible",
    //            "patch2-Lang-6-SketchFix-plausible", "patch1-Math-2-SOFix"};
    //    static String plausibleCheck[] = {"Closure-133-Kali", "Chart-12-kPAR", "Chart-12-FixMiner", "patch1-Lang-6-SketchFix-plausible",
    //            "patch2-Lang-6-SketchFix-plausible", "patch1-Math-2-SOFix"};
    //static String wrongLabel[] = {"patch2-Lang-51-Jaid","patch1-Lang-43-CapGen",
    //        "patch2-Lang-43-CapGen",  "patch2-Math-53-CapGen", "patch2-Math-53-Jaid", "Lang-7-jKali", "Lang-35-ACS",
    //        "Math-35-Arja", "Math-72-SimFix", "Closure-19-SimFix", "Math-50-Arja", "Lang-60-SimFix"};
    public static void countAllFiles(String path, List<String> fileList) {
        for (File f : new File(path).listFiles()) {
            if (f.isFile() && f.getName().endsWith(".patch")) {
                if (f.getName().contains("Mockito")) {
                    System.out.println(f.getName());
                }
                //                if(Arrays.asList(plausibleCheck).contains(f.getName())){
                //                    System.out.println(f.getAbsolutePath());
                //                }
                //                if(Arrays.asList(wrongLabel).contains(f.getName())){
                //                    System.out.println(f.getAbsolutePath());
                //                }
                fileList.add(f.getAbsolutePath());

            } else if (f.isDirectory()) {
                countAllFiles(f.getAbsolutePath(), fileList);
            } else {
                //System.out.println(f.getAbsolutePath());
            }
        }
    }

    public static void moveFile(List<String> fileList, String target) {

        fileList.stream().filter(Objects::nonNull).forEach(filePath -> {
            try {
                FileUtils.copyFile(new File(filePath), new File(
                        target + "/" + filePath.split("/")[filePath.split("/").length - 1]));
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        });

    }

    public static void countWen() {
        String path = "/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/Patches/Patches_others/Doverfitting";

        List<String> fileList = new LinkedList<>();
        countAllFiles(path, fileList);
        List<String> totalList = new LinkedList<>(fileList);

        //System.out.println("Patches_others/Doverfitting: " + fileList.size());

        //patchesSet = fileList.stream().map(f-> FileIO.readFileToString(f)).collect(Collectors.toSet());

        fileList = new LinkedList<>();
        path = "/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/Patches/Patches_others/Dcorrect";
        countAllFiles(path, fileList);
        totalList.addAll(fileList);
        System.out.println("Patches_others/Dcorrect: " + fileList.size());
        //patchesSet.addAll(fileList.stream().map(f-> FileIO.readFileToString(f)).collect(Collectors.toSet()));

        fileList = new LinkedList<>();
        path = "/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/Patches/Patches_ICSE/Ddifferent";
        String targetDir = "/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/Patches/Patches_ICSE2";
        countAllFiles(path, fileList);
        totalList.addAll(fileList);
        moveFile(fileList, targetDir + "/C");
        System.out.println("Patches_ICSE/Ddifferent: " + fileList.size());
        //patchesSet.addAll(fileList.stream().map(f-> FileIO.readFileToString(f)).collect(Collectors.toSet()));

        fileList = new LinkedList<>();
        path = "/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/Patches/Patches_ICSE/Dsame";
        countAllFiles(path, fileList);
        totalList.addAll(fileList);
        moveFile(fileList, targetDir + "/C");
        System.out.println("Patches_ICSE/Dsame: " + fileList.size());
        //patchesSet.addAll(fileList.stream().map(f-> FileIO.readFileToString(f)).collect(Collectors.toSet()));

        fileList = new LinkedList<>();
        path = "/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/Patches/Patches_ICSE/Doverfitting";
        countAllFiles(path, fileList);
        totalList.addAll(fileList);
        System.out.println("Patches_ICSE/Doverfitting: " + fileList.size());
        moveFile(fileList, targetDir + "/P");
        //patchesSet.addAll(fileList.stream().map(f-> FileIO.readFileToString(f)).collect(Collectors.toSet()));

        fileList = new LinkedList<>();
        path = "/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/Patches/Patches_ICSE/Error";
        countAllFiles(path, fileList);
        totalList.addAll(fileList);
        moveFile(fileList, targetDir + "/P");
        System.out.println("Patches_ICSE/Error: " + fileList.size());

    }

    public static List<Patch> countKui() {
        String path = "/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/Patches/experiment3/APR-Efficiency-NFL"; //
        List<Patch> kuiPatchList = new LinkedList<>();
        //Set<String> patchContentSet = new HashSet<>();
        for (File toolDir : new File(path).listFiles()) {
            if (toolDir.isFile()) {
                continue;
            }
            String tool = toolDir.getName();
            log.info(tool);
            for (File subjectFile : toolDir.listFiles()) {
                if (subjectFile.isFile()) {
                    continue;
                }
                String subject = subjectFile.getName().split("_")[0];
                String label = subjectFile.getName().split("_")[1].trim();
                for (File patchFile : subjectFile.listFiles()) {
                    if (patchFile.getName().endsWith("txt")) {
                        Patch patch = Patch.builder().lable(label).tool(tool)
                                .patchName(patchFile.getName())
                                .content(FileIO.readFileToString(patchFile)).bugid(subject).build();
                        // patchContentSet.add(FileIO.readFileToString(patchFile));
                        kuiPatchList.add(patch);
                    }
                }
            }
        }
        Map<String, List<Patch>> labelMap = kuiPatchList.stream().filter(Objects::nonNull)
                .collect(Collectors.groupingBy(Patch::getLable));
        Map<String, List<Patch>> contentMap = kuiPatchList.stream().filter(Objects::nonNull)
                .collect(Collectors.groupingBy(Patch::getContent));
        //log.info("" + labelMap.size());
        return kuiPatchList;
        //buildMap(kuiPatchList );
    }

    public static List<Patch> countWen2() {
        String targetDir = "/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/Patches/Patches_ICSE2";
        List<Patch> wenPatchList = new LinkedList<>();
        for (File f : new File(targetDir).listFiles()) {
            if (f.isFile()) {
                continue;
            }
            String label = f.getName();
            for (File patchFile : f.listFiles()) {
                if (!patchFile.getName().endsWith("patch")) {
                    log.warn("ignore file {}", patchFile.getName());
                    continue;
                }
                String[] fileName = patchFile.getName().split(".patch")[0].split("-");
                String subject = fileName[1] + "-" + fileName[2];
                String tool = fileName[3];
                Patch patch = Patch.builder().lable(label).tool(tool).bugid(subject)
                        .patchName(patchFile.getName()).build();
                wenPatchList.add(patch);
            }
        }
        return wenPatchList;
    }

    public static void buildMap(List<Patch> kuiList, List<Patch> wenList) {
        Set<String> kuiSet = kuiList.stream().filter(Objects::nonNull)
                .map(patch -> patch.getLable() + "-" + patch.getBugid() + "-" + patch.getTool())
                .collect(Collectors.toSet());
        Map<String, List<Patch>> kuiMap = kuiList.stream().filter(Objects::nonNull)
                .collect(Collectors.groupingBy(patch -> patch.getLable() + "-" + patch.getBugid()
                        + "-" + patch.getTool()));
        Map<String, List<String>> labelMap = kuiSet.stream()
                .collect(Collectors.groupingBy(str -> str.split("-")[0]));
        List<Patch> containList = new LinkedList<>();
        List<Patch> notContainList = new LinkedList<>();
        for (Patch patch : wenList) {
            String tool = patch.getTool();
            switch (tool) {
                case "Arja":
                    tool = "ARJA";
                    break;
                case "GenProg":
                    tool = "GenProg-A";
                    break;
                case "Kali":
                    tool = "Kali-A";
                    break;
                case "RSRepair":
                    tool = "RSRepair-A";
                    break;
                case "Cardumen":
                    tool = "Cardumem";
                    break;
            }
            String match = patch.getLable() + "-" + patch.getBugid() + "-" + tool;
            if (kuiSet.contains(match)) {
                containList.add(patch);
            } else {
                notContainList.add(patch);
            }
        }

        log.info("" + containList.size());
    }

    public static void main(String[] args) {
        //Set<String> patchesSet = new LinkedHashSet<>()
        buildMap(countKui(), countWen2());
        // countWen();

    }
}
