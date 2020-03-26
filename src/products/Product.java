package products;

import cards.Bronze;
import cards.Gold;
import cards.Silver;

public abstract class Product {
	public String name;
	public double price;
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "# {name: "+ this.name +", price: "+ this.price + "}";
	}
	
	public abstract double visitBronzeCard(Bronze card);
	public abstract double visitSilverCard(Silver card);
	public abstract double visitGoldCard(Gold card);
}
