package com.qiu.design.pattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/23
 */
public class Test {
    public static void main(String[] args) {
        List<Course> courses = new ArrayList<>();
        FreeCourse freeCourse = new FreeCourse();
        freeCourse.setName("test");

        CodingCourse codingCourse = new CodingCourse();
        codingCourse.setName("dahuashejimoshi");
        codingCourse.setPrice(98);

        courses.add(freeCourse);
        courses.add(codingCourse);

        for (Course cours : courses) {
            cours.accept(new Visitor());
        }
    }
}
