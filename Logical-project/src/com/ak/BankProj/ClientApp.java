package com.ak.BankProj;

public class ClientApp {

	public static void main(String[] args) {
		Bank bank=new Bank();
		//System.out.println(bank.openAccount("ashish", 400));
		System.out.println(bank.openAccount("ashish", 500));
		System.out.println(bank.deposite(1500));
		System.out.println(bank.withdraw(1600));
	}
}
