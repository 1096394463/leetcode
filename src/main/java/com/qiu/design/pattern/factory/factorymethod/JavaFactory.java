package com.qiu.design.pattern.factory.factorymethod;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/15
 */
public class JavaFactory extends VideoFactory{
    @Override
    Video getVideo() {
        return new JavaVideo();
    }
}
