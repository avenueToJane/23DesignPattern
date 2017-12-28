package Iterator;


/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 10:10 2017/12/28
 */
public interface Collection {
    public Iterator iterator();

    /*取得集合元素*/
    public Object get(int i);

    /*取得集合大小*/
    public int size();
}
