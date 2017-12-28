/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 20:49 2017/12/25
 * 测试类
 */
public class WrapperTest {
    public static void main(String[] args) {
        Sourceable sourceable1=new SourceSub1();
        Sourceable sourceable2=new SourceSub2();
        sourceable1.method1();
        sourceable1.method2();
        System.out.println("========================");
        sourceable2.method1();
        sourceable2.method2();
        /**
         * 输出结果：
         * the SourceSub1类继承Wrapper2类只需要方法1!
            ========================
            the SourceSub2类继承Wrapper2类只需要方法2!
         */
    }
}
