package com.ak.Arrays;

import java.util.Arrays;

public class A2_P2_RotateRightUptoPth{
	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5,6};
		rotateUptoP(arr1, 2);
		int[] arr2= {1,2,3,4,5,6};
		rotateUptoP(arr2, 5);
		int[] arr3= {1,2,3,4,5,6};
		rotateUptoP(arr3, 3);
	}
	// 1 2 3 4 5 6
	public static void rotateUptoP(int[] arr,int p) {
		int[] temp=new int[p];
		int k=0;
		for(int i=0;i<p;i++) {
			temp[k++]=arr[arr.length-1-i];
		}
		for(int i=arr.length-1;i>=0;i--) {
			if(i>p-1) {
				arr[i]=arr[i-p];
			}
			else {
				arr[i]=temp[i];
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
