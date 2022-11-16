package com.qiu.design.pattern.singleton;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/16
 */
public class Test {
    public static void main(String[] args) {
        EnumInstance instance = EnumInstance.getInstance();
        instance.setData("a");
        System.out.println(instance.getData());
        EnumInstance instance1 = EnumInstance.getInstance();
        System.out.println(instance1.getData());
        System.out.println(instance==instance1);
    }
}
