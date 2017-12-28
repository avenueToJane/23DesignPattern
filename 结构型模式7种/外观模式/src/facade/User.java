package facade;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 14:41 2017/12/27
 * 测试类
 */
public class User {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
