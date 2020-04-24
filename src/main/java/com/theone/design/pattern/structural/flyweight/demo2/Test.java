package com.theone.design.pattern.structural.flyweight.demo2;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/21 18:26
 * @Description: 画圆
 */
public class Test {

    private static final String[] COLORS = {"red", "black", "blue"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Circle circle = (Circle) ShapeFactory.getShape(getColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static int getRandomY() {
        return (int) (Math.random()*100);
    }

    private static int getRandomX() {
        return (int) (Math.random()*100);
    }

    private static String getColor() {
        return COLORS[(int) (Math.random() * COLORS.length)];
    }
}
