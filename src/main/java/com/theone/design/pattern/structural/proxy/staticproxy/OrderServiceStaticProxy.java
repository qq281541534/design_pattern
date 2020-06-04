package com.theone.design.pattern.structural.proxy.staticproxy;

import com.theone.design.pattern.structural.proxy.IOrderService;
import com.theone.design.pattern.structural.proxy.Order;
import com.theone.design.pattern.structural.proxy.OrderServiceImpl;
import com.theone.design.pattern.structural.proxy.db.DataSourceContextHolder;

/**
 * @Author: liuyu
 * @DateTime: 2020/5/25 11:32
 * @Description: 订单服务类静态代理实例
 * 静态代理是需要提前写好的，所以每个代理类中处理的业务逻辑都是跟具体模块业务相关的
 * 如果多个模块会有相同的业务逻辑时，则使用动态代理，动态代理是动态生成的代理类
 */
public class OrderServiceStaticProxy {
    private IOrderService orderService;

    public int saveOrder(Order order){
        beforeMethod(order);
        orderService = new OrderServiceImpl();
        int result = orderService.saveOrder(order);
        afterMethod();
        return result;
    }

    private void beforeMethod(Order order){
        // 通过userId进行数据源的切换实现分库

        Integer userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到【db"+dbRouter+"】处理数据");

        DataSourceContextHolder.setDBType("db" + String.valueOf(dbRouter));
        System.out.println("静态代理before code ");
    }

    private void afterMethod(){
        System.out.println("静态代理after code ");
    }
}
