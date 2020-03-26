package cards;

import products.Product;

public final class Bronze extends Card {
	
	@Override
	public double accept(Product product) {
		return product.visitBronzeCard(this);
	}
	
}
