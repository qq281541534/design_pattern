package com.theone.design.pattern.creational.abstractfactory;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/12 18:43
 * @Description: TODO
 */
public class PythonArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编辑python手记");
    }
}
