package com.qiu.design.pattern.structural.facade;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/21
 */
public class PointsPaymentService {
    public boolean pay(PointsGift pointsGift){
        System.out.println("支付"+pointsGift.getName());
        return true;
    }
}
