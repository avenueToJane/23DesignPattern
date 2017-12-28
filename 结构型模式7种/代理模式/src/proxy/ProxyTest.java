package proxy;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 9:08 2017/12/26
 * 测试类
 */
public class ProxyTest {
    public static void main(String[] args) {
        Sourceable source=new Proxy();
        source.method();
    }
}
