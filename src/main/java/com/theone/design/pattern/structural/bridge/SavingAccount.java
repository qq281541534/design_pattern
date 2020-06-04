package com.theone.design.pattern.structural.bridge;

/**
 * @Author: liuyu
 * @DateTime: 2020/5/17 13:58
 * @Description: 活期账户
 */
public class SavingAccount implements Account {
    public Account openAccount() {
        System.out.println("打开活期账户");
        return new SavingAccount();
    }

    public void showAccountType() {
        System.out.println("这是一个活期账户");
    }
}
