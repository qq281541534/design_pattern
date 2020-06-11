package com.theone.design.pattern.behavioral.iterator;

/**
 * @Author: liuyu
 * @DateTime: 2020/6/11 08:52
 * @Description: 课程迭代器
 */
public interface CourseIterator {
    Course nextCourse();
    boolean isLastCourse();
}
