package strategy;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 16:13 2017/12/27
 */
public class Plus  extends AbstractCalculator implements ICalculator  {
    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"\\+");
        return arrayInt[0]+arrayInt[1];
    }
}
