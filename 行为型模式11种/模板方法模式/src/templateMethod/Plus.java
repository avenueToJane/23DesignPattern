package templateMethod;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 16:44 2017/12/27
 */
public class Plus extends AbstractCalculator {
    @Override
    public int calculate(int num1, int num2) {
        return num1 + num2;
    }
}
