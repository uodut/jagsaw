package callback.situation2;

import callback.Callback;

/**
 * @author gl
 * @create 2018-11-27 16:51
 **/
public interface ICustomer {
    void confirm(Callback cb);
    void received(boolean rec);
}
