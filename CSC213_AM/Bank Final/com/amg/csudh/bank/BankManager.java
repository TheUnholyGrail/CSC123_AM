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
		Bank bank = new Bank();
		
		//Start
		Scanner userInput = new Scanner(System.in);
		do {
			//Menu
			System.out.println("1 - Open a Checking Account");
			System.out.println("2 - Open a Saving Account");
			System.out.println("3 - List Accounts");
			System.out.println("4 - Account Statement");
			System.out.println("5 - Deposit Funds");
			System.out.println("6 - Withdraw Funds");
			System.out.println("7 - Close an Account");
			System.out.println("8 - Exit");
			int choice = userInput.nextInt();
			switch(choice) 
			{
			case 1:	//Checking Account Option
				choiceOne(userInput, bank);
				break;
			case 2:	//Savings Account Option
				choiceTwo(userInput, bank);
				break;
			case 3:	//List Accounts
				bank.listAccounts();
				break;
			case 4: //Account Statement
				choiceFour(userInput, bank);
				break;
			case 5:	//Deposit Funds
				choiceFive(userInput, bank);
				break;
			case 6:	//Withdraw Funds
				choiceSix(userInput, bank);
				break;
			case 7:	//Close Account
				choiceSeven(userInput, bank);
			case 8:	//Exit
				System.exit(0);
				break;
			default:
			}
		}while(true);
		
		
		
	}
	//Methods
	public static AccountHolder createAccHolder(Scanner userInput) {	//Returns an Account Holder object
		System.out.println("Enter first name: ");
		String fName = userInput.next();
		System.out.println("Enter last name: ");
		String lName = userInput.next();
		System.out.println("Enter Social Security Number: ");
		String ssn = userInput.next();
		//Get Proper Date object
		Date cDob = null;
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");	//Pattern
		while(cDob == null) {
			System.out.println("Enter date of birth(mm/dd/yyyy): ");
			String dob = userInput.next();
			try {
				cDob = sdf.parse(dob);
			} catch (ParseException e) {
				System.out.println("The date of birth you inputted is invalid.");
				//cDob = null;
			}
		}
		//Outside loop
		AccountHolder client = new AccountHolder(fName+" "+lName,ssn,null, cDob);
		return client;
	}
	//Choices - (Methods)
	public static void choiceOne(Scanner userInput, Bank bank) {
		AccountHolder client = createAccHolder(userInput);
		//Begin Checkings Account Process
		if(client.getAge() >= 18) {
			//Create Checking Account
			System.out.println("Enter overdraft limit: ");
			int overdraftLim = userInput.nextInt();
			CheckingAccount cAccount = new CheckingAccount(client, overdraftLim);
			cAccount.setBankID(Account.createBankID());
			System.out.println("Thank you, the account number is: " + cAccount.getBankID());
			bank.addAccount(cAccount);
		} else if(client.getAge() >= 16) {
			//Create Checking Account
			CheckingAccount cAccount = new CheckingAccount(client);
			cAccount.setBankID(Account.createBankID());
			System.out.println("Thank you, the account number is: " + cAccount.getBankID());
			bank.addAccount(cAccount);
		} else {
			System.out.println("This person is too young to have a savings account.");
			client = null;
		}
	}
	public static void choiceTwo(Scanner userInput, Bank bank) {
		AccountHolder client = createAccHolder(userInput);
		//Begin Savings Account Process
		if(client.getAge() >= 5) {
			SavingAccount sAccount = new SavingAccount(client);
			sAccount.setBankID(Account.createBankID());
			System.out.println("Thank you, the account number is: " + sAccount.getBankID());
			bank.addAccount(sAccount);
		} else {
			System.out.println("This person is too young to have a checking account.");
			client = null;
		}
	}
	public static void choiceFour(Scanner userInput, Bank bank) {
		System.out.println("Enter account number: ");
		String accID = userInput.next();
		bank.accountStatement(accID);
	}
	public static void choiceFive(Scanner userInput, Bank bank) {
		System.out.println("Enter account number: ");
		String accID = userInput.next();
		System.out.println("Enter the amount to deposit: ");
		double dAmount = userInput.nextDouble();
		bank.deposit(accID, dAmount);
	}
	public static void choiceSix(Scanner userInput, Bank bank) {
		System.out.println("Enter account number: ");
		String accID = userInput.next();
		System.out.println("Enter the amount to withdraw: ");
		double wAmount = userInput.nextDouble();
		bank.withdraw(accID, wAmount);
	}
	public static void choiceSeven(Scanner userInput, Bank bank) {
		System.out.println("Enter an account number to close: ");
		String accountID = userInput.next();
		bank.closeAccount(accountID);
	}
}
