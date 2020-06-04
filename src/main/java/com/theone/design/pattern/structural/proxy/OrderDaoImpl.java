package com.theone.design.pattern.structural.proxy;

/**
 * @Author: liuyu
 * @DateTime: 2020/5/25 11:29
 * @Description: TODO
 */
public class OrderDaoImpl implements IOrderDao {
    public int insert(Order order) {
        System.out.println("数据库存储order成功");
        return 1;
    }
}
