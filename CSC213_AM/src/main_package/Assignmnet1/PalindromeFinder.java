package main_package.Assignmnet1;
import java.util.Scanner;
public class PalindromeFinder {
	//Alejandro Morales (amorales298@toromail.csudh.edu)
	public static void main(String[] args) {
		//OBJ: Instead of check if a phrase or word is a palindrome, your program will take as input a sentence/string of any length and print all words that appeared to be palindromes
		Scanner userInput = new Scanner(System.in);
		//Take user input
		System.out.print("Please enter a string: ");
		String uString = userInput.nextLine();
		//Modify Input
		uString = uString.replace(" a", "");
		String[] stringArray = uString.split("\s");
		//Verify strings
		int score = 0;
		String[] palindromeArray = new String[stringArray.length];
		for(int stringNum = 0;stringNum < stringArray.length;stringNum++) 
		{
			stringArray[stringNum] = stringArray[stringNum].replaceAll("\\p{Punct}", "");
			char[] cArrayRev = new char[stringArray[stringNum].length()];
			//Create a reverse of string
			for(int i = cArrayRev.length-1, j = 0;i >= 0; i--, j++) {
				cArrayRev[i] = stringArray[stringNum].charAt(j);
			}
			String stringRev = new String(cArrayRev);
			//Display wether the input was a palindrome
			if(stringArray[stringNum].compareToIgnoreCase(stringRev) == 0) 
			{
				palindromeArray[score] = stringArray[stringNum];
				score++;
			}
		}
		//Print words that are palindromes
		System.out.println(score + " palindromes were found: ");
		for(String str: palindromeArray) {
			if(str != null)
			  {
			    System.out.println(str);
			  }
		}
		
	}

}
