package util;


import config.Constant;
import entity.Subject;

public class BuildPath {

    public static String buildDymicFile(String dir, String patchName, String test, boolean isBuggy) {
        String prefix = Constant.macOs ? "/Volumes/My Passport" : "";
        return prefix + Constant.dynamicResult + "/failing/" + dir + "/" + patchName + "/" + test + "/" + (isBuggy
                                                                                                           ? "buggy"
                                                                                                           : "fixed");
    }

    public static String buildDymicPassFile(String dir, String patchName, String test, boolean isBuggy) {
        String prefix = Constant.macOs ? "/Volumes/My Passport" : "";
        return prefix + Constant.dynamicResult + "/passing/" + dir + "/" + patchName + "/" + test + "/" + (isBuggy
                                                                                                           ? "buggy"
                                                                                                           : "fixed");
    }

    public static String buildMethodsFile(Subject subject, boolean isBuggy) {
        return Constant.methodResult + "/" + subject.get_name() + "/" + subject.get_id() + (isBuggy ? ".buggy"
                                                                                                    : ".fixed");
    }

    public static String buildMethodReFile(String file) {
        return Constant.methodResult + "/" + file;
    }


}
