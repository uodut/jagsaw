package callback.situation2;

import callback.Callback;

/**
 * @author gl
 * @create 2018-11-27 16:51
 **/
public class Customer2 implements ICustomer {
    @Override
    public void confirm(Callback cb) {
        System.out.println("customer confirm and good comment");
        cb.callback();
        System.out.println("this is last step");
    }

    @Override
    public void received(boolean rec) {
        if (rec) System.out.println("customer has been received");
    }
}
