package com.theone.design.pattern.creational.prototype.abstractprototype;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/14 18:31
 * @Description: 通过抽象类实现原型模式
 */
public abstract class A implements Cloneable{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
