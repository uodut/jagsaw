package pattern.visitor;

/**
 * @author gl
 * @create 2018-10-10 14:21
 **/
public class Client {
    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();
        os.add(new Node(){

            @Override
            public void accept(Visitor visitor) {

            }
        });
        os.add(new NodeB());
        Visitor visitor = new VisitorA();
        os.action(visitor);
    }
}
