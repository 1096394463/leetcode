package com.qiu.design.pattern.behavioral.visitor;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/23
 */
public class Visitor implements IVisitor{
    @Override
    public void visit(FreeCourse freeCourse) {
        System.out.println("免费课程:"+freeCourse.getName());
    }

    @Override
    public void visit(CodingCourse codingCourse) {
        System.out.println("付费课程:"+codingCourse.getName()+","+codingCourse.getPrice());
    }
}
