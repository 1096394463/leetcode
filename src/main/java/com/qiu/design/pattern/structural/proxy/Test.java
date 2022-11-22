package com.qiu.design.pattern.structural.proxy;

import com.qiu.design.pattern.structural.proxy.dynamicproxy.OrderServiceDynamicProxy;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/22
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);
        /*OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);*/
        IOrderService proxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        proxy.saveOrder(order);
    }
}
