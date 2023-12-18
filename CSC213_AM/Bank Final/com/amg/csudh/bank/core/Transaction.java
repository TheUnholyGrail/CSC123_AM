package com.amg.csudh.bank.core;

public class Transaction {
	//Fields
	protected double amount;
	String transID;
	private static long idCounter = 0;
	//Constructor
	//Methods
	public static String createTransID() {
		return String.valueOf(++idCounter);
	}
	public void setBankID(String transID) {
		this.transID = transID;
	}
	public String getBankID() {
		return transID;
	}
	public double getAmount() {
		return amount;
	}
	//Extra
}
