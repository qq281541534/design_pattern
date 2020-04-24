package com.theone.design.pattern.structural.adapter.objectadapter.transformer;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/20 15:09
 * @Description: TODO
 */
public class Test {

    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter();
        dc5.outputDC5V();
    }
}
