package config;

public class Constant {

    public static final boolean macOs = System.getProperty("os.name").contains("Mac OS X");
    public static String env = macOs ? "/Users/liangjingjing" : "/home/emily";
    public static String HOME = env + "/WorkSpace/Project/PatchCorrectness/patch-correctness";
    public static String PROJECT_HOME = env + "/WorkSpace/Data/Defects4J/projects_buggy";
    public static String D4J_HOME = env + "/WorkSpace/defects4j";


    public static String PROJ_INFO = HOME + "/d4j-info";

    // for daikon use in java1.8
    public static final String COMMAND_JAVA_HOME =
            macOs ? "/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home"
                  : "/home/emily/pathFile/jdk1.8.0_144";

    // for javaslicer use in java1.7
    //    public static final String COMMAND_JAVA_HOME =
    //            macOs ? "/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home"
    //                  : "/home/emily/pathFile/jdk1.7.0_80";

    public static final String COMMAND_CD = "cd ";

    public static final String COMMAND_D4J = D4J_HOME + "/framework/bin/defects4j ";

    public static final String COMMAND_GENTEST = D4J_HOME + "/framework/bin/gen_tests.pl";
    public static final String COMMAND_DIFF = "";

    public static final String COMMAND_PATCH = "patch -u -p0 ";

    public static final int COMPILE_TIMEOUT = 100;
    public static final int DAIKON_TIMEOUT = 3600;


    public static final String PATCH_SUCCESS = "succeeded";


    public static final String JUNIT_RUN_MAIN = "JUnitTestRunner4Trace";
    public static final String DUMPER_HOME = HOME + "/src/main/java/auxiliary";
    public static String HOME_LIB = HOME + "/lib";

    public static final String ANT_BUILD_FAILED = "FAIL";


    // type segment

    public static final String SUBCLASS_SEGMENT = "$";
    public static final String FIELD_SEGMENT = ":";
    public static final String VAR_SEGMENT = ":";
    public static final String METHOD_SEGMENT = ".";
    public static final String LINENUMBER_SEGMENT = "#";

    // result file
    public static String tracerResult = HOME + "/result/tracer";
    public static String traceFile = "tracer";
    public static String sliceResult = HOME + "/result/slicer";
    public static String sliceFile = "slicer";
    public static String testDir = HOME + "/result/test";
    public static String dependencyDir = HOME + "/result/dependency";

    //daikon file
    public static String daikonResult = HOME + "/result/daikon";
    public static String fixedDaikonFile = "fixed_daikon";
    public static String buggyDaikonFile = "buggy_daikon";

    public static String varResult = HOME + "/result/var";
    public static String fixedVarFile = "fixed_var";
    public static String buggyVarFile = "buggy_var";
    public static String allFixedVarFile = "fixed_var_all";
    public static String allBuggyVarFile = "buggy_var_all";

    // jdcallgraph
    public static String jdCallGraphDir = HOME_LIB + "/jdcallgraph";
    public static String jdCallGraphReFile = HOME + "/result/callgraph/cg";


    // patches dir
    public static String patchesICSE = HOME + "/Patches/Patches_ICSE";
    public static String patchesOther = HOME + "/Patches/Patches_others";
    public static String methodResult = HOME + "/result/methods";


    public static String FIXED = ".fixed";
    public static String BUGGY = ".buggy";
    public static String PURIFY = ".purify";
}
