package prototype;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 19:22 2017/12/25
 */
public class Prototype implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        /*Prototype proto = (Prototype) super.clone();
        return proto;*/
        return super.clone();
    }
}
