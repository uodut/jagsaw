package callback.situation1;

/**
 * @author gl
 * @create 2018-11-27 16:33
 **/
public class Customer1 {
    public void received(boolean rec) {
        if (rec) System.out.println("customer has been received");
    }

    public boolean confirm() {
        System.out.println("customer confirm and good comment");
        return true;
    }
}
