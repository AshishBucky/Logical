package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringUtils {

	public static String reverse(String str) {
		String strRev = "";
		int i = str.length() - 1;
		while (i >= 0) {
			strRev = strRev + str.charAt(i--);
		}
//		for(int i=0;i<str.length();i++) {
//			
//		}
		return strRev;
	}

	public static void findMaximumOccuranceOfCharacter(String str) {
		Map<Character, Integer> map = new HashMap<>();
		for (char ch : str.toCharArray()) {
			map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);
		}
		int max=0;
		for(int n:map.values()) {
			if(n>max)
				max=n;
		}
		for(Entry<Character,Integer> entry:map.entrySet()) {
			if(entry.getValue()==max)
				System.out.println("The maximum occured char is:"+entry.getKey());
		}
		
	}

	public static void main(String[] args) {
		
		
		findMaximumOccuranceOfCharacter("aabbac");
		System.out.println("-----------------------------");
		findMaximumOccuranceOfCharacter("aabbbac");
	}
}
