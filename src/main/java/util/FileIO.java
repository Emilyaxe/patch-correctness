package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.apache.commons.io.FileUtils;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FileIO {

    public static String readFileToString(String filePath) {
        if (filePath == null) {
            log.error("file does {} not exist", filePath);
            return "";
        }
        File file = new File(filePath);
        if (!file.exists() || !file.isFile()) {
            log.error("file does {} not exist", file.toString());
            return "";
        }
        return readFileToString(file);
    }

    public static String readFileToString(File file) {
        if (file == null) {
            log.error("file does {} not exist", file.toString());
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        InputStream in = null;
        InputStreamReader inputStreamReader = null;
        try {
            in = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(in, StandardCharsets.UTF_8);
            char[] ch = new char[1024];
            int readCount = 0;
            while ((readCount = inputStreamReader.read(ch)) != -1) {
                stringBuilder.append(ch, 0, readCount);
            }
            inputStreamReader.close();
            in.close();

        } catch (Exception e) {
            if (inputStreamReader != null) {
                try {
                    inputStreamReader.close();
                } catch (IOException e1) {
                    return "";
                }
            }
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e1) {
                    return "";
                }
            }
        }
        return stringBuilder.toString();
    }

    public static boolean writeStringToLog(String logFile, String info) {
        return writeStringToFile(logFile, info + "\n", true);
    }

    public static boolean writeStringToLog(File logFile, String info) {
        return writeStringToFile(logFile, info + "\n", true);
    }

    public static boolean writeStringToFile(File file, String string) {
        return writeStringToFile(file, string, false);
    }

    public static boolean writeStringToFile(String filePath, String string) {
        return writeStringToFile(filePath, string, false);
    }

    public static boolean writeStringToFile(String filePath, String string, boolean append) {
        if (filePath == null) {
            //LevelLogger.error(__name__ + "#writeStringToFile Illegal file path : null.");
            log.error("file does {} not exist", filePath);
            return false;
        }
        File file = new File(filePath);
        return writeStringToFile(file, string, append);
    }

    public static boolean writeStringToFile(File file, String string, boolean append) {
        if (file == null || string == null) {
            //LevelLogger.error(__name__ + "#writeStringToFile Illegal arguments : null.");
            log.error("file does {} not exist", file.toString());
            return false;
        }
        if (!file.exists()) {
            try {
                file.getParentFile().mkdirs();
                file.createNewFile();
            } catch (IOException e) {
                // LevelLogger.error(__name__ + "#writeStringToFile Create new file failed : " + file.getAbsolutePath
                // ());
                return false;
            }
        }
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(file, append), StandardCharsets.UTF_8));
            bufferedWriter.write(string);
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return true;
    }

    public static void deleteComments(String filePath) {
        try {
            File file = new File(filePath);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            StringBuilder result = new StringBuilder();
            boolean breakContinue = false;
            while (br.ready()) {
                line = br.readLine();
                if (line.trim().equals("")) {
                    continue;
                }
                if (line.trim().startsWith("//")) {
                    continue;
                }
                if (line.trim().startsWith("/*")) {
                    breakContinue = true;
                }
                if (line.trim().endsWith("*/")) {
                    breakContinue = false;
                    continue;
                }
                if (!breakContinue) {
                    result.append(line).append("\n");
                }
            }
            br.close();
            String content = result.toString().replaceAll(
                    "\\/\\/[^\\n]*|\\/\\*([^\\*^\\/]*|[\\*^\\/*]*|[^\\**\\/]*)*\\*+\\/", "");
            FileIO.writeStringToFile(filePath, content.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void normalizeFile(String filePath) {
        try {
            File file = new File(filePath);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            StringBuilder result = new StringBuilder();

            while (br.ready()) {
                line = deleteZhushi(br.readLine());
                if (!line.trim().startsWith("{") && !line.trim().startsWith("@")
                        && !line.endsWith("{") && !line.endsWith(";") && !line.endsWith("}")) {
                    result.append(line.replaceAll("   ", ""));
                    continue;
                }
                result.append(line).append("\n");
            }
            br.close();
            FileIO.writeStringToFile(filePath, result.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void backupDir(String dirPath) {
        File srcDir = new File(dirPath);
        File backFile = new File(dirPath + ".bak");
        try {
            if (backFile.exists()) {
                FileUtils.copyDirectory(backFile, srcDir);
            } else {
                FileUtils.copyDirectory(srcDir, backFile);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void backupFile(String filePath) {
        File srcFile = new File(filePath);
        File backFile = new File(filePath + ".bak");
        try {
            if (backFile.exists()) {
                FileUtils.copyFile(backFile, srcFile);
            } else {
                FileUtils.copyFile(srcFile, backFile);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void backUpFile(String source, String sourceCopy) {
        File sourceFile = new File(source);
        File sourceCopyFile = new File(sourceCopy);
        try {
            FileUtils.copyFile(sourceFile, sourceCopyFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void restoreFile(String source, String sourceCopy) {
        File sourceFile = new File(source);
        File sourceCopyFile = new File(sourceCopy);
        if (sourceCopyFile.exists()) {
            try {
                FileUtils.copyFile(sourceCopyFile, sourceFile);
                //FileUtils.deleteQuietly(sourceCopyFile);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void deleteFile(String file) {
        File deleteFile = new File(file);
        if (deleteFile.exists()) {
            try {
                FileUtils.forceDelete(deleteFile);
                // FileUtils.deleteQuietly(deleteFile);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static String[] getClassPath() {
        String property = System.getProperty("java.class.path", ".");
        //System.out.println(property);

        return property.split(File.pathSeparator);
    }

    /**
     * generate {@code CompilationUnit} from {@code ICompilationUnit}
     */
    public static CompilationUnit genASTFromICU(ICompilationUnit icu) {
        ASTParser astParser = ASTParser.newParser(AST.JLS8);
        Map<String, String> options = JavaCore.getOptions();
        JavaCore.setComplianceOptions(JavaCore.VERSION_1_7, options);
        astParser.setCompilerOptions(options);
        astParser.setSource(icu);
        astParser.setKind(ASTParser.K_COMPILATION_UNIT);
        astParser.setResolveBindings(true);
        return (CompilationUnit) astParser.createAST(null);
    }

    /**
     * generate {@code CompilationUnit} from source code based on the specific type (e.g., {@code
     * ASTParser.K_COMPILATION_UNIT})
     */
    public static CompilationUnit genASTFromSource(String icu, int type) {
        ASTParser astParser = ASTParser.newParser(AST.JLS8);
        Map<String, String> options = JavaCore.getOptions();
        JavaCore.setComplianceOptions(JavaCore.VERSION_1_7, options);
        astParser.setCompilerOptions(options);
        astParser.setSource(icu.toCharArray());
        astParser.setKind(type);
        astParser.setResolveBindings(true);
        CompilationUnit compilationUnit = (CompilationUnit) astParser.createAST(null);

        // process the cast where using enum
        if (compilationUnit.getProblems().length > 0) {
            astParser = ASTParser.newParser(AST.JLS8);
            options = JavaCore.getOptions();
            JavaCore.setComplianceOptions(JavaCore.VERSION_1_4, options);
            astParser.setCompilerOptions(options);
            astParser.setSource(icu.toCharArray());
            astParser.setKind(type);
            astParser.setResolveBindings(true);
            compilationUnit = (CompilationUnit) astParser.createAST(null);
        }
        return compilationUnit;
    }

    public static CompilationUnit genASTFromFile(String fileName) {
        return (CompilationUnit) genASTFromSource(readFileToString(fileName),
                ASTParser.K_COMPILATION_UNIT);
    }

    public static CompilationUnit genASTFromFile(File file) {
        return (CompilationUnit) genASTFromSource(readFileToString(file),
                ASTParser.K_COMPILATION_UNIT);
    }

    public static List<File> getAllFile(File file, List<File> fileList) {
        if (fileList == null) {
            fileList = new LinkedList<>();
        }
        if (Objects.isNull(file) || Objects.isNull(file.listFiles())) {
            return fileList;
        }
        for (File f : file.listFiles()) {
            if (f.isDirectory()) {
                getAllFile(f, fileList);
            } else if (f.isFile()) {
                fileList.add(f);
            }
        }
        return fileList;
    }

    private static String deleteZhushi(String line) {
        int index = line.indexOf("//");
        return index >= 0 ? line.substring(0, index) : line;
    }

    public static void main(String[] args) {
        String path = "/Users/liangjingjing/WorkSpace/Data/Defects4J/projects/Chart/Chart_9_buggy/source/org/jfree/data"
                + "/time/TimeSeries.java";
        // FileIO.normalizeFile(path);
        //System.out.println(FileIO.cleanCommons(FileIO.readFileToString(path)));
        deleteComments(path);
    }

}
