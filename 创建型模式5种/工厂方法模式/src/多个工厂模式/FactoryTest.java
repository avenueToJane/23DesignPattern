package 多个工厂模式;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 14:58 2017/12/25
 * 工厂测试类
 */
public class FactoryTest {
    public static void main(String[] args) {
        SendFactory sendFactory=new SendFactory();
        Sender sender = sendFactory.produceMail();
        sender.Send();
        System.out.println("===================");
        Sender sender1 = sendFactory.produceSms();
        sender1.Send();
    }
}
