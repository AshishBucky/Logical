
package com.ak.Strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class A3_P5_RemoveSpecialChars {

	public static String findFirstNonRepeatedChar(String str) {
		return str.replaceAll("[^0-9a-zA-Z]", "");
	}
	public static void main(String[] args) {
		System.out.println(findFirstNonRepeatedChar("a?s*his/@@h"));
	}
}
