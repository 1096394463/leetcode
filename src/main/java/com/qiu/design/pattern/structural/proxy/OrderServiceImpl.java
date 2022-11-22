package com.qiu.design.pattern.structural.proxy;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/22
 */
public class OrderServiceImpl implements IOrderService {
    private IOrderDao iOrderDao = new OrderDaoImpl();

    @Override
    public int saveOrder(Order order) {
        System.out.println("service调用dao");
        return iOrderDao.insert(order);
    }
}
