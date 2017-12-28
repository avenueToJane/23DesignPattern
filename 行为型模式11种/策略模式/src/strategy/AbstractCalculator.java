package strategy;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 16:13 2017/12/27
 * 辅助类
 */
public abstract class AbstractCalculator {
    public int[] split(String exp,String opt){
        String array[] = exp.split(opt);
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }
}
