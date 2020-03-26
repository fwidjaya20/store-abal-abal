package cards;

import products.Product;

public final class Gold extends Card {

	@Override
	public double accept(Product product) {
		return product.visitGoldCard(this);
	}
	
}
