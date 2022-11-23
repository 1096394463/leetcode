package com.qiu.design.pattern.behavioral.visitor;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/23
 */
public class CodingCourse extends Course{
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
