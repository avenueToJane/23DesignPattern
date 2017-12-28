package bridge;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 14:51 2017/12/27
 */
public class MyBridge extends Bridge {
    public void method(){
        getSource().method();
    }

}
