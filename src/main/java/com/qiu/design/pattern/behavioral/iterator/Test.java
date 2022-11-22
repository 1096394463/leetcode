package com.qiu.design.pattern.behavioral.iterator;

import java.util.ArrayList;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/22
 */
public class Test {
    public static void main(String[] args) {
        Course course1 = new Course("Java基础");
        Course course2 = new Course("Java进阶");
        Course course3 = new Course("Java高级");
        Course course4 = new Course("spring基础");
        Course course5 = new Course("spring高级");

        CourseAggregate courseAggregate = new CourseAggregateImpl(new ArrayList());
        courseAggregate.addCourse(course1);
        courseAggregate.addCourse(course2);
        courseAggregate.addCourse(course3);
        courseAggregate.addCourse(course4);
        courseAggregate.addCourse(course5);

        System.out.println("----课程列表----");
        printCourses(courseAggregate);

        courseAggregate.removeCourse(course3);

        System.out.println("----删除后的课程列表----");
        printCourses(courseAggregate);
    }

    private static void printCourses(CourseAggregate courseAggregate) {
        CourseIterator courseIterator = courseAggregate.getCourseIterator();
        while (courseIterator.hasNextCourse()){
            Course course = courseIterator.nextCourse();
            System.out.println(course.getName());
        }
    }
}
