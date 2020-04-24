package com.theone.design.pattern.creational.singleton.lazy.v1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/13 12:17
 * @Description: 单例设计模式-基于DoubleCheck双重检查的对象初始化延迟加载实战及原理解析
 */
public class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton;
    // 并不能解决反射攻击破坏该单例模式
    private static boolean flag = true;

    private LazyDoubleCheckSingleton() {
//        if (flag) {
//            flag = false;
//        } else {
//            throw new RuntimeException("单例构造器禁止反射调用");
//        }

        if(lazyDoubleCheckSingleton != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    /**
     * 双重检查可能会遇到创建对象的过程重排序的问题，会在造成当第一个线程在没执行 第2步初始化对象 之前先执行了 第3步引用对象指向instance实例；
     * 在此时，第二个线程已经判断了lazyDoubleCheckSingleton 不为空，则返回实例调用，就会发生null异常。
     *
     * 解决办法：给引用对象加入volatile 关键字，实现线程安全的延迟初始化，这样就可以禁止重排序。
     *
     * 原理：多线程下CPU也有共享内存，volatile关键字可以使所有线程都可以看到共享内存的最新状态，保证了内存的可见性。主要是保证缓存一致性。
     * @return
     */
    public static LazyDoubleCheckSingleton getInstance(){
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    // 创建实例实际执行了以下三个步骤，可能会造成重排序的问题，例如
                    // 1.给对象分配内存
                    // 3.设置lazyDoubleCheckSingleton 指向刚分配内存的instance对象实例
                    // 2.初始化对象
                    // intra-thread semantics 是一个java规范，重排序保证不会改变单线程内的执行结果 3.设置lazyDoubleCheckSingleton 指向刚分配内存的instance对象实例
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }

    // 通过反射破坏doubleCheck单例模式
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {

        // 通过反射获取类，获取构造器，修改构造器的权限
        Class objectClass = LazyDoubleCheckSingleton.class;
        Constructor constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);

        LazyDoubleCheckSingleton instance = (LazyDoubleCheckSingleton) constructor.newInstance();
        // 通过反射获取成员变量，修改其权限，重新设置newInstance对象的成员变量的值
        Field field = instance.getClass().getDeclaredField("flag");
        field.setAccessible(true);
        field.set(instance, true);

        LazyDoubleCheckSingleton newInstance = LazyDoubleCheckSingleton.getInstance();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);


    }

}
