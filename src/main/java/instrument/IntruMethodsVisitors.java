package instrument;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.AssertStatement;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.BreakStatement;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.ConstructorInvocation;
import org.eclipse.jdt.core.dom.ContinueStatement;
import org.eclipse.jdt.core.dom.DoStatement;
import org.eclipse.jdt.core.dom.EnhancedForStatement;
import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.ExpressionStatement;
import org.eclipse.jdt.core.dom.ForStatement;
import org.eclipse.jdt.core.dom.IfStatement;
import org.eclipse.jdt.core.dom.LabeledStatement;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.ReturnStatement;
import org.eclipse.jdt.core.dom.Statement;
import org.eclipse.jdt.core.dom.SuperConstructorInvocation;
import org.eclipse.jdt.core.dom.SwitchStatement;
import org.eclipse.jdt.core.dom.SynchronizedStatement;
import org.eclipse.jdt.core.dom.ThrowStatement;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;
import org.eclipse.jdt.core.dom.WhileStatement;


import instrument.gen.GenStatement;
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
public class IntruMethodsVisitors extends TraversalVisitor{

    private String _clazzName = "";
    private String _clazzFileName = "";
    private CompilationUnit _cu;

    private Integer fixedMethodStartLine;
    private String writeFile = "";

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


        int lineStartNumber = _cu.getLineNumber(node.getStartPosition());
        int lineEndNumber = _cu
                .getLineNumber(node.getStartPosition() + node.getLength());

        if(! (lineStartNumber <= fixedMethodStartLine && lineEndNumber >= fixedMethodStartLine)){
            return false;
        }

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

