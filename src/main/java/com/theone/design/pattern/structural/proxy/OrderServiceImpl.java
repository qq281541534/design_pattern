package com.theone.design.pattern.structural.proxy;

/**
 * @Author: liuyu
 * @DateTime: 2020/5/25 11:30
 * @Description: TODO
 */
public class OrderServiceImpl implements IOrderService {

    private IOrderDao orderDao;

    public int saveOrder(Order order) {
        orderDao = new OrderDaoImpl();
        System.out.println("service层调用dao层添加order");
        return orderDao.insert(order);
    }
}
