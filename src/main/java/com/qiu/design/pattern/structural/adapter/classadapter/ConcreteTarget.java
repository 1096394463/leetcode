package com.qiu.design.pattern.structural.adapter.classadapter;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/21
 */
public class ConcreteTarget implements Target{
    @Override
    public void request() {
        System.out.println("target目标方法");
    }
}
