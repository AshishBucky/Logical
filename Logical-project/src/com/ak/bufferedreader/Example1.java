package com.ak.bufferedreader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example1 {

	public static void main(String[] args) {
		try {
			FileReader fr=new FileReader("F:\\AK codings\\Logical\\Logical-project\\src\\com\\ak\\bufferedreader\\abc.txt");
			BufferedReader br=new BufferedReader(fr);
			int data=0;
			
			/*
			 * while((data=br.read())!=-1) { System.out.print((char)data); }
			 */
			
			System.out.println();
			String str1="";
			String result="";
			while((str1=br.readLine())!=null) {
				System.out.println(str1);
				result=result+str1;
			}
			//System.out.println(result);
			String[] words=result.split(" ");
			int count=0;
			for(int i=0;i<words.length;i++) {
				if(words[i].equals("butter")) {
					count++;
				}
			}
			System.out.println("'butter' is repeated "+count+" times");
			
			
			br.close();
			fr.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
