package com.qiu.design.pattern.behavioral.visitor;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/23
 */
public interface IVisitor {
     void visit(FreeCourse freeCourse);
    void visit(CodingCourse codingCourse);
}
