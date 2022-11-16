package com.qiu.design.pattern.singleton;

/**静态内部类
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/16
 */
public class StaticInnerClassSingleton {
    private static class  InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }
    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }
    private StaticInnerClassSingleton(){

    }
}
