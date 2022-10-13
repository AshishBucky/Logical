package com.ak.program;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
    	int i=0;
		String str="India";
		char ch[]=str.toCharArray();
		for(char c:ch) {
			i++;
		}
		System.out.println("Length of string is:"+i);
	
	
    }
}
