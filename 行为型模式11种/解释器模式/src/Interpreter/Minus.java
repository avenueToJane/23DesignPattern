package Interpreter;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 14:25 2017/12/28
 */
public class Minus implements Expression {
    @Override
    public int interpret(Context context) {
        return context.getNum1()-context.getNum2();
    }
}
