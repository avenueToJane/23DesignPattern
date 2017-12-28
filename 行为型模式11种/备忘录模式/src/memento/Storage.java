package memento;

import memento.Memento;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 10:38 2017/12/28
 */
public class Storage {
    private Memento memento;

    public Storage(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
