package com.theone.design.pattern.structural.facade;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/18 09:13
 * @Description: 限定、获取资格服务类
 */
public class QualifyService {
    /**
     * 是否可获得奖品
     * @param pointsGift
     */
    public boolean isAvailable(PointsGift pointsGift){
        System.out.println("效验" + pointsGift.getName() + "积分资格通过，库存通过");
        return true;
    }
}
