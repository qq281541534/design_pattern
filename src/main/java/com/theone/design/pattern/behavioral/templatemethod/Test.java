package com.theone.design.pattern.behavioral.templatemethod;

/**
 * @Author: liuyu
 * @DateTime: 2020/6/4 16:12
 * @Description: TODO
 */
public class Test {

    public static void main(String[] args) {
        /**
         * 制作PPT
         * 制作视频
         * 编写手记
         * 提供课程java源码
         */
        System.out.println("后端设计模式课程start----------");
        AbsCourse designPatternCourse = new DesignPatternCourse();
        designPatternCourse.makeCourse();
        System.out.println("后端设计模式课程end----------");

        /**
         * 制作PPT
         * 制作视频
         * 编写手记
         * 提供课程源码
         * 提供课程所需素材相关图片
         */
        System.out.println("前端VUE课程start----------");
        AbsCourse vueCourse = new FECourse(true);
        vueCourse.makeCourse();
        System.out.println("前端VUE课程end----------");

        /**
         * 制作PPT
         * 制作视频
         * 提供课程源码
         * 提供课程所需素材相关图片
         */
        System.out.println("前端微信小程序课程start----------");
        AbsCourse wxCourse = new FECourse(false);
        wxCourse.makeCourse();
        System.out.println("前端微信小程序课程end----------");

    }
}
