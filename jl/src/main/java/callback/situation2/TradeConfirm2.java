package callback.situation2;

/**
 * @author gl
 * @create 2018-11-27 17:38
 **/
public class TradeConfirm2 {
    public static void main(String[] args) throws InterruptedException {
        ICustomer c = new Customer2();
        Merchant2 m2 = new Merchant2(c);
        m2.sendGoods();
    }
}
