import java.util.Vector;

import cards.Card;
import products.Food;
import products.Product;

public class Main {

	public static void main(String[] args) {
		Vector<Product> cart = new Vector<Product>();
		
		cart.add(new Food("Wiskas", 5500));
		cart.add(new Food("Lays", 7500));
		
		Card myCard = null;
		
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
		
		for (Product item : cart) {
			System.out.println(item.toString());
		}
	}
	
}
