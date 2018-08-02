package pattern.singleton;

public class Singleton {
    public static void main(String[] args) {
        HungrySingleton.getInstance().setName("cat");
        System.out.println(  HungrySingleton.getInstance().getName());

    }
}

/**
 * 饿汉式单例模式
 * 1.构造器私有化
 * 2.本类中实例化本类对象
 * 3.对外提供静态访问接口
 */
class HungrySingleton {

    private static HungrySingleton hungrySingleton = new HungrySingleton();

    private String name="pig";

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

/**
 * 饿汉式单例模式
 * 1.构造器私有化
 * 2.本类中定义本类对象引用
 * 3.对外提供静态访问接口，调用时创建本类对象
 */
class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (null == lazySingleton) {
            return new LazySingleton();
        } else {
            return lazySingleton;
        }
    }

}
