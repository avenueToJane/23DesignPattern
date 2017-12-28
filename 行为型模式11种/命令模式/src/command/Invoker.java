package command;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 10:33 2017/12/28
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        command.exe();
    }
}
