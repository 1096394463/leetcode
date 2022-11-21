package com.qiu.design.pattern.structural.bridge;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/21
 */
public class ABCBank extends Bank{
    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国农业银行账号");
        account.openAccount();
        return account;
    }
}
