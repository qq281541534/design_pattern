package com.theone.design.pattern.structural.composite;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/21 22:37
 * @Description: 课程
 */
public class Course extends CatalogComponent {
    private String name;
    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public double getPrice(CatalogComponent catalogComponent) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("课程名称：" + name + "， 课程价格：" + price);
    }
}
