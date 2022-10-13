package com.ak.Strings;

import java.util.Arrays;

public class A3_P6_CheckAnagram {

	public static boolean isAnagram1(String s1,String s2) {
		if(s1.length()!=s2.length())
			return false;
		char[] arr1=s1.toCharArray();
		char[] arr2=s2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		return Arrays.equals(arr1, arr2);
	}
	public static boolean isAnagram2(String s1,String s2) {
		boolean flag=true;
		if(s1.length()!=s2.length())
			return false;
		for(int i=0;i<s1.length();i++) {
			int found=0;
			for(int j=0;j<s2.length();j++) {
				if(s1.charAt(i)==s2.charAt(j)) {
					found=1;
					break;
				}
			}
			if(found==0) {
				flag=false;
				break;
			}
		}
		return flag;
	}
	
	public static void main(String[] args) {
		System.out.println(isAnagram1("peek", "keep"));
		System.out.println(isAnagram1("peek", "pkek"));
		System.out.println(isAnagram1("aca", "aaca"));
		System.out.println("------");
		System.out.println(isAnagram2("peek", "keep"));
		System.out.println(isAnagram2("peek", "pkek"));
		System.out.println(isAnagram2("aca", "aaca"));
	}
}
