package pattern.visitor;

/**
 * @author gl
 * @create 2018-10-10 14:18
 **/
public class NodeB extends Node{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationB(){
        return "NodeB";
    }
}
