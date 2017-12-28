package builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 18:59 2017/12/25
 * 建造者类
 */
public class Builder {
    private List<Sender> list=new ArrayList<>();

    public List<Sender> produceMailSender(int count){
        for(int i=0; i<count; i++){
            list.add(new MailSender());
        }
        return list;
    }

    public List<Sender> produceSmsSender(int count){
        for(int i=0; i<count; i++){
            list.add(new SmsSender());
        }
        return list;
    }

}
