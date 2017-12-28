package builder;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 14:46 2017/12/25
 * 普通工厂模式，就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建
 * 创建一个邮件和短信的发送接口
 */
public interface Sender {
     public void Send();
}
