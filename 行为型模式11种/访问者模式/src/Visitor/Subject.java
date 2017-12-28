package Visitor;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 14:14 2017/12/28
 * Subject类，accept方法，接受将要访问它的对象，getSubject()获取将要被访问的属性，
 */
public interface Subject {
    public void accept(Visitor visitor);
    public String getSubject();
}
