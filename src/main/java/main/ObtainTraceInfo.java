package main;

import static entity.Patch.getMethodInfo;
import static util.AsyExecutor.EXECUTOR;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;

import config.Constant;
import entity.Method;
import entity.Patch;
import entity.Subject;
import instrument.InstruTestFileVisitor;
import instrument.IntruMethodsVisitors;
import lombok.extern.slf4j.Slf4j;
import purification.Purification;
import run.Runner;
import service.ObtainPassingTests;
import service.ObtainPatches;
import service.ProcessPatch;
import util.BuildPath;
import util.FileIO;

@Slf4j
public class ObtainTraceInfo {

    public static List<String> illeglePatches = new LinkedList<>();
    public static Map<String, String> shoulPass = new ConcurrentHashMap<>();
    public static Map<String, String> shouldFail = new ConcurrentHashMap<>();


    public static final Object lock = new Object();

    private static final Set<String> specialPatches = new HashSet<>(Arrays.asList(
            "Math_104.src.patch", "Math_12.src.patch", "Lang_56.src.patch", "Closure_28.src.patch",
            "Lang_23.src.patch", "Time_26.src.patch", "Chart_23.src.patch", "Time_11.src.patch"));


    private static final String unPurifyPatches =
            "Math_13.src.patch,Chart26b_Patch93,Lang_34.src.patch,patch1-Math-44-SimFix-plausible.patch,"
                    + "Math_66.src.patch,Math78b_Patch171,patch2-Chart-26-Jaid.patch,"
                    + "patch1-Chart-26-jMutRepair-plausible.patch,"
                    + "Math78b_Patch58,Time_7.src.patch,Chart26b_Patch18,patch1-Math-56-Arja-plausible.patch,"
                    + "patch1-Chart-26-SOFix.patch,Chart26b_Patch19,patch2-Chart-26-Jaid-plausible.patch,"
                    + "patch1-Chart-26-Kali-plausible.patch,patch1-Math-78-AVATAR-plausible.patch,Lang_65.src.patch,"
                    + "Math_78.src.patch,patch3-Chart-26-Jaid.patch,Math_44.src.patch,patch1-Chart-26-Jaid-plausible"
                    + ".patch,"
                    + "Math_14.src.patch,patch1-Lang-55-Jaid-plausible.patch,patch1-Math-78-Nopol-plausible.patch,"
                    + "patch1-Chart-26-TBar-plausible.patch,patch1-Chart-26-AVATAR-plausible.patch,Math_56.src.patch,"
                    + "Time_16.src.patch,patch1-Chart-26-FixMiner-plausible.patch,patch1-Chart-26-Jaid.patch,"
                    + "Time16b_Patch185,"
                    + "Chart_26.src.patch,Math_67.src.patch,Lang_53.src.patch,patch1-Lang-57-TBar.patch,"
                    + "patch1-Lang-57-kPAR-plausible.patch,patch1-Lang-57-kPAR-plausible.patch,patch2-Lang-57-CapGen"
                    + ".patch,patch1-Lang-57-CapGen.patch,patch3-Lang-57-CapGen.patch";

    private static final String reRunPatches = "Math_39.src.patch,patch1-Lang-57-TBar.patch,Math_41.src.patch,Time_22"
            + ".src.patch,patch1-Math-41-SimFix.patch,Lang_15.src.patch,patch1-Lang-57-kPAR-plausible.patch,"
            + "patch1-Math-29-jKali-plausible.patch,patch1-Math-20-FixMiner-plausible.patch,Math41b_Patch162,"
            + "patch1-Lang-7-Arja-plausible.patch,patch1-Math-15-kPAR-plausible.patch,Lang_42.src.patch,"
            + "patch1-Math-41-DynaMoth-plausible.patch,patch1-Lang-57-kPAR-plausible.patch,"
            + "patch1-Lang-13-AVATAR-plausible.patch,Chart_8.src.patch,patch1-Lang-13-RSRepair-plausible.patch,"
            + "Closure_60.src.patch,patch2-Lang-57-CapGen.patch,patch1-Lang-57-CapGen.patch,Math_22.src.patch,Math_29"
            + ".src.patch,Math_67.src.patch,Lang57b_PatchHDRepair1,patch1-Math-41-Nopol-plausible.patch,Math_49.src"
            + ".patch,Math_15.src.patch,patch1-Chart-8-CapGen.patch,patch1-Math-15-TBar-plausible.patch,Math_71.src"
            + ".patch,Math_101.src.patch,Chart_15.src.patch,patch3-Lang-57-CapGen.patch,Lang_13.src.patch";

