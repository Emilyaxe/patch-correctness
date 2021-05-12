package instrument;


import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ClassInstanceCreation;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.TypeDeclaration;

import config.Constant;
import entity.Subject;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import util.FileIO;

/*
收集测试文件内，测试用例列表
 */
@Slf4j
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TestFileVisitor extends TraversalVisitor {
    private String _clazzName = "";
    private String _clazzFileName = "";

    private Set<String> testsSet = new LinkedHashSet<>();

    @Override
    public boolean visit(CompilationUnit node) {

        _clazzName = node.getPackage().getName().getFullyQualifiedName();
        if (_clazzName.equals("auxiliary")) {
            return false;
        }
        for (Object object : node.types()) {
            if (object instanceof TypeDeclaration) {
                TypeDeclaration type = (TypeDeclaration) object;
                if (Modifier.isPublic(type.getModifiers())) {
                    _clazzName += "." + type.getName().getFullyQualifiedName();
                    _clazzFileName = _clazzName;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean visit(TypeDeclaration node) {
        if (!Modifier.isPublic(node.getModifiers())) {
            if (_clazzFileName.equals("")) {
                _clazzFileName = _clazzName;
                _clazzName = _clazzFileName + "." + node.getName().getFullyQualifiedName();
            } else {
                _clazzName = _clazzFileName + "$" + node.getName().getFullyQualifiedName();
            }
        }

        return true;
    }

    @Override
    public boolean visit(MethodDeclaration node) {
        ASTNode parent = node.getParent();
        while (parent != null && !(parent instanceof TypeDeclaration)) {
            if (parent instanceof ClassInstanceCreation) {
                return true;
            }
            parent = parent.getParent();
        }
        String name = node.getName().getFullyQualifiedName();
        if ((name.equals("setUp") || name.equals("countTestCases") || name.equals("createResult") || name.equals("run")
                || name.equals("runBare") || name.equals("runTest") || name.equals("tearDown")
                || name.equals("toString") || name.equals("getName") || name.equals("setName") || name
                .equals("suite"))) {
            return true;
        }
        if (_clazzName.contains("$")) {
            if (_clazzName.split("\\$")[_clazzName.split("\\$").length - 1].equals(name)) {
                return true;
            }
        }
        if (_clazzName.split("\\.")[_clazzName.split("\\.").length - 1].equals(name)) {
            return true;
        }
        if (Objects.isNull(node.getBody())) {
            return true;
        }
        if (node.modifiers().stream().noneMatch(current -> current.toString().equals("public"))) {
            return true;
        }
        if (node.getBody().statements().size() > 0) {
            testsSet.add(_clazzName + "::" + name);
        }

        return true;
    }

    public static void main(String[] args) {
        String name = "Closure";
        int id = 63;
        int begin = 0, end = 0;
        for (int i = 0; i < args.length; i++) {
            name = args[0];
            begin = Integer.parseInt(args[1]);
            end = Integer.parseInt(args[2]);
        }
        for (id = begin; id <= end; id++) {
            Subject subject = new Subject(name, id);
            log.info("begin obtain subject {} test info", subject.get_name() + subject.get_id());
            // CombineVersions.change2PurTest(subject);
            Set<String> testFiles = subject.getFailingTests().stream().map(test -> test.split("::")[0])
                    .map(test -> subject.getHome() + subject.get_tsrc() + "/" + test.replaceAll("\\.", "\\/") + ".java")
                    .collect(Collectors.toSet());
            Set<String> allTests = new LinkedHashSet<>();
            for (String testFile : testFiles) {
                TestFileVisitor testFileVisitor = new TestFileVisitor();
                CompilationUnit compilationUnit = FileIO.genASTFromSource(FileIO.readFileToString(testFile),
                        ASTParser.K_COMPILATION_UNIT);
                compilationUnit.accept(testFileVisitor);
                allTests.addAll(testFileVisitor.getTestsSet());
            }
            FileIO.writeStringToFile(Constant.PROJ_INFO + "/all_tests/" + name + "/" + id,
                    StringUtils.join(allTests, "\n"));
        }

        //log.info(String.valueOf(allTests.size()));
    }

}
