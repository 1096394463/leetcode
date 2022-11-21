package com.qiu.design.pattern.creational.buider.v1;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/15
 */
public abstract class CourseBuilder {
    abstract  void  buildName(String name);
    abstract  void  buildType(String type);
    abstract  void  buildVideo(String video);
    abstract  void  buildArticle(String article);
    abstract  void  buildQa(String qa);

    abstract Course makeCourse();
}
