package com.qiu.design.pattern.behavioral.strategy;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/22
 */
public class Test {
    public static void main(String[] args) {
        PromotionActivity liJian = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy("liJian"));
        liJian.executePromotionStrategy();
    }
}
