package com.theone.design.pattern.creational.factorymethod;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/12 16:36
 * @Description: TODO
 */
public class FEVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}
