package com.ak.Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class StringUtility {
	//1
	public static String toUpperCaseFirstLetter(String str) {
		//my name is khan-->My Name Is Khan
		String[] words=str.split(" ");
		String upper="";
		int i=0;
		while(i<words.length) {
			String word=words[i];
			for(int j=0;j<word.length();j++) {
				if(j==0) 
					upper=upper+Character.toUpperCase(word.charAt(j));	
				else
					upper=upper+word.charAt(j);	
			}
			upper=upper+" ";
			i++;
		}
		return upper.substring(0,upper.length()-1);
	}
	//2
	public static String getReverseString(String str){
		//avenger-->regneva
		int l=str.length();
		String revstr="";
		int i=0;//position
		while(i<=l-1){
			char ch=str.charAt(l-1-i);
			revstr=revstr+ch;
			i++;
		}
		return revstr;
	}
	//3
	public static String getEachWordReverseString(String str){
		//my name is khan-->ym eman si nakh
		String[] words=str.split(" ");
		String revStr="";
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			int l=word.length();
			for(int j=l-1;j>=0;j--) {
					char ch=word.charAt(j);
					revStr=revStr+ch;
			}
			revStr=revStr+" ";
		}
		return revStr.substring(0,revStr.length()-1);
	}
	//4
	public static String underscoreRemoveAdd(String str) {
		//no_of_wheels-->noOfWheels and noOfWheels-->no_of_wheels
		if(str.contains("_")) {
			String result="";
			String[] words=str.split("_");
			for(int i=0;i<words.length;i++) {
				String word=words[i];
				for(int j=0;j<word.length();j++) {
					char ch=word.charAt(j);
					if(i>0 &&j==0 && !Character.isUpperCase(ch))
						result=result+Character.toUpperCase(word.charAt(j));
					else
						result=result+word.charAt(j);		
				}
				
			}
			return result;
		}
		//5
		else {
			String result="";
			for(int i=0;i<str.length();i++) {
				char ch=str.charAt(i);
				if(Character.isUpperCase(ch)) 
					result=result+"_"+Character.toLowerCase(ch);
				else
					result=result+ch;
			}
			return result;
		}	
	}
	//6
	public static String toggleCase(String str) {
		//avengerENDGAME-->AVENGERendgame
		String result="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isLowerCase(ch))
				result=result+Character.toUpperCase(ch);
			else
				result=result+Character.toLowerCase(ch);
		}
		return result;
	}
	//7
	public static boolean isAnagram(String str1,String str2) {
		System.out.println(str1.length()+" "+str2.length());
		if(!(str1.length()==str2.length()))
			return false;
		else {
			int count=0;
			for (int i=0;i<str1.length();i++) {
				for (int j=0;j<str2.length();j++) {
					if(str1.charAt(i)==str2.charAt(j)) {
						char[] chArr=str2.toCharArray();
						while(j<chArr.length-1) {
							
							System.out.println("before:"+Arrays.toString(chArr));
							chArr[j]=chArr[j+1];
							System.out.println("after:"+Arrays.toString(chArr));
							j++;
							count++;	
						}
						chArr[j]=' ';
						
					}
				}
			}
			if(count==str1.length())
				return true;
			else return false;
		}	
	}
	//8
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
	
	//9-using linkedhashset
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
	//10
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
	
	public static void main(String[] args) {
		
 			Scanner sc=new Scanner(System.in);
 			int choice;
 			do{
 			System.out.println("1:Get String as first letter of each word to uppercase");
 			System.out.println("2:Get String as Reversed ");
 			System.out.println("3:Get String as Each word reversed ");
 			System.out.println("4:Get String as Each '_' replaced with next letter with uppercase");
 			System.out.println("5:Get String as Each uppercse letter replaced with '_'+lowercase of that letter");
 			System.out.println("6:Get String as changed to ToggleCase");
 			System.out.println("7:Check String is Anagram or not");
 			System.out.println("8:Remove Duplicates chars from a string");
 			System.out.println("9:Remove Duplicates chars from a string");
 			System.out.println("10:Find occurance of each words in a string");
 			System.out.println("Choose your option :");
 			choice=sc.nextInt();
 			switch(choice) {
 				case 1:
 					//String str;
 					System.out.println("enter your sentence:");
 					sc.nextLine();
 					String str=sc.nextLine();
 					System.out.println(toUpperCaseFirstLetter(str));
 					break;
 				case 2:
 					System.out.println("enter a String :");
 					sc.nextLine(); 
 					str=sc.nextLine();
 					System.out.println(getReverseString(str));
 					break;
 				case 3:
 					System.out.println("enter your sentence:");
 					sc.nextLine();
 					str=sc.nextLine();
 					System.out.println(getEachWordReverseString(str));
 					break;
 				case 4:
 					System.out.println("enter a string having underscore :");
 					 str=sc.next();
 					System.out.println(underscoreRemoveAdd(str));
 					break;
 				case 5:
 					System.out.println("enter a string having capital letter:");
 					 str=sc.next();
 					System.out.println(underscoreRemoveAdd(str));
 					break;
 				case 6:
 					System.out.println("enter a string:");
 					sc.nextLine();
 					str=sc.nextLine();
 					System.out.println(toggleCase(str));
 					break;
 				case 7:
 					System.out.println("enter a string:");
 					sc.nextLine();
 					String str1=sc.nextLine();
 					System.out.println("enter a string:");
 					String str2=sc.nextLine();
 					System.out.println(isAnagram(str1,str2));
 					break;
 				default:
 					System.out.println("Invalid choice !");
 			}
 			}
 			while(choice<10);
	}

}
