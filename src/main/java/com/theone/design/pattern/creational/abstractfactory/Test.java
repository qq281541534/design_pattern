package com.theone.design.pattern.creational.abstractfactory;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/12 18:44
 * @Description: TODO
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Article article = courseFactory.getArticle();
        Video video = courseFactory.getVideo();
        article.produce();
        video.produce();

        CourseFactory courseFactory1 = new PythonCourseFactory();
        Video pythonVideo = courseFactory1.getVideo();
        Article pythonArticle = courseFactory1.getArticle();
        pythonArticle.produce();
        pythonVideo.produce();

    }
}
