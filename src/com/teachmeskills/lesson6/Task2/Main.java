package com.teachmeskills.lesson6.Task2;

/**
 *  2. Create a CreditCard class with the account number and current account balance fields.
 *  Create one constructor with two parameters.
 *  Create a TransferService class - a transfer service.
 *  Add a method that allows you to add an amount to a credit card.
 *  The method takes an amount and a card as input. Inside the method, create code that adds the amount passed to the method to the current amount on the card passed to the method.
 *  Add a method that allows you to withdraw a certain amount from the card.
 *  The method takes an amount and a card as input. Inside the method, write code that subtracts the transferred amount from the current amount on the passed card.
 *  Add a method that displays current card information to the console.
 *  Think over and implement various checks inside the withdrawal/addition methods: for example, a negative number was passed, 0 was passed, a request to withdraw an amount greater than what is currently on the card, and other possible checks.
 *  Write a program that creates three objects of the CreditCard class with an account number and an initial amount specified.
 *  Test scenario for verification:
 *  Add money to the first two cards and withdraw from the third.
 *  Display the current state of all three cards.
 */

public class Main {
    public static void main(String[] args) {
        CreditCard account1 = new CreditCard("84739182734813748237", 2000);
        CreditCard account2 = new CreditCard("98746321748923057843", 1500);
        CreditCard account3 = new CreditCard("84739182734813748237", 8000);
        TransferService.accrual(account1, 1000);
        TransferService.showAccountInformation(account1);
        TransferService.accrual(account2, 3250);
        TransferService.showAccountInformation(account2);
        TransferService.withdrawal(account3, 7999);
        TransferService.showAccountInformation(account3);


    }
}
