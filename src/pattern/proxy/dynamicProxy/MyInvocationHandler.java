package pattern.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvocationHandler implements InvocationHandler {

    // 目标对象
    private Object target;

    /**
     * 构造方法
     *
     * @param target 目标对象
     */
    public  MyInvocationHandler(Object target) {
        super();
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 在目标对象的方法执行之前简单的打印一下
        System.out.println("卖门票");

        // 执行目标对象的方法
        Object result = method.invoke(target, args);

        // 在目标对象的方法执行之后简单的打印一下
        System.out.println("打扫会场");

        return result;
    }


    /**
     * 获取目标对象的代理对象
     *
     * @return 代理对象
     * newProxyInstance 的三个参数：1、类加载器 2.目标类实现的接口 3.this中包含传入的目标对象
     */
    public Object getProxy() {
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                target.getClass().getInterfaces(), this);
    }
}
