package proxy;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 9:05 2017/12/26
 */
public class Proxy implements Sourceable {
    private  Source source;

    public Proxy() {
        super();
        this.source = new Source();
    }

    @Override
    public void method() {
        before();
        source.method();
        atfer();
    }
    private void atfer() {
        System.out.println("代理后");
    }
    private void before() {
        System.out.println("代理前!");
    }
}
