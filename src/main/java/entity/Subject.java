package entity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import config.Constant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import run.Runner;
import util.FileIO;


@Slf4j
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Subject {

    private String _name = null;
    private int _id = 0;
    private String _ssrc = null;
    private String _tsrc = null;
    private String _sbin = null;
    private String _tbin = null;
    private String _triggerTestInfo;
    private String _purificationTestTrace;
    private List<String> failingTests;
    private List<String> purfifyFailingTests;
    private Set<String> projectFiles;
    //private List<String> _instrumentPackages = null;
    //private List<String> _testClasses = null;
    private String _dependency = null;

    /**
     * subject
     *
     * @param name : name of subject, e.g., "chart".
     * @param id : number of subject, e.g., 1.
     */

    public Subject(String name, int id) {
        _name = name;
        _id = id;

        //this.setSrcPath();
        //this.setDependency();
        download();
    }

    private void download() {
        if (!new File(getHome()).exists()) {
            Runner.downloadSubject(this);
        }
    }

    private void setProjectFiles() {
        this.projectFiles = new HashSet<>();
        getFile(getHome() + this._ssrc, projectFiles);
    }

    private void getFile(String path, Set<String> fileList) {
        // 获得指定文件对象
        File file = new File(path);
        // 获得该文件夹内的所有文件
        File[] array = file.listFiles();
        if (Objects.isNull(array)) {
            return;
        }
        for (File value : array) {
            if (value.isFile()) {
                String fullPath = getHome() + this._ssrc + "/";
                fileList
                        .add(value.getPath().split(fullPath)[1].replaceAll("/", "\\.").replace(".java", ""));
            } else if (value.isDirectory()) {
                getFile(value.getPath(), fileList);
            }
        }
    }

    private void setTrigerTestInfo() {
        String fileName = Constant.PROJ_INFO + "/trigger_tests/" + _name + "/" + _id;
        //String fileName = Constant.PROJ_INFO + "/purify_tests_trace/" + _name + "/" + _id;
        _triggerTestInfo = FileIO.readFileToString(fileName);
    }

    private void setPurificationTestTrace() {
        //String fileName = Constant.PROJ_INFO + "/trigger_tests/" + _name + "/" + _id;
        String fileName = Constant.PROJ_INFO + "/purify_tests_trace/" + _name + "/" + _id;
        _purificationTestTrace = FileIO.readFileToString(fileName);
    }

    public Set<String> allTests() {
        Set<String> allTests = new LinkedHashSet<>();
        String fileName = Constant.PROJ_INFO + "/all_tests/" + _name + "/" + _id;
        for (String test : FileIO.readFileToString(fileName).split("\n")) {
            if (!test.trim().equals("")) {
                allTests.add(test);
            }
        }
        return allTests;
    }


    /*
    update failing tests after purification
     */
    public void setPurifyFailingTest() {
        purfifyFailingTests = new LinkedList<>();
        String fileName = Constant.PROJ_INFO + "/purify_tests/" + _name + "/" + _id;
        for (String failingtest : FileIO.readFileToString(fileName).split("\n")) {
            if (!failingtest.trim().equals("")) {
                purfifyFailingTests.add(failingtest);
            }
        }
    }

    private void setFailingTest() {
        failingTests = new ArrayList<>();
        String[] stringArray = _triggerTestInfo.split("--- ");
        List<String> testMethodList = new ArrayList<>(stringArray.length);
        for (String line : stringArray) {
            if (StringUtils.isEmpty(line)) {
                continue;
            }
            String[] stackArray = line.replaceAll("\n\t", "\n").split("\n");
            failingTests.add(stackArray[0]);
        }

    }

    private void setSrcPath() {
        // TODO Auto-generated method stub
        String fileName = Constant.PROJ_INFO + "/src_path/" + _name + "/" + _id + ".txt";
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("File : " + fileName + " does not exist!");
            return;
        }
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (Objects.isNull(br)) {
            log.error("buffer read of file {} is null!", file);
            return;
        }
        String line;
        List<String> source = new ArrayList<>();
        try {
            while ((line = br.readLine()) != null) {
                source.add(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (source.size() < 4) {
            System.err.println("PROJEC INFO CONFIGURE ERROR !");
            System.exit(0);
        }

        _ssrc = source.get(0);
        _sbin = source.get(1);
        _tsrc = source.get(2);
        _tbin = source.get(3);
    }

    public Subject(String name, int id, String ssrc, String tsrc, String sbin, String tbin) {
        this(name, id, ssrc, tsrc, sbin, tbin, null);
    }

    public Subject(String name, int id, String ssrc, String tsrc, String sbin, String tbin,
            String dependency) {
        _name = name;
        _id = id;
        _ssrc = ssrc;
        _tsrc = tsrc;
        _sbin = sbin;
        _tbin = tbin;
        _dependency = dependency;
    }

    public String getSootDependency() {
        String classpath =
                Constant.HOME_LIB + "/junit-4.11.jar:" + this.getHome() + this.get_sbin() + ":" + this
                        .getHome() + this.get_tbin();

    /*    switch (_name) {
            case "Math":
                classpath = classpath + getHome() + "/target/test-classes:" + getHome() + "/target/classes";
                break;
            case "Chart":
                classpath = classpath + getHome() + "/build:" + getHome() + "/build-tests";
                break;
            case "Lang":
                classpath = classpath + getHome() + "/target/test-classes:" + getHome() + "/target/tests:" + getHome()
                        + "/target/classes";
                break;
            case "Closure":
                classpath = classpath + getHome() + "/build/lib/rhino.jar:"
                        + getHome() + "/build/classes:" + getHome() + "/build/test";
                break;
            case "Time":
                classpath = classpath + getHome() + "/target/test-classes:" + getHome() + "/target/classes:" + getHome()
                        + "/build/classes:" + getHome() + "/build/tests";
                break;
            case "Mockito":
                classpath =
                        classpath + getHome() + "/target/test-classes:" + getHome()
                                + "/target/classes:" + getHome() + "/build/classes/main:" + getHome()
                                + "/build/classes/test";
                break;
            default:
                System.err.println("UNKNOWN project name : " + _name);

    }*/
        return classpath;
    }

    private void setDependency() {
        // TODO Auto-generated method stub
        //String base = Constant.PROJ_DEPENCY;
        //List<String> classpath = new LinkedList<>();
        String classpath =
                Constant.HOME_LIB + "/junit-4.11.jar:"    // remove when running daikon
                        //Constant.HOME_LIB + "/daikon5.8.6/daikon.jar:"      //  for daikon 5.8.6
                        + Constant.DUMPER_HOME + "/lib/*";      // for instrumentation
        switch (_name) {
            case "Math":
                classpath = classpath + ":target/test-classes:target/classes";
                break;
            case "Chart":
                classpath = classpath + ":build:build-tests";
                break;
            case "Lang":
                classpath = classpath + ":target/test-classes:target/tests:target/classes";
                break;
            case "Closure":
                classpath = classpath + ":build/lib/rhino.jar:lib/*:build/classes:build/test";
                break;
            case "Time":
                classpath = classpath
                        + ":target/test-classes:target/classes:build/classes:build/tests";
                break;
            case "Mockito":
                classpath =
                        classpath + ":target/test-classes:target/classes:build/classes/main:build/classes/test";
                break;
            case "Cli":
                classpath = classpath + ":target/test-classes:target/classes:build/classes:build/tests";
                break;
            case "Codec":
                classpath = classpath + ":target/tests:target/classes:target/test-classes";
                break;
            case "Collections":
                classpath = classpath + ":target/tests:target/classes:target/test-classes";
                break;
            case "Compress":
                classpath = classpath + ":target/tests:target/classes:target/test-classes";
                break;
            case "Csv":
                classpath = classpath + ":target/tests:target/classes:target/test-classes";
                break;
            case "Gson":
                classpath = classpath + ":target/tests:target/classes:target/test-classes";
                break;
            case "JacksonCore":
                classpath = classpath + ":target/tests:target/classes:target/test-classes";
                break;
            case "JacksonDatabind":
                classpath = classpath + ":target/tests:target/classes:target/test-classes";
                break;
            case "JacksonXml":
                classpath = classpath + ":target/tests:target/classes:target/test-classes";
                break;
            case "Jsoup":
                System.err.println("UNDownload : " + _name);
                break;
            case "JxPath":
                classpath = classpath + ":target/tests:target/classes:target/test-classes";
                break;
            default:
                System.err.println("UNKNOWN project name : " + _name);
        }
        this._dependency = classpath;
    }

    /*    public List<String> getTestClasses() {
        if (_testClasses == null) {
            _testClasses = new ArrayList<>(getTestClasses(new File(getHome() + _tsrc)));
        }
        return _testClasses;
    }*/

    /*   public List<String> getInstrumentPackage() {
        if (_instrumentPackages == null) {
            _instrumentPackages = new ArrayList<>(getPackage(getHome() + _ssrc, getHome() + _ssrc));
        }
        return _instrumentPackages;
    }*/

    /**
     * get absolute home path for subject
     *
     * @return e.g., "/home/user/chart/chart1"
     */
    public String getHome() {
        return Constant.PROJECT_HOME + "/" + _name + "/" + _name + _id;
    }
    /*public String getHome() {
        return Constant.PROJECT_HOME + "/" + _name + "/" + _name + "_" + _id + "_fixed";
    }*/

    public String getBuggyHome() {
        return Constant.PROJECT_HOME + "/" + _name + "/" + _name + "_" + _id + "_buggy";
    }

    public String getFailedTestRecFile() {
        return getHome() + "/failing_tests";
    }

    public String getAllTestRecFile() {
        return getHome() + "/all-tests.txt";
    }

    /*    public List<String> getFailedTestList() {
        String failTestFile = Constant.HOME + "/d4j-info/trigger_tests/" + _name + "/" + _id + ".txt";
        String content = FileIO.readFileToString(failTestFile);
        return Arrays.asList(content.split("\n"));
    }*/

    /* public String getBuggyLineSuspFile(){
        return Constant.LOCATOR_SUSP_FILE_BASE + "/" + _name + "/" + _id + "/" + "stmt-susps.txt";
    }*/

    public void deleteBin() {
        File sbinFile = new File(getHome() + "/" + _sbin);
        File tbinFile = new File(getHome() + "/" + _tbin);
        if (sbinFile.exists()) {
            try {
                FileUtils.deleteDirectory(sbinFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (tbinFile.exists()) {
            try {
                FileUtils.deleteDirectory(tbinFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void backup(String folder) {
        log.info("Back up src folder for {}", this.toString());
        File file = new File(folder + "_ori");
        try {
            if (!file.exists()) {
                FileUtils.copyDirectory(new File(folder), file);
            } else {
                FileUtils.deleteDirectory(new File(folder));
                FileUtils.copyDirectory(file, new File(folder));
            }
        } catch (Exception e) {
            log.error("Back up failed!");
        }

    }

    public void restore(String folder) {
        log.info("Delete src folder for {}", this.toString());
        File file = new File(folder + "_ori");
        try {
            if (file.exists()) {
                FileUtils.copyDirectory(file, new File(folder));
                FileUtils.deleteDirectory(file);
            } else {
                log.error(
                        "Restore source file failed : cannot find file " + file.getAbsolutePath());
            }
        } catch (Exception e) {
            log.error("Restore failed!");

        }

    }

    public void backup() throws IOException {
        String src = getHome() + _ssrc;
        File file = new File(src + "_ori");
        if (!file.exists()) {
            FileUtils.copyDirectory(new File(src), file);
        } else {
            FileUtils.deleteDirectory(new File(src));
            FileUtils.copyDirectory(file, new File(src));
        }
    }

    public void restore() throws IOException {
        String src = getHome() + _ssrc;
        File file = new File(src + "_ori");
        if (file.exists()) {
            FileUtils.copyDirectory(file, new File(src));
        } else {
            System.out.println(
                    "Restore source file failed : cannot find file " + file.getAbsolutePath());
        }
    }

    private Set<String> getPackage(String rootPath, String currPath) {
        Set<String> packages = new HashSet<>();
        File file = new File(currPath);
        File[] files = file.listFiles();
        if (Objects.isNull(files) || files.length <= 0) {
            return Collections.emptySet();
        }
        for (File f : files) {
            if (f.getName().equals(".DS_Store")) {
                continue;
            }
            if (f.isDirectory()) {
                String absPath = f.getAbsolutePath();
                String packageName = absPath.replace(rootPath + "/", "");
                packageName = packageName.replace("/", ".");
                packages.add(packageName);
                packages.addAll(getPackage(rootPath, f.getAbsolutePath()));
            }
        }
        return packages;
    }

    private Set<String> getTestClasses(File root) {
        Set<String> classes = new HashSet<>();
        File[] files = root.listFiles();
        String pack = null;
        if (Objects.isNull(files) || files.length <= 0) {
            return Collections.emptySet();
        }
        for (File f : files) {
            if (f.isFile()) {
                String fName = f.getName();
                if (fName.equals(".DS_Store")) {
                    continue;
                }
                if (fName.endsWith(".java")) {
                    fName = fName.substring(0, fName.length() - 5);
                    if (!fName.endsWith("Tests")) {
                        continue;
                    }
                    if (pack != null) {
                        classes.add(pack + "." + fName);
                    } else {
                        BufferedReader br;
                        try {
                            br = new BufferedReader(new FileReader(f));
                            String line;
                            while ((line = br.readLine()) != null) {
                                line = line.trim();
                                if (line.startsWith("package")) {
                                    Pattern pattern = Pattern
                                            .compile("(?<=package\\s)[\\s\\S]*(?=;)");
                                    Matcher matcher = pattern.matcher(line);
                                    if (matcher.find()) {
                                        pack = matcher.group(0);
                                        classes.add(pack + "." + fName);
                                        break;
                                    }
                                }
                            }
                            br.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            } else if (f.isDirectory()) {
                classes.addAll(getTestClasses(f));
            }
        }
        return classes;
    }

    @Override
    public String toString() {
        return "Subject [_name=" + _name + ", _id=" + _id + "]";
    }


}