package script;

import java.io.File;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import config.Constant;
import lombok.extern.slf4j.Slf4j;
import util.FileIO;

@Slf4j
public class checkkuipatch {


    public static void main(String[] args) {

        String checkPatches =
                "SimFix_Lang-1_P_Patch_164_164.txt, SimFix_Lang-9_P_Patch_4_4.txt, SimFix_Lang-9_P_Patch_4_4.txt, Nopol_Math-4_P_Patch_1_1.txt, TBar_Lang-20_P_Patch_1220_617.txt, kPAR_Math-43_P_Patch_115_106.txt, SimFix_Math-1_P_Patch_60_60.txt, kPAR_Math-43_P_Patch_115_106.txt, kPAR_Lang-20_P_Patch_282_124.txt, SimFix_Lang-10_P_Patch_2518_2518.txt, SimFix_Lang-10_P_Patch_2518_2518.txt, SimFix_Closure-106_P_Patch_1483_1483.txt, SimFix_Closure-106_P_Patch_1483_1483.txt, kPAR_Math-43_P_Patch_115_106.txt, SimFix_Closure-106_P_Patch_1483_1483.txt, AVATAR_Lang-20_P_Patch_455_139.txt, kPAR_Math-43_P_Patch_115_106.txt, jMutRepair_Math-57_P_Patch_22_22.txt, Nopol_Math-20_P_Patch_1_1.txt, SimFix_Lang-12_P_Patch_128_128.txt, FixMiner_Math-22_C_Patch_1_1.txt, SimFix_Closure-109_P_Patch_6_6.txt, SimFix_Math-43_P_Patch_17_17.txt, RSRepair-A_Math-103_P_Patch_1758_558.txt, SimFix_Math-43_P_Patch_17_17.txt, TBar_Lang-41_P_Patch_2958_1870.txt, SimFix_Math-43_P_Patch_17_17.txt, Kali-A_Math-31_P_Patch_12_12.txt, SimFix_Math-43_P_Patch_17_17.txt, kPAR_Lang-41_P_Patch_223_61.txt, SimFix_Lang-41_P_Patch_8416_8416.txt, SimFix_Closure-26_P_Patch_6288_6288.txt, SimFix_Closure-26_P_Patch_6288_6288.txt, SimFix_Closure-26_P_Patch_6288_6288.txt, kPAR_Lang-53_P_Patch_1593_845.txt, SimFix_Closure-26_P_Patch_6288_6288.txt, SimFix_Closure-6_P_Patch_1874_1874.txt, SimFix_Lang-50_P_Patch_1884_1884.txt, SimFix_Closure-26_P_Patch_6288_6288.txt, SimFix_Closure-6_P_Patch_1874_1874.txt, SimFix_Chart-3_P_Patch_1622_1622.txt, ARJA_Math-98_C_Patch_686_649.txt, TBar_Lang-47_C_Patch_1732_1023.txt, SimFix_Lang-60_C_Patch_1290_1290.txt, SimFix_Lang-61_P_Patch_4407_4407.txt, DynaMoth_Math-71_P_Patch_1_1.txt, SimFix_Chart-20_C_Patch_4_4.txt, Cardumem_Math-63_P_Patch_1_1.txt, SimFix_Math-69_P_Patch_63_63.txt, SimFix_Math-69_P_Patch_63_63.txt, SimFix_Chart-22_P_Patch_1504_1504.txt, SimFix_Math-71_C_Patch_899_899.txt, SimFix_Chart-22_P_Patch_1504_1504.txt, SimFix_Chart-22_P_Patch_1504_1504.txt, SimFix_Chart-22_P_Patch_1504_1504.txt, SimFix_Math-71_C_Patch_899_899.txt, SimFix_Chart-22_P_Patch_1504_1504.txt, TBar_Chart-14_P_Patch_2631_615.txt, jGenProg_Chart-13_P_Patch_2461_1666.txt, SimFix_Chart-22_P_Patch_1504_1504.txt, TBar_Chart-14_P_Patch_2631_615.txt, FixMiner_Lang-57_P_Patch_33_11.txt, TBar_Chart-14_P_Patch_2631_615.txt, DynaMoth_Chart-18_P_Patch_1_1.txt, DynaMoth_Chart-18_P_Patch_1_1.txt, DynaMoth_Chart-18_P_Patch_1_1.txt, SimFix_Math-72_C_Patch_2_2.txt, FixMiner_Chart-14_P_Patch_1940_564.txt, FixMiner_Chart-14_P_Patch_1940_564.txt, FixMiner_Chart-14_P_Patch_1940_564.txt, SimFix_Chart-18_P_Patch_38_38.txt, SimFix_Chart-18_P_Patch_38_38.txt, AVATAR_Lang-57_C_Patch_38_2.txt, jMutRepair_Math-80_P_Patch_305_301.txt, SimFix_Closure-126_P_Patch_32_32.txt, AVATAR_Chart-14_P_Patch_560_34.txt, AVATAR_Chart-14_P_Patch_560_34.txt, AVATAR_Chart-14_P_Patch_560_34.txt, FixMiner_Chart-25_P_Patch_76_13.txt, FixMiner_Chart-25_P_Patch_76_13.txt, FixMiner_Chart-25_P_Patch_76_13.txt, FixMiner_Chart-25_P_Patch_76_13.txt, SimFix_Chart-25_P_Patch_1_1.txt, SimFix_Chart-25_P_Patch_1_1.txt";
        Set<String> patchSet = Arrays.stream(checkPatches.split(",")).map(patch->patch.trim()).collect(Collectors.toSet());
        String targetDir = Constant.HOME + "/Patches/experiment3/TrainingSet/";
        String sourceDir = Constant.HOME + "/Patches/experiment3/APR-Efficiency-NFL";
        List<File> sourceFiles = new LinkedList<>();
        FileIO.getAllFile(new File(sourceDir), sourceFiles);
        List<String> result = new LinkedList<>();
        int i =0;
        for(String patchName: patchSet){
            String targetContent = FileIO.readFileToString(targetDir+patchName);
            for(File f: sourceFiles){
                if(f.getAbsolutePath().replaceAll("\\/", "_").contains(patchName)) {
                    i++;
                    String sourceContent = FileIO.readFileToString(f);
                    String sLine = sourceContent.split("@@ -",2)[1].split(",")[0];
                    String tLine = targetContent.split("@@ -",2)[1].split(",")[0];
                    if(!sLine.equals(tLine)){
                        result.add(patchName);
                    }else{
                        String tmpsContent = sourceContent.split("@@ -",2)[1].split("\n", 2)[1].replace(" ", "").replace("\n", "").replace("\t", "");
                        String tmptContent = targetContent.split("@@ -",2)[1].split("\n", 2)[1].replace(" ", "").replace("\n", "").replace("\t", "");
                        if(!tmpsContent.equals(tmptContent)){
                            result.add(patchName);
                        }
                    }

                    break;
                }
            }
        }
        log.info("" + i);
        log.info("Size: {}", result.size());
        log.info("Patches: {}", result.stream().collect(Collectors.joining(",")));
    }
}
