package com.amg.csudh.bank.core;

import java.util.ArrayList;

public class Bank {
	//Fields
		ArrayList<Account> accounts = new ArrayList<Account>();
	//Constructor
		public Bank() {
			
		}
	//Methods
		public void addAccount(Account a) {
			this.accounts.add(a);
		}
		public void closeAccount(String accountID) {
			Account targetAccount = findAccount(accountID);
			if(targetAccount != null) {
				//Close Account
				targetAccount.setStatus(false);
				System.out.println("Account closed, current balance is: " + String.format(": %.2f", targetAccount.getBalance()));
			} else {
				System.out.println("Account not found.");
			}
		}
		public void deposit(String accountID, double dAmount) {
			//Find the account
			Account targetAccount = findAccount(accountID);
			//
			if(targetAccount != null) {
				//Check deposit conditions
				if(targetAccount.getStatus() == true || (targetAccount.getStatus() == false && targetAccount.getBalance() <= 0)) {
					//Deposit Authorized
					targetAccount.setBalance(targetAccount.getBalance() + dAmount);
					System.out.println("Deposit successful, the new balance is: " + String.format(": %.2f", targetAccount.getBalance()));
					CreditTransaction db = new CreditTransaction(dAmount);
		            db.setTransID(Transaction.createTransID());
		            targetAccount.addTransaction(db);
				} else {
					System.out.println("Deposit Failed. The account is not open.");
				}
			} else {
				System.out.println("Account not found.");
			}
		}
		public void withdraw(String accountID, double wAmount) {
			//Find the account
			Account targetAccount = findAccount(accountID);
			//
			if(targetAccount != null) {
				// Check if the account was found
			        // Check withdrawal conditions
			        if ((targetAccount instanceof CheckingAccount)  &&
			                ((targetAccount.getStatus() == true && targetAccount.getBalance() - wAmount >= -((CheckingAccount) targetAccount).getOverDraftLimit()) ||
			                        (targetAccount.getStatus() == false && targetAccount.getBalance() >= wAmount)) ||
			                (targetAccount instanceof SavingAccount && (targetAccount.getStatus() == true && targetAccount.getBalance() >= wAmount ||
			                targetAccount.getStatus() == false && targetAccount.getBalance() - wAmount >= 0))) {
			            // Withdrawal is authorized
			            targetAccount.setBalance(targetAccount.getBalance() - wAmount);
			            System.out.println("Withdrawal successful, the new balance is: " + String.format(": %.2f", targetAccount.getBalance()));
			            DebitTransaction db = new DebitTransaction(wAmount);
			            db.setTransID(Transaction.createTransID());
			            targetAccount.addTransaction(db);
			        } else {
			            System.out.println("Withdrawal failed, the balance is: " + String.format(": %.2f", targetAccount.getBalance()));
			        }
			}else {
				System.out.println("Account not found.");
			}
		}
		public void listAccounts() {
			for(Account a: accounts) {
				System.out.println(a);
			}
		}
		public void accountStatement(String accountID) {
			Account targetAccount = findAccount(accountID);
			if(targetAccount != null) {
				targetAccount.listTransactions();
			} else {
				System.out.println("Account does not exist.");
			}
		}
		private Account findAccount(String accountID) {
			for(Account a: accounts) {
				if(a.getBankID().equals(accountID)) {
					return a;
				}
			}
			return null;
		}
}
