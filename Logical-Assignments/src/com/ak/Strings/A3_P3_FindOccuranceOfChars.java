
package com.ak.Strings;

import java.util.HashMap;
import java.util.Map;

public class A3_P3_FindOccuranceOfChars {

	public static Object findOccurances(String str) {
		
		Map<Character,Integer> map=new HashMap<>();
		int i=0;
		boolean isAvail=false;
		
		 /*
		 for(char ch:str.toCharArray()) {
			 map.put(ch,map.containsKey(ch)? map.get(ch)+1:1);
		 }
		 */
		while(i<str.length()) {
			if(!map.containsKey(str.charAt(i))) 
				map.put(str.charAt(i++), 1);
			else {
				char ch=str.charAt(i);
				map.put(ch, map.get(ch)+1);
				i++;
				isAvail=true;
			}
		}
		if(!isAvail)
			return "No duplicate character!";
		return map;
		
	}
	public static void main(String[] args) {
		System.out.println("little :"+findOccurances("little"));
		System.out.println("tiger  :"+findOccurances("tiger"));
	}
}
