package pattern.proxy.dynamicProxy;

/**
 * 动态代理
 */
public class Test {

    public static void main(String[] args) throws Throwable {
        testProxy();
    }

    public static void testProxy() throws Throwable {

        // 实例化目标对象
        Person singer = new Singer();

        // 实例化InvocationHandler
        MyInvocationHandler invocationHandler = new MyInvocationHandler(singer);

        // 根据目标对象生成代理对象
        Person proxy = (Person) invocationHandler.getProxy();

        // 调用代理对象的方法
        proxy.sing();

    }

    private String name;
    private String sex;

    public Test(String name) {

        this.name = name;
    }

    public Test(String name, String sex) {
        this(name); //调用了上面的构造方法。
        this.sex = sex;
    }
}
