package ChainOfResponsibility;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 10:24 2017/12/28
 */
public abstract class AbstractHandler {
    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
