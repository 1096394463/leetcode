package com.qiu.design.pattern.creational.buider.v1;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/15
 */
public class Coach {
    public CourseBuilder courseBuilder;
    public void setCourseBuilder(CourseBuilder courseBuilder){
        this.courseBuilder=courseBuilder;
    }
    public Course makeCourse(String name,String type,String video,String article,String qa ){
        courseBuilder.buildArticle(article);
        courseBuilder.buildQa(qa);
        courseBuilder.buildName(name);
        courseBuilder.buildType(type);
        courseBuilder.buildVideo(video);
        return courseBuilder.makeCourse();
    }

}
