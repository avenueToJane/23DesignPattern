import java.io.*;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 19:26 2017/12/25
 * 深浅复制的例子
 */
public class Prototype2  implements Cloneable, Serializable{

    private static final long serialVersionUID = -1114788280268227881L;

    private String string;

    private SerializableObject obj;

    /* 浅复制 */
    public Object clone() throws CloneNotSupportedException {
        Prototype2 proto = (Prototype2) super.clone();
        return proto;
    }

    /* 深复制
       要实现深复制，需要采用流的形式读入当前对象的二进制输入，再写出二进制数据对应的对象。
    */
    public Object deepClone() throws IOException, ClassNotFoundException, IOException {

        /* 写入当前对象的二进制流 */
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        /* 读出二进制流产生的新对象 */
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public SerializableObject getObj() {
        return obj;
    }

    public void setObj(SerializableObject obj) {
        this.obj = obj;
    }

}
class SerializableObject implements Serializable {
    private static final long serialVersionUID = 1L;
}
