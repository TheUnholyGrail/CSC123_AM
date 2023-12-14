package com.amg.csudh.bank;
import com.amg.csudh.bank.core.*;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

import java.util.Scanner;
public class BankManager {

	public static void main(String[] args) throws ParseException{
		//Import packages and run the program
			//Create bank object
		
		
		//Start
		Scanner userInput = new Scanner(System.in);
		do {
			System.out.println("1 - Open a Checking Accout");
			System.out.println("2 - Open a Saving Accout");
			System.out.println("3 - List Accounts");
			System.out.println("4 - Account Statement");
			System.out.println("5 - Deposit Funds");
			System.out.println("6 - Withdraw Funds");
			System.out.println("7 - Close an Account");
			System.out.println("8 - Exit");
			int choice = userInput.nextInt();
			switch(choice) 
			{
			case 1:
				System.out.println("Enter first name: ");
				String fName = userInput.next();
				System.out.println("Enter last name: ");
				String lName = userInput.next();
				System.out.println("Enter Social Security Number: ");
				String ssn = userInput.next();
				System.out.println("Enter date of birth(mm/dd/yy): ");
				String dob = userInput.next();
				AccountHolder client = new AccountHolder(fName+" "+lName,ssn,null,strToDate(dob));
				if(client.findAge() >= 16) {
					//Create Savings Account
					//Overdraft limit?
				} else {
					System.out.println("This person is too young to have a savings account.");
				}
				
				break;
			case 8:
				System.exit(0);
				break;
			default:
			}
			//Open a Checking Account
			//Open a Savings Account
			//List Accounts
			//Deposit Funds
			//Withdraw Funds
			//Close an Account
			//Exit
		}while(true);
		
		
		
	}
	//Other Methods
	public static Date strToDate(String dob) {	//Converts User Input into a date object
		Date cDob = null;
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");	//Pattern
		try {
			cDob = sdf.parse(dob);
		} catch (ParseException e) {
			 System.out.println("The date of birth you inputted is invalid");
			 //Returns null
		}
		//if statement
		return cDob;
	}
}
