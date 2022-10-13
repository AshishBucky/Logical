package com.ak.multithreading;

class Factorial extends Thread{
	int num=0;
	
	public Factorial(int num) {
		this.num = num;
	}

	@Override
	public void run() {
		int temp=num;
		int fact=1;
		while(num!=0) {
			fact=fact*num;
			num--;
		}
		System.out.println("factorial of "+temp+" is "+fact);
	}
}
class MultiplicationTable extends Thread{
	int num=0;

	public MultiplicationTable(int num) {
		this.num = num;
	}
	@Override
	public void run() {
		int mul;
		for(int i=1;i<=10;i++) {
			mul=num*i;
			System.out.println(num+"*"+i+"="+mul);
		}
	}
}
public class FactorialAndTable {
	public static void main(String[] args) {
		Factorial fact=new Factorial(5);
		fact.start();
	
		MultiplicationTable table=new MultiplicationTable(5);
		table.start();
	}
}
