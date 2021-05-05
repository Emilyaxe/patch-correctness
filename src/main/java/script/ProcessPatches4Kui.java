package script;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import entity.Subject;
import util.FileIO;

public class ProcessPatches4Kui {

    public static void moveTrainSet(String summaryFile, List<File> fileList ){
        String patchLines = FileIO.readFileToString(summaryFile);
        List<String> testPatches = new LinkedList<>();
        List<String> trainPatches = new LinkedList<>();

        int i = 1;
        for(String patch: patchLines.split("\n")){
            String title[] = patch.split("<ml>");
            //String lable = title[0];
            String patchId = title[1];
            if(i <= 130){
                testPatches.add(patchId);
            }else{
                trainPatches.add(patchId);
            }
            i++;
            //String diffContent= StringUtils.join(title[3].split("<nl>"),"\n");
        }
        String targetDir = "/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/Patches/experiment3/TrainingSet";
        for(File patchFile: fileList){
            String path[] = patchFile.getAbsolutePath().split("/");
            String newName = path[path.length-3]+"_" + path[path.length-2]+"_"+path[path.length-1];
            if(trainPatches.contains(newName)){
                // move to target
                try {
                    FileUtils.copyFile(patchFile, new File(targetDir+ "/" + newName));
                } catch (IOException exception) {
                    exception.printStackTrace();
                }
            }else{
                System.out.println(newName);
            }
        }
    }
    public static void countAllFiles(String path, List<File> fileList){
        for(File f: new File(path).listFiles()){
            if(f.isFile() && f.getName().endsWith("txt")){
                fileList.add(f);
            }else if (f.isDirectory()){
                countAllFiles(f.getAbsolutePath(), fileList);
            }else{
                //System.out.println(f.getAbsolutePath());
            }
        }
    }

    public static void mainProcess(){
        String patchesDir = "/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/Patches/experiment3/APR-Efficiency-NFL";
        String summaryFile = "/Users/liangjingjing/WorkSpace/Project/PatchCorrectness/patch-correctness/Patches/experiment3/kui_data_for_cc2v.txt";

        List<File> patchesList = new LinkedList<>();  // 665
        countAllFiles(patchesDir, patchesList);
        moveTrainSet(summaryFile, patchesList);
    }
    public static void main(String[] args) {
        //parseSummary(summaryFile);
        mainProcess();
        System.out.println();
    }
}
