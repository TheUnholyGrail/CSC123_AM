package main_package.Assignmnet1;
import java.util.Scanner;

public class TempConverter {
	//Alejandro Morales (amorales298@toromail.csudh.edu)
	public static void main(String[] args) {
		//OBJ: Write a program that will convert temperatures between Celsius and Fahrenheit.
		Scanner userInput = new Scanner(System.in);
		int numCelsius, numFahrenheit;
		//Ask user what unit
		System.out.print("Would you like to convert to Celsius or Fahrenheit(C/F)?: ");
		String str = userInput.nextLine();
		char choice = str.charAt(0);
		//Ask for Temp value
		System.out.print("Please enter temperature value: ");
		int rawValue = userInput.nextInt();
		//Check
		switch(choice) 
		{
		case 'C':
		case 'c':
			//C to F
			numFahrenheit = (rawValue * 9/5) + 32;
			System.out.printf("The value in Fahrenheit is %d F", numFahrenheit);
			break;
		case 'F':
		case 'f':
			//F to C
			numCelsius = (rawValue - 32) * 5/9;
			System.out.printf("\nThe value in Celsius is %d C", numCelsius);
			break;
		default:
		}
	}
}
