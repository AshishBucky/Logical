package com.ak.Strings;

import javax.xml.stream.events.Characters;

public class A3_P9_ToggleCase {
	public static void main(String[] args) {
		toggleCase("My name is Khan");
		toggleCase("wwW.akCodes.COM");
		toggleCase("My name is Khan");
	}
	
	public static void toggleCase(String s) {
		String res="";
		int i=0;
		while(i<s.length()) {
			if(Character.isLowerCase(s.charAt(i))) 
				res=res+Character.toUpperCase(s.charAt(i));
			else
				res=res+Character.toLowerCase(s.charAt(i));
			i++;
		}
		System.out.println(res);
	}
}
