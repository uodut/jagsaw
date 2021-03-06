package pattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gl
 * @create 2018-10-10 14:19
 **/
public class ObjectStructure {
    private List<Node> nodes = new ArrayList<Node>();

    public void action(Visitor visitor) {
        for (Node node : nodes) {
            node.accept(visitor);
        }
    }

    public void add(Node node) {
        nodes.add(node);
    }
}
