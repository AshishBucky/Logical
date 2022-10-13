package com.ak.BankProj;

public class InsufficientBalanceException extends RuntimeException {		//unchecked exception

	InsufficientBalanceException(String s){
		super(s);
	}
}
