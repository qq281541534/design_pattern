package com.theone.design.pattern.structural.composite;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/21 22:48
 * @Description: TODO
 */
public class Test {
    public static void main(String[] args) {
        CatalogComponent liunxCourse = new Course("liunx课程", 11);
        CatalogComponent winCourse = new Course("win课程", 12);

        CatalogComponent javaCourseCatalog = new CourseCatalog("java课程目录", 2);
        CatalogComponent mallCourse1 = new Course("电商课程一期", 33);
        CatalogComponent mallCourse2 = new Course("电商课程二期", 44);
        CatalogComponent designPattern = new Course("设计模式", 55);
        javaCourseCatalog.add(mallCourse1);
        javaCourseCatalog.add(mallCourse2);
        javaCourseCatalog.add(designPattern);

        CatalogComponent platformCourseCatalog = new CourseCatalog("平台课程目录", 1);
        platformCourseCatalog.add(liunxCourse);
        platformCourseCatalog.add(winCourse);
        platformCourseCatalog.add(javaCourseCatalog);
        platformCourseCatalog.print();
    }
}
