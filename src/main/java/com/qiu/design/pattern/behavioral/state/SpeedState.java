package com.qiu.design.pattern.behavioral.state;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/23
 */
public class SpeedState extends CourseVideoState{
    @Override
    void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }
    @Override
    void speed() {
        System.out.println("倍速播放");
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
