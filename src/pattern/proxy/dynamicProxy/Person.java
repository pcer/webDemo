package pattern.proxy.dynamicProxy;

/**
 * 目标对象实现的接口，用JDK来生成代理对象一定要实现一个接口
 */
public interface Person {

    /**
     * 目标方法
     */
      void sing();
}
