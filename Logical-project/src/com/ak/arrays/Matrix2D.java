package com.ak.arrays;

public class Matrix2D {

	public static void main(String[] args) {
		int[][] matrix1= {{1,2,3},{1,2,3},{1,2,3}};
		int[][] matrix2= {{1,2,3},{1,2,3},{1,2,3}};
		int[][] matrix3= new int[3][3];
		
		for(int i=0;i<matrix1.length;i++) {
			for(int j=0;j<matrix1[i].length;j++) {
				System.out.print(matrix1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("------");
		for(int i=0;i<matrix2.length;i++) {
			for(int j=0;j<matrix2[i].length;j++) {
				System.out.print(matrix2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("\nmatrix3:");
		//add matrix1 and matrix2
		for(int i=0;i<matrix3.length;i++) {
			for(int j=0;j<matrix3[i].length;j++) {
				matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		for(int i=0;i<matrix3.length;i++) {
			for(int j=0;j<matrix3[i].length;j++) {
				System.out.print(matrix3[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("\nTranspose of matrix3:");
		//transpose matrix
		for(int i=0;i<matrix3.length;i++) {
			for(int j=0;j<matrix3[i].length;j++) {
				System.out.print(matrix3[j][i]+" ");
			}
			System.out.println();
		}
		//symmetric matrix[if matrix is same as is tranpose matrix ]
		int[][] transpose=new int[3][3];
		
		boolean isSymmetric=true;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(matrix3[i][j]!=transpose[i][j]) {
					isSymmetric=false;
					break;
				}
			}
		}
		if(isSymmetric)
			System.out.println("it is a symmetric matrix");
		else
			System.out.println("not a symmetric matrix");
		
		System.out.println("==========================");
		//Trace an matrix
		int[][] matrix= {{1,2,3},{2,3,4},{5,5,6}};
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[j][i]+" ");
			}
			System.out.println();
		}
		int sum1=0;
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				if(i==j)
					sum1=sum1+matrix[i][j];
			}
		}
		System.out.println("sum of all elements of diagonal[00,11,22]: "+sum1);
		int sum2=0;
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				if(i+j==2)
					sum2=sum2+matrix[i][j];
			}
		}
		System.out.println("sum of all elements of diagonal[02,11,20]: "+sum2);
		
		//sum of all elements of matrix
		int sum=0;
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				sum=sum+matrix[i][j];
			}
		}
		System.out.println("sum of all elements: "+sum);
		
		
	}

}
