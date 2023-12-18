package com.amg.csudh.bank.core;

public class DebitTransaction extends Transaction{
	//Fields
	//Constructor
	//Methods
	//Extra
	@Override
	public String toString() {
		return transID + " : Debit : " + amount;
	}
}
