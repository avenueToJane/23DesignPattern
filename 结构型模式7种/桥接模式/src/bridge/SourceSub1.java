package bridge;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 14:49 2017/12/27
 */
public class SourceSub1 implements Sourceable {
    @Override
    public void method() {
        System.out.println("这是第一个实现类的方法");
    }
}
