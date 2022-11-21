package com.qiu.design.pattern.structural.decorator.v1;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/21
 */
public class BattercakeWithEgg extends Battercake{
    @Override
    public String getDesc() {
        return super.getDesc()+"加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost()+1;
    }
}
