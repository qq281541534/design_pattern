package com.theone.design.pattern.structural.adapter.classadapter;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/20 09:26
 * @Description: 适配者
 */
public class Adapter extends Adaptee implements Target {
    public void request() {

        // 前后增加的逻辑代码....


        super.adapteeRequest();


        // 前后增加的逻辑代码.....
    }
}
