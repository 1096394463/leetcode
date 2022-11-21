package com.qiu.design.pattern.structural.facade;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/21
 */
public class QualifyService {
    public boolean  isAvailable(PointsGift pointsGift){
        System.out.println("校验"+pointsGift.getName());
        return true;
    }
}
