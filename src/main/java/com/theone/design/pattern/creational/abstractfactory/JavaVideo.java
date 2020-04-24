package com.theone.design.pattern.creational.abstractfactory;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/12 18:39
 * @Description: TODO
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java视频");
    }
}
