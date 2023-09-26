package ba_package;
public class AccountManager {

	public static void main(String[] args) {
		//Start Here
		
		//Create Bank Account
		BankAccount myAccount = new BankAccount("Tim", 15);
		myAccount.deposit(100);
		myAccount.printStatement();
	}

}
