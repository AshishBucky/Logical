package com.ak.Arrays;

import java.util.Arrays;

public class A2_P1_RotateLeftUptoPth {
	
	public static void rotateUptoP(int[] arr,int p) {
		
		int[] temp=new int[p];
		for(int i=0;i<p;i++) {
			temp[i]=arr[i];
		}
		int k=0;
		for(int i=0;i<arr.length;i++) {
			if(i<arr.length-p)
			    arr[i]=arr[p+i];
			else if(i>=arr.length-p)
				arr[i]=temp[k++];
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5,6,7,8};
		rotateUptoP(arr1, 2);
		int[] arr2= {1,2,3,4,5,6,7,8};
		rotateUptoP(arr2, 5);
		int[] arr3= {1,2,3,4,5,6,7,8};
		rotateUptoP(arr3, 3);
	}
}
