package com.ak.multithreading_Join;

public class JoinTest {
	public static void main(String[] args) throws InterruptedException {
		System.out .println("main start");
		Child c1=new Child();
		Thread t1=new Thread(c1);
		t1.setName("child 1");
		t1.start();
		
		Child c2=new Child();
		Thread t2=new Thread(c2);
		t2.setName("child 2");
		t2.start();
		
		Child c3=new Child();
		Thread t3=new Thread(c3);
		t3.setName("child 3");
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();

		System.out.println("main end");
		
		
		
	}
}
