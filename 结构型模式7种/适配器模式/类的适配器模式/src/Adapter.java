/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 20:25 2017/12/25
 * Adapter类继承Source类，实现Targetable接口
 */
public class Adapter extends Source implements Targetable {

    @Override
    public void method2() {
        System.out.println("这是Targetable中的方法");
    }
}
