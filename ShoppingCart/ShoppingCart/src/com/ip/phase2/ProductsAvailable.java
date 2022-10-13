package com.ip.phase2;

import java.util.ArrayList;
import java.util.List;

public class ProductsAvailable {
	private final List<Product> products = new ArrayList<Product>();

	public ProductsAvailable() {
		this.storeItem();
	}

	public List<Product> getProductsAvailable() {
		return products;

	}

	public void storeItem() {
		String[] productNames = { "Soap", "Biscuit", "oil" };
		Double[] productPrice = { 40.00d, 30.00d, 60.00d };
		Integer[] stock = { 8, 16, 15 };

		for (int i = 0; i < productNames.length; i++) {
			this.products.add(new Product(i + 1, productNames[i], productPrice[i], stock[i]));
		}
	}

}
