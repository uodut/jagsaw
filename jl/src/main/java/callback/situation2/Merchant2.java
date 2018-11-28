package callback.situation2;

import callback.Callback;

/**
 * @author gl
 * @create 2018-11-27 16:57
 **/
public class Merchant2 implements Callback {

    private ICustomer c;

    public Merchant2(ICustomer c) {
        this.c = c;
    }

    public void sendGoods() throws InterruptedException {
        System.out.println("merchant start to send goods");
        Thread.sleep(2000);
        c.received(true);
        Thread.sleep(200);
        c.confirm(this);
    }

    public void sendReward() {
        System.out.println("merchant start to send reward");
    }

    @Override
    public void callback() {
        sendReward();
    }
}
