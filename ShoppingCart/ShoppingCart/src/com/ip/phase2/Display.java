package com.ip.phase2;

import java.util.List;
import java.util.Scanner;

public class Display {

	Cart cart = new Cart();
	private int pCh;
	private int aCh;

	public Display() {
		menu();
	}

	public void storeProductsMenu() {
		System.out.println("1. Add to Cart");
		System.out.println("2. Remove From Cart");
		System.out.println("0. Exit");
	}

	public void startScreen() {
		System.out.println("1. Display Store Products");
		System.out.println("2. Display Cart");
		System.out.println("0. Exit");
	}

	private void menu() {

		do {
			startScreen();
  			aCh=getUserInput();
			//System.out.println("ch value"+ch);
			switch (aCh) {
			case 0:
				System.exit(0);
				break;
			case 1:
				storeItem(); 
				pCh=getUserInput();
				storeProductsMenu();
				aCh=getUserInput();
				//System.out.println("input");
				innerChoice();
				break;
			case 2:
				showCart();

				break;
			default:
				break;
			}
		} while (aCh != 0);
	}

	private void innerChoice() {
		switch (aCh) {
		case 1:
			addProductToCart();
			showCart();
			break;
		case 2:
			removeProductFromCart();
			break;
		default:

			break;
		}
	}

	private void addProductToCart() {
		//int pid = getUserInput();
		cart.addProductToCartByPID(pCh);
	}

	private void removeProductFromCart() {
		//int pid = getUserInput();
		cart.removeProductByPID(pCh);
	}

	private void showCart() {
		cart.printCartItems();
	}

	private void storeItem() {
		List<Product> products = new ProductsAvailable().getProductsAvailable();
		for (Product prod : products) {
			System.out.println(prod.getPid() + "- " + prod.getPname() + " " + prod.getPrice() + " " + prod.getStock());
		}
	}

	private int getUserInput() throws NumberFormatException {
		Scanner in = new Scanner(System.in);
		int input = Integer.parseInt(in.nextLine());
		return input;
	}

}
