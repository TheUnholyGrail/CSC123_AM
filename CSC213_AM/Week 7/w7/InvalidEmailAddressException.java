package w7;

public class InvalidEmailAddressException extends Exception{	//Checked(Always make sure to handle errors) or Unchecked(Just throw them)
	public InvalidEmailAddressException(String reason) {
		super(reason);
	}
}
