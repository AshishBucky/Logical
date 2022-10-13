package com.ak.Arrays;

import java.util.Arrays;

public class A2_P7_SortMaxMin {

	public static void sort(int[] arr) {
		Arrays.sort(arr);
		int[] newArr=new int[arr.length];
		int k=0,j=arr.length-1;
		
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) 
				newArr[i]=arr[j--];
			else 
				newArr[i]=arr[k++];
		}
		System.out.println(Arrays.toString(newArr));
	}
	public static void main(String[] args) {
		int[] arr= {10,70,50,40,30,60,90,80,20,100};
		sort(arr);
	}
}
