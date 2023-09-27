package main_package.Assignment2;
//Imports
import java.util.Scanner;
import java.util.ArrayList;
public class UserManager {
	//Alejandro Morales (amorales298@toromail.csudh.edu)
	//Accessible by other methods
	private static ArrayList<String> database = new ArrayList<String>();
	private static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Start
		do {	//List options to user, verify input, and direct user accordingly
			System.out.print("1 - Register User\n2 - List Users\n3 - Exit\nPlease enter your choice: ");
			int choice = userInput.nextInt();
			switch(choice) {
				case 1:	//Register User
					registerUser();
					break;
				case 2:	//List Users
					listUsers();
					break;
				case 3:	//Exit
					System.out.print("Thank you for using User Manager, Goodbye.");
					System.exit(0);
					break;
				default:
					//Options are listed again
			}
		} while(true);
	}
	//Methods
	public static void registerUser() {
		//Local Variables
		String firstName,lastName,email, user;
		//Start
		System.out.print("Enter the first name: ");
		firstName = userInput.next();
		System.out.print("Enter the last name: ");
		lastName = userInput.next();
		System.out.print("Enter the email address: ");
		email = userInput.next();
		//Configure
		user = String.format("%s, %s (%s)", lastName, firstName, email);
		database.add(user);
		System.out.printf("Thank you, user %s %s (%s) has been registered\n", firstName, lastName, email);
	}
	public static void listUsers() {
		for(int i = 0; i < database.size(); i++) {
			System.out.printf("%d - %s\n", i+1, database.get(i));
		}
		System.out.println("Total Users: " + database.size());
	}
}
