package config;

public class Constant {

    public static final boolean macOs = System.getProperty("os.name").contains("Mac OS X");
    public static String env = macOs ? "/Users/liangjingjing" : "/home/jjliang";
    public static String HOME = env + "/WorkSpace/Project/PatchCorrectness/patch-correctness";
    public static String PROJECT_HOME = env + "/WorkSpace/Data/Defects4J/projects_buggy";
    public static String D4J_HOME = env + (macOs ? "/WorkSpace/defects4j" : "/WorkSpace/defects4j");


    public static String PROJ_INFO = HOME + "/d4j-info";


    //    public static final String COMMAND_JAVA_HOME =
    //            macOs ? "/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home"
    //                  : env + "/pathFile/jdk1.8.0_144";

    public static final String COMMAND_JAVA_HOME =
            macOs ? "/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home"
                  : env + "/pathFile/jdk1.7.0_80";

    public static final String COMMAND_CD = "cd ";

    public static final String COMMAND_D4J = D4J_HOME + "/framework/bin/defects4j ";


    public static final String COMMAND_PATCH = "patch -u -p0 ";
    public static final String COMMAND_TIMEOUT = "timeout ";
    public static final int COMPILE_TIMEOUT = 200;
    public static final int TEST_TIMEOUT = 30 * 60;
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


    // patches dir
    public static String patchesICSE = HOME + "/Patches/Patches_ICSE";
    public static String patchesOther = HOME + "/Patches/Patches_others";
    public static String staticResult = HOME + "/result/static";
    public static String dynamicResult = HOME + "/result/dynamic_unpurify";
    public static String randoopResult = HOME + "/result/randoop";

    public static String patchesPartitionResult = HOME + "/result/dataSetPartition";


    public static String FIXED = ".fixed";
    public static String BUGGY = ".buggy";
    public static String PURIFY = ".purify";
}
