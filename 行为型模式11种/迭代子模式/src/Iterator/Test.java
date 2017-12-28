package Iterator;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 10:18 2017/12/28
 */
public class Test {
    public static void main(String[] args) {
        Collection collection = new MyCollection();
        Iterator it = collection.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
