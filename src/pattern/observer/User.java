package pattern.observer;

public class User implements IObserver {

    //用户名字
    private String name;

    //接受到的信息
    private String message;

    //姓名构造
    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.message=message;
        readMessage();
    }


    private void readMessage() {
        System.out.println(this.name + "阅读了:" + this.message);
    }

}
