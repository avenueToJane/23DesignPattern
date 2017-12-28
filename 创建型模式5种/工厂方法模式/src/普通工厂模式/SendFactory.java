package 普通工厂模式;

import 普通工厂模式.MailSender;
import 普通工厂模式.Sender;
import 普通工厂模式.SmsSender;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 14:53 2017/12/25
 * 将上面的多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可。
 */
public class SendFactory {
    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }
}
