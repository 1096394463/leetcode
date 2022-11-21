package com.qiu.design.pattern.structural.adapter;

import com.qiu.design.pattern.structural.adapter.classadapter.Adapter;
import com.qiu.design.pattern.structural.adapter.classadapter.ConcreteTarget;
import com.qiu.design.pattern.structural.adapter.classadapter.Target;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/21
 */
public class Test {
    public static void main(String[] args) {
        Target concreteTarget = new ConcreteTarget();
        Target adapter = new Adapter();
        adapter.request();
    }
}
