package purification;


import static org.apache.commons.io.FileUtils.copyFile;
import static util.FileIO.backupFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.Assignment;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.ExpressionStatement;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.PrimitiveType;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;

import config.Constant;
import entity.Subject;
import lombok.extern.slf4j.Slf4j;
import run.Runner;
import util.FileIO;

@Slf4j
public class Purification {

    private Subject _subject = null;
    private List<String> _failedTests = null;
    private final String _failedTestsPath = Constant.HOME + "/d4j-info/failed_tests";

    public Purification(Subject subject) {
        log.info("begin subject {} purification", subject.get_name() + subject.get_id());
        _subject = subject;
        _failedTests = _subject.getFailingTests();
    }

    public List<String> getFailedTest() {
        return _failedTests;
    }

    public void purifyWithoutValidate() {

        Map<String, List<String>> purifiedMap = new HashMap<>();
        HashMap<String, List<String>> testFileMap = new LinkedHashMap<>();
        for (String test : _failedTests) {
            String testFile =
                    _subject.getHome() + _subject.get_tsrc() + "/" + test.split("::")[0].replace(".", "/")
                            + ".java";
            if (testFileMap.containsKey(testFile)) {
                testFileMap.get(testFile).add(test);
            } else {
                List<String> tmpList = new LinkedList<>();
                tmpList.add(test);
                testFileMap.put(testFile, tmpList);
            }
        }
        for (Entry entry : testFileMap.entrySet()) {
            String testFile = (String) entry.getKey();
            List<String> failedTests = (List<String>) entry.getValue();

            for (String test : failedTests) {
                String[] testInfo = test.split("::");
                if (testInfo.length != 2) {
                    log.error("Failed test format error : " + test);
                    continue;
                }
                String failedTestClazz = testInfo[0];
                String failedTestCase = testInfo[1];
                CompilationUnit unit = FileIO.genASTFromFile(testFile);
                FindMethod findMethod = new FindMethod();
                List<String> newTests = findMethod.getMethod(unit, failedTestClazz, failedTestCase);
                if (newTests.size() == 0) {
                    newTests.add(test);
                }
                purifiedMap.put(test, newTests);
                FileIO.writeStringToFile(testFile, unit.toString());
            }
        }
    }

