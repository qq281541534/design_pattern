package com.theone.design.pattern.creational.builder;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/13 09:59
 * @Description: TODO
 */
public class Coach {

    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String courseName, String coursePPT, String courseVideo, String courseArticle, String courseQA){
        courseBuilder.buildCourseName(courseName);
        courseBuilder.buildCoursePPT(coursePPT);
        courseBuilder.buildCourseArticle(courseArticle);
        courseBuilder.buildCourseVideo(courseVideo);
        courseBuilder.buildCourseQA(courseQA);
        return courseBuilder.makeCourse();
    }
}
