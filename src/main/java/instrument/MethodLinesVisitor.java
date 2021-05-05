package instrument;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.ClassInstanceCreation;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;

import config.Constant;
import entity.Method;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import util.FileIO;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class MethodLinesVisitor extends TraversalVisitor {
    private String _clazzName = "";
    private String _clazzFileName = "";
    private CompilationUnit _cu;
    private List<Method> methodList = new LinkedList<>();

    @Override
    public boolean visit(CompilationUnit node) {
        if (node.getPackage().getName() != null
                && node.getPackage().getName().getFullyQualifiedName().equals("auxiliary")) {
            return false;
        }
        _cu = node;
        _clazzName = node.getPackage().getName().getFullyQualifiedName();
        for (Object object : node.types()) {
            if (object instanceof TypeDeclaration) {
                TypeDeclaration type = (TypeDeclaration) object;
                if (Modifier.isPublic(type.getModifiers())) {
                    _clazzName += "." + type.getName().getFullyQualifiedName();
                    _clazzFileName = _clazzName;
                }
            } else if (object instanceof EnumDeclaration)  {
                EnumDeclaration type = (EnumDeclaration) object;
                if (Modifier.isPublic(type.getModifiers())) {
                    _clazzName += "." + type.getName().getFullyQualifiedName();
                    _clazzFileName = _clazzName;
                }
            }
//            else {
//                return  false;
//            }
        }
        return true;
    }

    @Override
    public boolean visit(TypeDeclaration node) {
        if (!Modifier.isPublic(node.getModifiers())) {
            if (_clazzFileName == "") {
                _clazzFileName = _clazzName;
                _clazzName = _clazzFileName + "." + node.getName().getFullyQualifiedName();
            } else {
                _clazzName = _clazzFileName + "$" + node.getName().getFullyQualifiedName();
            }
        }
        return true;
    }

    @Override
    public boolean visit(EnumDeclaration node) {
        if (!Modifier.isPublic(node.getModifiers())) {
            if (_clazzFileName == "") {
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

        Method method = getMethod(node);
        // this method belongs to anonymous classes and is filtered out.
        if (method == null) {
            return true;
        }
        methodList.add(method);
        return true;
    }

    public Method getMethod(MethodDeclaration node) {

        // filter those methods that defined in anonymous classes
//        ASTNode parent = node.getParent();
//        while (parent != null && !(parent instanceof TypeDeclaration)) {
//            if (parent instanceof ClassInstanceCreation) {
//                return null;
//            }
//            parent = parent.getParent();
//        }

        Method method = null;
        if (node.getBody() != null) {
            int lineStartNumber = _cu.getLineNumber(node.getStartPosition());
            int lineEndNumber = _cu
                    .getLineNumber(node.getStartPosition()   + node.getLength() );

            method = new Method( lineStartNumber, lineEndNumber);
        }
        return method;
    }

    public static void main(String[] args) {
        MethodLinesVisitor methodVisitor = new MethodLinesVisitor();
        String filePath =
                "/Users/liangjingjing/WorkSpace/Data/Defects4J/projects/Chart/Chart_1_buggy/source/org/jfree/chart"
                        + "/renderer/category/AbstractCategoryItemRenderer.java";
        CompilationUnit compilationUnit = FileIO.genASTFromSource(FileIO.readFileToString(filePath),
                ASTParser.K_COMPILATION_UNIT);
        compilationUnit.accept(methodVisitor);
        //Set<Method> methods = methodVisitor.getMethodSet();
        //System.out.println(methods);
    }
}
