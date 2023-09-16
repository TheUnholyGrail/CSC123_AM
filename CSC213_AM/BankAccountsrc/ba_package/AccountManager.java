package ba_package;
public class AccountManager {

	public static void main(String[] args) {
		//Start Here
		//Create Bank Account
		BankAccount myAccount = new BankAccount();
		
		myAccount.deposit(1000);
		myAccount.deposit(100.75);
		myAccount.withdraw(20);
		myAccount.printStatement();
		System.out.println(myAccount.balance());
		myAccount.close();
		System.out.println(myAccount.isOpen());
	}

}
