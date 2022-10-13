package com.ak.Strings;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class Utility {
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr=new FileReader("src/com/ak/Strings/abc.txt");
		BufferedReader br=new BufferedReader(fr);
		
		String s=br.readLine();
		System.out.println(s);
		//findDuplicates(s);
		String s1="geeksforgeeks";
		removeDuplicatesCharacters(s1);
		removeDuplicatesCharacters1(s1);
		findOccuranceOfWords(s);
			
	}
	public static void findDuplicates(String str) {
		String words[]=str.split(" ");
		System.out.println(Arrays.toString(words));
		
		for(int i=0;i<words.length;i++) {
			int count=0;
			for(int j=1;j<words.length;j++) {
				if(words[i].equals(words[j])) {
					count++;
				}
			}
			System.out.println(words[i]+" "+count);
		}
	}
	public static void removeDuplicatesCharacters(String str) {
		char[] temp=str.toCharArray();
		Arrays.sort(temp);
		str=new String(temp);
		System.out.println(removeDups(str));
	}
	public static String removeDups(String str) {
		char[] arr=str.toCharArray();
		int res=1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=arr[i-1]) {
				arr[res]=arr[i];
				res++;
			}
		}
		str=new String(arr);
		System.out.println(str);
		return str.substring(0,res);
	}
	
	//using linkedhashset
	public static void removeDuplicatesCharacters1(String str) {
		
		LinkedHashSet<Character> lhs=new LinkedHashSet();
		String result="";
		for(int i=0;i<str.length();i++) {
			lhs.add(str.charAt(i));
		}
		System.out.println(lhs);
		for(char ch:lhs) {
			result=result+ch;
		}
		System.out.println(result);
	}
	public static void findOccuranceOfWords(String str) {
		HashMap<String,Integer> countMap=new HashMap<>();
		String[] arr=str.split(" ");
		for(String s:arr) {
			if(!countMap.containsKey(s)) {
				countMap.put(s,1);
			}
			else {
				countMap.put(s,countMap.get(s)+1);
			}
		}
		System.out.println("Occurances::");
		System.out.println(countMap);
	}

}
