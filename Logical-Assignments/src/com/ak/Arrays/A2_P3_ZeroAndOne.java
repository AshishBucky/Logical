package com.ak.Arrays;

import java.util.Arrays;

public class A2_P3_ZeroAndOne {

	public static void sortZeroAndOne(int[] arr) {
		int left=0,right=arr.length-1;
		while(left<right) {
			while(arr[left]==0 && left<right) 
				left++;
			while(arr[right]==1 && left<right)
				right--;
			if(left<right) {
				arr[left]=0;
				arr[right]=1;
				left++;
				right--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int[] arr= {1,1,0,0,0,1,0,1,0,1,1,0};
		sortZeroAndOne(arr);
		int[] arr2= {0,1,0,0,1,1,0,1,0,1,1,1};
		sortZeroAndOne(arr2);
	}
}
