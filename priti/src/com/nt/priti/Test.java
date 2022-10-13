package com.nt.priti;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	
	
	public static int totalPrice(float[] n,float discount) {
		float totalPrice=0;
		float percent=discount/100;
		for(float a:n) {
			totalPrice=totalPrice+a;
		}
		float totalPay=totalPrice-(totalPrice*percent);
		int result=Math.round(totalPay);
		return result;
	}
	public static void main(String[] args) {
		
		
		//System.out.println(totalPrice(new float[] {10,50}, 10));
		String[] arr= {"ashish","priyanka","nikhil"};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		Scanner sc=new Scanner(System.in);
		String[] arr1=new String[4];
		for(int i=0;i<4;i++) {
			System.out.println("enter string:");
			String s=sc.nextLine();
			arr1[i]=s;
		}
		System.out.println();
		
		
		//System.out.println(count(4));
	}
}
