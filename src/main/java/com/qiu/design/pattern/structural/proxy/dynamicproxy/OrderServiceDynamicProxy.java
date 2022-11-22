package com.qiu.design.pattern.structural.proxy.dynamicproxy;

import com.qiu.design.pattern.structural.proxy.Order;
import com.qiu.design.pattern.structural.proxy.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/22
 */
public class OrderServiceDynamicProxy implements InvocationHandler {
    private Object target;

    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    public Object bind() {
        Class cls = target.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object arg = args[0];
        beforeMethod(arg);
        Object invoke = method.invoke(target, args);
        afterMethod();
        return invoke;
    }

    private void beforeMethod(Object obj) {
        System.out.println("before.....");
        Integer userId = 0;
        if (obj instanceof Order) {
            Order order = (Order) obj;
            userId = order.getUserId();
        }

        int dbRouter = userId % 2;
        System.out.println("动态代理分配到【db" + dbRouter + "】处理数据");
        //模拟设置dataSource
        DataSourceContextHolder.setDBType(String.valueOf(dbRouter));
    }

    private void afterMethod() {
        System.out.println("after....");
    }
}
