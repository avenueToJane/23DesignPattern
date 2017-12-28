package 多个工厂模式;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 14:53 2017/12/25
 * 改动下SendFactory类就行
 */
public class SendFactory {
    public Sender produceMail() {
       return new MailSender();
     }
    public Sender produceSms() {
        return new SmsSender();
    }
    }
