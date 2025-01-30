//package com.bank;

import java.util.ArrayList;
import java.util.List;

public class Operation {
	double amount;
	private List<Account> accounts = new ArrayList<>();

    // Create a new bank account
    public void createAccount(String accountNumber, String accountHolder) {
        Account newAccount = new Account(accountNumber, accountHolder);
        accounts.add(newAccount);
        System.out.println("New account created for " + accountHolder + " with Account Number: " + accountNumber);
    }

    // Find an account by account number
    private Account getAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    // Deposit money into an account
    public void depositToAccount(String accountNumber, double amount) {
        Account account = getAccount(accountNumber);
        if (account != null) {
            account.depositToAccount(amount);
        } else {
            System.out.println("Account doesn't exist.");
        }
    }

    // Withdraw money from an account
    public void withdrawFromAccount(String accountNumber, double amount) {
        Account account = getAccount(accountNumber);
        if (account != null) {
            account.withdrawFromAccount(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Transfer money between two accounts
    public void transferBetweenAccounts(String fromAccountNumber, String toAccountNumber, double amount) {
        Account fromAccount = getAccount(fromAccountNumber);
        Account toAccount = getAccount(toAccountNumber);
        if (fromAccount != null && toAccount != null) {
            fromAccount.transfer(toAccount, amount);
        } else {
            System.out.println("One or both accounts not found.");
        }
    }

    // Display details for all accounts
    public void displayAllAccounts() {
        for (Account account : accounts) {
            account.displayAccountDetails();
        }
    }
    
    public void balance(String accountNumber) {
        for (Account account : accounts) {
            if(account.getAccountNumber().equalsIgnoreCase(accountNumber)) {
            	amount = account.getBalance();
            	System.out.println("balance is "+amount);
            	
            }
        else{
        	System.out.println("account doesn't exist");
        }
        }
    }
}
