package pattern.visitor;

/**
 * Created by wanggaoliang on 2018/10/10.
 */
public interface Visitor {
    void visit(NodeA node);
    void visit(NodeB node);
}
