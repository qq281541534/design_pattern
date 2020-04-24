package com.theone.design.pattern.creational.singleton.lazy;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/13 12:17
 * @Description: TODO
 */
public class LazySingleton {

    private static LazySingleton lazySingleton;

    private LazySingleton() {}

    /**
     * synchronized 加在静态方法上锁的是类，加锁解锁对性能影响较大
     * @return
     */
    public synchronized static LazySingleton getInstance(){
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

}
