package observer;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 16:51 2017/12/27
 */
public class Observer2 implements Observer {
    @Override
    public void update() {
        System.out.println("观察者2接收到信息");
    }
}
