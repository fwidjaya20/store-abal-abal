import java.util.Vector;

import cards.Bronze;
import cards.Card;
import cards.Gold;
import cards.Silver;
import products.Flight;
import products.Food;
import products.Hotel;
import products.Product;

public class Main {

	public static void main(String[] args) {
		double totalPrice = 0;
		Vector<Product> cart = new Vector<Product>();
		
		cart.add(new Food("Wiskas", 5500));
		cart.add(new Food("Lays", 7500));
		
		Card myCard = new Silver();
		
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
			System.out.print(item.toString());
			
			if (myCard == null) {
				totalPrice += item.price;
				System.out.println("");
			} else
			
			if (myCard instanceof Bronze) {
				double discountPrice = 0;
				if (item instanceof Food) {
					discountPrice = item.price * 0.05;
				} else	
				if (item instanceof Flight) {
					discountPrice = item.price * 0.10;
				} else
				if (item instanceof Hotel) {
					discountPrice = item.price * 0.15;
				}
				
				totalPrice += item.price - discountPrice;
				System.out.println(" - Discount : Rp. " + discountPrice);
			} else
			
			if (myCard instanceof Silver) {
				double discountPrice = 0;
				if (item instanceof Food) {
					discountPrice = item.price * 0.15;
				} else	
				if (item instanceof Flight) {
					discountPrice = item.price * 0.20;
				} else
				if (item instanceof Hotel) {
					discountPrice = item.price * 0.25;
				}
				
				totalPrice += item.price - discountPrice;
				System.out.println(" - Discount : Rp. " + discountPrice);
			} else
			
			if (myCard instanceof Gold) {
				double discountPrice = 0;
				if (item instanceof Food) {
					discountPrice = item.price * 0.50;
				} else	
				if (item instanceof Flight) {
					discountPrice = item.price * 0.50;
				} else
				if (item instanceof Hotel) {
					discountPrice = item.price * 0.50;
				}
				
				totalPrice += item.price - discountPrice;
				System.out.println(" - Discount : Rp. " + discountPrice);
			}
		}
		
		System.out.println("Total Price : Rp. " + totalPrice);
	}
	
}
