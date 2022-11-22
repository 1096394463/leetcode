package com.qiu.design.pattern.behavioral.iterator;

import java.util.List;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/22
 */
public class CourseIteratorImpl implements CourseIterator {
    private List courseList;
    private int position;
    Course course;

    public CourseIteratorImpl(List courseList) {
        this.courseList = courseList;
    }

    @Override
    public Course nextCourse() {
        System.out.println("返回课程，位置是：" + position);
        course = (Course) courseList.get(position);
        position++;
        return course;
    }

    @Override
    public boolean hasNextCourse() {
        if (position < courseList.size()) {
            return true;
        }
        return false;
    }
}
