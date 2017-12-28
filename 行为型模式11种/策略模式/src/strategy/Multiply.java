package strategy;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 16:15 2017/12/27
 */
public class Multiply extends AbstractCalculator implements ICalculator {
    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"\\*");
        return arrayInt[0]*arrayInt[1];
    }
}
