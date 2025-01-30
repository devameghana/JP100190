//package com.bank;

import java.util.Scanner;

public class Main {
	private static  Operation operation = new Operation();

	    public static void main(String[] args) {
	    	
	        startBanking(); 
	    }

	    public static void startBanking() {
	        Scanner scanner = new Scanner(System.in);
1

	        while (true) {
	            System.out.println("\nWelcome to the Banking Application");
	            System.out.println("1. Create New Account");
	            System.out.println("2. Deposit Money");
	            System.out.println("3. Withdraw Money");
	            System.out.println("4. Transfer Money");
	            System.out.println("5. Display Account Details");
	            System.out.println("6. Check Balance");
	            System.out.println("7. Exit");
	            System.out.print("Enter your choice: ");

	            int choice = scanner.nextInt();
	            scanner.nextLine(); 
	            switch (choice) {
	                case 1:
	                    createAccountUI(scanner);
	                    break;
	                case 2:
	                    depositUI(scanner);
	                    break;
	                case 3:
	                    withdrawUI(scanner);
	                    break;
	                case 4:
	                    transferUI(scanner);
	                    break;
	                case 5:
	                    operation.displayAllAccounts();
	                    break;
	                case 6:
	                	checkbalance(scanner);
	                	break;
	                case 7:
	                    System.out.println("Thank you for using the Banking Application.");
	                    return;
	                default:
	                    System.out.println("Invalid choice. Please choose again.");
	            }
	        }
	    }

	    private static void checkbalance(Scanner scanner) {
	    	System.out.print("Enter Account Number: ");
	    	 String accountNumber = scanner.nextLine();
	    	 operation.balance(accountNumber);
		}

		private static void createAccountUI(Scanner scanner) {
	        System.out.print("Enter Account Number: ");
	        String accountNumber = scanner.nextLine();
	        System.out.print("Enter Account Holder Name: ");
	        String accountHolder = scanner.nextLine();
	        operation.createAccount(accountNumber, accountHolder);
	    }

	    private static void depositUI(Scanner scanner) {
	        System.out.print("Enter Account Number: ");
	        String accountNumber = scanner.nextLine();
	        System.out.print("Enter Amount to Deposit: ");
	        double amount = scanner.nextDouble();
	        scanner.nextLine(); 
	        operation.depositToAccount(accountNumber, amount);
	    }

	    private static void withdrawUI(Scanner scanner) {
	        System.out.print("Enter Account Number: ");
	        String accountNumber = scanner.nextLine();
	        System.out.print("Enter Amount to Withdraw: ");
	        double amount = scanner.nextDouble();
	        scanner.nextLine(); 
	        operation.withdrawFromAccount(accountNumber, amount);
	    }
	    private static void transferUI(Scanner scanner) {
	        System.out.print("Enter From Account Number: ");
	        String fromAccount = scanner.nextLine();
	        System.out.print("Enter To Account Number: ");
	        String toAccount = scanner.nextLine();
	        System.out.print("Enter Amount to Transfer: ");
	        double amount = scanner.nextDouble();
	        scanner.nextLine(); 
	        operation.transferBetweenAccounts(fromAccount, toAccount, amount);
	    }
	}

