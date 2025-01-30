//package com.bank;

public class Account {
	private String accNo;
    private String accHolder;
    private double balance;

    // Constructor
    public Account(String accountNumber, String accountHolder) {
        this.accNo = accountNumber;
        this.accHolder = accountHolder;
        this.balance = 0.0; 
    }

    // Deposit money into the account
    public void depositToAccount(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully. Available Balance: " + balance);
        } else {
            System.out.println("Invalid amount. Please enter a valid number.");
        }
    }

    // Withdraw money from the account
    public void withdrawFromAccount(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a valid number.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Transaction failed.");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn successfully. Available Balance: " + balance);
        }
    }

    // Transfer money to another bank account
    public void transfer(Account otherAccount, double amount) {
        if (amount <= balance) {
            this.withdrawFromAccount(amount); // Withdraw from this account
            otherAccount.depositToAccount(amount); // Deposit into the other account
            System.out.println("Transfer successful. Balance: " + this.balance);
        } else {
            System.out.println("Insufficient balance. Transfer failed.");
        }
    }

    // Display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accNo + ", Account Holder: " + accHolder + ", Balance: " + balance);
    }

    // Getters and Setters
    public String getAccountNumber() { return accNo; }
    public void setAccountNumber(String accountNumber) { this.accNo = accountNumber; }
    public String getAccountHolder() { return accHolder; }
    public void setAccountHolder(String accountHolder) { this.accHolder = accountHolder; }
    public double getBalance() { return balance; }
}
