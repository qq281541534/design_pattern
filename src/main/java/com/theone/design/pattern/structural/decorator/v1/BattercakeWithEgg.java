package com.theone.design.pattern.structural.decorator.v1;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/18 21:36
 * @Description: TODO
 */
public class BattercakeWithEgg extends Battercake {

    @Override
    public String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
