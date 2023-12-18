package com.amg.csudh.bank.core;

public class CreditTransaction extends Transaction{
	//Fields
	//Constructor
	//Methods
	//Extra
	@Override
	public String toString() {
		return transID + " : Credit : " + amount;
	}
}
