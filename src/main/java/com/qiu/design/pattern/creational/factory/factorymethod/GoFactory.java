package com.qiu.design.pattern.creational.factory.factorymethod;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/15
 */
public class GoFactory extends VideoFactory{
    @Override
    Video getVideo() {
        return new GoVideo();
    }
}
