package callback.situation1;

/**
 * @author gl
 * @create 2018-11-27 16:29
 **/
public class Merchant1 {
    public void sendGoods() {
        System.out.println("merchant start to send goods");
    }

    public void sendReward(boolean confirm) {
        if (confirm) System.out.println("merchant start to send reward");
    }
}
