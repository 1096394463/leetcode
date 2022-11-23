package com.qiu.design.pattern.behavioral.command;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/23
 */
public class CloseCourseVideoCommand implements Command{
    private CourseVideo courseVideo;

    public CloseCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.close();
    }
}
