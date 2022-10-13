package com.ak.Strings;

import java.util.Arrays;
import java.util.Stack;

public class A3_P7_ParanthesisMatching {

	public static void main(String[] args) {
		String str1="{(()[])}[(){}]";
		String str2="[(])";
		isMatching(str1);
	}
	public static void isMatching(String s) {
		char[] braces=s.toCharArray();
		Stack<Character> stack=new Stack<>();
		boolean flag=false;
		for(int i=0;i<braces.length;i++) {
			if(braces[i]=='{' || braces[i]=='[' ||braces[i]=='(') {
				stack.push(braces[i]);
				System.out.println(stack);
			}
			else if(braces[i]==stack.pop()) {
				flag=true;
			}
		}
		System.out.println(flag);
	}
}
