import java.util.Vector;

import cards.Bronze;
import cards.Card;
import cards.Gold;
import products.Food;
import products.Product;

public class Main {

	public static void main(String[] args) {
		Vector<Product> cart = new Vector<Product>();
		
		cart.add(new Food("Wiskas", 5500));
		cart.add(new Food("Lays", 7500));
		
		Card myCard = new Gold();
		
		double totalPrice = 0;
		
		// TODO: Calculate Price + Discount
		/**
		 * Bronze:
		 * 1. Food = 5%
		 * 2. Flight = 10%;
		 * 3. Hotel = 15%;
		 * 
		 * Silver:
		 * 1. Food = 15%
		 * 2. Flight = 20%;
		 * 3. Hotel = 25%;
		 * 
		 * Gold:
		 * 1. Food = 50%
		 * 2. Flight = 50%;
		 * 3. Hotel = 50%;
		 */
		
		for (Product product : cart) {
			totalPrice += myCard.accept(product);
		}
		
		System.out.println("Total Price : Rp. " + totalPrice);
	}
	
}
