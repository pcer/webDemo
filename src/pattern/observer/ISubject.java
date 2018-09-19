package pattern.observer;

/**
 * 抽象的主题
 */
public interface ISubject {
    //添加观察者
    void  addObserver(User observer);
    //移除观察者
    void removeObserver(User observer);
    //通知所有观察者
    void notifyObservers();
}
