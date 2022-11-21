package com.qiu.design.pattern.structural.facade;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/21
 */
public class ShippingService {
    public String shipGift(PointsGift pointsGift){
        System.out.println(pointsGift.getName()+"进入物流");
        return "777";
    }
}
