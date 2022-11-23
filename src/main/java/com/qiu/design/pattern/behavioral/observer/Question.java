package com.qiu.design.pattern.behavioral.observer;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/23
 */
public class Question {
    private String userName;
    private String questionContent;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }
}
