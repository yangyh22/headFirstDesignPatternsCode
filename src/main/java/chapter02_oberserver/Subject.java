package chapter02_oberserver;

/**
 * @author yangyh
 * @date 2018/9/10
 */
public interface Subject {

    void registerObserver(Oberserver o);
    void remverObserver(Oberserver o);
    void notifyObservers();

}
