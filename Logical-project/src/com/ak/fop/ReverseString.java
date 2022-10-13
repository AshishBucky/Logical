package com.ak.fop;

public class ReverseString {

	public static void main(String[] args) {
		
		ReverseString r=new ReverseString();
		System.out.println(r.reverse("my name is khan"));
		
		System.out.println(r.divisor(7));
	}
	
	public String reverse(String word) {
		StringBuilder sb=null;
		
		String[] words=word.split(" ");
		//create StringBuilder Object
		sb=new StringBuilder();
		
		for(int i=words.length-1;i>=0;i--) {
			sb.append(words[i]);
		    sb.append(" ");
		}
	return	sb.toString();
	}
	
	public int divisor(int num) {
		int count=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				count=count+i;
			}
		}
		return count;
	}
}