            for (; i < methodBody.statements().size(); i++) {
                ASTNode astNode = (ASTNode) methodBody.statements().get(i);
                if (astNode instanceof Statement) {
                    blockStatement
                            .addAll(processMethodBody((Statement) astNode, node.getReturnType2()));
                } else {
                    blockStatement.add(ASTNode.copySubtree(ast, astNode));
                }
            }
            methodBody.statements().clear();
            for (ASTNode statement : blockStatement) {
                methodBody.statements().add(ASTNode.copySubtree(methodBody.getAST(), statement));
            }
        }
        return true;
    }

    public List<Statement> processMethodBody(Statement statement, Type reType) {
        String message = _clazzFileName;
        List<Statement> result = new ArrayList<>();
        int lineNumber = _cu.getLineNumber(statement.getStartPosition());
        if (statement instanceof IfStatement) {
            IfStatement ifStatement = (IfStatement) statement;

            Statement insert = GenStatement.genDumpLine(writeFile, message, lineNumber);
            result.add(insert);

            Statement thenBody = ifStatement.getThenStatement();
            if (thenBody != null) {
                AST ast = AST.newAST(AST.JLS8);
                Block thenBlock = ast.newBlock();
                if (thenBody instanceof Block) {
                    //thenBlock = (Block) thenBody;
                    for (Object s : ((Block) thenBody).statements()) {
                        if (s instanceof Statement) {
                            thenBlock.statements().add(ASTNode.copySubtree(thenBlock.getAST(), (Statement) s));
                        } else {
                            log.error("{} has other type", s.toString());
                        }
                    }
                } else {
                    thenBlock.statements().add(ASTNode.copySubtree(thenBlock.getAST(), thenBody));
                }

                Block newThenBlock = processBlock(thenBlock, null, reType);
                ifStatement
                        .setThenStatement((Statement) ASTNode.copySubtree(ifStatement.getAST(), newThenBlock));
            }
            Statement elseBody = ifStatement.getElseStatement();
            if (elseBody != null) {
                Block elseBlock = null;
                if (elseBody instanceof Block) {
                    elseBlock = (Block) elseBody;
                } else {
                    AST ast = AST.newAST(AST.JLS8);
                    elseBlock = ast.newBlock();
                    elseBlock.statements().add(ASTNode.copySubtree(elseBlock.getAST(), elseBody));
                }
                Block newElseBlock = processBlock(elseBlock,null, reType);
                ifStatement
                        .setElseStatement((Statement) ASTNode.copySubtree(ifStatement.getAST(), newElseBlock));
            }
            result.add(ifStatement);
        } else if (statement instanceof WhileStatement) {

            WhileStatement whileStatement = (WhileStatement) statement;
            Statement whilebody = whileStatement.getBody();
            if (whilebody != null) {
                Block whileBlock = null;
                if (whilebody instanceof Block) {
                    whileBlock = (Block) whilebody;
                } else {
                    AST ast = AST.newAST(AST.JLS8);
                    whileBlock = ast.newBlock();
                    whileBlock.statements().add(ASTNode.copySubtree(whileBlock.getAST(), whilebody));
                }
                Statement insert = GenStatement.genDumpLine(writeFile, message, lineNumber);

                Block newWhileBlock = processBlock(whileBlock,insert, reType);
                whileStatement
                        .setBody((Statement) ASTNode.copySubtree(whileStatement.getAST(), newWhileBlock));
            }

            result.add(whileStatement);
        } else if (statement instanceof ForStatement) {

            ForStatement forStatement = (ForStatement) statement;
            Statement forBody = forStatement.getBody();
            if (forBody != null) {
                Block forBlock = null;
                if (forBody instanceof Block) {
                    forBlock = (Block) forBody;
                } else {
                    AST ast = AST.newAST(AST.JLS8);
                    forBlock = ast.newBlock();
                    forBlock.statements().add(ASTNode.copySubtree(forBlock.getAST(), forBody));
                }
                Statement insert = GenStatement.genDumpLine(writeFile, message, lineNumber);
                Block newForBlock = processBlock(forBlock, insert, reType);
                forStatement.setBody((Statement) ASTNode.copySubtree(forStatement.getAST(), newForBlock));
            }

            result.add(forStatement);
        } else if (statement instanceof DoStatement) {

            DoStatement doStatement = (DoStatement) statement;
            Statement doBody = doStatement.getBody();
            if (doBody != null) {
                Block doBlock = null;
                if (doBody instanceof Block) {
                    doBlock = (Block) doBody;
                } else {
                    AST ast = AST.newAST(AST.JLS8);
                    doBlock = ast.newBlock();
                    doBlock.statements().add(ASTNode.copySubtree(doBlock.getAST(), doBody));
                }
                Statement insert = GenStatement.genDumpLine(writeFile, message, lineNumber);
                Block newDoBlock = processBlock(doBlock,insert, reType);
                doStatement.setBody((Statement) ASTNode.copySubtree(doStatement.getAST(), newDoBlock));
            }

            result.add(doStatement);
        } else if (statement instanceof Block) {
            Block block = (Block) statement;
            Block newBlock = processBlock(block, null, reType);
            result.add(newBlock);
        } else if (statement instanceof EnhancedForStatement) {

            EnhancedForStatement enhancedForStatement = (EnhancedForStatement) statement;
            Statement enhancedBody = enhancedForStatement.getBody();
            if (enhancedBody != null) {
                Block enhancedBlock = null;
                if (enhancedBody instanceof Block) {
                    enhancedBlock = (Block) enhancedBody;
                } else {
                    AST ast = AST.newAST(AST.JLS8);
                    enhancedBlock = ast.newBlock();
                    enhancedBlock.statements().add(ASTNode.copySubtree(enhancedBlock.getAST(), enhancedBody));
                }
                Statement insert = GenStatement.genDumpLine(writeFile, message, lineNumber);
                Block newEnhancedBlock = processBlock(enhancedBlock, insert, reType);
                enhancedForStatement
                        .setBody(
                                (Statement) ASTNode.copySubtree(enhancedForStatement.getAST(), newEnhancedBlock));
            }

            result.add(enhancedForStatement);
        } else if (statement instanceof SwitchStatement) {

            SwitchStatement switchStatement = (SwitchStatement) statement;
            List<ASTNode> statements = new ArrayList<>();
            AST ast = AST.newAST(AST.JLS8);
            for (Object object : switchStatement.statements()) {
                ASTNode astNode = (ASTNode) object;
                statements.add(ASTNode.copySubtree(ast, astNode));
            }

            switchStatement.statements().clear();

            for (ASTNode astNode : statements) {
                if (astNode instanceof Statement) {
                    Statement s = (Statement) astNode;
                    for (Statement statement2 : processMethodBody(s, reType)) {
                        switchStatement.statements()
                                .add(ASTNode.copySubtree(switchStatement.getAST(), statement2));
                    }
                } else {
                    switchStatement.statements().add(ASTNode.copySubtree(switchStatement.getAST(), astNode));
                }
            }
            Statement insert = GenStatement.genDumpLine(writeFile, message, lineNumber);
            result.add(insert);
            result.add(switchStatement);
        } else if (statement instanceof TryStatement) {

            TryStatement tryStatement = (TryStatement) statement;

            Block tryBlock = tryStatement.getBody();
            if (tryBlock != null) {
                Block newTryBlock = processBlock(tryBlock, null, reType);
                tryStatement.setBody((Block) ASTNode.copySubtree(tryStatement.getAST(), newTryBlock));
            }

            List catchList = tryStatement.catchClauses();
            if (catchList != null) {
                for (Object object : catchList) {
                    if (object instanceof CatchClause) {
                        CatchClause catchClause = (CatchClause) object;
                        Block catchBlock = catchClause.getBody();
                        Block newCatchBlock =
                                processBlock(catchBlock, null, reType);
                        catchClause.setBody((Block) ASTNode.copySubtree(catchClause.getAST(), newCatchBlock));
                    }
                }
            }
            Block finallyBlock = tryStatement.getFinally();
            if (finallyBlock != null) {
                Block newFinallyBlock = processBlock(finallyBlock, null, reType);
                tryStatement
                        .setFinally((Block) ASTNode.copySubtree(tryStatement.getAST(), newFinallyBlock));
            }

            result.add(tryStatement);
        } else {

            Statement copy = (Statement) ASTNode.copySubtree(AST.newAST(AST.JLS8), statement);
            Statement insert = GenStatement.genDumpLine(writeFile, message, lineNumber);
            if (statement instanceof ConstructorInvocation) {
                result.add(copy);
                result.add(insert);
            } else if (statement instanceof ContinueStatement || statement instanceof BreakStatement
                    || statement instanceof ReturnStatement || statement instanceof ThrowStatement
                    || statement instanceof AssertStatement || statement instanceof ExpressionStatement
                    || statement instanceof VariableDeclarationStatement) {
                result.add(insert);
                result.add(copy);

            } else if (statement instanceof LabeledStatement) {
                result.add(copy);
            } else if (statement instanceof SynchronizedStatement) {
                result.add(copy);
            } else {
                result.add(copy);
            }
        }

        return result;
    }

    private Block processBlock(Block block, Statement insert, Type reType) {
        Block newBlock = AST.newAST(AST.JLS8).newBlock();
        if (block == null) {
            return newBlock;
        }
        if (insert != null) {
            newBlock.statements().add(ASTNode.copySubtree(newBlock.getAST(), insert));
        }
        for (Object object : block.statements()) {
            if (object instanceof Statement) {
                Statement statement = (Statement) object;
                List<Statement> newStatements = processMethodBody(statement, reType);
                for (Statement newStatement : newStatements) {
                    newBlock.statements().add(ASTNode.copySubtree(newBlock.getAST(), newStatement));
                }
            } else {
                log.error("{} has other type", object.toString());
            }
        }
        return newBlock;
    }

    public static void main(String[] args) {
        String writeFile = "tmpWriteFile";
        String filePath = "/Users/liangjingjing/WorkSpace/Data/Defects4J/projects_buggy/Chart/Chart15/source/org/jfree/chart/JFreeChart.java";
        IntruMethodsVisitors visitor  = new IntruMethodsVisitors();
        visitor.setWriteFile(writeFile);
        visitor.setFixedMethodStartLine(1216);
        CompilationUnit compilationUnit = FileIO.genASTFromSource(FileIO.readFileToString(filePath),
                ASTParser.K_COMPILATION_UNIT);
        compilationUnit.accept(visitor);
        System.out.println(compilationUnit.toString());
    }

}
