package Visitor;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 14:15 2017/12/28
 */
public class Test {
    public static void main(String[] args) {

        Visitor visitor = new MyVisitor();
        Subject sub = new MySubject();
        sub.accept(visitor);
    }
}
