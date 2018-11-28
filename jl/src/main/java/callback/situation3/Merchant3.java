package callback.situation3;

import callback.Callback;
import callback.situation3.ICustomer;

import java.util.concurrent.ExecutorService;

/**
 * @author gl
 * @create 2018-11-27 16:57
 **/
public class Merchant3 implements Callback {


    public Merchant3() {

    }

    public void sendGoods(ExecutorService es) throws InterruptedException {
        System.out.println("merchant start to send goods");
        es.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    ICustomer c = new Customer3(Merchant3.this);
                    Thread.sleep(2000);
                    c.received(true);
                    Thread.sleep(200);
                    c.confirm();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        System.out.println("merchant do others");
    }

    public void sendReward() {
        System.out.println("merchant start to send reward");
    }

    @Override
    public void callback() {
        sendReward();
    }
}
