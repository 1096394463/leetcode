package com.qiu.design.pattern.structural.proxy;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/22
 */
public class OrderDaoImpl implements IOrderDao{
    @Override
    public int insert(Order order) {
        System.out.println("插入成功");
        return 1;
    }
}
