package run;

import config.Constant;
import entity.Subject;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CmdFactory {

    /**
     * build execution command for compiling a subject
     *
     * @param subject : subject to be compiled
     * @return commands need to be executed
     */

    public static String[] createCheckOutCmd(Subject subject) {

        String stringBuilder = Constant.COMMAND_D4J + " checkout -p " + subject.get_name() + " -v "
                + subject.get_id() + "b -w " + subject.getHome();
        return new String[] { "/bin/bash", "-c", stringBuilder };
        //return createD4JCmd(subject, "checkout -p " + subject.get_name() + " -v " + subject.get_id() + "f -w " +
        // subject.getHome(), Constant.COMPILE_TIMEOUT);
    }

    public static String[] createBuildSubjectCmd(Subject subject) {
        //log.info("----- Compile Subject " + subject.toString() + "------");
        return createD4JCmd(subject, "compile", Constant.COMPILE_TIMEOUT);
    }

    public static String[] createTestSubjectCmd(Subject subject, int timeout) {
        return createD4JCmd(subject, "test", timeout);
    }

    public static String[] createTestSingleTestCaseCmd(Subject subject, int timeout,
            String clazzAndMethod) {
        return createD4JCmd(subject, "test -t " + clazzAndMethod, timeout);
    }

    public static String[] createTestSingleTestCaseCmd(Subject subject, int timeout, String clazz,
            String method) {
        return createD4JCmd(subject, "test -t " + clazz + "::" + method, timeout);
    }

    public static String[] createTestSingleTestCaseCmd(Subject subject, String clazz,
            String method) {
        return createD4JCmd(subject, "test -t " + clazz + "::" + method, -1);
    }

    public static String[] createTestSingleTestCaseCmd(Subject subject, String failTest) {
        return createD4JCmd(subject, "test -t " + failTest, -1);
    }

    public static String[] createTestSuiteCmd(Subject subject, String testSuite) {
        return createD4JCmd(subject, "test -s " + testSuite, -1);
    }

    // TODO
    public static String[] createBTraceCmd(Subject subject, String arg, int timeout) {
        StringBuilder stringBuilder = new StringBuilder();
        /*        if(timeout > 0){
            stringBuilder.append(Constant.COMMAND_TIMEOUT).append(timeout).append(" ");
        }*/
        stringBuilder.append(Constant.COMMAND_D4J).append(arg);
        log.info(stringBuilder.toString());
        return new String[] { "/bin/bash", "-c", stringBuilder.toString() };
    }

    public static String[] createTestSingleTestByJUnit(Subject subject, String arg) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Constant.COMMAND_CD).append(subject.getHome()).append(" && ");
        //stringBuilder.append(Constant.COMMAND_TIMEOUT).append(Constant.TEST_TIMEOUT).append(" ");
        stringBuilder.append(arg);
        log.info(stringBuilder.toString());
        return new String[] { "/bin/bash", "-c", stringBuilder.toString() };
    }

    /**
     * create d4j command based on the given argument {@code args}
     *
     * @param subject : subject to be focused
     * @param args : command to be executed, e.g., "test", "compile", etc.
     * @return command need to be executed
     */
    private static String[] createD4JCmd(Subject subject, String args, int timeout) {
        //System.out.println(stringBuilder.toString() );
        //        String stringBuilder =
        //                "echo $JAVA_HOME" + " && " + Constant.COMMAND_CD + subject.getHome() + " && "
        //                        + Constant.COMMAND_D4J + args;
        StringBuilder stringBuilder = new StringBuilder(Constant.COMMAND_CD)
                .append(subject.getHome()).append(" && ").append("Java -version && ");
        if (timeout > 0) {
            stringBuilder.append(Constant.COMMAND_TIMEOUT).append(timeout).append(" ");
        }
        stringBuilder.append(Constant.COMMAND_D4J).append(args);
        return new String[] { "/bin/bash", "-c", stringBuilder.toString() };

    }

    //    public static String[] createDiffCmd(String sourceFile, String targetFile, String patchFile) {
    //        StringBuilder stringBuilder = new StringBuilder();
    //        stringBuilder.append(Constant.COMMAND_DIFF).append(sourceFile).append(" ")
    //                .append(targetFile).append(">").append(patchFile);
    //        log.info(stringBuilder.toString());
    //        return new String[] {"/bin/bash", "-c", stringBuilder.toString()};
    //    }

    public static String[] createPatchCmd(String targetFile, String patchFile) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Constant.COMMAND_PATCH).append(targetFile).append(" ")
                .append(patchFile);
        //log.info(stringBuilder.toString());
        return new String[] { "/bin/bash", "-c", stringBuilder.toString() };
    }

    public static String createTracer() {
        // return "java -javaagent:/home/emily/WorkSpace/javaslicer/assembly/tracer.jar=tracefile:";
        return Constant.COMMAND_JAVA_HOME + "/bin/java -javaagent:" + Constant.env
                + "/WorkSpace/javaslicer/assembly/tracer.jar=tracefile:";
    }

    public static String createSlicer() {
        return Constant.COMMAND_JAVA_HOME + "/bin/java -Xmx2g -jar " + Constant.env
                + "/WorkSpace/javaslicer/assembly/slicer.jar -p ";
    }

    public static String[] createSootJimple(String classPath, Subject subject) {
        StringBuilder stringBuilder = new StringBuilder().append(Constant.COMMAND_CD)
                .append(subject.getHome() + subject.get_sbin()).append(" && ")
                .append(Constant.COMMAND_JAVA_HOME)
                .append("/bin/java -cp /Users/liangjingjing/WorkSpace/Project/PatchExplanation/patch"
                        + "-explanation/lib"
                        + "/soot/soot-4.2.1-jar-with-dependencies.jar soot.Main -pp -f J -cp . ")
                .append(classPath);
        //log.info(stringBuilder.toString());
        return new String[] { "/bin/bash", "-c", stringBuilder.toString() };
    }

}
