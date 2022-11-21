package com.qiu.design.pattern.structural.bridge;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/21
 */
public class Test {
    public static void main(String[] args) {
        ABCBank abcBank = new ABCBank(new DepositAccount());
        Account account = abcBank.openAccount();
        account.showAccountType();


    }
}
