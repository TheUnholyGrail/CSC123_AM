package main_package;
import java.util.Scanner;
public class PalindromeChecker {
	//Alejandro Morales (amorales298@toromail.csudh.edu)
	public static void main(String[] args) {
		//OBJ: Design a program that checks if a provided string (via the command prompt) is a palindrome.
		Scanner userInput = new Scanner(System.in);
		//Get input from user
		System.out.print("Please enter a string: ");
		String uString = userInput.nextLine();
		//Remove punctuation and make lowercase
		uString = uString.replaceAll("\\W|\\p{Punct}", "");
		char[] cArrayRev = new char[uString.length()];
		//Create a reverse of string
		for(int i = cArrayRev.length-1, j = 0;i >= 0; i--, j++) {
			cArrayRev[i] = uString.charAt(j);
		}
		String uStringRev = new String(cArrayRev);
		//Display wether the input was a palindrome
		if(uString.compareToIgnoreCase(uStringRev) == 0) 
		{
			System.out.printf("%s is a palindrome.", uString);
		} else {
			System.out.printf("%s is not a palindrome.", uString);
		}
	}
	
}
