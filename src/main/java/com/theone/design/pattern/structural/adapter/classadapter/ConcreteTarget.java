package com.theone.design.pattern.structural.adapter.classadapter;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/20 09:24
 * @Description: target的具体实现
 */
public class ConcreteTarget implements Target {

    public void request() {
        System.out.println("concreteTarget目标方法实现");
    }
}
