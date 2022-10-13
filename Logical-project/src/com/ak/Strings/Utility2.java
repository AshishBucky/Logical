package com.ak.Strings;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Utility2 {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("src/com/ak/Strings/abc.txt");
		BufferedReader br=new BufferedReader(fr);
		
		String str="";
		String result="";
		while((str=br.readLine())!=null) {
			result=result+str;
		}
		System.out.println(result);
		removeDuplicates("geeksforseeks");
		removeDuplicatesUsingSet("geeksforseeks");
	}
	
	public static void removeDuplicates(String str) {
		char[] arr=str.toCharArray();
		Arrays.sort(arr);
		str=new String(arr);
		System.out.println(str);
		
		int res=1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=arr[i-1]) {
				arr[res]=arr[i];
				res++;
			}
		}
		str=new String(arr);
		System.out.println(str.substring(0,res));
	}
	
	public static void removeDuplicatesUsingSet(String str) {
		LinkedHashSet<Character> lhs=new LinkedHashSet<Character>();
		String result="";
		for(Character ch:str.toCharArray()) {
			lhs.add(ch);
		}
		System.out.println(lhs);
		for(char ch:lhs)
			result=result+ch;
		System.out.println(result);
	}
}
