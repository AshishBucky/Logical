package com.ak.Strings;

public class A3_P1_ReverseString {

	//Reverse a string without using reverse method
	public static String reverse(String s) {
		String revStr="";
		int i=s.length()-1;
		while(i>=0) {
			revStr=revStr+s.charAt(i--);
		}
		return revStr;
	}
	public static String reverse1(String s) {
		char[] chars=s.toCharArray();
		String revStr="";
		int i=s.length()-1;
		while(i>=0) {
			revStr=revStr+chars[i--];
		}
		return revStr;
	}
	public static void main(String[] args) {
		System.out.println(reverse("ACIREMA NIATPAC"));
		System.out.println(reverse1("ACIREMA NIATPAC"));
	}
}
