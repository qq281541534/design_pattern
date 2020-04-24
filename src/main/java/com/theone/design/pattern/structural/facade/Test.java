package com.theone.design.pattern.structural.facade;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/18 09:50
 * @Description: TODO
 */
public class Test {

    public static void main(String[] args) {
        GiftExchangService giftExchangService = new GiftExchangService();
        PointsGift gift = new PointsGift("电影票");
        giftExchangService.giftExchange(gift);
    }
}
