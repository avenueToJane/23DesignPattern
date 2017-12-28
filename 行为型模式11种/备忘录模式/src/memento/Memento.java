package memento;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 10:38 2017/12/28
 */
public class Memento {
    private String value;

    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
