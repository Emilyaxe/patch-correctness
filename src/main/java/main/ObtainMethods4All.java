package main;


import static entity.Patch.findMethods;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

import entity.Patch;
import lombok.extern.slf4j.Slf4j;
import util.FileIO;

@Slf4j
public class ObtainMethods4All {

    public static Map<String, List<Patch>> readTrainPatches() {

        String filePath = "/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/Patches"
                + "/experiment3/kui_data_for_cc2v.txt";

        String patchDir =  "/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/Patches/experiment3/TrainingSet";


        String[] content = FileIO.readFileToString(filePath).split("\n");
        List<Patch> patches = new LinkedList<>();
        for(int i = 130; i < 662; i++){

            String[] line = content[i].split("<ml>");
            String label = line[0];
            String info = line[1];
            String[] infoArray = info.split("_");

            String bugId = infoArray[1];
            patches.add(Patch.builder().lable(label).patchName(info)
                    .bugid(bugId).patchPath(patchDir + "/" + info).id(i)
                    .build());
        }

        Map<String, List<Patch>> subjectPatchMap =
                patches.stream().collect(Collectors.groupingBy(Patch::getBugid));
        log.info("Totol Subject {}", subjectPatchMap.size());
        log.info("Total Patches {}", subjectPatchMap.values().stream().mapToLong(List::size).sum());
        return subjectPatchMap;
    }


    public static Map<String, List<Patch>> readTestPatches() {
        List<Patch> patches = new LinkedList<>();
        String filePath = "/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/Patches"
                + "/experiment3/kui_data_for_cc2v.txt";
        String patchDir =
                "/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/Patches/experiment3/TestSet";
        String[] content = FileIO.readFileToString(filePath).split("\n");
        for (int i = 0; i <= 129; i++) {
            String line = content[i];
            String label = String.valueOf(line.charAt(0));
            String info = line.split("ppp")[1].trim().split(" ")[0];
            String[] infoArray = info.split("_");

            String id = StringUtils.getDigits(infoArray[0]);
            String name = infoArray[0].split(id)[0];

            patches.add(Patch.builder().lable(label).patchName(info)
                    .bugid(name + "-" + id).patchPath(patchDir + "/" + infoArray[1]).id(i)
                    .build());
        }

        Map<String, List<Patch>> subjectPatchMap =
                patches.stream().collect(Collectors.groupingBy(Patch::getBugid));
        log.info("Totol Subject {}", subjectPatchMap.size());
        log.info("Total Patches {}", subjectPatchMap.values().stream().mapToLong(List::size).sum());
        return subjectPatchMap;
    }

    public static Map<String, List<Patch>> readCorrectPatches() {
        List<Patch> patches = new LinkedList<>();
        String filePath = "/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/Patches"
                + "/experiment3/kui_data_for_cc2v.txt";
        String correctDir = "/Users/liangjingjing/WorkSpace/defects4j/framework/projects";
        String[] content = FileIO.readFileToString(filePath).split("\n");
        for(int i = 662; i < 998; i++){
            String[] line = content[i].split("<ml>");
            String label = line[0];
            String info = line[1];
            String[] infoArray = info.split("_");

            String id = infoArray[1].split("\\.")[0];
            String name = infoArray[0];

            patches.add(Patch.builder().lable(label).patchName(info)
                    .bugid(name + "-" + id).patchPath(correctDir + "/" + name +  "/patches/"  + id + ".src.patch")
                    .id(i)
                    .build());
        }

        Map<String, List<Patch>> subjectPatchMap =
                patches.stream().collect(Collectors.groupingBy(Patch::getBugid));
        log.info("Totol Subject {}", subjectPatchMap.size());
        log.info("Total Patches {}", subjectPatchMap.values().stream().mapToLong(List::size).sum());
        return subjectPatchMap;
    }


    public static Map<String, List<Patch>> readCorrectPatch4Wen(){
        List<Patch> patches = new LinkedList<>();
        String Dir = "/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/Patches/ASE20/Correct";
        for(File f: new File(Dir).listFiles()){
            if(!f.getName().endsWith(".patch")){
                continue;
            }
            String[] name = f.getName().split(".patch")[0].split("-");
            patches.add(Patch.builder().lable("1").patchName(f.getName())
                    .bugid(name[1] + "-" + name[2]).patchPath(f.getAbsolutePath()).tool(name[3])
                    .id(0)
                    .build());
        }
        Map<String, List<Patch>> subjectPatchMap =
                patches.stream().collect(Collectors.groupingBy(Patch::getBugid));
        log.info("Totol Subject {}", subjectPatchMap.size());
        log.info("Total Patches {}", subjectPatchMap.values().stream().mapToLong(List::size).sum());
        return subjectPatchMap;
    }
    public static Map<String, List<Patch>> readInCorrectPatch4Wen(){
        List<Patch> patches = new LinkedList<>();
        String Dir = "/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/Patches/ASE20/Overfitting";
        for(File f: new File(Dir).listFiles()){
            if(!f.getName().endsWith(".patch")){
                continue;
            }
            String[] name = f.getName().split(".patch")[0].split("-");
            patches.add(Patch.builder().lable("0").patchName(f.getName())
                    .bugid(name[1] + "-" + name[2]).patchPath(f.getAbsolutePath()).tool(name[3])
                    .id(0)
                    .build());
        }
        Map<String, List<Patch>> subjectPatchMap =
                patches.stream().collect(Collectors.groupingBy(Patch::getBugid));
        log.info("Totol Subject {}", subjectPatchMap.size());
        log.info("Total Patches {}", subjectPatchMap.values().stream().mapToLong(List::size).sum());
        return subjectPatchMap;
    }

    public static void main(String[] args) {

        Map<String, List<Patch>> testsubjectPatchMap = readTestPatches();
        findMethods(testsubjectPatchMap, "testSet4kui", false);
        Map<String, List<Patch>> corsubjectPatchMap = readCorrectPatches();
        findMethods(corsubjectPatchMap, "correctSet4kui", true);
        Map<String, List<Patch>> trainsubjectPatchMap = readTrainPatches();
        findMethods(trainsubjectPatchMap, "TrainSet4kui", false);
        Map<String, List<Patch>>  cor4wensubjectPatchMap = readCorrectPatch4Wen();
        findMethods(cor4wensubjectPatchMap, "Correct4Wen", false);
        Map<String, List<Patch>>  incor4wensubjectPatchMap = readInCorrectPatch4Wen();
        findMethods(incor4wensubjectPatchMap, "Overfitting4Wen", false);
    }
}
