package com.ak.multithreading_Join;

public class Child implements Runnable {
	@Override
	public void run() {
		Thread th=Thread.currentThread();
		System.out.println(th.getName()+" start");
		
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
		System.out.println(th.getName()+" end");
	
	}
}
