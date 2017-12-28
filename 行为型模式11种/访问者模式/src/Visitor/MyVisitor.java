package Visitor;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 14:13 2017/12/28
 */
public class MyVisitor implements Visitor{
    @Override
    public void visit(Subject sub) {
        System.out.println("visit the subject："+sub.getSubject());
    }
}
