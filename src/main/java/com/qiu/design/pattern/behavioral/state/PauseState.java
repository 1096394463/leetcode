package com.qiu.design.pattern.behavioral.state;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/23
 */
public class PauseState extends CourseVideoState{
    @Override
    void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    @Override
    void speed() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.SPEED_STATE);
    }

    @Override
    void pause() {
        System.out.println("暂停播放");
    }

    @Override
    void stop() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.STOP_STATE);
    }
}
