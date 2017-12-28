package Visitor;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 14:14 2017/12/28
 */
public class MySubject implements Subject {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getSubject() {
        return "love";
    }


}
