package main_package.Assignment2;
//Imports
public class InvString {
	//Alejandro Morales (amorales298@toromail.csudh.edu)
	public static void main(String[] args) {
		//OBJ: Write a Java class that appears like the String class but, when printed it reverses the sequence of characters
		String nString = new String("This is a test");
		char[] stringHolder = new char[nString.length()];
		//Reverse and Store string inside char array
		for(int i = stringHolder.length-1, j = 0;i >= 0;i--, j++) {
			stringHolder[i] = nString.charAt(j);
		}
		String rString = new String(stringHolder);
		//Print reversed String
		System.out.print("The output will be:\n" + rString);
	}

}
