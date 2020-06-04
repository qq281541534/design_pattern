package com.theone.design.pattern.structural.bridge;

/**
 * @Author: liuyu
 * @DateTime: 2020/5/18 12:17
 * @Description: 工商银行
 */
public class ICBCBank extends Bank {
    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开工商银行账号");
        // 这里注意要委托给account对象打开账户，不应该重新实现打开账户的逻辑
        account.openAccount();
        return account;
    }
}
