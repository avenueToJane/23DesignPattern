package mediator;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 14:22 2017/12/28
 */
public class Test {
    public static void main(String[] args) {
        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }
}
