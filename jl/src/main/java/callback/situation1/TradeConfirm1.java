package callback.situation1;

/**
 * @author gl
 * @create 2018-11-27 16:24
 **/
public class TradeConfirm1 {
    public static void main(String[] args) throws Exception {
        Merchant1 m1 = new Merchant1();
        Customer1 c1 = new Customer1();
        m1.sendGoods();
        Thread.sleep(2000);//mock the time of transport costs
        c1.received(true);
        boolean confirm = c1.confirm();
        Thread.sleep(200);//mock the time of customer costs
        m1.sendReward(confirm);
    }


}
