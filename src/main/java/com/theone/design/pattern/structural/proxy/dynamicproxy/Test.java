package com.theone.design.pattern.structural.proxy.dynamicproxy;

import com.theone.design.pattern.structural.proxy.IOrderService;
import com.theone.design.pattern.structural.proxy.Order;
import com.theone.design.pattern.structural.proxy.OrderServiceImpl;

/**
 * @Author: liuyu
 * @DateTime: 2020/5/25 17:26
 * @Description: TODO
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);
        IOrderService orderService = (IOrderService) new DataSourceDynamicProxy(new OrderServiceImpl()).bind();
        orderService.saveOrder(order);
    }
}
