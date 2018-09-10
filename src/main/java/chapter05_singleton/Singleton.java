package chapter05_singleton;

/**
 * @author yangyh
 * @date 2018/9/10
 */
public class Singleton {

    // volatile 关键字确保，当uniqueInstance变量被初始化成Singleton实例时，多个线程正确的处理uniqueInstance变量
    private volatile static Singleton uniqueInstance;

    private Singleton() {
    }

    // 双重加锁检查
    public static Singleton getInstance() {
        if (null == uniqueInstance) {
            synchronized (Singleton.class) {
                if (null == uniqueInstance) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

}
