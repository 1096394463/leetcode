package com.qiu.design.pattern.structural.adapter.objectadapter;

import com.qiu.design.pattern.structural.adapter.classadapter.Adaptee;
import com.qiu.design.pattern.structural.adapter.classadapter.Target;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/21
 */
public class Adapter  implements Target {
    private Adaptee adaptee=new Adaptee();
    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}
