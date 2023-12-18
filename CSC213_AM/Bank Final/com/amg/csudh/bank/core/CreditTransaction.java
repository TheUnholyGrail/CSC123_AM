package com.amg.csudh.bank.core;

public class CreditTransaction extends Transaction{
	public CreditTransaction(double amount) {
		super(amount);
		// TODO Auto-generated constructor stub
	}

	//Fields
	//Constructor
	//Methods
	//Extra
	@Override
	public String toString() {
		return transID + " : Credit : " + amount;
	}
}
