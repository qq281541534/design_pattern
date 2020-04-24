package com.theone.design.pattern.creational.prototype.deepclone;

import com.theone.design.pattern.creational.singleton.hungry.HungrySingleton;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/14 19:05
 * @Description: TODO
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        /*
         * 通过深克隆，解决浅克隆的问题
         */
//        Pig pig = new Pig("佩奇", new Date());
//        Pig pig1 = (Pig) pig.clone();
//
//        System.out.println(pig);
//        System.out.println(pig1);
//
//        pig1.getBirthday().setTime(66666666666666L);
//
//        System.out.println(pig);
//        System.out.println(pig1);

        /*
         * 当单例模式和原型模式同时使用时，需要重写clone方法,更改为调用getInstance()来实现，就可以防止单例模式被破坏
         */
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        Method declaredMethod = HungrySingleton.class.getDeclaredMethod("clone");
        declaredMethod.setAccessible(true);
        HungrySingleton hungrySingleton1 = (HungrySingleton) declaredMethod.invoke(hungrySingleton);

        System.out.println(hungrySingleton);
        System.out.println(hungrySingleton1);


    }
}
