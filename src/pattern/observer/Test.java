package pattern.observer;

import java.util.Observer;

public class Test {
    public static void main(String[] args) {
        Subject subject=new Subject();
        User xm=new User("小明");
        User xh=new User("小红");
        User xz=new User("小张");
        subject.addObserver(xm);
        subject.addObserver(xh);
        subject.addObserver(xz);
        subject.setMessage("三国演义");
        System.out.println("====================");
        subject.addObserver(new User("小花"));
        subject.removeObserver(xz);
        subject.setMessage("红楼梦");

    }
}
