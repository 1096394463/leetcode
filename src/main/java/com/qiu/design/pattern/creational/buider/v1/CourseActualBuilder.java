package com.qiu.design.pattern.creational.buider.v1;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/15
 */
public class CourseActualBuilder extends CourseBuilder{
    private Course course = new Course();
    @Override
    void buildName(String name) {
        course.setName(name);
    }

    @Override
    void buildType(String type) {
        course.setType(type);
    }

    @Override
    void buildVideo(String video) {
        course.setVideo(video);
    }

    @Override
    void buildArticle(String article) {
        course.setArticle(article);
    }

    @Override
    void buildQa(String qa) {
        course.setQa(qa);
    }

    @Override
    Course makeCourse() {
        return course;
    }
}
