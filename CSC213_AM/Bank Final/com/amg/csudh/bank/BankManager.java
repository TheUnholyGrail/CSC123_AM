package com.amg.csudh.bank;
import com.amg.csudh.bank.core.*;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class BankManager {

	public static void main(String[] args) throws ParseException{
		//Import packages and run the program
			//Create bank object
		
		
		//start
		String dob = "09/20/2004";	//String(Input)
		String dob1 = "09202004";	//String(Input)
		
		
		Client client1 = new Client("Alex M", "65131", "148", strToDate(dob));
		System.out.println(strToDate(dob1));
		//System.out.println("Here is your age: " + client1.findAge());
		
	}
	//Other Methods
	public static Date strToDate(String dob) {	
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
