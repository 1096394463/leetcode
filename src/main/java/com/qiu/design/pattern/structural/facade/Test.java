package com.qiu.design.pattern.structural.facade;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/21
 */
public class Test {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift();
        pointsGift.setName("显卡");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(pointsGift);
    }
}
