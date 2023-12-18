package com.amg.csudh.bank.core;

public class DebitTransaction extends Transaction{
	public DebitTransaction(double amount) {
		super(amount);
		// TODO Auto-generated constructor stub
	}

	//Fields
	//Constructor
	//Methods
	//Extra
	@Override
	public String toString() {
		return transID + " : Debit : " + amount;
	}
}
