package com.theone.design.pattern.structural.bridge;

/**
 * @Author: liuyu
 * @DateTime: 2020/5/18 12:03
 * @Description: 银行
 */
public abstract class Bank {
    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    abstract Account openAccount();
}
