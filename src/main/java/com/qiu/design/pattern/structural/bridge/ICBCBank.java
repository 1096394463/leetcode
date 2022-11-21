package com.qiu.design.pattern.structural.bridge;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/21
 */
public class ICBCBank extends Bank{

    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开工商银行账号");
        account.openAccount();
        return account;
    }
}
