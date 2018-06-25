package reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        System.out.println("请输入获取Clazz对象的方式");
//        Scanner sb = new Scanner(System.in);
//        String style = sb.nextLine();
//        if (style.equals("1")) {
//            getClazzStyle1();
//        } else if (style.equals("2")) {
//            getClazzStyle2();
//        } else {
        Class clazz = getClazzStyle3();
        clazz.getName();
        Class<?>[] interfaces = clazz.getInterfaces();

        Method[] methods1 = clazz.getMethods();         //本类公共方法，包括继承的公有方法
        Method[] methods2 = clazz.getDeclaredMethods(); //本类所有方法，不包括继承方法

        Field[] fields1 = clazz.getFields();    //本类和接口的公共字段
        Field[] fields2 = clazz.getDeclaredFields(); //本类所有的字段

        Constructor<?>[] constructors1 = clazz.getConstructors();   //公共构造方法
        Constructor<?>[] constructors2 = clazz.getDeclaredConstructors(); //

        Annotation[] annotations1 = clazz.getAnnotations();
        Annotation annotation = clazz.getAnnotation(Small.class);


//        }

    }

    /**
     * 通过对象获取字节码对象
     */
    public static void getClazzStyle1() {
        Cat cat = new Cat();
        Class clazz = cat.getClass();
        System.out.println("通过对象获取字节码对象" + clazz.getName());
    }

    /**
     * 通过类获取字节码对象
     */
    public static void getClazzStyle2() {
        Class clazz = Cat.class;
        System.out.println("通过类获取字节码对象" + clazz.getName());
    }

    /**
     * 通过类名获取字节码对象
     */
    public static Class getClazzStyle3() {
        try {
            Class clazz = Class.forName("reflect.Cat");
            System.out.println("通过类字符串名称获取字节码对象" + clazz.getName());
            return clazz;
        } catch (ClassNotFoundException e) {
            System.out.println("未找到该类");
            return null;
        }
    }

    public static void toShwo(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].toString());
        }

    }
}
