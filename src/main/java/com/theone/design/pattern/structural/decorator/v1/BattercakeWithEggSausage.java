package com.theone.design.pattern.structural.decorator.v1;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/18 21:38
 * @Description: TODO
 */
public class BattercakeWithEggSausage extends BattercakeWithEgg {

    @Override
    public String getDesc() {
        return super.getDesc() + " 加一个香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
