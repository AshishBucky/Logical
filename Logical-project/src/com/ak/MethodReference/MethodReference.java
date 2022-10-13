package com.ak.MethodReference;

public class MethodReference {

	public static void saySomething() {
		System.out.println("this is static method");
	}
	public void saySomething2() {
		System.out.println("this is non-static method");
	}
	public static void main(String[] args) {
		//for static method
		Sayable sayable=MethodReference::saySomething;
		sayable.say();
		
		//for nonstatic method
		MethodReference mr=new MethodReference();
		Sayable sayable2=mr::saySomething2;
		sayable2.say();
		
		//for nonstatic method using anonymous object
		Sayable sayable3=new MethodReference()::saySomething2;
		sayable3.say();
	}
}
