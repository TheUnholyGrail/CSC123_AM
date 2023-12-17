package com.amg.csudh.bank.core;

public class CheckingAccount extends Account{
	//Fields
	int overdraftLimit;
	//Constructor
	public CheckingAccount(AccountHolder accHolder, int overdraftLimit) {
		this.accHolder = accHolder;
		this.overdraftLimit = overdraftLimit;
	}
	public CheckingAccount(AccountHolder accHolder) {
		this.accHolder = accHolder;
	}
	//Methods
}
