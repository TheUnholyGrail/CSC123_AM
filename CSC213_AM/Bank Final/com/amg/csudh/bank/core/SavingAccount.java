package com.amg.csudh.bank.core;

public class SavingAccount extends Account{
	//Fields
	//Constructor
	public SavingAccount(AccountHolder accHolder) {
		this.accHolder = accHolder;
	}
	//Methods
	//Extra
	@Override
	public String toString() {
		return accountID + " (Saving) " + accHolder + String.format(": %.2f", balance) + " : Account " + getStatus(isOpen);
	}
}
