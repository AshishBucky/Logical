package junitbasic;

public class Test2 {

	public int count(String str) {
		int i=0;
		
		char ch[]=str.toCharArray();
		for(char c:ch) {
			i++;
		}
		return i;
	
	}

}
