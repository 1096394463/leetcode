package com.qiu.design.pattern.creational.factory.abstractfactory;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/15
 */
public interface CourseFactory {
    Video getVideo();
    Article getArticle();
}
