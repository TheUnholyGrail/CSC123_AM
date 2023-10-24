package main_package.Assignment3;
import java.util.ArrayList;
public class ShoppingCart {
	//Fields
	ArrayList<Item> cart = new ArrayList<Item>();	
	//Constructor
	public ShoppingCart() {
		
	}
	//Methods
	public void addToCart(Item i) {
		cart.add(i);
	}
	public void removeFromCart(int i) {
		cart.remove(i);
	}
	public void clearFromCart() {
		cart.clear();
	}
	
	public void itemsNum() {	//Returns number of items in cart
		System.out.printf("There are %d items in your cart\n", cart.size());
	}
	public void itemsCost() {
		double total = 0;
		for (Item i: cart) {	//Goes through each item in cart and adds to accumulator
			total += i.calculateTotalCost();
		}
		System.out.printf("The total cost(/w tax) of the items inside the cart is: $%.2f\n", total);
	}
	public void itemsInCart() {
		System.out.println("|Item|\t\t|Price|\t|Tax|\t|Total|");
		for(Item i: cart) {
			System.out.printf("|%s|\t|$ %.2f|\t|$ %.2f|\t|$ %.2f|\n", i.getName(), i.getPrice(), i.getTaxPrice(), i.calculateTotalPrice());
		}
		//Prints Grand Total of items in cart
		double grandTotal = 0;
		for(Item i: cart) {
			grandTotal += i.calculateTotalPrice();
		}
		System.out.printf("\t\t\tTOTAL: $%.2f\n", grandTotal);
	}
	//Other
}
