package com.theone.design.pattern.creational.singleton.lazy.v2;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/13 12:17
 * @Description: 基于静态内部类并且是线程安全的类初始化的延迟加载解决方案（非构造线程是不允许看到重排序的）
 * 类被初始化的5种情况：
 * 1.有一个A类的实例被创建
 * 2.A类种声明的一个静态方法被调用
 * 3.A类种声明的一个静态成员被赋值
 * 4.A类种声明的一个静态成员被使用，并且这个成员不是常量成员
 * 5.A类是个顶级类，并且在这个类中有断言语句
 *
 * 原理：在JVM创建对象的过程中，会先获取一个class对象的初始化锁，然后在执行对象的初始化步骤；这里通过静态内部类作为了class对象的初始化锁，
 *      哪个线程先拿到这个锁，就会被先初始化。
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {
        if (InnerClass.staticInnerClassSingleton != null) {
            throw new RuntimeException("禁止通过反射调用单例构造器");
        }
    }

    /**
     * 内部类
     */
    private static class InnerClass {
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    /**
     * 通过内部类实例化
     * @return
     */
    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }

}
