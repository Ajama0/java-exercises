package com.amigoscode._3_oop._4_polymorphism;

public class BankTransferPayment implements Payment{
    // TODO: 4 - Create a BankTransferPayment class that implements Payment.
//   - Add a private field: bankAccountId (String)
//   - Create a constructor that takes the bankAccountId
//   - Implement processPayment() to print:
//     "Processing bank transfer of $<amount> from account <bankAccountId>"
//     and return true
//   - Implement getPaymentMethod() to return "Bank Transfer"

    private String bankAccountId;

    public BankTransferPayment(String bankAccountId) {
        this.bankAccountId = bankAccountId;
    }

    @Override
    public Boolean processPayment(double amount) {
        System.out.println("processing bank transfer of " + amount + " from " + bankAccountId);

        return true;
    }

    @Override
    public String getPaymentMethod() {
        return "Bank Transfer Payment";
    }
}
