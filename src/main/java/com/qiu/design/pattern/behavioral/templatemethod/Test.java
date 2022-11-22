package com.qiu.design.pattern.behavioral.templatemethod;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/22
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("设计模式课程start--");
        ACourse designPatternCourse = new DesignPatternCourse();
        designPatternCourse.makeCourse();
        System.out.println("设计模式课程end--");
        System.out.println("前端课程start--");
        ACourse feCourse = new FECourse(true);
        feCourse.makeCourse();
        System.out.println("前端课程end--");
    }
}
