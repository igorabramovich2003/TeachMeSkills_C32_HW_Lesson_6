package com.teachmeskills.lesson6.Task2;


public class TransferService {
    static void accrual(CreditCard account, int sum) {
        if (sum <= 0){
            System.out.println("The operation cannot be performed.");
        }else {
            account.amountOnAccount += sum;
        }
    }
    static void withdrawal(CreditCard account, int sum) {
        if (sum <= 0){
            System.out.println("The operation cannot be performed.");
        }if (account.amountOnAccount < sum){
            System.out.println("The operation cannot be performed.");
        }else {
            account.amountOnAccount -= sum;
        }
    }
    static void showAccountInformation(CreditCard account) {
        System.out.println("Account: " + account.accountNumber + "\n" + "Balance: " + account.amountOnAccount + "\n");
    }
}
