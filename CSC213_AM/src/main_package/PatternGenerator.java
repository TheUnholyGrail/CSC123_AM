package main_package;
import java.util.Scanner;
public class PatternGenerator {
	//Alejandro Morales (amorales298@toromail.csudh.edu)
	public static void main(String[] args) {
		//OBJ: Create a program that prints a triangular pattern based on user input.
		Scanner userInput = new Scanner(System.in);
		//Ask user for a number
		System.out.print("Please enter a number n: ");
		int n = userInput.nextInt();
		//Use loops to generate triangle pattern of n height & Display the pattern
		for(int row = 1; row <= n; row++) {
			int column = 1;
			while(column <= row) {
				System.out.print("*");
				column++;
			}
			System.out.print("\n");
		}
		
	}
}
