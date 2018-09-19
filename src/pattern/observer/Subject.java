package pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject {

    //观察者集合
    private List<User> observerList =new ArrayList<>();

    //消息(消息变化通知所有观察者)
    private String message;

    @Override
    public void addObserver(User observer) {
        observerList.add(observer);

    }

    @Override
    public void removeObserver(User observer) {
        if (!observerList.isEmpty()) {
            observerList.remove(observer);
        }

    }

    //通知所有观察者更新自己
    public void notifyObservers() {
        for (User observer : observerList) {
            observer.update(message);
        }

    }

    //消息变化（发送消息）
    public void setMessage(String message) {
        this.message = message;
        //通知
        notifyObservers();
    }
}
