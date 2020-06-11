package com.theone.design.pattern.behavioral.iterator;

import java.util.List;

/**
 * @Author: liuyu
 * @DateTime: 2020/6/11 08:54
 * @Description: 课程迭代器实现
 */
public class CourseIteratorImpl implements CourseIterator {

    private List courseList;
    private int position;
    private Course course;

    public CourseIteratorImpl(List courseList) {
        this.courseList = courseList;
    }

    public Course nextCourse() {
        System.out.println("获取课程，课程位置：" + position);
        course = (Course) courseList.get(position);
        position++;
        return course;
    }

    public boolean isLastCourse() {
        if (position < courseList.size()) {
            return false;
        }
        return true;
    }
}
