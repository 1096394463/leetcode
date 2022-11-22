package com.qiu.design.pattern.behavioral.strategy;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/22
 */
public class LiJianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("立减促销");
    }
}