    public static boolean compileAndRun(Subject subject, String oneTest) {
        String srcPath = subject.getHome() + subject.get_ssrc();
        try {
            FileUtils.copyDirectory(new File(Constant.DUMPER_HOME),
                    new File(srcPath + "/auxiliary"));
        } catch (IOException e) {
            log.error("subject {} process test {} copy dumper failed!",
                    subject.get_name() + subject.get_id(), oneTest);
        }

        if (Runner.compileSubject(subject)) {
            return Runner.testSingleTest(subject, oneTest);
            //Runner.JUnitTestSubject(subject, oneTest, true);
        }
        return false;
    }

    public static boolean compile(Subject subject) {
        String srcPath = subject.getHome() + subject.get_ssrc();
        String testPath = subject.getHome() + subject.get_tsrc();
        try {
            FileUtils.copyDirectory(new File(Constant.DUMPER_HOME),
                    new File(srcPath + "/auxiliary"));
            FileUtils.copyDirectory(new File(Constant.DUMPER_HOME),
                    new File(testPath + "/auxiliary"));
        } catch (IOException e) {
            log.error("subject {} process copy dumper failed!",
                    subject.get_name() + subject.get_id(), e);
        }
        return Runner.compileSubject(subject);
    }

    public static void obtainTrace(Map<String, List<Patch>> subjectPatchMap, boolean reverse,
            String reDir) {
        List<CompletableFuture<Void>> futureList = new LinkedList<>();
        for (Entry<String, List<Patch>> entry : subjectPatchMap.entrySet()) {
            futureList.add(CompletableFuture.runAsync(() -> {
                try {
                    processAllTrace(reverse, reDir, entry);
                    //processTrace(reverse, reDir, entry);
                    //processPassingTrace(reverse, reDir, entry);
                } catch (Exception e) {
                    log.error("obtain trace failed! subject {}", entry.getKey(), e);
                }
            }, EXECUTOR));
        }
        CompletableFuture.allOf(futureList.toArray(new CompletableFuture[0])).join();

    }

    public static void cleanSubject(String srcPath) {
        log.info("Clean subject ....");
        List<File> list = new LinkedList<>();
        FileIO.getAllFile(new File(srcPath), list);
        for (File f : list) {
            if (new File(f.getAbsolutePath() + ".bak").exists()) {
                try {
                    FileUtils.copyFile(new File(f.getAbsolutePath() + ".bak"), f);
                } catch (IOException exception) {
                    log.error("clean subject {} file {} failed! ", srcPath, f.getName(), exception);
                }
            }
        }
    }

