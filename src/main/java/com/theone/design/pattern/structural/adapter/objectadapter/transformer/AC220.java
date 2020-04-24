package com.theone.design.pattern.structural.adapter.objectadapter.transformer;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/20 14:56
 * @Description: 220V的交流电压
 */
public class AC220 {

    public int outputAC220V(){
        System.out.println("输出200V电压");
        return 220;
    }
}
