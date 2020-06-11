package com.theone.design.pattern.behavioral.iterator;

/**
 * @Author: liuyu
 * @DateTime: 2020/6/11 08:50
 * @Description: 课程集合
 */
public interface CourseAggregate {

    void addCourse(Course course);
    void removeCourse(Course course);

    CourseIterator getIterator();
}
