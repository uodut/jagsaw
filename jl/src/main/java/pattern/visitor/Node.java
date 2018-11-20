package pattern.visitor;

/**
 * @author gl
 * @create 2018-10-10 14:16
 **/
public abstract class Node {
    public abstract void accept(Visitor visitor);
}
