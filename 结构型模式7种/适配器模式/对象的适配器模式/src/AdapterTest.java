/**
     * @Author: westlife
     * @Description:
     * @Date: Created in 20:27 2017/12/25
     * 测试类
     * 这样Targetable接口的实现类就具有了Source类的功能。
     * 输出与第一种一样，只是适配的方法不同而已。
     */
    public class AdapterTest {
        public static void main(String[] args) {
            Source source = new Source();
            Targetable target = new Adapter(source);
            target.method1();
            target.method2();
        }
}
