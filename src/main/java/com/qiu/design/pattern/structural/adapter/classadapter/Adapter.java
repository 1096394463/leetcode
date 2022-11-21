package com.qiu.design.pattern.structural.adapter.classadapter;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/21
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        super.adapteeRequest();
    }
}
