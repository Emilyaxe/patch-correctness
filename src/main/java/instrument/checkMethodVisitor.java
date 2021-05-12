package instrument;

import org.eclipse.jdt.core.dom.MethodDeclaration;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class checkMethodVisitor extends TraversalVisitor {
    @Override
    public boolean visit(MethodDeclaration node) {
        log.info(node.getName().toString());
        return true;
    }
}
