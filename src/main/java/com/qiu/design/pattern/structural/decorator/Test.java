package com.qiu.design.pattern.structural.decorator;

import com.qiu.design.pattern.structural.decorator.v2.Battercake;
import com.qiu.design.pattern.structural.decorator.v2.ABattercake;
import com.qiu.design.pattern.structural.decorator.v2.EggDecorator;
import com.qiu.design.pattern.structural.decorator.v2.SausageDecorator;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/21
 */
public class Test {
    public static void main(String[] args) {
        ABattercake battercake ;
        battercake = new Battercake();
        battercake = new EggDecorator(battercake);
        battercake = new SausageDecorator(battercake);
        System.out.println(battercake.getDesc()+"___"+battercake.cost());
    }
}
