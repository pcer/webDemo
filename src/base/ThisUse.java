package base;

/**
 * 构造器调用构造器
 */
public class ThisUse {
    public static void main(String[] args) {
        new Person("小明", 19).say();
    }
}

class Person {
    private String name;
    private Integer age;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Integer age) {
        //this语句的使用，执行上面的构造函数
        this(name);
        this.age = age;
    }

    public void say() {
        System.out.println(this.name + "---" + this.age);
    }
}
