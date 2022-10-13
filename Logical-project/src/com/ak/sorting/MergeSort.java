package com.ak.sorting;

public class MergeSort {
	public static int[] a= {5,2,8,7,10,4,3,9};
	public void mergeSortedArray(int low,int mid,int high){
		int l1=mid-low+1;
		int l2=high-mid+1;
		int[] arr3=new int[l1+l2];
		int i=0,j=0,k=0;
		while(i<l1 && j<l2) {
			if(a[low]<a[high]) {
				a[k++]=a[low++];
			}
			else
				a[k++]=a[high++];
		}
		while(low<l1)
			a[k++]=a[low];
		while(j<l2)
			a[k++]=a[high];
	}
	
	public void mergeSort(int low,int high){
		int mid=0;
		if(low<high) {
			mid=(low+high)/2;
			mergeSort(low,mid);
			mergeSort(mid+1,high);
			mergeSortedArray(low,mid,high);
		}
	}
	
	public static void main(String[] args) {
		
	}
}
