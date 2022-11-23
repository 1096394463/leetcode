package com.qiu.design.pattern.behavioral.command;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/23
 */
public class OpenCourseVideoCommand implements Command{
    private CourseVideo courseVideo;

    public OpenCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.open();
    }
}
