package com.qiu.design.pattern.behavioral.visitor;


/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/23
 */
public class FreeCourse extends Course {
    @Override
    void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
