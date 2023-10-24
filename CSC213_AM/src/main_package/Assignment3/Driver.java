package main_package.Assignment3;
import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		//Start Here
		Scanner userInput = new Scanner(System.in);
		
		//Examples Items
		Item item1 = new Item("Wrench", null, 6.14, 4.54, 2, 0.15);
		Food food1 = new Food("Apple", null, 0.30, 0.15, 0.05, 0, null, null);
		Publication book1 = new Publication("The Headache", null, 45, 24.13, 0.50, 0.30, "John M", "Sept.", 230);
		//Cart
		ShoppingCart myCart = new ShoppingCart();
		myCart.addToCart(item1);
		myCart.addToCart(food1);
		myCart.addToCart(book1);
		//User Interaction
		do {
			System.out.println("(1) Get the number of items in your cart\n(2) Get the total cost of items in your cart\n(3) Print all items in your cart\n(4) Quit\nInput: ");
			int choice = userInput.nextInt();
			switch(choice) {
				case 1:	//get the number of items in cart
					myCart.itemsNum();
					break;
				case 2:	//get the total cost of items in cart
					myCart.itemsCost();
					break;
				case 3:	//print your items in cart
					myCart.itemsInCart();
					break;
				case 4:	//Exit
					System.exit(0);
					break;
				default:
					//Options are listed again
			}
		} while(true);
		
	}

}
