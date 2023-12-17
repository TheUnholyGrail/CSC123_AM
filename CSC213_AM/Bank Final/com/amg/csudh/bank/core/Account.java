package com.amg.csudh.bank.core;

public class Account {
	//Fields
	protected boolean isOpen = true;
	protected AccountHolder accHolder;
	String bankID;
	
	private static long idCounter = 0;
	//Constructor
	//Method
	public static String createBankID() {
		return String.valueOf(++idCounter);
	}
	public void setBankID(String bankID) {
		this.bankID = bankID;
	}
	public String getBankID() {
		return bankID;
	}
}
//cAccount.setBankID(createBankID());
//cAccount.setBankID();
// + cAccount.getBankID();