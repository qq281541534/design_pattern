package com.theone.design.pattern.creational.singleton.lazy;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/13 12:19
 * @Description: TODO
 */
public class T implements Runnable {
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    public void run() {
        LazySingleton instance = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + instance);
    }
}
