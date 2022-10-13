package com.ak.Arrays;

import java.util.Arrays;

public class A2_P8_NewArraySumOfRest {

	public static void createNewArray(int[] arr) {
		int[] newArr=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int element=0;
			for(int j=0;j<arr.length;j++) {
				if(i!=j) {
					element=element+arr[j];
				}
			}
			newArr[i]=element;
		}
		System.out.println(Arrays.toString(newArr));
	}
	public static void main(String[] args) {
		int[] arr={4, 5, 6};
		createNewArray(arr);
		int[] arr2={10,30,20};
		createNewArray(arr2);
	}
}
