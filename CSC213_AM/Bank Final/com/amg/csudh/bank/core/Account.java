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
	
	public static String getStatus(boolean isOpen) {
		String status;
		if(isOpen == true) {
			status = "Open";
		} else {
			status = "Closed";
		}
		return status;
	}
	public void addTransaction(Transaction transaction) {
		this.transactions.add(transaction);
	}
	public void listTransactions() {
		for(Transaction t: this.transactions) {
			System.out.println(t);
		}
	}
	//List transactions in a for loop
}
	