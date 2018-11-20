package pattern.visitor;

/**
 * @author gl
 * @create 2018-10-10 14:16
 **/
public class NodeA extends Node {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationA() {
        return "NodeA";
    }
}
