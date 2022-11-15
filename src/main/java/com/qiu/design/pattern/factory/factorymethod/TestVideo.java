package com.qiu.design.pattern.factory.factorymethod;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/15
 */
public class TestVideo {
    public static void main(String[] args) {
        JavaFactory javaFactory = new JavaFactory();
        Video video = javaFactory.getVideo();
        video.videoInfo();
    }
}
