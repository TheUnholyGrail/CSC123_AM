package main_package;
import java.text.*;
public class ExTest1 {
	//Check exception must be handled
	//Unchecked exception can occur
	public static void main(String args[]) throws Exception {

		try	{
			
			System.out.println(divide());
			
		} catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		}
		//More Code finally {System.out.println("I knew this was going to happen");} <-- This gets printed and then the try block is ran
	}
	public static int divide() {
		return divide2();
	}
	public static int divide2() {
		return divide3();
	}
	public static int divide3() {
		return 2/0;
	}
}
