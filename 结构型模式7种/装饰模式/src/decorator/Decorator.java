package decorator;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 21:04 2017/12/25
 * 装饰者类
 */
public class Decorator implements Sourceable {
    private Sourceable source;

    public Decorator(Sourceable source){
        super();
        this.source = source;
    }
    @Override
    public void method() {
        System.out.println("装饰之前!");
        source.method();
        System.out.println("装饰之后!");
    }
}
