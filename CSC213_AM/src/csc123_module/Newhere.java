package csc123_module;

public class Newhere {

	public static void main(String[] args) {
		// Up casting no risk & Down casting has risk!
		
		//Down casting
		short a = 250;
		byte b = (byte) a;
		System.out.println(a);
		System.out.println(b);
		
		//Casting 2
		int v = 65;
		char c = (char)v;
		System.out.println(c);
		
		//Conditional
		if(true) 
		{
			//Statement
		}
		else if(false){
			//Statement
		}
		//Switch Statement
		int x = 12;
		switch(x) 
		{
		 case 1:
			 //Statement
			 break;
		 case 12:
			 //Statement
			 break;
		default:
			//Statement or none
		}
		
		//For loop
		for(int i = 1;i <= 5;i++) {
			System.out.println("hello");
		}
		
	}
}
