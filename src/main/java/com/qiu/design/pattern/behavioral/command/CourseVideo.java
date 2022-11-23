package com.qiu.design.pattern.behavioral.command;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/23
 */
public class CourseVideo {
    private String name;

    public CourseVideo(String name) {
        this.name = name;
    }

    public void open(){
        System.out.println(this.name+"课程开放");
    }
    public void close(){
        System.out.println(this.name+"课程关闭");
    }
}
