package com.ak.maximumNoOfFactors;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Utility {

	public static void main(String[] args) {
		maxFactorsInRangeOf(10);
		System.out.println(maxFactorsInRangeOf(15));

	}
	public static String maxFactorsInRangeOf(int num) {
		Map map=new HashMap();
		String result="";
		int maximum=0;
		for(int i=2;i<=num;i++) {
			int count=2;
			for(int j=2;j<i;j++) {
				if(i%j==0)
					count++;
			}
			map.put(i,count);
		}
		System.out.println(map);
		int max=0;
		for(int i=2;i<=map.size();i++) {
			for(int j=3;j<=map.size();j++) {
				if((int)map.get(j)>max) {
					max=(int) map.get(j);
					result=i+"::"+max;
				}
				else {
					max=(int) map.get(i);
					result=i+"::"+max;
				}	
			}
			
		}
		return result;
	}
}
