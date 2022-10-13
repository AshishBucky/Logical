package com.ak.Arrays;

public class A2_P6_SuperElement {

	public static void findSuperElements(int[] arr) {
		int first=arr[0],second=0;
		String result="[";
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>=first) {
				if(arr[i]==first)
					first=arr[i];
				else {
					second=first;
					first=arr[i];
				}
			}
			else if(arr[i]>second)
				second=arr[i];
		}
		for(int n:arr) {
			if(n<second) {
				result=result+n+",";
			}
		}
		System.out.println(result.substring(0,result.length()-1)+"]");
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,4,5,5};
		findSuperElements(arr);
		int[] arr2= {1,4,3,8,-5};
		findSuperElements(arr2);
		
	}
}
