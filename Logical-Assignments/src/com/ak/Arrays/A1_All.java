package com.ak.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class A1_All {

	//1.find duplicates elements in an array
	public static String findDuplicates(int[] arr) {
		String result="{";
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) 
					result=result+arr[i]+",";
			}
		}
		return result.substring(0,result.length()-1)+"}";
	}
	
	//2.Remove dup elements from an array
	public static Object removeDups(int[] arr) {
		Set uset=new HashSet();
		for(int n:arr) {
			uset.add(n);
		}
		return uset;
	}
	
	//3.find sum of unique elements of an array
	public static int sumOfUniqueElements(int[] arr) {
		Set uset=new HashSet();
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(!uset.contains(arr[i])) {
				uset.add(arr[i]);
				sum=sum+arr[i];
			}
		}
		return sum;
	}
	
	//4.find out third largest no in an array
	public static String findThirdLargest(int[] arr) {
		if(arr.length<3)
			return "invalid input.Size less than 3.";
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<=arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int same=0;
		for(int i=0;i<=2+same;i++) {
			if(arr[i]==arr[i+1]) 
				same++;
		}
		return ""+arr[2+same];
	}
	//Efficient way of no 4
	public static int findThirdLargestEff(int[] arr) {
		int first=arr[0],second=0,third=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>=first) {
				if(arr[i]==first){
					first=arr[i];
				}
				else {
					third=second;
					second=first;
					first=arr[i];
				}			
			}
			else if(arr[i]>=second) {
				if(arr[i]==second) 
					second=arr[i];
				else {
					third=second;
					second=arr[i];
				}
			}
			else if(arr[i]>=third) {
				third=arr[i];
			}
		}
		return third;
	}
	
	//5.Find max diff b/w elements of an array
	public static int findMaxDifference(int[] arr){
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>=arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		return arr[arr.length-1]-arr[0];
	}
	//6.Find min and max elements of an array
	public static String findMinMax(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>=arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return "Min:"+arr[0]+" Max:"+arr[arr.length-1];
	}
	//7.Find 2nd min and 2nd max numbers of an array
	public static String findSecondMinMax(int[]  arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>=arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int same=0;
		for(int i=0;i<1+same;i++) {
			if(arr[i]==arr[i+1]) {
				same++;
			}
		}
		String result=""+arr[1+same];
		for(int i=arr.length-1;i>arr.length-2-same;i--) {
			if(arr[i]==arr[i-1]) {
				same++;
			}
		}
		result=result+"\n2nd Max number :"+arr[arr.length-2-same];
		return result;
	}
	//8.Find out common element among three array
	public static Set findCommonElements(int[] arr1,int[] arr2,int[] arr3) {
		Set commons=new HashSet();
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					for(int k=0;k<arr3.length;k++) {
						if(arr1[i]==arr3[k]) 
							commons.add(arr1[i]);
					}
				}
			}
		}
		return commons;
	}
	//9.find Two Sum
	public static int[] findTwoSum(int[] arr,int sum) {
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
		return result;
	}
	//Efficient of 9
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
	//10.Smallest sum pair in an array
	public static String smallestSumPair(int[] arr) {
		Arrays.sort(arr);
		return ""+arr[0]+" and "+arr[1];
	}
	
	
	public static void main(String[] args) {
		int[] arr1= {1,5,4,5,6,4,8,2,9,2,8};
		int[] arr2= {10,15,8,12,5,62,40,6};
		int[] arr3= {21,8,1,30,9,10,40,5};
		System.out.println("Find Duplicates Elements of array: "+ findDuplicates(arr1));
		
		System.out.println();

		System.out.println("Remove duplicates form an array:"+removeDups(arr1));
		System.out.println();
		System.out.println("sum of unique elements of an array: "+sumOfUniqueElements(arr1));
		System.out.println();
		System.out.println("Third largest of the array:"+findThirdLargest(arr1));
		System.out.println("Third largest of the array:"+findThirdLargestEff(arr1));
		System.out.println();
		System.out.println("Max diff b/w elements of an array:"+findMaxDifference(arr1));
		System.out.println();
		System.out.println("Min and Max elements of an array:\n"+findMinMax(arr1));
		System.out.println();
		System.out.println("2nd min number :"+findSecondMinMax(arr1));
		System.out.println(); 
		System.out.println("Common elements are :"+findCommonElements(arr1, arr2, arr3));
		System.out.println();
		System.out.println("find two sum :"+Arrays.toString(findTwoSum(arr1, 14)));
		System.out.println("find two sum :"+Arrays.toString(findTwoSumUsingMap(arr1, 14)));
		System.out.println();
		System.out.println("Smallest sum having pair :"+smallestSumPair(arr2));
	}
}