    public List<String> purify(boolean purify) {
        if (!purify) {
            return null;
        }
        Map<String, List<String>> purifiedMap = new HashMap<>();
        Set<String> testFiles = _failedTests.stream()
                .map(test -> _subject.getHome() + _subject.get_tsrc() + "/" + test.split("::")[0]
                        .replace(".", "/") + ".java")
                .collect(Collectors.toCollection(HashSet::new));
        log.info("Back Up test files: {}", testFiles.size());
        for (String testFile : testFiles) {
            backupFile(testFile);
        }
        // todo  group by file name
       /* HashMap<String, List<String>> testFileMap = _failedTests.stream().collect(
                Collectors.groupingBy(failedTest->
                        (_subject.getHome() + _subject.get_tsrc() + "/" + failedTest.split("::")[0].replace(".", "/")
                         + ".java"))).;*/
        HashMap<String, List<String>> testFileMap = new LinkedHashMap<>();
        for (String test : _failedTests) {
            String testFile =
                    _subject.getHome() + _subject.get_tsrc() + "/" + test.split("::")[0].replace(".", "/")
                            + ".java";
            if (testFileMap.containsKey(testFile)) {
                testFileMap.get(testFile).add(test);
            } else {
                List<String> tmpList = new LinkedList<>();
                tmpList.add(test);
                testFileMap.put(testFile, tmpList);
            }
        }
        for (Entry entry : testFileMap.entrySet()) {
            String testFile = (String) entry.getKey();
            List<String> failedTests = (List<String>) entry.getValue();

            for (String test : failedTests) {
                String[] testInfo = test.split("::");
                if (testInfo.length != 2) {
                    log.error("Failed test format error : " + test);
                    continue;
                }
                String failedTestClazz = testInfo[0];
                String failedTestCase = testInfo[1];
                //String testFile = _subject.getHome() + _subject.get_tsrc() + "/" + failedTestClazz.replace(".",
                // "/") + ".java" ;
                CompilationUnit unit = FileIO.genASTFromFile(testFile);
                FindMethod findMethod = new FindMethod();
                List<String> newTests = findMethod.getMethod(unit, failedTestClazz, failedTestCase);
                if (newTests.size() == 0) {
                    newTests.add(test);
                }
                purifiedMap.put(test, newTests);
                FileIO.writeStringToFile(testFile, unit.toString());
            }
            try {
                copyFile(new File(testFile), new File(testFile + Constant.PURIFY));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        change2PurifyVersion();
        return validateEachPurifiedTestCases(purifiedMap);
    }

    private List<String> validateEachPurifiedTestCases(Map<String, List<String>> purifiedMap) {
        log.info("Validate failing tests after purification ... ");
        _subject.deleteBin();
        List<String> failedTests = new LinkedList<>();
        for (Entry<String, List<String>> entry : purifiedMap.entrySet()) {
            boolean containFailed = false;
            for (String t : entry.getValue()) {
                if (!Runner.testSingleTest(_subject, t)) {
                    containFailed = true;
                    failedTests.add(t);
                }
            }
            if (!containFailed) {
                log.error("Test purification failed : NO failed test cases after purification for " + entry
                        .getKey());
            }
        }
        return failedTests;
    }

    public void change2PurifyVersion() {
        log.info("Change to Purify Test Version ...");

        Set<String> testFiles = _failedTests.stream().map(
                test -> _subject.getHome() + _subject.get_tsrc() + "/" + test.split("::")[0]
                        .replace(".", "/") + ".java")
                .collect(Collectors.toCollection(HashSet::new));
        log.info("Back Up test files: {}", testFiles.size());
        for (String testFile : testFiles) {
            backupFile(testFile);
            if (new File(testFile + Constant.PURIFY).exists()) {
                try {
                    copyFile(new File(testFile + Constant.PURIFY), new File(testFile));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                log.error("{} does not have a purification version", testFile);
            }
        }
    }

    public void change2OriginVersion() {
        log.info("Change to Origin Test Version ...");

        Set<String> testFiles = _failedTests.stream().map(
                test -> _subject.getHome() + _subject.get_tsrc() + "/" + test.split("::")[0]
                        .replace(".", "/") + ".java")
                .collect(Collectors.toCollection(HashSet::new));
        log.info("Back Up test files: {}", testFiles.size());
        for (String testFile : testFiles) {
            backupFile(testFile);
        }
    }

    private class FindMethod extends ASTVisitor {

        private List<String> _purifiedTestCases = new LinkedList<>();
        private String _clazz = null;
        private String _methodName = null;

        public List<String> getMethod(CompilationUnit unit, String clazz, String method) {
            _clazz = clazz;
            _methodName = method;
            unit.accept(this);
            return _purifiedTestCases;
        }

        @Override
        public boolean visit(MethodDeclaration node) {
            if (node.getName().getFullyQualifiedName().equals(_methodName)) {
                ASTNode parent = node.getParent();
                while (parent != null) {
                    if (parent instanceof TypeDeclaration) {
                        break;
                    }
                    parent = parent.getParent();
                }
                if (parent == null) {
                    return false;
                }
                TypeDeclaration typeDeclaration = (TypeDeclaration) parent;
                Set<Integer> assertLines = analysis(node);
                if (assertLines.size() <= 1) {
                    _purifiedTestCases.add(_clazz + "::" + _methodName);
                } else {
                    int methodID = 1;
                    for (Integer line : assertLines) {
                        AST ast = AST.newAST(AST.JLS8);
                        MethodDeclaration newMethod = ast.newMethodDeclaration();
                        String newName = _methodName + "_purify_" + methodID;
                        methodID++;
                        newMethod.setName(ast.newSimpleName(newName));
                        newMethod.modifiers().addAll(ASTNode.copySubtrees(ast, node.modifiers()));
                        if (node.thrownExceptionTypes().size() > 0) {
                            newMethod.thrownExceptionTypes()
                                    .addAll(ASTNode.copySubtrees(ast, node.thrownExceptionTypes()));
                        }
                        newMethod.setReturnType2(ast.newPrimitiveType(PrimitiveType.VOID));
                        List<ASTNode> result = new ArrayList<>();
                        for (int i = 0; i < line; i++) {
                            if (assertLines.contains(i)) {
                                continue;
                            }
                            result.add((ASTNode) node.getBody().statements().get(i));
                        }
                        result.add((ASTNode) node.getBody().statements().get(line));
                        // cannot simply remove duplicate assignment since it may cause side-effect
                        //						result = simplify(result);
                        Block body = ast.newBlock();
                        for (ASTNode astNode : result) {
                            body.statements().add(ASTNode.copySubtree(ast, astNode));
                        }
                        newMethod.setBody(body);
                        typeDeclaration.bodyDeclarations().add(ASTNode.copySubtree(node.getAST(), newMethod));
                        _purifiedTestCases.add(_clazz + "::" + newName);
                    }
                    node.getBody().statements().clear();
                }
                return false;
            }
            return true;
        }

        private List<ASTNode> simplify(List<ASTNode> statements) {
            List<ASTNode> simplified = removeDuplicateAssignment(statements);
            return simplified;
        }

        private List<ASTNode> removeDuplicateAssignment(List<ASTNode> nodes) {
            HashSet<String> assigned = new HashSet<>();
            List<ASTNode> result = new ArrayList<>();
            AST ast = AST.newAST(AST.JLS8);
            for (int i = nodes.size() - 1; i >= 0; i--) {
                ASTNode node = nodes.get(i);
                if (node instanceof ExpressionStatement) {
                    ExpressionStatement expressionStatement = (ExpressionStatement) node;
                    if (expressionStatement.getExpression() != null && expressionStatement
                            .getExpression() instanceof Assignment) {
                        Assignment assignment = (Assignment) expressionStatement.getExpression();
                        if (!assigned.contains(assignment.getLeftHandSide().toString())) {
                            result.add(ASTNode.copySubtree(ast, node));
                            assigned.add(assignment.getLeftHandSide().toString());
                        }
                    } else {
                        VariableCollector collector = new VariableCollector();
                        node.accept(collector);
                        List<String> variable = collector.getAllVariables();
                        for (String var : variable) {
                            assigned.remove(var);
                        }
                        result.add(ASTNode.copySubtree(ast, node));
                    }
                } else if (node instanceof VariableDeclarationStatement) {
                    VariableDeclarationStatement vds = (VariableDeclarationStatement) ASTNode
                            .copySubtree(ast, node);
                    for (Object object : vds.fragments()) {
                        if (object instanceof VariableDeclarationFragment) {
                            VariableDeclarationFragment vdf = (VariableDeclarationFragment) object;
                            if (vdf.getInitializer() == null) {
                                continue;
                            } else {
                                if (assigned.contains(vdf.getName().toString())) {
                                    vdf.setInitializer(null);
                                }
                            }
                        }
                    }
                    result.add(vds);
                } else {
                    VariableCollector collector = new VariableCollector();
                    node.accept(collector);
                    List<String> variable = collector.getAllVariables();
                    for (String var : variable) {
                        assigned.remove(var);
                    }
                    result.add(ASTNode.copySubtree(ast, node));
                }
            }
            Collections.reverse(result);
            return result;
        }

        private Set<Integer> analysis(MethodDeclaration node) {
            Block block = node.getBody();
            Set<Integer> assertLine = new HashSet<>();
            for (int i = 0; i < block.statements().size(); i++) {
                AssertFinder assertFinder = new AssertFinder();
                ((ASTNode) block.statements().get(i)).accept(assertFinder);
                if (assertFinder.isAssert()) {
                    assertLine.add(i);
                }
            }
            return assertLine;
        }
    }


    private class AssertFinder extends ASTVisitor {

        private boolean _containAssert = false;

        public boolean isAssert() {
            return _containAssert;
        }

        @Override
        public boolean visit(MethodInvocation node) {
            String methodName = node.getName().getFullyQualifiedName();
            if (methodName.startsWith("assert") || methodName.equals("fail")) {
                _containAssert = true;
                return false;
            }
            return true;
        }
    }

    private class VariableCollector extends ASTVisitor {

        private List<String> variable = new LinkedList<>();

        public List<String> getAllVariables() {
            return variable;
        }

        @Override
        public boolean visit(SimpleName node) {
            String name = node.getIdentifier();
            if (name.equals("this") || node.getParent().toString().contains(name + "(")) {
                return true;
            }
            if (Character.isUpperCase(name.charAt(0))) {
                return true;
            }
            variable.add(name);
            return true;
        }
    }

    public static void main(String[] args) throws IOException {
        String name = "Lang";
        int id = 11;
        for (int i = 0; i < args.length; i++) {
            name = args[0];
            id = Integer.parseInt(args[1]);
        }
        Subject subject = new Subject(name, id);
        Purification purification = new Purification(subject);
        boolean purify = true;
        purification.purifyWithoutValidate();
       /* List<String> purifiedFailedTestCases = purification.purify(purify);
        if(purifiedFailedTestCases == null || purifiedFailedTestCases.size() == 0){
            purifiedFailedTestCases = purification.getFailedTest();
        }
        log.info("Failing Test: " );
        String purifyFile = Constant.PROJ_INFO + "/purify_tests/" + subject.get_name() + "/" + subject.get_id();
        String purifyTests = purifiedFailedTestCases.stream().collect(Collectors.joining("\n"));
        FileIO.writeStringToFile(purifyFile, purifyTests);
        for(String testcases: purifiedFailedTestCases){
            log.info(testcases);
        }*/
    }
}
