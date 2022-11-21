package com.qiu.design.pattern.creational.singleton;

/**懒汉式 非线程安全
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/16
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton= new LazySingleton();
        }
        return lazySingleton;
    }
}
