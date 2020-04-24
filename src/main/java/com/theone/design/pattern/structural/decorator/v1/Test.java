package com.theone.design.pattern.structural.decorator.v1;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/18 21:39
 * @Description: TODO
 */
public class Test {

    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getDesc() + " 销售价格:" + battercake.cost());

        BattercakeWithEgg battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getDesc() + " 销售价格:" + battercakeWithEgg.cost());

        BattercakeWithEggSausage battercakeWithEggSausage = new BattercakeWithEggSausage();
        System.out.println(battercakeWithEggSausage.getDesc() + " 销售价格:" + battercakeWithEggSausage.cost());

    }
}
