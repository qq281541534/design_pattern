package com.theone.design.pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: liuyu
 * @DateTime: 2020/6/11 08:55
 * @Description: 课程集合实现类
 */
public class CourseAggregateImpl implements CourseAggregate {

    private List courseList;

    public CourseAggregateImpl() {
        courseList = new ArrayList();
    }

    public void addCourse(Course course) {
        courseList.add(course);
    }

    public void removeCourse(Course course) {
        courseList.remove(course);
    }

    public CourseIterator getIterator() {
        return new CourseIteratorImpl(courseList);
    }
}
