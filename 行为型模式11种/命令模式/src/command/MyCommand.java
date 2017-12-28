package command;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 10:31 2017/12/28
 */
public class MyCommand implements Command {
    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }
}
