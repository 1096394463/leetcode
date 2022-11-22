package com.qiu.design.pattern.behavioral.iterator;

import java.util.List;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/22
 */
public class CourseAggregateImpl implements CourseAggregate{
    private List courseList;

    public CourseAggregateImpl(List courseList) {
        this.courseList = courseList;
    }

    @Override
    public void addCourse(Course course) {
        courseList.add(course);
    }

    @Override
    public void removeCourse(Course course) {
        courseList.remove(course);
    }

    @Override
    public CourseIterator getCourseIterator() {
        return new CourseIteratorImpl(courseList);
    }
}
