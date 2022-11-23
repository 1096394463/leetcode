package com.qiu.design.pattern.behavioral.observer;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/23
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course("Java基础");
        Teacher teacher = new Teacher("小王");
        course.addObserver(teacher);

        Question question = new Question();
        question.setQuestionContent("xxxxxx");
        question.setUserName("小邱");
        course.produceQuestion(question);
    }
}
