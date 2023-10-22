//TURN IN
package w7;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class DateParse {
	public static final String PATTERN="dd-MM-yy";
	public static void main(String[] args) {	//When a method throws and Exception, you can choose to handle or throw it
		SimpleDateFormat df=new SimpleDateFormat(PATTERN);	
		try {
		Date d2=df.parse("10-kbbblbl-00");	//Incorrect Date Format
		System.out.println(d2);
		} catch(ParseException pe) {	//Specific Exception
			System.out.println("Invalid Format");
		} catch(Exception e) {	//General Exception
			System.out.println("Something else is wrong here");
		} finally {	//You can just use try and finally, but it will crash and not continue further
			System.out.println("Yep I knew this would not work.");
		}
		
	}

}