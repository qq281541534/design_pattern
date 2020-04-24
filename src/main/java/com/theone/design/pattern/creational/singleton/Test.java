package com.theone.design.pattern.creational.singleton;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/14 11:07
 * @Description: TODO
 */
public class Test {

    public static void main(String[] args) {
        Thread t = new Thread(new T());
        Thread t1 = new Thread(new T());
        t.start();
        t1.start();
        System.out.println("end");

    }
}
