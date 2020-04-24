package com.theone.design.pattern.creational.abstractfactory;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/12 18:38
 * @Description: TODO
 */
public class JavaCourseFactory implements CourseFactory {
    public Video getVideo() {
        return new JavaVideo();
    }

    public Article getArticle() {
        return new JavaArticle();
    }
}
