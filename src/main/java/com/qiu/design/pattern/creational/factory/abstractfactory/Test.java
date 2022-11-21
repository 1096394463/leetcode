package com.qiu.design.pattern.creational.factory.abstractfactory;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/15
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory javaFactory = new JavaCourseFactory();
        Article article = javaFactory.getArticle();
        article.articleInfo();
        CourseFactory goCourseFactory = new GoCourseFactory();
        Video video = goCourseFactory.getVideo();
        video.videoInfo();
    }
}
