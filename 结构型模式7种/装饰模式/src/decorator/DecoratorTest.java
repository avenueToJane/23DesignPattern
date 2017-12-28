package decorator;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 21:06 2017/12/25
 * 测试类
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Sourceable source = new Source();
        Sourceable obj = new Decorator(source);
        obj.method();
        /**
         * 输出结果：
         * 装饰之前!
           这是被装饰者实现接口的方法
           装饰之后!
         */
    }
}
