package com.theone.design.pattern.structural.adapter.objectadapter;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/20 10:39
 * @Description: 通过组合的方式把target中request的方法实现委托给adaptee
 */
public class Adapter implements Target {

    private Adaptee adaptee = new Adaptee();

    public void request() {

        // 前后加业务逻辑...

        adaptee.adapteeRequest();

        // 前后加业务逻辑...
    }
}
