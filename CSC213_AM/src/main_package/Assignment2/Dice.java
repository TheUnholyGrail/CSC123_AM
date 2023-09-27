package main_package.Assignment2;
//Imports
import java.util.Random;
public class Dice {
	//Alejandro Morales (amorales298@toromail.csudh.edu)
	//Fields
	Random rand = new Random();
	private int side;
	//Constructors
	public Dice() {
		
	}
	//**Methods**
	//Mutator
	public void cast() {	//Generate numbers 1-6
		side = rand.nextInt(6) + 1;
	}
	
	@Override
	public String toString() 
	{
		return "The output will be:\nThe value is: " + side;
	}

}
