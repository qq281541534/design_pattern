package com.theone.design.pattern.behavioral.iterator;

/**
 * @Author: liuyu
 * @DateTime: 2020/6/11 09:31
 * @Description: TODO
 */
public class Test {

    public static void main(String[] args) {
        Course javaCourse = new Course("java课程");
        Course CCCourse = new Course("c++课程");
        Course CCourse = new Course("c语言课程");
        Course pythonCourse = new Course("python课程");
        Course FECourse = new Course("FE课程");

        CourseAggregate courseAggregate = new CourseAggregateImpl();

        courseAggregate.addCourse(javaCourse);
        courseAggregate.addCourse(CCCourse);
        courseAggregate.addCourse(CCourse);
        courseAggregate.addCourse(pythonCourse);
        courseAggregate.addCourse(FECourse);

        System.out.println("------课程列表------");
        printCourse(courseAggregate);

        courseAggregate.removeCourse(CCCourse);
        courseAggregate.removeCourse(CCourse);

        System.out.println("---------删除操作后的课程列表----------");
        printCourse(courseAggregate);
    }

    private static void printCourse(CourseAggregate courseAggregate) {
        CourseIterator iterator = courseAggregate.getIterator();
        while (!iterator.isLastCourse()) {
            Course course = iterator.nextCourse();
            System.out.println(course.getName());
        }

    }
}
