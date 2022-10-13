package com.ak.Strings;

public class A3_P8_OccuranceOfSubstrings {

	public static void main(String[] args) {

		findNoOfOccurance("ashishkumar", "sh");
		findNoOfOccurance("aaaaa", "aa");
		findNoOfOccurance("aaaaa", "ar");
		
	}
	public static void findNoOfOccurance(String str,String sub) {
		int rep=0;
		boolean flag=false;
		for(int i=0;i<str.length();i++) {
			int k=0;
				for(int j=i;j<str.length() && k<sub.length() ;j++) {
					if(str.charAt(j)==sub.charAt(k)) {
						flag=true;
						k++;
					}
					else {
						flag=false;
						break;
					}
				}
				if(k==sub.length())
					rep++;
		}
		if(rep>0)
			flag=true;
		else
			flag=false;
		System.out.println(flag+" "+rep);
	}
}
