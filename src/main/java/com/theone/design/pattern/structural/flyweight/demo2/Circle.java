package com.theone.design.pattern.structural.flyweight.demo2;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/21 11:16
 * @Description: TODO
 */
public class Circle implements Shape {

    private String color;
    private int x;
    private int y;
    // 半径
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("draw circle color: " + color + ", x: " + x + ", y: " + y);
    }
}
