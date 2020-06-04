package com.theone.design.pattern.structural.bridge;

/**
 * @Author: liuyu
 * @DateTime: 2020/5/19 11:25
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        Bank abcBank = new ABCBank(new DepositAccount());
        Account abcAccount = abcBank.openAccount();
        abcAccount.showAccountType();

        Bank abc2Bank = new ABCBank(new SavingAccount());
        Account abc2Account = abc2Bank.openAccount();
        abc2Account.showAccountType();

        Bank icbcBank = new ICBCBank(new DepositAccount());
        Account icbcAccount = icbcBank.openAccount();
        icbcAccount.showAccountType();
    }
}
