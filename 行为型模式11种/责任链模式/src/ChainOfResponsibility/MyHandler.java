package ChainOfResponsibility;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 10:24 2017/12/28
 */
public class MyHandler extends AbstractHandler implements Handler {
    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println(name+"deal!");
        if(getHandler()!=null){
            getHandler().operator();
        }
    }
}
