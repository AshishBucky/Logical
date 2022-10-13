package com.ak.Strings;

public class A3_P10_ConvertToParagraph {

	public static void main(String[] args) {

		String str="abcdefghijklmnopqrstyuvwxyz";
		convert(str, 4);
	}
	public static void convert(String s,int width) {
		
		for(int i=0;i<s.length();i+=width) {
			System.out.println(s.substring(i,Math.min(s.length(), i+width)));
		}
	}
public static void convert2(String s,int width) {
		
		for(int i=0;i<s.length();) {
			System.out.println(s.substring(i,Math.min(s.length(), i+width)));
		}
	}
}
