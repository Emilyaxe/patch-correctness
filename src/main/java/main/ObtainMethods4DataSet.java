package main;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import entity.Patch;
import lombok.extern.slf4j.Slf4j;
import service.ObtainPatches;

@Slf4j
public class ObtainMethods4DataSet {

    public static void main(String[] args) {
        List<Patch> trainPatch = ObtainPatches.readTrainPatches();
        Map<String, List<Patch>> subjectPatchMap =
                trainPatch.stream().collect(Collectors.groupingBy(Patch::getBugid));
        Patch.findMethods(subjectPatchMap, "trainSet", false);
        //        List<Patch> testPatches = ObtainPatches.readTestPatches();
        //        Map<String, List<Patch>> testSubjectPatchMap =
        //                testPatches.stream().collect(Collectors.groupingBy(Patch::getBugid));
        //        Patch.findMethods(testSubjectPatchMap, "testSet", false);

        //        List<Patch> corPatches = ObtainPatches.readCorPatches();
        //        Map<String, List<Patch>> correctSubjectPatches =
        //                corPatches.stream().collect(Collectors.groupingBy(Patch::getBugid));
        //        Patch.findMethods(correctSubjectPatches, "correctSet", true);
    }
}
