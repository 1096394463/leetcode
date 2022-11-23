package com.qiu.design.pattern.behavioral.state;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/23
 */
public abstract class CourseVideoState {
    protected CourseVideoContext courseVideoContext;

    public void setCourseVideoContext(CourseVideoContext courseVideoContext) {
        this.courseVideoContext = courseVideoContext;
    }

    abstract void play();

    abstract void speed();

    abstract void pause();

    abstract void stop();
}
