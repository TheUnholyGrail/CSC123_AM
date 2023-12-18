package com.amg.csudh.bank.core;
import java.util.Date;
public class AccountHolder {
	//Fields
	//These variables are strings as they do not serve a greater purpose
	protected String name;	
	protected String SSN;
	protected String address;
	
	protected Date dob;	//Date of Birth - date obj
	//Constructor
	public AccountHolder(String name, String SSN, String address, Date dob)
	{
		this.name = name;
		this.SSN = SSN;
		this.address = address;
		this.dob = dob;
	}
	//Methods
	public int getAge() {
		final long MS_TO_YEARS = 31556952000L;	//Years to ms ratio
		Date currentDate = new Date();	//Current Date
		
		//Convert currentDate and dob into ms
		int age = (int)((currentDate.getTime()- dob.getTime())/MS_TO_YEARS);
		return age;
	}
	//Extra
	@Override
	
	public String toString() {
		return ": " + name.replaceAll(" ", " : ")+ " : " + SSN + " ";
	}
}
