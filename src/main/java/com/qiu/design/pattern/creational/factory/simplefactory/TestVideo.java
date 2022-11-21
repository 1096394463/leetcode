package com.qiu.design.pattern.creational.factory.simplefactory;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/15
 */
public class TestVideo {
    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        Video java = videoFactory.getVideo("Java");
        java.videoInfo();
    }
}
