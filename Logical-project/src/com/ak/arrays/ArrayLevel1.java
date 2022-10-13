package com.ak.arrays;

//Sorted array merging,finding frequency of an alement,
import java.util.*;
class ArrayLevel1 
{
	public static void mergeArray(int[] arr1,int[] arr2){
		
		int l1=arr1.length;
		int l2=arr2.length;
		int arr3[]=new int[l1+l2];
		int i=0,j=0,k=0;
		while(i<l1 && j<l2){
			if(arr1[i]<arr2[j])
				arr3[k++]=arr1[i++];
			else
				arr3[k++]=arr2[j++];
		}
		while(i<l1)					// adding rest elements
			arr3[k++]=arr1[i++];	//one of these two while will execute !think
		while(j<l2)
			arr3[k++]=arr2[j++];
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
	}
	public static void frequency(int[] arr){
		
		for(int i=0;i<arr.length;i++){
			int freq=0;
			for(int j=0;j<arr.length;j++){
				if (arr[i]==arr[j]){
					freq++;
				}
			}
			System.out.println("frequency of "+arr[i]+" is :"+freq);
		}
	}
	public static int[] eliminateDuplicate(int[] arr){
		Set<Integer> uSet=new HashSet<>();
		
		for(int n:arr) {
			uSet.add(n);
		}
		int[] result=new int[uSet.size()];
		int i=0;
		for(int n:uSet) {
			result[i++]=n;
		}
		return result;
	}
	public static void findMax(int[] arr) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("Max value is :"+max);
	}
	public static void main(String[] args) 
	{
		int arr1[]={1,4,4,5,5,8,10};
		int arr2[]={2,3,4,6,9,};
		mergeArray(arr1,arr2);
		frequency(arr1);
		System.out.println(Arrays.toString(eliminateDuplicate(arr1)));
		findMax(arr1);
	}
}
