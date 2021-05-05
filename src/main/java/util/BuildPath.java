package util;

import static config.Constant.allBuggyVarFile;
import static config.Constant.allFixedVarFile;
import static config.Constant.buggyDaikonFile;
import static config.Constant.buggyVarFile;
import static config.Constant.dependencyDir;
import static config.Constant.fixedDaikonFile;
import static config.Constant.fixedVarFile;
import static config.Constant.sliceFile;
import static config.Constant.testDir;
import static config.Constant.traceFile;

import config.Constant;
import entity.Subject;

public class BuildPath {

    public static String buildTraceFile(Subject subject, String oneTest) {
        return Constant.tracerResult + "/" + subject.get_name() + "/" + subject.get_id() + "/" + oneTest
                + "/" + traceFile;
    }

    public static String buildSliceFile(Subject subject, String oneTest) {
        return Constant.sliceResult + "/" + subject.get_name() + "/" + subject.get_id() + "/" + oneTest
                + "/" + sliceFile;
    }

    public static String buildFixedVarFile(Subject subject, String oneTest) {
        return Constant.varResult + "/" + subject.get_name() + "/" + subject.get_id() + "/" + oneTest
                + "/" + fixedVarFile;
    }

    public static String buildBuggyVarFile(Subject subject, String oneTest) {
        return Constant.varResult + "/" + subject.get_name() + "/" + subject.get_id() + "/" + oneTest
                + "/" + buggyVarFile;
    }

    public static String buildFixedAllVarFile(Subject subject, String oneTest) {

        String prefix = Constant.macOs ? "/Volumes/My Passport" : "";
        return prefix + Constant.varResult + "/" + subject.get_name() + "/" + subject.get_id() + "/"
                + oneTest
                + "/" + allFixedVarFile;
    }

    public static String buildBuggyAllVarFile(Subject subject, String oneTest) {
        String prefix = Constant.macOs ? "/Volumes/My Passport" : "";
        return prefix + Constant.varResult + "/" + subject.get_name() + "/" + subject.get_id() + "/"
                + oneTest
                + "/" + allBuggyVarFile;
    }


    // for daikon result
    public static String buildFixedDaikonDir(Subject subject, String oneTest) {
        return Constant.daikonResult + "/" + subject.get_name() + "/" + subject.get_id() + "/" + oneTest;
    }

    public static String buildFixedDaikonFile(Subject subject, String oneTest) {
        return Constant.daikonResult + "/" + subject.get_name() + "/" + subject.get_id() + "/" + oneTest
                + "/" + fixedDaikonFile;
    }

    public static String buildBuggyDaikonFile(Subject subject, String oneTest) {
        return Constant.daikonResult + "/" + subject.get_name() + "/" + subject.get_id() + "/" + oneTest
                + "/" + buggyDaikonFile;
    }

    public static String buildFixedDaikonDiff(Subject subject, String oneTest) {
        return Constant.daikonResult + "/" + subject.get_name() + "/" + subject.get_id() + "/" + oneTest
                + "/fixed_diff";
    }

    public static String buildBuggyDaikonDiff(Subject subject, String oneTest) {
        return Constant.daikonResult + "/" + subject.get_name() + "/" + subject.get_id() + "/" + oneTest
                + "/buggy_diff";
    }


    public static String buildTestDir(Subject subject, String generator, String isBuggy) {
        return testDir + "/" + subject.get_name() + "/" + generator + "/" + subject.get_id() + "/"
                + subject.get_name()
                + "-" + subject.get_id() + isBuggy + "-" + generator + "." + subject.get_id() + ".tar.bz2";
    }

    public static String buildDependencyDir(Subject subject) {
        return dependencyDir + "/" + subject.get_name() + "/" + subject.get_id() + "/";
    }

    public static String buildCGFile(Subject subject) {
        return Constant.jdCallGraphReFile + "/" + subject.get_name() + "/" + subject.get_id();
    }

    public static String buildMethodsFile(Subject subject, boolean isBuggy) {
        return Constant.methodResult + "/" + subject.get_name() + "/" + subject.get_id() +  (isBuggy? ".buggy" : ".fixed");
    }
    public static String buildMethodReFile(String file) {
        return Constant.methodResult + "/" + file;
    }


}
