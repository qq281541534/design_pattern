package com.theone.design.pattern.creational.singleton;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/14 16:00
 * @Description: 基于ThreadLocal实现的"单例"模式
 * 这种是特殊的"单例"，每个线程都有创建一个线程隔离的对象(该对象在这个线程里是唯一的),所以是线程安全的。
 */
public class ThreadLocalInstance {

    /**
     * ThreadLocal隔离了多个线程对数据的访问冲突，与synchronized的作用相反，synchronized是以时间换空间的方式，ThreadLocal是空间换时间。
     */
    private static ThreadLocal<ThreadLocalInstance> threadLocal = new ThreadLocal<ThreadLocalInstance>(){

        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };

    private ThreadLocalInstance(){}

    public static ThreadLocalInstance getInstance(){
        return threadLocal.get();
    }
}
