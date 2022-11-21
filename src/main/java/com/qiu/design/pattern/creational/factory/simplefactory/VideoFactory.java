package com.qiu.design.pattern.creational.factory.simplefactory;

import java.util.Objects;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/15
 */
public class VideoFactory {
    public   Video getVideo(String type){
        if(Objects.equals("Java",type)){
            return new JavaVideo();
        }else {
            return new GoVideo();
        }
    }
}
