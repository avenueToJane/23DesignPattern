package Interpreter;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 14:24 2017/12/28
 */
public class Plus implements Expression {
    @Override
    public int interpret(Context context) {
        return context.getNum1()+context.getNum2();
    }
}
