package com.theone.design.pattern.behavioral.templatemethod;

/**
 * @Author: liuyu
 * @DateTime: 2020/6/4 16:10
 * @Description: 设计模式课程
 */
public class DesignPatternCourse extends AbsCourse {
    @Override
    void packageCourse() {
        System.out.println("提供课程java源码");
    }

    /**
     * 设计模式课程需要编写手记，所以重写方法，返回true
     * @return
     */
    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}
