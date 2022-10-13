
package com.ak.Strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class A3_P4_FindFirstNonRepeatdChar {

	public static String findFirstNonRepeatedChar(String str) {
		Map<Character,Integer> map=new LinkedHashMap<>();
		for(char ch:str.toCharArray()) {
			map.put(ch, map.containsKey(ch) ? map.get(ch)+1 : 1);
		}
		Set<Character> keys=map.keySet();
		for(char c:keys) {
			if(map.get(c)==1)
				return "First non repeating character is:"+c;
		}
		return "No non-repeating char !";
		
	}
	public static void main(String[] args) {
		System.out.println(findFirstNonRepeatedChar("ashPish"));
		System.out.println(findFirstNonRepeatedChar("saassaKssJasa"));
	}
}
