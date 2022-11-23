package com.qiu.design.pattern.behavioral.observer;

import java.util.Observable;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/23
 */
public class Course  extends Observable {
    private String name;

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void produceQuestion(Question question){
        System.out.println(question.getUserName()+"在"+this.getName()+"提出了问题");
        setChanged();
        notifyObservers(question);
    }
}
