package com.amg.csudh.bank.core;

import java.util.ArrayList;

public class Bank {
	//Fields
		ArrayList<Account> accounts = new ArrayList<Account>();
		//Currency obj
	//Constructor
		public Bank() {
			
		}
	//Methods
		public void addAccount(Account a) {
			this.accounts.add(a);
		}
		//Close Account
			//Run process and until conditions are met remove account(?)
		//deposit
		//withdraw
		//listAccounts
		public void listAccounts() {
			for(Account a: accounts) {
				System.out.println(a);
			}
		}
		public void accountStatement(String accountID) {
			int counter = 0;
			int i = 0;
			for(Account a: accounts) {
				if(a.getBankID().equals(accountID)) {
					counter = 1;
					i = accounts.indexOf(a);
				}
			}
			if(counter == 1) {
				accounts.get(i).listTransactions();
			} else {
				System.out.println("The account number you inputted does not exist.");
			}
		}
		
		//Maybe Currency Stuff
	//Extra
}
