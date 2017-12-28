package observer;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 16:50 2017/12/27
 */
public class Observer1 implements Observer {
    @Override
    public void update() {
        System.out.println("观察者1接收到信息");
    }
}
