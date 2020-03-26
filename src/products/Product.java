package products;

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
}
