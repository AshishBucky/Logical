package com.ak.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] numbers= {10,20,-5,15,5};
		int[] arr1= {1,5,4,5,4,6,8,2,9,2,8};
		findTwoSum(numbers, 35);
		findTwoSum(numbers, 15);
		findTwoSum(numbers, 35);
		findTwoSum(numbers, 0);
		findTwoSum(arr1, 14);
		System.out.println("-----Using Map----");
		System.out.println(Arrays.toString(findTwoSumUsingMap(numbers, 30)));
		System.out.println(Arrays.toString(findTwoSumUsingMap(numbers, 0)));
		System.out.println(Arrays.toString(findTwoSumUsingMap(numbers, 20)));
		System.out.println(Arrays.toString(findTwoSumUsingMap(arr1, 14)));
		
	}
	public static void findTwoSum(int[] arr,int sum) {
		int[] result= new int[2];
		int k=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]+arr[j]==sum) {
					result[k]=j;
					result[k+1]=i;
				}
			}
		}
		System.out.println(Arrays.toString(result));
	}
	public static int[] findTwoSumUsingMap(int[] arr,int sum) {
		Map<Integer,Integer> numMap=new HashMap();
		for(int i=0;i<arr.length;i++) {
			int sub=sum-arr[i];
			if(numMap.containsKey(sub))
				return new int[] {i,numMap.get(sub)};
			numMap.put(arr[i], i);	
		}
		return new int[] {-1,-1};
	}
}