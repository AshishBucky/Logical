package com.ak.BankProj;

public class Bank {
	private static int acNo=100100;
	private String acHolderName;
	public static final float minBal=500;
	private float bal=0;
	
	public String openAccount(String acHolderName,float bal)  {
		boolean flag=false;
		try {
			if(bal>=minBal) {
				acNo=acNo+1;
				this.acHolderName=acHolderName;
				this.bal=bal;
				flag=true;
			}
			else {
				throw new MinBalanceException("Minimum balance should be 500");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		if(flag)
			return "Congrats! Account opened sucessfully.";
		return "account opening failed!";
	}
	public String deposite(float amt) {
		if(bal>=minBal) {
			this.bal=bal+amt;
			return amt+" deposited";
		}
		else {
			return "Account Does not exists!";
		}
	}
	public String withdraw(float amt) {
		boolean flag=false;
		if(bal==minBal) {
			throw new InsufficientBalanceException("Insufficient funds !");
		}
		else {
			if(bal-amt>=minBal) {
				bal=bal-amt;
				flag=true;
			}
			else
				throw new InsufficientBalanceException("Insufficient funds!");
		}
		if(flag)
			return amt+" rupees widrawn";
		return "withdraw failed!";
	}
}
