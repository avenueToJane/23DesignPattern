package builder;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 14:51 2017/12/25
 * 创建接口的实现类
 */
public class SmsSender implements Sender {
    @Override
    public void Send() {

        System.out.println("建造者模式=========这是一个发送短信的实现类");
    }
}
