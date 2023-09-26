package ba_package;
//Imports
import java.util.ArrayList;

public class BankAccount {
	//Fields
	private static String name = "Default Name";
	private int accountNumber;
	private boolean open = true; //Determine wether account is open or closed
	private ArrayList<Double> transactions = new ArrayList<Double>();
	//Constructor
	public BankAccount(String name, int accNum) {
		name = this.name;	//Prints obj's name defined in the field
		accountNumber = accNum;
	}
	//Methods	
	public void deposit(double amount) {
		if(isOpen()) {
			transactions.add(amount);
		} else {
			System.out.println("Your account is closed. You can't deposit");
		}
	}
	
	public void withdraw(double amount) {
		if(balance() - amount >= 0) {
			transactions.add(amount*-1);
		} else {
			//if withdraw exceeds balance
		}

	}
	
	public void printStatement() {
		System.out.print(name + "\n");
		for(double d: transactions) {
			System.out.println(d);
		}
	}
	
	public double balance() {
		double startingBalance = 0;
		for(double d: transactions) {
			startingBalance += d;
		}
		return startingBalance;
	}
	
	public void close() {
		open = false;
	}
	
	public boolean isOpen() {
		return open;
	}
	
}
