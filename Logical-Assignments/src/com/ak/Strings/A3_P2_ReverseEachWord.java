
package com.ak.Strings;

public class A3_P2_ReverseEachWord {

	public static String reverseWords(String str) {
		String[] words=str.split(" ");
		String result="";
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			String rev="";
			int j=word.length()-1;
			while(j>=0) {
				rev=rev+word.charAt(j--);
			}
			result=result+rev+" ";
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(reverseWords("FI UOY ERA DOOG TA GNIHTEMOS REVEN OD TI ROF EERF "));
		System.out.println(reverseWords("IF YOU ARE GOOD AT SOMETHING NEVER DO IT FOR FREE"));
	}
}
