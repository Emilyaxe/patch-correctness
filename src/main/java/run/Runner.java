package run;


import static config.Constant.ANT_BUILD_FAILED;
import static config.Constant.HOME;
import static config.Constant.JUNIT_RUN_MAIN;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import config.Constant;
import entity.Subject;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Runner {

    private final static String __name__ = "@Runner ";
    public final static String SUCCESSTEST = "Failing tests: 0";

    public static boolean testSingleTest(Subject subject, String clazzAndMethod) {
        List<String> message = null;
        try {
            log.info("TESTING : " + clazzAndMethod);
            message = Executor
                    .execute(CmdFactory.createTestSingleTestCaseCmd(subject, Constant.TEST_TIMEOUT, clazzAndMethod));
        } catch (Exception e) {
            // LevelLogger.fatal(__name__ + "#buildSubject run test single test case failed !", e);
        }

        boolean success = false;
        for (int i = Objects.requireNonNull(message).size() - 1; i >= 0; i--) {
            //			System.out.println(message.get(i));
            if (message.get(i).contains(SUCCESSTEST)) {
                success = true;
                break;
            }
        }
        log.info(String.join("\n", message));
        return success;
    }

    public static boolean testSingleTest(Subject subject, String clazz, String method) {
        return testSingleTest(subject, clazz + "::" + method);
    }


    public static void runFailTest(Subject subject, String failTest) {
        List<String> message = null;
        try {
            log.info("TESTING : " + subject.get_name() + "_" + subject.get_id());
            message = Executor.execute(CmdFactory.createTestSingleTestCaseCmd(subject, failTest));
            //System.out.println(message);
        } catch (Exception e) {
            // LevelLogger.fatal(__name__ + "#buildSubject run test single test case failed !", e);
        }
        if (CollectionUtils.isNotEmpty(message)
                && message.stream().filter(Objects::nonNull)
                .anyMatch(element -> element.contains(SUCCESSTEST))) {  // true
            log.info("Failing test Pass .....");

        } else {
            log.info("Failing test Failed .....");
        }
    }

    public static List<String> runTestSuite(Subject subject) {
        List<String> message = null;
        //subject.deleteBin();
        try {
            log.info("TESTING : " + subject.get_name() + "_" + subject.get_id());
            message = Executor.execute(CmdFactory.createTestSubjectCmd(subject, 30 * 60));
        } catch (Exception e) {
            // LevelLogger.fatal(__name__ + "#buildSubject run test single test case failed !", e);
        }
        return message;
        //        return CollectionUtils.isNotEmpty(message)
        //                && message.stream().filter(Objects::nonNull)
        //                .anyMatch(element -> element.contains(SUCCESSTEST));
    }

    /*
 run randoop test
  */
    public static List<String> runTestSuite(Subject subject, String testSuite) {
        List<String> message = Collections.emptyList();
        try {
            log.info("TESTING Randoop: " + subject.get_name() + "_" + subject.get_id());
            message = Executor.execute(CmdFactory.createTestSuiteCmd(subject, testSuite, 30 * 60));
            //System.out.println(message);
        } catch (Exception e) {
            // LevelLogger.fatal(__name__ + "#buildSubject run test single test case failed !", e);
        }
        log.info(StringUtils.join(message));
        return message;
        //log.info(String.join(" ", message));
        /*if(CollectionUtils.isNotEmpty(message)
                && message.stream().filter(Objects::nonNull).anyMatch(element -> element.contains(SUCCESSTEST))) {
                // true
            log.info("Failing test Pass .....");

        }else {
            log.info("Failing test Failed .....");
        }*/
    }


    public static boolean downloadSubject(Subject subject) {
        log.info("Downloading {} ...", subject.toString());
        File file = new File(subject.getHome());
        if (!file.exists()) {
            file.getParentFile().mkdirs();
            //file.createNewFile();
        }
        List<String> message = Collections.emptyList();
        try {
            message = Executor.execute(CmdFactory.createCheckOutCmd(subject));
        } catch (Exception e) {
            // LevelLogger.fatal(__name__ + "#buildSubject run build subject failed !", e);
        }
        log.info(String.join("\n", message));
        return CollectionUtils.isNotEmpty(message) || message.stream().filter(Objects::nonNull)
                .noneMatch(element -> element.contains("Version id does not exist:"));
    }

    public static boolean compileSubject(Subject subject) {

        //System.out.println("----- Compile " + subject.toString() + " -----");
        subject.deleteBin();
        /*if(new File(subject.getHome()+"/" + subject.get_sbin()).exists()){
            return true;
        }*/
        log.info("Compile " + subject.toString());
        List<String> message = Collections.emptyList();
        try {
            message = Executor.execute(CmdFactory.createBuildSubjectCmd(subject));
        } catch (Exception e) {
            // LevelLogger.fatal(__name__ + "#buildSubject run build subject failed !", e);
        }
        if (CollectionUtils.isNotEmpty(message)
                && message.stream().filter(Objects::nonNull)
                .anyMatch(element -> element.contains(ANT_BUILD_FAILED))) { // failed
            log.error(String.join("\n", message));
            return false;
        } else {
            //log.info("Compile Success!");
            log.info(String.join("\n", message));
        }
        return true;
    }

    public static boolean traceSubject(Subject subject, String arg) {
        List<String> message = null;
        try {
            message = Executor.execute(CmdFactory.createBTraceCmd(subject, arg, 90));
        } catch (Exception e) {
            // LevelLogger.fatal(__name__ + "#buildSubject run build subject failed !", e);
            log.error("trace subject failed", e);
        }
        return true;
    }

    public static String JUnitTestSubject(Subject subject, String failingTest, boolean isTimeout) {
        log.info("----- Begin Run Failing Test And Get Trace ----- " + failingTest);
        List<String> message = Collections.emptyList();
        try {
            StringBuilder junitArg = new StringBuilder();
            junitArg.append(Constant.COMMAND_CD + subject.getHome() + " && ");
            if (isTimeout) {
                junitArg.append(Constant.COMMAND_TIMEOUT).append(Constant.TEST_TIMEOUT).append(" ");
            }
            junitArg.append(Constant.COMMAND_JAVA_HOME).append("/bin/java -Xms2g -Xmx4g -cp \"")
                    // .append(subject.get_dependency()).append(":").append(HOME).append("/lib\" JUnitTestRunner ")
                    .append(subject.get_dependency()).append(":").append(HOME).append("/lib\" ")
                    .append(JUNIT_RUN_MAIN).append(" ")     // get only trace
                    .append(subject.get_name()).append(" ").append(subject.get_id()).append(" ")
                    .append(failingTest);
            // log.info(junitArg.toString());
            message = Executor.execute(new String[] {"/bin/bash", "-c", junitArg.toString()});
        } catch (Exception e) {
            log.error(__name__ + "#buildSubject run build subject failed !", e);
        }
        log.info(CollectionUtils.isEmpty(message) ? "" : String.join(" ", message));
        return String.join("\n", message);
    }

    /*
     * targetFile: fixedFile
     * patchFile: diffFile
     */
    public static boolean patchFile(String targetFile, String patchFile) {
        List<String> message = null;
        try {
            message = Executor.execute(CmdFactory.createPatchCmd(targetFile, patchFile));
        } catch (Exception e) {
            log.error(__name__ + "#createPatch run build subject failed !", e);
        }
        //        return !CollectionUtils.isEmpty(message) &&
        //                message.get(0).startsWith("patching file");
        return !CollectionUtils.isEmpty(message)
                && message.stream().filter(Objects::nonNull)
                .noneMatch(element -> element.contains("FAILED"));
    }

    //    public static void diff2File(String sourceFile, String targetFile, String patchFile) {
    //        List<String> message = null;
    //        try {
    //            message = Executor.execute(CmdFactory.createDiffCmd(sourceFile, targetFile, patchFile));
    //        } catch (Exception e) {
    //            log.error(__name__ + "#diff2File run build subject failed !", e);
    //        }
    //return  message.get(0);
/*        for(int i = message.size() - 1; i >= 0; i--){
            if (message.get(i).contains(Constant.ANT_BUILD_FAILED)) {
                success = false;
                break;
            }
        }*/
    //    }

    // the depedency must be this
    public static boolean dynComp(String failingTestPath, Subject subject) {
        log.info("DynComp for {} ...", subject.toString());
        StringBuilder stringBuilder = new StringBuilder(
                Constant.COMMAND_CD + subject.getHome() + " && ");
        stringBuilder.append("java -cp \"").append(subject.get_dependency())
                .append(":").append(HOME).append("/lib")
                .append("\" daikon.DynComp --ppt-omit-pattern=org.junit.* MultipleTestRunner ")
                .append(subject.get_name()).append(" ").append(subject.get_id()).append(" ")
                .append(failingTestPath);
        log.info(stringBuilder.toString());
        List<String> message = null;
        try {
            message = Executor.execute(new String[] {"/bin/bash", "-c", stringBuilder.toString()});
        } catch (Exception e) {
            log.error(__name__ + " Tracer failed !", e);
        }
        //log.info(message.toString());
        return true;
    }

    // the depedency must be this
    public static boolean chicory(String failingTestPath, Subject subject, Set<String> modifiedClass) {
        log.info("Chicory for {} ...", subject.toString());
        StringBuilder tmpStr = new StringBuilder();
        for (String clazz : modifiedClass) {
            tmpStr.append("--ppt-select-pattern=").append(clazz).append(" ");
        }
        StringBuilder stringBuilder = new StringBuilder(
                Constant.COMMAND_CD + subject.getHome() + " && ");

        stringBuilder.append("timeout ").append(Constant.DAIKON_TIMEOUT).append(" java -Xmx16G -cp \"")
                .append(subject.get_dependency())
                .append(":").append(HOME).append("/lib")
                // .append("\" daikon.Chicory --ppt-omit-pattern=org.junit.* " +
                .append("\" daikon.Chicory ").append(tmpStr.toString())
                .append("--heap-size=16G --daikon --comparability-file=MultipleTestRunner.decls-DynComp "
                        + "MultipleTestRunner ")
                .append(subject.get_name()).append(" ").append(subject.get_id()).append(" ")
                .append(failingTestPath);
        log.info(stringBuilder.toString());
        List<String> message = null;
        try {
            message = Executor.execute(new String[] {"/bin/bash", "-c", stringBuilder.toString()});
        } catch (Exception e) {
            log.error(__name__ + " Tracer failed !", e);
        }
        if (message.toString().contains("Exception in thread \"main\" java.lang.OutOfMemoryError: GC overhead limit "
                + "exceeded")) {
            log.warn("Daikon's error: OutOfMemoryError");
            return false;
        }
        if (message.toString().contains("Warning: Did not run Daikon because target exited with 1 status")) {
            log.warn("Daikon's warning: exited with 1 status");
            return false;
        }
        //log.info(message.toString());
        return true;
    }

    public static String readInVariants(String failingTest, Subject subject) {
        log.info("Read Invariants ...");
        StringBuilder stringBuilder = new StringBuilder(
                Constant.COMMAND_CD + subject.getHome() + " && ");
        stringBuilder.append("java -cp \"").append(subject.get_dependency()).append(":")
                .append("\" daikon.PrintInvariants " +
                        "MultipleTestRunner.inv.gz");
        log.info(stringBuilder.toString());
        List<String> message = Collections.emptyList();
        try {
            message = Executor.execute(new String[] {"/bin/bash", "-c", stringBuilder.toString()});
        } catch (Exception e) {
            log.error(__name__ + " Tracer failed !", e);
        }
        return String.join("\n", message);
    }

    // run junitCore
    public static boolean dynCompForCore(String failingTest, Subject subject) {
        log.info("DynComp for {} ...", failingTest);
        StringBuilder stringBuilder = new StringBuilder(
                Constant.COMMAND_CD + subject.getHome() + " && ");
        //        String pacakgeName = failingTest.split("::")[0];
        //        String methodName = pacakgeName.split("\\.")[pacakgeName.split("\\.").length - 1] +
        //                failingTest.split("::")[1];

        stringBuilder.append("java -cp \"").append(subject.get_dependency())
                .append(":").append(HOME).append("/lib")
                .append("\" daikon.DynComp --ppt-omit-pattern=org.junit.* org.junit.runner.JUnitCore ")
                .append(failingTest);
        log.info(stringBuilder.toString());
        List<String> message = null;
        try {
            message = Executor.execute(new String[] {"/bin/bash", "-c", stringBuilder.toString()});
        } catch (Exception e) {
            log.error(__name__ + " Tracer failed !", e);
        }
        //log.info(message.toString());
        return true;
    }

    // run junitCore
    public static boolean chicoryForCore(String failingTest, Subject subject, Set<String> files) {
        log.info("Chicory for {} ...", failingTest);
        StringBuilder stringBuilder = new StringBuilder(
                Constant.COMMAND_CD + subject.getHome() + " && ");
       /* String pacakgeName = failingTest.split("::")[0];
        String methodName = pacakgeName.split("\\.")[pacakgeName.split("\\.").length - 1] +
                failingTest.split("::")[1];
        StringBuilder tmpStr = new StringBuilder();
        for (String file : files) {
            String arr[] = file.split("\\.");
            String classN = arr[arr.length - 1];
            String pkg = Arrays.stream(arr).limit(arr.length - 1).collect(Collectors.joining("."));
            tmpStr.append("--ppt-select-pattern=").append(pkg).append("$").append(classN).append(" ");
        }*/
        stringBuilder.append("timeout ").append(Constant.DAIKON_TIMEOUT).append(" java -Xmx16G -cp \"")
                .append(subject.get_dependency())
                .append(":").append(HOME).append("/lib")
                // .append("\" daikon.Chicory ").append(tmpStr.toString())
                .append("\" daikon.Chicory --ppt-omit-pattern=org.junit.* ")
                .append("--heap-size=16G --daikon --comparability-file=JUnitCore.decls-DynComp org.junit.runner"
                        + ".JUnitCore ")
                .append(failingTest);

        log.info(stringBuilder.toString());
        List<String> message = Collections.emptyList();
        try {
            message = Executor.execute(new String[] {"/bin/bash", "-c", stringBuilder.toString()});
        } catch (Exception e) {
            log.error(__name__ + " Tracer failed !", e);
        }
        if (message.toString()
                .contains("Exception in thread \"main\" java.lang.OutOfMemoryError: GC overhead limit exceeded")) {
            log.warn("Daikon's error: OutOfMemoryError");
            return false;
        }
        if (message.toString().contains("Warning: Did not run Daikon because target exited with 1 status")) {
            log.warn("Daikon's warning: exited with 1 status");
            return false;
        }
        return true;

    }


    public static String readInVariantsForCore(String failingTest, Subject subject, String invFile) {
        log.info("Read Invariants ...");
        StringBuilder stringBuilder = new StringBuilder(
                Constant.COMMAND_CD + subject.getHome() + " && ");
        stringBuilder.append("java -cp \"").append(subject.get_dependency()).append(":")
                .append("\" daikon.PrintInvariants ").append(invFile);
        log.info(stringBuilder.toString());
        List<String> message = Collections.emptyList();
        try {
            message = Executor.execute(new String[] {"/bin/bash", "-c", stringBuilder.toString()});
        } catch (Exception e) {
            log.error(__name__ + " Tracer failed !", e);
        }
        return String.join("\n", message);
    }

    public static String diffInVariants(String file1, String file2) {
        log.info("Diff Invariants ...");
        StringBuilder stringBuilder =
                new StringBuilder("java -cp $DAIKONDIR/daikon.jar daikon.diff.Diff ").append(file1).append(file2);

        log.info(stringBuilder.toString());
        List<String> message = Collections.emptyList();
        try {
            message = Executor.execute(new String[] {"/bin/bash", "-c", stringBuilder.toString()});
        } catch (Exception e) {
            log.error(__name__ + " Tracer failed !", e);
        }
        return String.join("\n", message);
    }


    // get tracer by using javaslicer
    public static boolean tracer(String saveFile, Subject subject, String failingTest) {
        log.info("Trace for {} ...", failingTest);
        StringBuilder stringBuilder = new StringBuilder(
                Constant.COMMAND_CD + subject.getHome() + " && ");
        stringBuilder.append(CmdFactory.createTracer()).append(saveFile).append(" ")
                .append("-cp \"").append(subject.get_dependency()).append(":").append(HOME)
                .append("/lib\" JUnitTestRunner ")
                .append(subject.get_name()).append(" ").append(subject.get_id()).append(" ")
                .append(failingTest);
        //log.info(stringBuilder.toString());
        List<String> message = Collections.emptyList();
        try {
            message = Executor.execute(new String[] {"/bin/bash", "-c", stringBuilder.toString()});
        } catch (Exception e) {
            log.error(__name__ + " Tracer failed !", e);
        }

        log.info(stringBuilder.toString());
        if (CollectionUtils.isEmpty(message)
                || message.stream().filter(Objects::nonNull).noneMatch(
                element -> element.contains("WARNING") || element.contains("ERROR") || element
                        .contains("Exception"))) {
            log.info("{} trace success!", subject.toString());

            log.info(String.join(" ", message));
        } else {
            //log.info(stringBuilder.toString());
            log.error("{} trace failed", subject.toString());
            log.info(String.join(" ", message));
            return false;
        }
        return true;
    }

    // get slice by using javaslicer

    public static void slicer(String traceFile, String criterion, String sliceFile) {
        log.info("Slicing ...");
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(CmdFactory.createSlicer()).append(traceFile).append(" ").append(criterion)
                .append(">").append(sliceFile);
        // java -Xmx2g -jar assembly/slicer.jar -p

        List<String> message = null;
        try {
            message = Executor.execute(new String[] {"/bin/bash", "-c", stringBuilder.toString()});
        } catch (Exception e) {
            log.error(__name__ + " Tracer failed !", e);
        }
        log.info(stringBuilder.toString());
        if (CollectionUtils.isEmpty(message)
                || message.stream().filter(Objects::nonNull)
                .noneMatch(element -> element.contains("Error parsing slicing criterion"))) {
            log.info("{} slice success!", criterion);
        } else {
            log.error(String.join(" ", message));
        }

        //FileIO.writeStringToFile(sliceFile, message.stream().collect(Collectors.joining("\n")));
        //         return CollectionUtils.isEmpty(message)
        //                || message.stream().filter(Objects::nonNull).noneMatch(element -> element.contains("error"));
        //return CollectionUtils.isEmpty(message) ? "" : String.join(" ", message);

    }


    /*
    tar.bz2 unzip
     */
    public static void unZipTest(String filePath) {
        log.info("Unzip {}", filePath);
        String newPath = filePath.split(".tar.bz2")[0];
        if (!new File(newPath).exists()) {
            new File(newPath).mkdirs();
        }
        StringBuilder stringBuilder = new StringBuilder("tar -jxvf ").append(filePath).append(" -C ").append(newPath);
        List<String> message = Collections.emptyList();
        try {
            message = Executor.execute(new String[] {"/bin/bash", "-c", stringBuilder.toString()});
        } catch (Exception e) {
            log.error(__name__ + " unzip failed !", e);
        }
        log.info(stringBuilder.toString());
        log.info(String.join(" ", message));
    }

    /*
 tar.bz2 zip
  */
    public static void zipTest(String filePath) {
        log.info("zip {}", filePath);
        if (new File(filePath + ".tar.bz2").exists()) {
            try {
                FileUtils.forceDelete(new File(filePath + ".tar.bz2"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String fileName = filePath.split("\\/")[filePath.split("\\/").length - 1];
        String fileDir = filePath.split(fileName)[0];
        StringBuilder stringBuilder =
                new StringBuilder("cd ").append(fileDir).append(" && ").append("tar -jcvf ").append(fileName)
                        .append(".tar.bz2 ").append(fileName);
        List<String> message = Collections.emptyList();
        try {
            message = Executor.execute(new String[] {"/bin/bash", "-c", stringBuilder.toString()});
        } catch (Exception e) {
            log.error(__name__ + " zip failed !", e);
        }
        log.info(stringBuilder.toString());
        log.info(String.join(" ", message));
    }

    public static void runSootJimple(String classPath, Subject subject) {
        List<String> message = Collections.emptyList();
        try {
            message = Executor.execute(CmdFactory.createSootJimple(classPath, subject));
        } catch (Exception e) {
            log.info(classPath);
            log.info(String.join(" ", message));
        }
    }


    public static void sleepOneMinute() {
        try {
            TimeUnit.MINUTES.sleep(1);
        } catch (Exception ignored) {

        }
    }

    public static void sleep30s() {
        try {
            TimeUnit.SECONDS.sleep(30);
        } catch (Exception ignored) {

        }
    }

    public static void runTestFile(Subject subject, String testSuite, boolean isTimeout) {
        log.info("----- Begin Run Test And Get Trace ----- " + testSuite);
        // cp test to subject test dir
        //String testDir = subject.getHome() + subject.get_tsrc();
        for (File f : new File(testSuite).listFiles()) {
            if (!f.getName().endsWith(".java")) {
                continue;
            }
            List<String> message = Collections.emptyList();
            try {
                StringBuilder junitArg = new StringBuilder();
                junitArg.append(Constant.COMMAND_CD + subject.getHome() + " && ");
                if (isTimeout) {
                    junitArg.append(Constant.COMMAND_TIMEOUT).append(Constant.TEST_TIMEOUT).append(" ");
                }
                junitArg.append(Constant.COMMAND_JAVA_HOME).append("/bin/java -Xms2g -Xmx4g -cp \"")
                        // .append(subject.get_dependency()).append(":").append(HOME).append("/lib\" JUnitTestRunner ")
                        .append(subject.get_dependency()).append(":").append(HOME).append("/lib\" ")
                        .append("JUnitTestRunner").append(" ")     // get only trace
                        .append(subject.get_name()).append(" ").append(subject.get_id()).append(" ")
                        .append(f.getName().split(".java")[0]);
                // log.info(junitArg.toString());
                message = Executor.execute(new String[] {"/bin/bash", "-c", junitArg.toString()});
            } catch (Exception e) {
                log.error(__name__ + "#buildSubject run build subject failed !", e);
            }
            log.info(CollectionUtils.isEmpty(message) ? "" : String.join(" ", message));
        }
        //return String.join("\n", message);
    }
}
