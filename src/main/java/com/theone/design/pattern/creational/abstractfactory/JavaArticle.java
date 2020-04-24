package com.theone.design.pattern.creational.abstractfactory;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/12 18:40
 * @Description: TODO
 */
public class JavaArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写Java手记");
    }
}
