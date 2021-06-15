package script;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.alibaba.fastjson.JSON;

import entity.PatchJson;
import lombok.extern.slf4j.Slf4j;
import util.FileIO;

@Slf4j
public class checkPrefix {

    //public static String[] preFix = {"org.jfree", "com.google", "org.apache", "org.joda"};
    public static String checkedPatch = "Time19b_Patch187\n"
            + "Math40b_Patch161\n"
            + "Chart26b_Patch93\n"
            + "Chart26b_Patch19\n"
            + "Chart21b_Patch14\n"
            + "Math80b_Patch172\n"
            + "Chart21b_Patch91\n"
            + "Math57b_Patch48\n"
            + "Math49b_Patch165\n"
            + "Math32b_Patch34\n"
            + "Math73b_Patch55\n"
            + "Chart5b_Patch7\n"
            + "Math33b_Patch159\n"
            + "Chart5b_Patch6\n"
            + "Chart5b_Patch5\n"
            + "Lang53b_Patch24\n"
            + "Math88b_Patch176\n"
            + "Lang55b_Patch25\n"
            + "Math39b_Patch160\n"
            + "Math81b_Patch64\n"
            + "Math105b_Patch79\n"
            + "Math53b_Patch47\n"
            + "Math71b_Patch53\n"
            + "Math104b_Patch78\n"
            + "Math33b_Patch36\n"
            + "Math58b_Patch49\n"
            + "Lang53b_Patch152\n"
            + "Chart15b_Patch13\n"
            + "Math42b_Patch163\n"
            + "Math87b_Patch73\n"
            + "Math81b_Patch173\n"
            + "Time4b_Patch180\n"
            + "Math50b_Patch166\n"
            + "Math5b_Patch29\n"
            + "Chart17b_Patch90\n"
            + "patch1-Chart-6-Cardumen-plausible.patch\n"
            + "patch1-Chart-15-Kali-plausible.patch\n"
            + "patch1-Lang-57-CapGen.patch\n"
            + "patch1-Math-18-Nopol-plausible.patch\n"
            + "patch1-Math-49-Nopol-plausible.patch\n"
            + "patch2-Math-53-CapGen-plausible.patch\n"
            + "patch3-Lang-57-CapGen.patch\n"
            + "patch1-Math-80-Nopol-plausible.patch\n"
            + "patch1-Lang-55-Nopol-plausible.patch\n"
            + "patch1-Math-87-Nopol-plausible.patch\n"
            + "patch8-Math-63-CapGen-plausible.patch\n"
            + "patch2-Lang-57-CapGen.patch\n"
            + "patch4-Math-63-CapGen-plausible.patch\n"
            + "patch1-Chart-15-FixMiner-plausible.patch\n"
            + "patch3-Math-5-CapGen-plausible.patch\n"
            + "patch1-Math-63-CapGen-plausible.patch\n"
            + "patch1-Math-42-Nopol-plausible.patch\n"
            + "patch1-Math-33-Nopol-plausible.patch\n"
            + "patch1-Math-81-Nopol-plausible.patch\n"
            + "patch1-Chart-17-Nopol-plausible.patch\n"
            + "patch1-Chart-9-Nopol-plausible.patch\n"
            + "patch1-Math-73-Nopol-plausible.patch\n"
            + "patch2-Math-5-CapGen-plausible.patch\n"
            + "patch1-Math-7-Nopol-plausible.patch\n"
            + "patch1-Math-63-CapGen.patch\n"
            + "patch1-Math-58-Nopol-plausible.patch\n"
            + "patch1-Math-53-CapGen.patch\n"
            + "patch1-Chart-21-Nopol-plausible.patch\n"
            + "patch1-Math-5-CapGen-plausible.patch\n"
            + "patch1-Time-14-Nopol-plausible.patch\n"
            + "patch1-Math-50-jGenProg-plausible.patch\n"
            + "patch1-Lang-53-Nopol-plausible.patch\n"
            + "patch1-Math-82-Nopol-plausible.patch";

    public static void mainProcess(String dir) {
        List<PatchJson> patches =
                JSON.parseArray(FileIO.readFileToString("./result/" + dir + "_purify"), PatchJson.class);
        List<PatchJson> patchJsons =
                JSON.parseArray(FileIO.readFileToString("./result/" + dir + "_tmp_unpurify"), PatchJson
                        .class);
        List<String> checkedPatches = Arrays.asList(checkedPatch.split("\n"));
        Map<String, PatchJson> replaceMap =
                patchJsons.stream().filter(Objects::nonNull).collect(Collectors.toMap(PatchJson::getPatchName,
                        Function.identity(), (v1, v2) -> v2));
        for (PatchJson patchJson : patches) {
            if (replaceMap.containsKey(patchJson.getPatchName())) {
                patchJson.setCombinedMethod(replaceMap.get(patchJson.getPatchName()).getCombinedMethod());
            }
            //            if (checkedPatches.contains(patchJson.getPatchName())) {
            //                //log.info(patchJson.getPatchName());
            //                //                patchJson.setBuggyTraceInfo(Collections.emptyMap());
            //                //                patchJson.setFixedTraceInfo(Collections.emptyMap());
            //                //                patchJsons.add(patchJson);
            //            }
            //            String method = patchJson.getCombinedMethod();
            //
            //            if (method.contains("org.jfree") || method.contains("com.google") || method.contains("org
            //            .apache") || method
            //                    .contains("org.joda")) {
            //                //log.info(patchJson.getPatchName());
            //                System.out.println(patchJson.getPatchName());
            //            }
        }
        log.info("Dir {} size {}", dir, patches.size());
        //FileIO.writeStringToFile("./result/" + dir + "_purify_simple", JSON.toJSONString(patches));
    }

    public static void main(String[] args) {
        String[] dirs = {"testSet", "trainSet"};
        for (String dir : dirs) {
            mainProcess(dir);
        }
    }
}
