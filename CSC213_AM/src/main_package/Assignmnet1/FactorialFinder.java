package main_package.Assignmnet1;
import java.util.Scanner;
public class FactorialFinder {
	//Alejandro Morales (amorales298@toromail.csudh.edu)
	public static void main(String[] args) {
		//OBJ: Develop a program that computes the factorial of a number given through the command prompt.
		Scanner userInput = new Scanner(System.in);
		int rawValue;
		//Check for valid input
		do 
		{
			//Ask user to input a positive integer
			System.out.print("Please input a positive integer: ");
			rawValue = userInput.nextInt();
			
		}while(rawValue <= 0);
		//Compute the factorial of the number
		int factorial = 1;
		for(int i = 1;i <= rawValue;i++) {
			factorial *= i;
		}
		//Display the result
		System.out.printf("The factorial of %d! is %d", rawValue, factorial);
	}
}
