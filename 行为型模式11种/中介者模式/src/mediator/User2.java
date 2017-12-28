package mediator;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 14:22 2017/12/28
 */
public class User2 extends User {
    public User2(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user2 exe!");
    }
}
