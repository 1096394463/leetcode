package com.qiu.design.pattern.structural.bridge;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/21
 */
public class SavingAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开活期账号");
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个活期账号");
    }
}
