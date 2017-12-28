package Iterator;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 10:12 2017/12/28
 */
public class MyCollection implements Collection {
    public String string[] = {"A","B","C","D","E"};
    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return string[i];
    }

    @Override
    public int size() {
        return string.length;
    }

}
