package script;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import config.Constant;
import entity.Patch;
import lombok.extern.slf4j.Slf4j;
import util.FileIO;

@Slf4j
public class ProcessPatch4Wen {


    public static void mainProcess(){
        String patches = Constant.HOME + "/Patches";
        List<File> fileList = new LinkedList<>();
        countAllFiles(patches, fileList);

        String patchClassfication = Constant.HOME + "/Patches/records";
        String content = FileIO.readFileToString(patchClassfication);
        List<Patch> correctPatch = new LinkedList<>();
        List<Patch> inCorrectPatch = new LinkedList<>();

        for(String line: content.split("\n")){
//            if(StringUtils.isEmpty(line.trim())){
//                continue;
//            }
            String c = line.split("\t")[0];
            if(!StringUtils.isEmpty(c)){
                correctPatch.add(processName(c,true));
            }
            String ic = line.split("\t")[1];
            if(!StringUtils.isEmpty(ic)){
                inCorrectPatch.add(processName(ic,false));
            }
        }
        Map<String, List<String>> cPatchMap = new LinkedHashMap<>();
        for (Patch cPatch: correctPatch){
            String matcher = "";
            if(Objects.isNull(cPatch.getPatchName())){
                matcher = cPatch.getBugid() + "-" + cPatch.getTool();
            }else{
                matcher = cPatch.getPatchName();
            }
            for(File f : fileList){
                if(f.getName().equals(matcher) || f.getName().contains(matcher)){
                    if(cPatchMap.containsKey(f.getName())){
                        cPatchMap.get(matcher).add(f.getAbsolutePath());
                    }else{
                        List<String> list = new LinkedList<>();
                        list.add(f.getAbsolutePath());
                        cPatchMap.put(matcher, list);
                    }
                }
            }
        }
        String targetDir = Constant.HOME + "/Patches/ASE20/Correct/";
        for(Entry<String, List<String>> entry : cPatchMap.entrySet()){
           String source = entry.getValue().get(0);
           String fileName = source.split("/")[source.split("/").length-1];
           moveFile(source, targetDir+fileName);
        }
        Map<String, List<String>> incPatchMap = new LinkedHashMap<>();
        for (Patch icPatch: inCorrectPatch){
            String matcher = "";
            if(Objects.isNull(icPatch.getPatchName())){
                matcher = icPatch.getBugid() + "-" + icPatch.getTool();
            }else{
                matcher = icPatch.getPatchName();
            }
            boolean isFind = false;
            for(File f : fileList){
                if(f.getName().equals(matcher) || f.getName().contains(matcher)){
                    isFind = true;
                    if(incPatchMap.containsKey(f.getName())){
                        //log.info(icPatch.toString());
                        incPatchMap.get(matcher).add(f.getAbsolutePath());
                    }else{
                        List<String> list = new LinkedList<>();
                        list.add(f.getAbsolutePath());
                        incPatchMap.put(matcher, list);
                    }
                    break;
                }
            }
            if(! isFind){
                log.info(icPatch.toString());
            }
        }
        targetDir = Constant.HOME + "/Patches/ASE20/Overfitting/";
        for(Entry<String, List<String>> entry : incPatchMap.entrySet()){
            String source = entry.getValue().get(0);
            String fileName = source.split("/")[source.split("/").length-1];
            moveFile(source, targetDir+fileName);
        }
        log.info(cPatchMap.size() + "");
        log.info(incPatchMap.size() + "");

    }
    public static void moveFile(String source, String target){
        try {
            FileUtils.copyFile(new File(source), new File(target));
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
    private static Patch processName(String name, boolean isCorrect){
        String[] patchName = name.split("-");
        Patch patch = new Patch();
        patch.setCorrectness(isCorrect? "1":"0");
        if(patchName.length >= 4){
            //patch.setId(patchName[0]);
            patch.setBugid(patchName[1] + "-" + patchName[2]);
            patch.setTool(patchName[3]);
            patch.setPatchName(name);
        }else if(patchName.length == 3){
            patch.setTool(patchName[0]);
            patch.setBugid(patchName[1] + "-" + patchName[2]);
        }else{
            log.error("Process PatchName Failed {}", name);
        }
        return patch;
    }
    public static void countAllFiles(String path, List<File> fileList){
        for(File f: new File(path).listFiles()){
            if(f.isFile() && f.getName().endsWith(".patch")){
                fileList.add(f);
            }else if (f.isDirectory()){
                countAllFiles(f.getAbsolutePath(), fileList);
            }else{
                //System.out.println(f.getAbsolutePath());
            }
        }
    }
    public static void main(String[] args) {
 mainProcess();
    }
}
