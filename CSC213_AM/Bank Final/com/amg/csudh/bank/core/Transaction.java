package com.amg.csudh.bank.core;

public class Transaction {
	//Fields
	protected double amount;
	String transID;
	private static long idCounter = 0;
	//Constructor
	public Transaction(double amount) {
		this.amount = amount;
	}
	//Methods
	public static String createTransID() {
		return String.valueOf(++idCounter);
	}
	public void setTransID(String transID) {
		this.transID = transID;
	}
	public String getTransID() {
		return transID;
	}
	public double getAmount() {
		return amount;
	}
	//Extra
}
