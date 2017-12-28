package 普通工厂模式;
/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 14:58 2017/12/25
 * 工厂测试类
 */
public class FactoryTest {
    public static void main(String[] args) {

        SendFactory sendFactory=new SendFactory();
        Sender sms = sendFactory.produce("sms");
        sms.Send();
        System.out.println("========================");
        Sender mail = sendFactory.produce("mail");
        mail.Send();
    }
}
