package mediator;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 14:21 2017/12/28
 */
public abstract class User {
    private Mediator mediator;

    public Mediator getMediator(){
        return mediator;
    }

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void work();
}
