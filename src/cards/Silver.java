package cards;

import products.Product;

public final class Silver extends Card {

	@Override
	public double accept(Product product) {
		return product.visitSilverCard(this);
	}
	
}
