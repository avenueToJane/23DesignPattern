/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 20:27 2017/12/25
 * 测试类
 * 这样Targetable接口的实现类就具有了Source类的功能。
 */
public class AdapterTest {
    public static void main(String[] args) {
        Targetable targetable=new Adapter();
        targetable.method1();
        targetable.method2();
    }
}
