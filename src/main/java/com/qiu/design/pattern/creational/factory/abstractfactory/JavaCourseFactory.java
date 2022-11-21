package com.qiu.design.pattern.creational.factory.abstractfactory;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/15
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
