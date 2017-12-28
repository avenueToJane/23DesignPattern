package proxy;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 9:02 2017/12/26
 * 定义一个被代理的类
 */
public class Source implements Sourceable {
    @Override
    public void method() {

            System.out.println("这是一个起初的方法");
    }
}
