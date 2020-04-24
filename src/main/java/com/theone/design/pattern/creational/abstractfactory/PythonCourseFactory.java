package com.theone.design.pattern.creational.abstractfactory;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/12 18:41
 * @Description: TODO
 */
public class PythonCourseFactory implements CourseFactory {
    public Video getVideo() {
        return new PythonVideo();
    }

    public Article getArticle() {
        return new PythonArticle();
    }
}
