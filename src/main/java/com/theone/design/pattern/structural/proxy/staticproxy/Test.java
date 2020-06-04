package com.theone.design.pattern.structural.proxy.staticproxy;

import com.theone.design.pattern.structural.proxy.Order;

/**
 * @Author: liuyu
 * @DateTime: 2020/5/25 15:59
 * @Description: TODO
 */
public class Test {

    public static void main(String[] args) {

        Order order = new Order();
        order.setUserId(2);

        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }
}
