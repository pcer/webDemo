package pattern.observer;


/**
 * 抽象的观察者
 */
public interface IObserver {
    //更新自己
    void update(String message);
}
