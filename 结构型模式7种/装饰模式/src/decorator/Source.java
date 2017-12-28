package decorator;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 21:03 2017/12/25
 * 被装饰者类
 */
public class Source implements Sourceable{
    @Override
    public void method() {
        System.out.println("这是被装饰者实现接口的方法");
    }
}
