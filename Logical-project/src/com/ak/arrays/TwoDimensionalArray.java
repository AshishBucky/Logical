package com.ak.arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		/*
	     int[] n1={1,2};
		int[] n2={1,2,3};
		int[] n3={1,2,3,4};
		int[] n4={1,2,3,4,5};
		int[] n5={1,2};

		int[][] n=new int[5][5];=====>!not recommended
		*/
		
		int[][] n=null;
		n=new int[5][];
		n[0]=new int[2];
		n[1]=new int[3];
		n[2]=new int[4];
		n[3]=new int[5];
		n[4]=new int[2];

		for(int i=0;i<n.length;i++){
		   for(int j=0;j<n[i].length;j++){   
			n[i][j]=i+j;
		   }
		}

		for(int i=0;i<n.length;i++){
		   for(int j=0;j<n[i].length;j++){   
			System.out.print(n[i][j]+" ");
		   }
		  System.out.println();
		}
		
		System.out.println("===============");
		
		for(int[] arr:n) {
			for(int element:arr) {
				System.out.print(element+" ");
			}
			System.out.println();
		}
		
	}
}
