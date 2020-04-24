package com.theone.design.pattern.creational.simplefactory;

/**
 * 简单工厂模式
 *
 * @Author: liuyu
 * @DateTime: 2020/4/12 17:05
 * @Description: 简单工厂模式并不属于23种设计模式，只是一种编码习惯；在工厂模式中只分为"工厂模式"和"抽象工厂模式"两种。
 */
public class Test {

    public static void main(String[] args) {
        // 应用层不应该直接依赖对应的具体实现类
//        Video video = new JavaVideo();
//        video.produce();

        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo("java");
        video.produce();

        // 通过反射
        VideoFactory videoFactory1 = new VideoFactory();
        Video video1 = videoFactory1.getVideo(JavaVideo.class);
        video1.produce();

    }
}
