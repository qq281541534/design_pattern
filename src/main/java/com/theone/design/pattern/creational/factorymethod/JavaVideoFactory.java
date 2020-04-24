package com.theone.design.pattern.creational.factorymethod;

/**
 * @author liuyu
 */
public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
