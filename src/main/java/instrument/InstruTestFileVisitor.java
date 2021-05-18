package instrument;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.ClassInstanceCreation;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.ConstructorInvocation;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.Statement;
import org.eclipse.jdt.core.dom.SuperConstructorInvocation;
import org.eclipse.jdt.core.dom.TypeDeclaration;

import instrument.gen.GenStatement;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import util.FileIO;

@Slf4j
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InstruTestFileVisitor extends TraversalVisitor {

    private String _clazzName = "";
    private String _clazzFileName = "";
    private CompilationUnit _cu;
    private String writeFile = "";

    //private List<String> passingList;

    @Override
    public boolean visit(CompilationUnit node) {
        _cu = node;
        _clazzName = node.getPackage().getName().getFullyQualifiedName();
        if (_clazzName.equals("auxiliary")) {
            return false;
        }
        for (Object object : node.types()) {
            if (object instanceof TypeDeclaration) {
                TypeDeclaration type = (TypeDeclaration) object;
                if (!Modifier.isPublic(type.getModifiers())) {
                    return false;
                }
                if (!type.getName().getFullyQualifiedName().startsWith("Test") && !type.getName()
                        .getFullyQualifiedName().endsWith("Test")) {
                    return false;
                }
                _clazzName += "." + type.getName().getFullyQualifiedName();
                _clazzFileName = _clazzName;
            }
        }
        return true;
    }

    @Override
    public boolean visit(TypeDeclaration node) {
        if (Modifier.isPublic(node.getModifiers())) {
            String[] className = _clazzName.split("\\.");
            if (node.getName().getFullyQualifiedName().equals(className[className.length - 1])) {
                return true;
            }
            if (_clazzFileName.equals("")) {
                _clazzFileName = _clazzName;
                _clazzName = _clazzFileName + "." + node.getName().getFullyQualifiedName();
            } else {
                _clazzName = _clazzFileName + "$" + node.getName().getFullyQualifiedName();
            }
        } else {
            return false;
        }
        return true;
    }

    @Override
    public boolean visit(MethodDeclaration node) {
        if (!Modifier.isPublic(node.getModifiers())) {
            return true;
        }
        ASTNode parent = node.getParent();
        while (parent != null && !(parent instanceof TypeDeclaration)) {
            if (parent instanceof ClassInstanceCreation) {
                return true;
            }
            parent = parent.getParent();
        }
        String name = node.getName().getFullyQualifiedName();
        //        if ((name.equals("setUp") || name.equals("countTestCases") || name.equals("createResult") || name
        //        .equals("run")
        //                || name.equals("runBare") || name.equals("runTest") || name.equals("tearDown")
        //                || name.equals("toString") || name.equals("getName") || name.equals("setName") || name
        //                .equals("suite"))) {
        //            return true;
        //        }
        if (!name.startsWith("test")) {
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
        //        if (node.modifiers().stream().noneMatch(current -> current.toString().equals("public"))) {
        //            return true;
        //        }

        if (node.getBody() != null) {
            Block methodBody = node.getBody();
            List<ASTNode> blockStatement = new ArrayList<>();

            AST ast = AST.newAST(AST.JLS8);
            int i = 0;
            if (methodBody.statements().size() > 0) {
                ASTNode astNode = (ASTNode) methodBody.statements().get(0);
                if (astNode instanceof ConstructorInvocation
                        || astNode instanceof SuperConstructorInvocation) {
                    i = 1;
                    blockStatement.add(astNode);
                }
            }
            String message = "\n" + _clazzName + "::" + name;
  
            Integer lineNumber = _cu.getLineNumber(node.getStartPosition());
            Statement insert = GenStatement.genDumpLine(writeFile, message, lineNumber);
            blockStatement.add(insert);


            for (; i < methodBody.statements().size(); i++) {
                ASTNode astNode = (ASTNode) methodBody.statements().get(i);
                blockStatement.add(ASTNode.copySubtree(ast, astNode));
            }
            methodBody.statements().clear();
            for (ASTNode statement : blockStatement) {
                methodBody.statements().add(ASTNode.copySubtree(methodBody.getAST(), statement));
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String file =
                "/Users/liangjingjing/WorkSpace/Data/Defects4J/projects_buggy/Lang/Lang6/src/test/java/org/apache"
                        + "/commons/lang3/EnumUtilsTest.java";
        InstruTestFileVisitor instruTestFileVisitor = new InstruTestFileVisitor();
        CompilationUnit compilationUnit = FileIO.genASTFromFile(file);
        compilationUnit.accept(instruTestFileVisitor);
        FileIO.writeStringToFile(file, compilationUnit.toString());
    }
}
