package com.theone.design.pattern.structural.facade;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/18 09:30
 * @Description: 物流
 */
public class ShippingService {

    public String shipGift(PointsGift gift) {
        System.out.println("发送物流成功，奖品："+ gift.getName());
        return "12345";
    }
}