    private static void processAllTrace(boolean reverse, String reDir,
            Entry<String, List<Patch>> entry) {
        String[] sub = entry.getKey().split("-");
        Subject subject = new Subject(sub[0], Integer.parseInt(sub[1]));
        for (Patch patch : entry.getValue()) {

            //            if (!reRunPatches.contains(patch.getPatchName())) {
            //                continue;
            //            }
            //            try {
            //                log.info("Delete Dir for Patch {}", patch.getPatchName());
            //                FileUtils.deleteDirectory(new File(Constant.dynamicResult + "/" + reDir + "/" + patch
            //                .getPatchName()));
            //            } catch (IOException e) {
            //                e.printStackTrace();
            //            }
            if (!patch.getPatchName().equals("patch1-Math-41-SimFix.patch")) {
                continue;
            }

            boolean isPurify = !unPurifyPatches.contains(patch.getPatchName());
            //Set<String> illegalTests = new LinkedHashSet<>();
            cleanSubject(subject.getHome() + subject.get_ssrc());
            log.info("Process Dir {} for Patch {}", reDir, patch.getPatchName());
            int fixedLine = getOneChangeLine(subject, patch, reverse);
            if (fixedLine == 0) {
                illeglePatches.add(patch.getPatchName());
                continue;
            }
            try {
                String writeFile = BuildPath.buildDymicAllFile(reDir, patch.getPatchName(), true);
                String oneFixedFile = Constant.PROJECT_HOME + "/" + subject.get_name() + "/"
                        + subject.get_name() + subject.get_id() + patch.getFixedFile().trim();
                ProcessPatch.createCombinedBuggy4AllFiles(patch, reverse);
                instrument(fixedLine, writeFile, oneFixedFile);
                instrumentTests(subject, writeFile, isPurify);
                TimeUnit.SECONDS.sleep(10);

                if (!compile(subject)) {
                    log.error("Patch {}, Compile Error on buggy version!", patch.getPatchName());
                }
                List<String> message = Runner.runTestSuite(subject);
                if (message.size() <= 3) {
                    log.error("Patch {}, Should Fail! \n {} ", patch.getPatchName(),
                            StringUtils.join(message, "\n"));
                    //shouldFail.add(patch.getPatchName());
                    shouldFail.putIfAbsent(patch.getPatchName(), "");
                } else {
                    String failingTest = message.stream()
                            .filter(line -> line.trim().startsWith("-"))
                            .map(line -> line.split("-", 2)[1].trim())
                            .collect(Collectors.joining("\n"));
                    FileIO.writeStringToFile(writeFile + ".failing", failingTest);
                }
            } catch (Exception e) {
                log.error("process  test on buggy version failed! subject {} patch {} ",
                        subject.get_name() + subject.get_id(), patch.getPatchName(), e);
            }

            try {
                String writeFile = BuildPath.buildDymicAllFile(reDir, patch.getPatchName(), false);
                String oneFixedFile = Constant.PROJECT_HOME + "/" + subject.get_name() + "/"
                        + subject.get_name() + subject.get_id() + patch.getFixedFile().trim();
                ProcessPatch.createCombinedFixed4AllFiles(patch, reverse);
                instrument(fixedLine, writeFile, oneFixedFile);
                instrumentTests(subject, writeFile, isPurify);
                TimeUnit.SECONDS.sleep(10);

                if (!compile(subject)) {
                    log.error("Patch {}, Compile Error on fixed version!", patch.getPatchName());
                }
                List<String> message = Runner.runTestSuite(subject);
                if (CollectionUtils.isEmpty(message) || message.stream().filter(Objects::nonNull)
                        .noneMatch(element -> element.contains(Runner.SUCCESSTEST))) {
                    //shouldPass.add(patch.getPatchName());
                    shoulPass.putIfAbsent(patch.getPatchName(), "");
                    log.error("Patch {}, Should Pass! \n {} ", patch.getPatchName(),
                            StringUtils.join(message, "\n"));
                }
            } catch (Exception e) {
                log.error("process test on fixed version failed! subject {} patch {} ",
                        subject.get_name() + subject.get_id(), patch.getPatchName(), e);
            }
        }
    }

    private static void instrumentTests(Subject subject, String writeFile, boolean isPurify) {
        synchronized (lock) {
            String testDir = subject.getHome() + subject.get_tsrc();
            FileIO.backupDir(testDir);
            if (isPurify) {
                Purification purification = new Purification(subject);
                purification.purifyWithoutValidate();
            }

            List<File> allTestFiles = new LinkedList<>();
            FileIO.getAllFile(new File(testDir), allTestFiles);
            for (File testFile : allTestFiles) {
                if (!testFile.getName().endsWith(".java")) {
                    continue;
                }
                InstruTestFileVisitor instruTestFileVisitor = new InstruTestFileVisitor();
                instruTestFileVisitor.setWriteFile(writeFile);
                //log.info(testFile.getAbsolutePath());
                CompilationUnit compilationUnit = FileIO.genASTFromSource(
                        FileIO.readFileToString(testFile), ASTParser.K_COMPILATION_UNIT);
                compilationUnit.accept(instruTestFileVisitor);
                FileIO.writeStringToFile(testFile, compilationUnit.toString());
            }
        }
    }

