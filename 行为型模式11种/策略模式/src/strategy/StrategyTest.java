package strategy;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 16:19 2017/12/27
 */
public class StrategyTest {
    public static void main(String[] args) {
        String exp = "2+8";
        ICalculator cal = new Plus();
        int result = cal.calculate(exp);
        System.out.println(result);
    }
}
