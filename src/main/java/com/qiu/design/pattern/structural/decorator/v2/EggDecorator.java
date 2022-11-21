package com.qiu.design.pattern.structural.decorator.v2;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/21
 */
public class EggDecorator extends AbstractDecorator{
    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    public String getDesc() {
        return super.getDesc()+"加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost()+1;
    }
}
