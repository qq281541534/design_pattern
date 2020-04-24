package com.theone.design.pattern.creational.factorymethod;

public class Test {
    public static void main(String[] args) {
        VideoFactory factory = new JavaVideoFactory();
        Video video = factory.getVideo();
        video.produce();

        VideoFactory factory1 = new PythonVideoFactory();
        Video video1 = factory1.getVideo();
        video1.produce();

        VideoFactory factory2 = new FEVideoFactory();
        Video video2 = factory2.getVideo();
        video2.produce();

    }
}
