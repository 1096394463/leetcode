package com.qiu.design.pattern.creational.buider;

import com.qiu.design.pattern.creational.buider.v2.Course;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/15
 */
public class Test {
    public static void main(String[] args) {
       /* CourseBuilder courseActualBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseActualBuilder);
        Course course = coach.makeCourse("建造者模式", "设计", "video", "手记", "问答");
        System.out.println(course);*/

        Course build = new Course.CourseBuilder().buildName("建造者模式").buildArticle("手记").build();
        System.out.println(build);
    }
}
