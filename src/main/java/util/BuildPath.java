package util;


import config.Constant;
import entity.Subject;

public class BuildPath {

    public static String buildDymicFile(String dir, String patchName, String test, boolean isBuggy) {
        // String prefix = Constant.macOs ? "/Volumes/My Passport" : "";
        return Constant.dynamicResult + "/failing/" + dir + "/" + patchName + "/" + test + "/" + (isBuggy
                                                                                                  ? "buggy"
                                                                                                  : "fixed");
    }

    public static String buildDymicPassFile(String dir, String patchName, String test, boolean isBuggy) {
        String prefix = Constant.macOs ? "/Volumes/My Passport" : "";
        return prefix + Constant.dynamicResult + "/passing/" + dir + "/" + patchName + "/" + test + "/" + (isBuggy
                                                                                                           ? "buggy"
                                                                                                           : "fixed");
    }

    public static String buildDymicAllFile(String dir, String patchName, boolean isBuggy) {
        // String prefix = Constant.macOs ? "/Volumes/My Passport" : "";
        return Constant.dynamicResult + "/" + dir + "/" + patchName + "/" + (isBuggy
                                                                             ? "buggy"
                                                                             : "fixed");
    }

    public static String buildMethodsFile(Subject subject, boolean isBuggy) {
        return Constant.staticResult + "/" + subject.get_name() + "/" + subject.get_id() + (isBuggy ? ".buggy"
                                                                                                    : ".fixed");
    }

    public static String buildProjectFile(Subject subject, String test) {
        return "";
    }

    public static String buildMethodReFile(String file) {
        return Constant.staticResult + "/" + file;
    }


}
