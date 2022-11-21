package com.qiu.design.pattern.structural.decorator.v2;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/21
 */
public class Battercake extends ABattercake {
    @Override
    public String getDesc() {
        return "煎饼";
    }

    @Override
    public int cost() {
        return 8;
    }
}
