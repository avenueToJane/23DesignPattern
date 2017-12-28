/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 20:25 2017/12/25
 * Adapter类继承Source类，实现Targetable接口
 */
public class Adapter implements Targetable {

    private Source source;

    public Adapter(Source source){
        super();
        this.source = source;
    }
    @Override
    public void method2() {
        System.out.println("这是targetable中的方法!");
    }

    @Override
    public void method1() {
        source.method1();
    }
}
