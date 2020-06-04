package com.theone.design.pattern.structural.bridge;

/**
 * @Author: liuyu
 * @DateTime: 2020/5/17 13:58
 * @Description: 定期账户
 */
public class DepositAccount implements Account {
    public Account openAccount() {
        System.out.println("打开定期账户");
        return new DepositAccount();
    }

    public void showAccountType() {
        System.out.println("这是一个定期账户");
    }
}
