package com.theone.design.pattern.creational.builder.v2;

import com.google.common.collect.ImmutableSet;

import java.util.Set;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/13 10:31
 * @Description: TODO
 */
public class Test {

    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().builderCourseName("Java设计模式")
                .builderCoursePPT("Java设计模式PPT")
                .builderCourseVideo("Java设计模式视频")
                .builderCourseArticle("Java设计模式手记")
                .builderCourseQA("Java设计模式问答")
                .build();
        System.out.println(course);

        Set set = ImmutableSet.builder().add("a").add("b").build();
        System.out.println(set);
    }
}
