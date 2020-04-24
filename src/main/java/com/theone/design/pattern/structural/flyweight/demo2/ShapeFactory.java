package com.theone.design.pattern.structural.flyweight.demo2;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/21 18:19
 * @Description: 容器单例的 形状加工厂
 */
public class ShapeFactory {
    private static final Map<String, Shape> SHAPE_MAP = new HashMap<String, Shape>();

    public static Shape getShape(String color){
        Circle circle = (Circle) SHAPE_MAP.get(color);
        if (circle == null) {
            circle = new Circle(color);
            SHAPE_MAP.put(color, circle);
            System.out.println("creating circle of color: " + color);
        }
        return circle;
    }
}
