package com.ak.Arrays;

import java.util.Arrays;

public class A2_P4_ZeroOneAndTwo {

	public static void sortZeroAndOne(int[] arr) {
		int i=0,count0=0,count1=0,count2=0;
		for(i=0;i<arr.length;i++) {
			switch(arr[i]) {
			case 0:
				count0++;
				break;
			case 1:
				count1++;
				break;
			case 2:
				count2++;
				break;
			}
		}
		i=0;
		while(count0>0) { 
			arr[i++]=0;
			count0--;
		}
		while(count1>0) {
			arr[i++]=1;
			count1--;
		}
		while(count2>0) {
			arr[i++]=2;
			count2--;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int[] arr= {2,1,0,0,2,1,2,1,0,2,1,0};
		sortZeroAndOne(arr);
	}
}
