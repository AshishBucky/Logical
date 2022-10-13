package com.ak.product;

import java.util.Scanner;

public class ClientApp {
	public static void main(String[] args) {
		ProductInventory inv=new ProductInventory();
		Scanner sc=new Scanner(System.in);
		int choice=0;
		
		do {
		System.out.println("...M E N U...");
		System.out.println("1:Add Product");
		System.out.println("2:Remove Product By Id");
		System.out.println("3:Search Product By Id");
		System.out.println("4:Search Product By Category");
		System.out.println("5:Update Product Details");
		System.out.println("6:Show All Products");
		System.out.println("Enter your choice:");
		choice=sc.nextInt();
		switch(choice) {
			case 1:
				int id=0,qnty=0;
				float unitPrice=0;
				String pName=null,desc=null,category=null;
				Product p=new Product();
				System.out.println("Enter your product details::");
				System.out.println("enter product id:");
				id=sc.nextInt();
				System.out.println("enter product name:");
				sc.nextLine();
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
				//add product to inventory
				System.out.println(inv.addProduct(p));
				break;
				
			case 2:
				System.out.println("enter Id to remove product:");
				int rId=sc.nextInt();
				System.out.println(inv.removeProductById(rId));
				break;
			
			case 3:
				System.out.println("Enter product Id to search:");
				int sId=sc.nextInt();
				System.out.println(inv.searchProductById(sId));
				break;
				
			case 4:
				System.out.println("Enter product Id to search:");
				String cat=sc.next();
				System.out.println(inv.searchProductByCategory(cat));
				break;
				
			case 5:
				System.out.println("Enter product Id to be updated:");
				int uId=sc.nextInt();
				System.out.println(inv.updateProduct(uId));
				break;
				
			case 6:
				inv.showAllProducts();
				break;
				
			default:
				System.out.println("invalid choice !");
		}
		}
		while(choice!=9);	
	}
}
