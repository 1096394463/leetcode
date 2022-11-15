package com.qiu.design.pattern.factory.abstractfactory;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/15
 */
public class GoCourseFactory implements CourseFactory{
    @Override
    public Video getVideo() {
        return new GoVideo();
    }

    @Override
    public Article getArticle() {
        return new GoArticle();
    }
}
