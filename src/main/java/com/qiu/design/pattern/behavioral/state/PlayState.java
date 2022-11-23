package com.qiu.design.pattern.behavioral.state;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/23
 */
public class PlayState extends CourseVideoState {
    @Override
    void play() {
        System.out.println("播放视频");
    }

    @Override
    void speed() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.SPEED_STATE);
    }

    @Override
    void pause() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PAUSE_STATE);
    }

    @Override
    void stop() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.STOP_STATE);
    }
}
