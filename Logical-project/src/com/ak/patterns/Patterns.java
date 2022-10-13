package com.ak.patterns;

public class Patterns {

	/*Pattern:1
	1
	12
	123
	1234
	12345
	*/
	public static void pattern1(int n) {
		for(int i=0;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	/*Pattern:2
	 12345
	 1234
	 123
	 12
	 1
	 */
	public static void pattern2(int n) {
		for(int i=5;i>0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	/*Pattern:3
	 1
	 22
	 333
	 4444
     55555
	 */
	public static void pattern3(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	/*Pattern:4
	 54321
	 5432
	 543
	 54
	 5
	 */
	public static void pattern4(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	/*Pattern:5
	 54321
	 4321
	 321
	 21
	 1
	 */
	public static void pattern5(int n) {
		for(int i=n;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print(i-j);
			}
			System.out.println();
		}
	}
	/*Pattern:6
	 12345
	 2345
	 345
	 34
	 5
	 */
	public static void pattern6(int n) {
		for(int i=0;i<n;i++) {
			for(int j=1;j<=n-i ;j++) {
				System.out.print(i+j);
			}
			System.out.println();
		}
	}
	/*Pattern:7
	     *****
	      ****
	       ***
	       	**
	       	 * 
	 */
	public static void pattern7(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j>=i)
					System.out.print("*");
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	/*Pattern:8
	 12345
 	  2345
  	   345
   		45
    	 5
	 */
	public static void pattern8(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j>=i)
					System.out.print(j);
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	/*
	 12345
	 4321
	 123
	 21
	 1
	 */
	public static void pattern9(int n) {
		int k;
		for(int i=5;i>0;i--) {
			if(i%2==1)
				k=1;
			else 
				k=i;
			for(int j=1;j<=i;j++) {
				System.out.print(k);
				if(i%2==1)
					k++;
				else 
					k--;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		pattern1(5);
		System.out.println();
		pattern2(5);
		System.out.println();
		pattern3(5);
		System.out.println();
		pattern4(5);
		System.out.println();
		pattern5(5);
		System.out.println();
		pattern6(5);
		System.out.println();
		pattern7(5);
		System.out.println();
		pattern8(5);
		System.out.println();
		pattern9(5);
	}
}
