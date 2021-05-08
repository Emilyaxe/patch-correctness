package util;



import config.Constant;
import entity.Subject;

public class BuildPath {

    public static String buildMethodsFile(Subject subject, boolean isBuggy) {
        return Constant.methodResult + "/" + subject.get_name() + "/" + subject.get_id() +  (isBuggy? ".buggy" : ".fixed");
    }
    public static String buildMethodReFile(String file) {
        return Constant.methodResult + "/" + file;
    }


}