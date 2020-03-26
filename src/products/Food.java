package products;

import cards.Bronze;
import cards.Gold;
import cards.Silver;

public final class Food extends Product {
	public Food(String name, double price) {
		super(name, price);
	}
	
	@Override
	public double visitBronzeCard(Bronze card) {
		double discountPrice = this.price * 0.05;
		System.out.print(this.toString());
		System.out.println(" - Discount Rp. " + discountPrice);
		return this.price - discountPrice;
	}
	
	@Override
	public double visitSilverCard(Silver card) {
		double discountPrice = this.price * 0.15;
		System.out.print(this.toString());
		System.out.println(" - Discount Rp. " + discountPrice);
		return this.price - discountPrice;
	}
	
	@Override
	public double visitGoldCard(Gold card) {
		double discountPrice = this.price * 0.50;
		System.out.print(this.toString());
		System.out.println(" - Discount Rp. " + discountPrice);
		return this.price - discountPrice;
	}
}
