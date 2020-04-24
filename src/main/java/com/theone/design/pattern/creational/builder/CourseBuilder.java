package com.theone.design.pattern.creational.builder;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/13 09:52
 * @Description: TODO
 */
public abstract class CourseBuilder {

    public abstract void buildCourseName(String courseName);
    public abstract void buildCoursePPT(String coursePPT);
    public abstract void buildCourseVideo(String courseVideo);
    public abstract void buildCourseArticle(String courseArticle);
    public abstract void buildCourseQA(String courseQA);

    public abstract Course makeCourse();
}
