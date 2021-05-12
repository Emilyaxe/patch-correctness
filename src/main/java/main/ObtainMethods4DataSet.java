package main;

import static entity.Patch.findMethods;

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
        findMethods(subjectPatchMap, "trainSet", false);
    }
}
