package builder;

import java.util.List;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 19:02 2017/12/25
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        Builder builder=new Builder();
        List<Sender> senders = builder.produceMailSender(10);
        List<Sender> senders1 = builder.produceSmsSender(10);
        for(int i=0;i<senders.size();i++){
            senders.get(i).Send();
        }
        for(int i=0;i<senders1.size();i++){
            senders1.get(i).Send();
        }
    }
}
