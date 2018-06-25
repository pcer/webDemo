package reflect;

@Small
public class Cat extends Animal implements Action {

    private String name;
    private Integer age;
    public String weight;

    public Cat() {
        System.out.println("Car 的无参构造器调用了。。。。。。");
    }

    public Cat(String name, Integer age) {
        System.out.println("Car的有参构造器调用了。。。。。。");
        this.name = name;
        this.age = age;
    }

    private Cat(String name) {
        System.out.println("Car的私有的构造方法");
    }

    @Override
    public void run() {

    }

    public void sleep() {

    }

    private void catchMouse() {

    }

}
