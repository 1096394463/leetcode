package com.qiu.design.pattern.behavioral.visitor;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/23
 */
public abstract class Course {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void accept(IVisitor visitor);
}
