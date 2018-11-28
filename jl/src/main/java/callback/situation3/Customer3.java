package callback.situation3;

import callback.Callback;

/**
 * @author gl
 * @create 2018-11-27 16:51
 **/
public class Customer3 implements ICustomer {

    private Callback callback;

    public Customer3(Callback cb) {
        callback = cb;
    }

    @Override
    public void confirm() {
        System.out.println("customer confirm and good comment");
        callback.callback();
        System.out.println("this is last step");
    }

    @Override
    public void received(boolean rec) {
        if (rec) System.out.println("customer has been received");
    }
}
