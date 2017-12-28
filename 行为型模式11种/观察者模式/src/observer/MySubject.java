package observer;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 18:09 2017/12/27
 */
public class MySubject extends AbstractSubject {
    @Override
    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }
}
