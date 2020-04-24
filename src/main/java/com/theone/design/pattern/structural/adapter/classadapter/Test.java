package com.theone.design.pattern.structural.adapter.classadapter;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/20 09:27
 * @Description: TODO
 */
public class Test {

    public static void main(String[] args) {
        // 正常情况：ConcreteTarget是Target的直接实现者
        Target target = new ConcreteTarget();
        target.request();
        // 适配者情况：Target的方法，通过Adapter直接移交给了Adaptee
        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
