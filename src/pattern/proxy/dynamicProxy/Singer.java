package pattern.proxy.dynamicProxy;

/**
 * 目标对象
 */
public class Singer implements Person {
    @Override
    public void sing() {
        System.out.println("sing......");
    }
}
