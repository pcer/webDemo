package pattern.proxy;

/**
 * 动态代理
 */
public class ProxyTest {

    public static void main(String[] args) throws Throwable {
        testProxy();
    }

    public static void testProxy() throws Throwable {
        // 实例化目标对象
        IUserService userService = new UserServiceImpl();

        // 实例化InvocationHandler
        MyInvocationHandler invocationHandler = new MyInvocationHandler(userService);

        // 根据目标对象生成代理对象
        IUserService proxy = (IUserService) invocationHandler.getProxy();

        // 调用代理对象的方法
        proxy.add();

    }
    private String name;
    private String sex;
    public ProxyTest(String name) {

        this.name=name;
    }
    public ProxyTest(String name,String sex) {
        this(name); //调用了上面的构造方法。
        this.sex=sex;
    }
}
