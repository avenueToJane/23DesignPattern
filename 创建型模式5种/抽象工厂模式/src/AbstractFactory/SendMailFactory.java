package AbstractFactory;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 16:47 2017/12/25
 * 建立一个发邮件的工厂类
 */
public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
