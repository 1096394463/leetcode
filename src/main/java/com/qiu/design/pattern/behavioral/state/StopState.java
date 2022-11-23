package com.qiu.design.pattern.behavioral.state;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/23
 */
public class StopState extends CourseVideoState {
    @Override
    void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    @Override
    void speed() {
        System.out.println("error 停止状态不能更换到快进");
    }

    @Override
    void pause() {
        System.out.println("error 停止状态不能更换到暂停");
    }

    @Override
    void stop() {
        System.out.println("暂停播放");
    }
}
