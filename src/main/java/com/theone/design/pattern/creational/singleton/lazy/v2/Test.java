package com.theone.design.pattern.creational.singleton.lazy.v2;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/13 12:21
 * @Description: TODO
 */
public class Test {

    public static void main(String[] args) {

        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("stop.");
    }

}
