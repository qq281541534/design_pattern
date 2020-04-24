package com.theone.design.pattern.creational.singleton.hungry;

import java.io.Serializable;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/13 16:11
 * @Description: 恶汉单例模式，在类加载时就初始化到内存中，如果不是常用的类，则会造成内存的浪费。
 */
public class HungrySingleton implements Serializable, Cloneable{

    // 1.第一种方式 final关键字在类加载时就要初始化
//    private static final HungrySingleton hungrySingleton = new HungrySingleton();


    // 2.第二种方式 final关键字在类加载时就要初始化
    private static final HungrySingleton hungrySingleton;
    static {
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton(){
        // 禁止通过反射调用创建实例，破坏单例模式
        if(hungrySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    /**
     * 解决Serializable 序列化与反序列化时，破坏单例模式的问题
     * @return
     */
    private Object readResolve(){
        return hungrySingleton;
    }

    /**
     * 将clone方法中的super.clone() 更改为getInstance() 来防止使用原型模式破坏单例模式。
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }
}
