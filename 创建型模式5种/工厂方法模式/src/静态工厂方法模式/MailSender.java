package 静态工厂方法模式;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 14:49 2017/12/25
 * 创建接口的实现类
 */
public class MailSender implements Sender {
    @Override
    public void Send() {
        System.out.println("静态工厂===这是一个发送邮件的实现类");
    }
}
