package com.qiu.design.pattern.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/23
 */
public class Teacher implements Observer {
    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public void update(Observable o, Object arg) {
        Course course= (Course) o;
        Question question= (Question) arg;
        System.out.println(teacherName+"老师的"+course.getName()+"课程接收到一个"+question.getUserName()+"提交到问题"+question.getQuestionContent());
    }
}
