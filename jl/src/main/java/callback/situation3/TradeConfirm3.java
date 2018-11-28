package callback.situation3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author gl
 * @create 2018-11-27 17:38
 **/
public class TradeConfirm3 {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService es = Executors.newFixedThreadPool(2);
        Merchant3 m3 = new Merchant3();
        m3.sendGoods(es);
        es.shutdown();
    }
}
