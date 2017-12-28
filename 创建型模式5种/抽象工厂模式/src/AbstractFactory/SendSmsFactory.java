package AbstractFactory;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 16:48 2017/12/25
 * 建立一个发短信的工厂类
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
