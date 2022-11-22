package com.qiu.design.pattern.structural.proxy.staticproxy;

import com.qiu.design.pattern.structural.proxy.IOrderService;
import com.qiu.design.pattern.structural.proxy.Order;
import com.qiu.design.pattern.structural.proxy.OrderServiceImpl;
import com.qiu.design.pattern.structural.proxy.db.DataSourceContextHolder;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/22
 */
public class OrderServiceStaticProxy {
    private IOrderService iOrderService = new OrderServiceImpl();

    public int saveOrder(Order order) {
        beforeMethod(order);
        int i = iOrderService.saveOrder(order);
        afterMethod();
        return i;
    }

    private void beforeMethod(Order order) {
        System.out.println("before.....");
        Integer userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到【db" + dbRouter + "】处理数据");
        //模拟设置dataSource
        DataSourceContextHolder.setDBType(String.valueOf(dbRouter));
    }

    private void afterMethod() {
        System.out.println("after....");
    }
}
