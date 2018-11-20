package pattern.visitor;

/**
 * @author gl
 * @create 2018-10-10 14:23
 **/
public class VisitorB implements Visitor {
    @Override
    public void visit(NodeA node) {
        System.out.println(node.operationA());
    }

    @Override
    public void visit(NodeB node) {
        System.out.println(node.operationB());
    }
}
