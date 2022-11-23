package com.qiu.design.pattern.behavioral.chainofresponsibility;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/23
 */
public class Test {
    public static void main(String[] args) {
        ArticleApprover articleApprover = new ArticleApprover();
        VideoApprover videoApprover = new VideoApprover();
        Course course = new Course();
        course.setName("Java");
        course.setArticle("article");
        course.setVideo("video");
        articleApprover.setNextApprover(videoApprover);
        articleApprover.deploy(course);
    }
}
