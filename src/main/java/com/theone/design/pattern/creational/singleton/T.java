package com.theone.design.pattern.creational.singleton;

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
        ContainerSingleton.putInstance("object", new Object());
        Object object = ContainerSingleton.getInstance("object");
        System.out.println(Thread.currentThread().getName() + " " + object);
    }
}
