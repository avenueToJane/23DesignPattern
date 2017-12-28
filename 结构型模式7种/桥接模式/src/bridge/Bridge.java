package bridge;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 14:50 2017/12/27
 * 定义一个桥 持有Sourceable的一个实例：
 */
public abstract  class Bridge {
    private Sourceable source;
    public void method(){
        source.method();
    }

    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }
}
