package com.qiu.design.pattern.behavioral.iterator;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/22
 */
public interface CourseAggregate {
    void addCourse(Course course);

    void removeCourse(Course course);

    CourseIterator getCourseIterator();
}
