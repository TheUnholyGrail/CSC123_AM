package com.amg.csudh.bank.core;

import java.util.ArrayList;

public class Account {
	//Fields
	protected boolean isOpen = true;
	protected AccountHolder accHolder;
	protected double balance = 0;
	
	ArrayList<Transaction> transactions = new ArrayList<Transaction>();
	
	String accountID;
	
	private static long idCounter = 1000;
	//Constructor
	public Account() {
		
	}
	//Method
	public static String createBankID() {
		return String.valueOf(++idCounter);
	}
	public void setBankID(String bankID) {
		this.accountID = bankID;
	}
	public String getBankID() {
		return accountID;
	}
	
	public double getBalance() {
		return this.balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public static String getS(boolean isOpen) {	//Due for change?
		String status;
		if(isOpen == true) {
			status = "Open";
		} else {
			status = "Closed";
		}
		return status;
	}
	public void setStatus(boolean newStatus) {
		this.isOpen = newStatus;
	}
	public boolean getStatus() {
		return this.isOpen;
	}
	public void addTransaction(Transaction transaction) {
		this.transactions.add(transaction);
	}
	public void listTransactions() {
		for(Transaction t: this.transactions) {
			System.out.println(t);
		}
		System.out.printf("\nBalance: %.2f\n", balance);
	}
	
}
	