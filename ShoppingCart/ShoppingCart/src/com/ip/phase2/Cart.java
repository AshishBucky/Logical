package com.ip.phase2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Cart {

	//List<Product> cartItems = new ArrayList<Product>();
	Map<Product,Integer> cItems=new HashMap<>();
	
	public void addProductToCartByPID(int pid) {
		Product product = getProductByProductID(pid);
		addToCart(product);
	}

	private Product getProductByProductID(int pid) {
		Product product = null;
		List<Product> products = new ProductsAvailable().getProductsAvailable();
		for (Product prod : products) {
			if (prod.getPid() == pid) {
				product = prod;
				break;
			}
		}
		return product;
	}

	public void removeProductByPID(int pId) {
		
		
		for (Entry<Product, Integer> entry : cItems.entrySet()) {
			Product p=entry.getKey();
			if(p.getPid()==pId)
				cItems.put(p, entry.getValue() > 0 ? entry.getValue()-1 : 0 );
			
		}
	}

	ProductsAvailable proAvl = new ProductsAvailable();

	
	private void addToCart1(Product product) {
		System.out.println("add to cart start===");
		Integer pId=product.getPid();
		if(cItems.size()<=0)
			cItems.put(product, 1);
		else {
			for (Entry<Product, Integer> entry : cItems.entrySet()) {
				Product p = entry.getKey();
				// if(p.equals(product))
				//System.out.println(p.equals(product));
				if (p.getPid() == pId){
					System.out.println(entry.getValue());
					cItems.put(product, entry.getValue() + 1);
					
				}
				else  {
						cItems.put(product, 1);
						break;
				}
			}
		}
	}

	private void addToCart(Product product) {
		System.out.println("add to cart start===");
		if (cItems.size() <= 0)
			cItems.put(product, 1);
		else {
			int count = 0;
			if (cItems.containsKey(product)) {
				count = cItems.get(product);
				cItems.put(product, count + 1);
			} else
				cItems.put(product, 1);
		}
	}
	void printCartItems() {
		double gTotal=0;
		System.out.println("Item \t  Price\t  count\t  Total");
		for (Entry<Product, Integer> entry : cItems.entrySet()) {
			Product p=entry.getKey();
			int count=entry.getValue();
			if(count>0) {
			System.out.println(p.getPname()+ "\t  "+p.getPrice()+"\t  "+count+"\t  "+count*p.getPrice());
			gTotal=gTotal+(count*p.getPrice());
			}
		}
		System.out.println("Grand Total : "+gTotal);
		

	}
}
