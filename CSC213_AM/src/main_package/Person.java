package main_package;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Person {
	//Fields
	String firstName = "Alex";
	String lastName = "M";
	String dob = "09/20/04";	//Date of Birth in MM/DD/YY
	
	
	//Constructor
	public Person(String firstN, String lastN, String dob) {
		
	}
	//Methods
	public String getFullName() {
		return (firstName + " " + lastName);
	}
	public long getAge() throws Exception{
		String date = "10142023";
		Date today = new Date();
		SimpleDateFormat df = new SimpleDateFormat("MM/DD/YYYY");
		Date DOB = df.parse(date);
		//Date of birth since 1970
		long DOBMilliseconds = DOB.getTime();
		//Today's date since 1970
		long todayMilliseconds = today.getTime();
		//Difference of dob and today in miliseconds
		long delta = todayMilliseconds - DOBMilliseconds;
		//Person's age in years
		long age = delta/1000/60/60/24/365;
		return age;
	}
}
