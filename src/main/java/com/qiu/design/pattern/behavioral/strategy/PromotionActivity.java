package com.qiu.design.pattern.behavioral.strategy;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/22
 */
public class PromotionActivity {
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }
    public void executePromotionStrategy(){
        promotionStrategy.doPromotion();
    }
}
