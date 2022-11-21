package com.qiu.design.pattern.creational.singleton;

/**饿汉式
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/16
 */
public class HungrySingleton {
    private static final HungrySingleton hungrySingleton=new HungrySingleton();
    private HungrySingleton(){

    }
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    /**
     * 防止序列化破坏单利
     * @return
     */
    private Object readResolve(){
        return hungrySingleton;
    }
}
