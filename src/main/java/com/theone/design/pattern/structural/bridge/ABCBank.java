package com.theone.design.pattern.structural.bridge;

/**
 * @Author: liuyu
 * @DateTime: 2020/5/19 11:17
 * @Description: 农业银行
 */
public class ABCBank extends Bank {
    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开农业银行账号");
        account.openAccount();
        return account;
    }
}
