package com.qiu.design.pattern.structural.facade;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/21
 */
public class GiftExchangeService {
    private PointsPaymentService pointsPaymentService=new PointsPaymentService();
    private QualifyService qualifyService=new QualifyService();
    private ShippingService shippingService=new ShippingService();



    public void giftExchange(PointsGift pointsGift){
        if(qualifyService.isAvailable(pointsGift)){
            if(pointsPaymentService.pay(pointsGift)){
                String s = shippingService.shipGift(pointsGift);
                System.out.println("兑换成功,物流号"+s);
            }
        }
    }
}
