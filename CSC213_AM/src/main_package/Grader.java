package main_package;
import java.util.Scanner;

public class Grader {
	//Alejandro Morales (amorales298@toromail.csudh.edu)
	public static void main(String[] args) {
		//OBJ: Design a program that will calculate and display the grade based on a given numeric score.
		Scanner userInput = new Scanner(System.in);
		//Ask user for number score
		System.out.print("Please enter your score(0-100): ");
		int score = userInput.nextInt();
		//Put grades into categories and Print grade with unique message
		if(score >= 90 && score <= 100) 
		{
			//A
			System.out.print("You got an A. Excellent.");
		} else if(score >= 80 && score <= 89) {
			//B
			System.out.print("You got a B. Good Job.");
		} else if(score >= 70 && score <= 79) {
			//C
			System.out.print("You got a C. Needs Improvement.");
		} else if(score >= 60 && score <= 69) {
			//D
			System.out.print("You got a D. Needs Improvement.");
		} else if(score < 60 && score >= 0) {
			//F
			System.out.print("You got an F. Needs Improvement.");
		} else {
			//Not a valid answer
			System.out.print("The score you inputted is invalid.");
		}
	}
}
