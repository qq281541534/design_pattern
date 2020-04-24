package com.theone.design.pattern.structural.facade;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/18 09:20
 * @Description: TODO
 */
public class PointsPaymentService {

    public boolean pay(PointsGift pointsGift){
        //扣减积分
        System.out.println("支付"+pointsGift.getName()+"成功！");
        return true;
    }
}
