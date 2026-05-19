package com.amigoscode._2_developers._10_exceptions;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount)throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("not enough funds to withdraw, required : ", amount - balance);
        }
        balance -= amount;
    }

        public double getBalance() {
            return balance;
        }





}
