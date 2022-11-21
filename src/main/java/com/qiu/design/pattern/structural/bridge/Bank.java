package com.qiu.design.pattern.structural.bridge;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/21
 */
public abstract class Bank {
    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }
    abstract Account openAccount();
}
