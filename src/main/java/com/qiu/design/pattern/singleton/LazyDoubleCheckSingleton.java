package com.qiu.design.pattern.singleton;

/**双检单利，线程安全
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/16
 */
public class LazyDoubleCheckSingleton {
    private static volatile LazyDoubleCheckSingleton lazySingleton = null;

    private LazyDoubleCheckSingleton() {

    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (lazySingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazySingleton==null){
                    lazySingleton= new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazySingleton;
    }
}
