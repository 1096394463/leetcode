package com.qiu.design.pattern.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/22
 */
public class PromotionStrategyFactory {
    private static Map<String,PromotionStrategy> PROMOTION_STRATEGY_MAP=new HashMap<>();

    static {
        PROMOTION_STRATEGY_MAP.put("liJian",new LiJianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put("manJian",new ManJianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put("fanXian",new FanXianPromotionStrategy());
    }

    public static PromotionStrategy getPromotionStrategy(String key){
        return PROMOTION_STRATEGY_MAP.get(key);
    }
}
