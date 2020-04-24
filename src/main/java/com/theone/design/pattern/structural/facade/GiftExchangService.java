package com.theone.design.pattern.structural.facade;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/18 09:34
 * @Description: TODO
 */
public class GiftExchangService {

    private PointsPaymentService pointsPaymentService = new PointsPaymentService();

    private QualifyService qualifyService = new QualifyService();

    private ShippingService shippingService = new ShippingService();

    public boolean giftExchange(PointsGift gift){
        boolean available = qualifyService.isAvailable(gift);
        if (available) {
            boolean isSuccess = pointsPaymentService.pay(gift);
            if (isSuccess) {
                String shipNum = shippingService.shipGift(gift);
                return true;
            }
        }
        return false;
    }

}
