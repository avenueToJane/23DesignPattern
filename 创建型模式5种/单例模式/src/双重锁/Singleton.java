package 双重锁;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 17:10 2017/12/25
 * 这个模式将同步内容下放到if内部，提高了执行的效率，不必每次获取对象时都进行同步，只有第一次才同步，创建了
 * 以后就没必要了。这种模式中双重判断加同步的方式，比第一个例子中的效率大大提升，因为如果单层if判断，在服务
 * 器允许的情况下，假设有一百个线程，耗费的时间为100*（同步判断时间+if判断时间），而如果双重if判断，
 * 100的线程可以同时if判断，理论消耗的时间只有一个if判断的时间。
 *所以如果面对高并发的情况，而且采用的是懒汉模式，最好的选择就是双重判断加同步的方式。
 */
public class Singleton {
    /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
    private static volatile Singleton instance=null;
    /* 私有构造方法，防止被实例化 */
    private Singleton(){
        //do something
    }
    /* 静态工程方法，创建实例
    在懒汉式中synchronized关键字锁住的是这个对象，这样的用法，在性能上会有所下降，因为每次调用getInstance()，
    都要对对象上锁，事实上，只有在第一次创建对象的时候需要加锁，之后就不需要了，所以，这个地方需要改进。
    我们改成下面这个：
    * */
    public static  Singleton getInstance(){
        if(instance==null){
            synchronized(instance){
                if(instance==null){
                    instance=new Singleton();
                }
            }
        }
        return instance;
    }
}
