package com.theone.design.pattern.structural.proxy.dynamicproxy;

import com.theone.design.pattern.structural.proxy.Order;
import com.theone.design.pattern.structural.proxy.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: liuyu
 * @DateTime: 2020/5/25 16:38
 * @Description: 切换数据源分库的动态代理（通过JDK的动态代理实现）
 *
 */
public class DataSourceDynamicProxy implements InvocationHandler {

    /**
     * 目标对象
     */
    private Object target;

    public DataSourceDynamicProxy(Object target) {
        this.target = target;
    }

    /**
     * 绑定的方法
     * @return
     */
    public Object bind(){
        Class cls = target.getClass();
        // 生成代理对象
        return Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), this);
    }

    /**
     * 代理核心方法
     * 处理对代理实例的方法调用并返回结果。当在与其关联的代理实例上调用方法时，将在调用处理程序上调用此方法。
     *
     * @param proxy 动态生成的代理类
     * @param method 代理类的方法
     * @param args 代理类的方法中的参数
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 获取被代理类传入的参数，这里因为知道模拟的order对象，所以直接取0
        Object orderObj = args[0];
        // 进行前置方法增强
        beforeMethod(orderObj);
        // 要被增强的方法的返回值，因为每个方法的返回值不同，但父类都是Object，所以用Object引用声明来接收
        Object object = method.invoke(target, args);
        afterMethod();
        return object;
    }

    private void beforeMethod(Object object){
        Integer userId = 0;
        System.out.println("动态代理 before code");

        // 这里假设只有order相关业务的情况下，进行数据源分库
        // 如果还有其他业务也需要分库，则可以增加判断
        if (object instanceof Order) {
            Order order = (Order) object;
            userId = order.getUserId();
        }
        int dbRouter = userId % 2;
        System.out.println("动态代理分配到【db"+dbRouter+"】处理数据");

        DataSourceContextHolder.setDBType("db" + dbRouter);

    }

    private void afterMethod(){
        System.out.println("动态代理 after code");
    }
}
