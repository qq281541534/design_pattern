package com.theone.design.pattern.structural.proxy;

/**
 * @Author: liuyu
 * @DateTime: 2020/5/25 10:11
 * @Description: TODO
 */
public class Order {
    private Object orderInfo;
    private Integer userId;

    public Object getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(Object orderInfo) {
        this.orderInfo = orderInfo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