    private static void processPassingTrace(boolean reverse, String reDir,
            Entry<String, List<Patch>> entry) {
        String[] sub = entry.getKey().split("-");
        Subject subject = new Subject(sub[0], Integer.parseInt(sub[1]));

        for (Patch patch : entry.getValue()) {
            Set<String> illegalTests = new LinkedHashSet<>();
            cleanSubject(subject.getHome() + subject.get_ssrc());
            log.info("Process Dir {} for Patch {}", reDir, patch.getPatchName());
            int fixedLine = getOneChangeLine(subject, patch, reverse);
            if (fixedLine == 0) {
                illeglePatches.add(patch.getPatchName());
                continue;
            }
            // run passing tests on buggy version
            for (String test : ObtainPassingTests.passingTests(subject)) {
                try {
                    String writeFile = BuildPath.buildDymicPassFile(reDir, patch.getPatchName(),
                            test, true);
                    String oneFixedFile = Constant.PROJECT_HOME + "/" + subject.get_name() + "/"
                            + subject.get_name() + subject.get_id() + patch.getFixedFile().trim();
                    ProcessPatch.createCombinedBuggy4AllFiles(patch, reverse);
                    instrument(fixedLine, writeFile, oneFixedFile);
                    if (!compileAndRun(subject, test)) {
                        illegalTests.add(test);
                        log.error("Patch {}, Should Pass!", patch.getPatchName());
                    }
                } catch (Exception e) {
                    log.error(
                            "process failing test on buggy version failed! subject {} patch {} test {}",
                            subject.get_name() + subject.get_id(), patch.getPatchName(), test, e);
                }
            }

            // change to fixed version run passing tests on fixed version
            for (String test : ObtainPassingTests.passingTests(subject)) {
                try {
                    String writeFile = BuildPath.buildDymicPassFile(reDir, patch.getPatchName(),
                            test, false);
                    String oneFixedFile = Constant.PROJECT_HOME + "/" + subject.get_name() + "/"
                            + subject.get_name() + subject.get_id() + patch.getFixedFile().trim();
                    ProcessPatch.createCombinedFixed4AllFiles(patch, reverse);
                    instrument(fixedLine, writeFile, oneFixedFile);
                    if (!compileAndRun(subject, test)) {
                        //inPlausiblePatches.add(patch.getPatchName());
                        illegalTests.add(test);
                        log.error("Patch {}, Should Pass!", patch.getPatchName());
                    }
                } catch (Exception e) {
                    log.error(
                            "process failing test on fixed version failed! subject {} patch {} test {}",
                            subject.get_name() + subject.get_id(), patch.getPatchName(), test, e);
                }
            }
            // remove dynamic info in illegal tests
            for (String illegaltest : illegalTests) {
                String illegalDir = Constant.dynamicResult + "/passing/" + reDir + "/"
                        + patch.getPatchName() + "/" + illegaltest;
                if (new File(illegalDir).exists()) {
                    try {
                        FileUtils.deleteDirectory(new File(illegalDir));
                    } catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
            }
        }
    }

    private static void processTrace(boolean reverse, String reDir,
            Entry<String, List<Patch>> entry) {
        String[] sub = entry.getKey().split("-");
        Subject subject = new Subject(sub[0], Integer.parseInt(sub[1]));

        for (Patch patch : entry.getValue()) {

            cleanSubject(subject.getHome() + subject.get_ssrc());
            if (!patch.getPatchName().equals("Chart_7.src.patch")) {
                continue;
            }
            log.info("Process Dir {} for Patch {}", reDir, patch.getPatchName());
            int fixedLine = getOneChangeLine(subject, patch, reverse);
            if (fixedLine == 0) {
                illeglePatches.add(patch.getPatchName());
                continue;
            }
            // run failing tests on buggy version
            for (String test : subject.getFailingTests()) {
                try {
                    String writeFile = BuildPath.buildDymicFile(reDir, patch.getPatchName(), test,
                            true);
                    String oneFixedFile = Constant.PROJECT_HOME + "/" + subject.get_name() + "/"
                            + subject.get_name() + subject.get_id() + patch.getFixedFile().trim();
                    ProcessPatch.createCombinedBuggy4AllFiles(patch, reverse);
                    instrument(fixedLine, writeFile, oneFixedFile);
                    TimeUnit.SECONDS.sleep(10);
                    if (compileAndRun(subject, test)) {
                        log.error("Patch {}, Should Fail!", patch.getPatchName());
                    }
                } catch (Exception e) {
                    log.error(
                            "process failing test on buggy version failed! subject {} patch {} test {}",
                            subject.get_name() + subject.get_id(), patch.getPatchName(), test, e);
                }
            }

            // change to fixed version run failing tests on fixed version
            for (String test : subject.getFailingTests()) {
                try {
                    String writeFile = BuildPath.buildDymicFile(reDir, patch.getPatchName(), test,
                            false);
                    String oneFixedFile = Constant.PROJECT_HOME + "/" + subject.get_name() + "/"
                            + subject.get_name() + subject.get_id() + patch.getFixedFile().trim();
                    ProcessPatch.createCombinedFixed4AllFiles(patch, reverse);
                    instrument(fixedLine, writeFile, oneFixedFile);
                    if (!compileAndRun(subject, test)) {
                        shoulPass.putIfAbsent(patch.getPatchName(), "");
                        log.error("Patch {}, Should Pass!", patch.getPatchName());
                    }
                } catch (Exception e) {
                    log.error(
                            "process failing test on fixed version failed! subject {} patch {} test {}",
                            subject.get_name() + subject.get_id(), patch.getPatchName(), test, e);
                }
            }
        }
    }

    private static void instrument(int fixedLine, String writeFile, String oneFixedFile) {
        synchronized (lock) {
            IntruMethodsVisitors visitor = new IntruMethodsVisitors();
            visitor.setWriteFile(writeFile);
            visitor.setFixedMethodStartLine(fixedLine);
            CompilationUnit compilationUnit = FileIO.genASTFromSource(
                    FileIO.readFileToString(oneFixedFile), ASTParser.K_COMPILATION_UNIT);
            compilationUnit.accept(visitor);
            FileIO.writeStringToFile(oneFixedFile, compilationUnit.toString());
        }
    }

    public static int getOneChangeLine(Subject subject, Patch patch, boolean reverse) {

        ProcessPatch.createCombinedBuggy4AllFiles(patch, reverse);

        int result = 0;
        String name = subject.get_name();
        String id = String.valueOf(subject.get_id());
        String subjectPath = Constant.PROJECT_HOME + "/" + name + "/" + name + id;
        Patch.initFixedFileAndChanges(patch);
        if (patch.isDeleteAll() || specialPatches.contains(patch.getPatchName())) {
            return result;
        }
        String fixedFile = subjectPath + patch.getFixedFile().trim();//  already in combined version
        List<Method> methodList;
        synchronized (lock) {
            methodList = getMethodInfo(fixedFile);
        }
        for (Integer lnumber : patch.getChangeLines()) {
            Method findMethod = methodList.stream().filter(Objects::nonNull).filter(
                    method -> lnumber >= method.get_startLine() && lnumber <= method.get_endLine())
                    .findAny().orElse(null);

            if (Objects.isNull(findMethod)) {
                continue;
            }
            return lnumber;
        }
        log.error("Patch {} obtain method failed ", patch.getPatchPath());
        return result;
    }

    private static void processCornerCase(String reDir, String patchName) {
        Subject subject = new Subject("Closure", 16);
        for (String test : subject.getFailingTests()) {
            String writeFile = BuildPath.buildDymicFile(reDir, patchName, test, true);
            String content = FileIO.readFileToString(writeFile);
            StringBuilder newContent = new StringBuilder();
            for (String line : content.split("\n")) {
                String[] lineStr = line.split("#");
                newContent.append(lineStr[0]).append("#").append(Integer.parseInt(lineStr[1]) + 1)
                        .append("\n");
            }
            FileIO.writeStringToFile(writeFile, newContent.toString());
        }
    }

    public static void main(String[] args) {
        List<Patch> trainPatch = ObtainPatches.readTrainPatches();
        Map<String, List<Patch>> trainPatchMap = trainPatch.stream()
                .collect(Collectors.groupingBy(Patch::getBugId));
        obtainTrace(trainPatchMap, false, "trainSet");

        List<Patch> testPatches = ObtainPatches.readTestPatches();
        Map<String, List<Patch>> testSubjectPatchMap =
                testPatches.stream().collect(Collectors.groupingBy(Patch::getBugId));
        obtainTrace(testSubjectPatchMap, false, "testSet");

        List<Patch> correctPatches = ObtainPatches.readCorPatches();
        Map<String, List<Patch>> correctSubjectPatchMap =
                correctPatches.stream().collect(Collectors.groupingBy(Patch::getBugId));
        obtainTrace(correctSubjectPatchMap, true, "correctSet");
        //processCornerCase("correctSet", "Closure_16.src.patch");


        log.info("Should Pass Patches: {}", String.join(",", shoulPass.keySet()));
        log.info("Should Fail Patches: {}", String.join(",", shouldFail.keySet()));
        log.info("Illegle Patches: {}", String.join(",", illeglePatches));
        log.info("finish obtain trace!");

    }
}
