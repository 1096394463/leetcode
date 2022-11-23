package com.qiu.design.pattern.behavioral.mediator;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/23
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void sendMessage(String message) {
        StudyGroup.showMessage(this, message);
    }
}
