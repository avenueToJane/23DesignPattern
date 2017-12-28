package mediator;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 14:22 2017/12/28
 */
public class User1 extends User {
    public User1(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user1 exe!");
    }
}
