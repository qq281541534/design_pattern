package com.theone.design.pattern.creational.abstractfactory;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/12 18:42
 * @Description: TODO
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制python视频");
    }
}
