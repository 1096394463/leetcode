package com.qiu.design.pattern.structural.decorator.v2;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/21
 */
public abstract class AbstractDecorator extends ABattercake{
    private ABattercake aBattercake;

    public AbstractDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }

    @Override
    public String getDesc() {
        return aBattercake.getDesc();
    }

    @Override
    public int cost() {
        return aBattercake.cost();
    }
}
