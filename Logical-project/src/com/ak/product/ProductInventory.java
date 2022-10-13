package com.ak.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductInventory extends Product{
	List<Product> pinv=new ArrayList();
	Scanner sc=new Scanner(System.in);
	
	//1
	public String addProduct(Product p) {
		pinv.add(p);
		return "new product added sucessfully !!";
	}
	//2
	public String removeProductById(int id) {
		
			for(Product p:pinv) {
				int index=pinv.indexOf(p);
				if(p.getpId()==id) 
					pinv.remove(index);
			}
			return "Product removed sucessfully !!";	
	}
	//3
	public String searchProductById(int id) {
			for(Product p:pinv) {
				if(p.getpId()==id)
					return p.toString();
			}
			return "Product with this Id is not available !";
	}
	//4
	public String searchProductByCategory(String cat) {
		for(Product p:pinv) {
			if(p.getCategory().equalsIgnoreCase(cat))
				return p.toString();
		}
		return "Product with this Category is not available !";
	}
	//5
	public String updateProduct(int id) {
		for(Product p:pinv) {
			if(p.getpId()==id) {
				int qnty=0;
				float unitPrice=0;
				String pName=null,desc=null,category=null;
				System.out.println("Enter Name:");
				pName=sc.nextLine();
				System.out.println("enter product unit price:");
				unitPrice=sc.nextFloat();
				System.out.println("product quantity:");
				qnty=sc.nextInt();
				System.out.println("enter product description:");
				sc.nextLine();
				desc=sc.nextLine();
				System.out.println("enter product category:");
				category=sc.next();
				//set value to product obj
				p.setpId(id);
				p.setpName(pName);
				p.setUnitPrice(unitPrice);
				p.setQtyOnHand(qnty);
				p.setDesc(desc);
				p.setCategory(category);
				
				return "Product updated !";
			}	
		}
		return "Product not available !";
	}
	
	//6
	public void showAllProducts() {
		if(!pinv.isEmpty()) {
			System.out.println("Products Available are:");
			for(Product p:pinv) {
				System.out.println(p.toString());
			}
		}
		else
			System.out.println("No products available !");
	}
	
	
}
