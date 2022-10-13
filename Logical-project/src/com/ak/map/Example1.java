package com.ak.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Example1 {

	public static void main(String[] args) {

		Map<String,String> map1=new HashMap<>();
		map1.put("name", "Ashish");
		map1.put("actor","Dhanush" );
		map1.put("country", "India");
		
		System.out.println(map1);
		//another way of displaying
		Set<String> keys=map1.keySet();
		for(String key:keys) {
			System.out.println(key+" "+map1.get(key));
		}
		
		map1.put("name", "Nikhil");
		map1.put("actor", "Nikhil");
		
		System.out.println(map1);
		System.out.println("===============");
		Map<Integer,String>  map2=new Hashtable<>();
		map2.put(1, "ashish");
		map2.put(2, "captain");
		
		System.out.println(map2);
		Set<Integer> keys2=map2.keySet();
		for(int key:keys2) {
			System.out.println(key+" "+map2.get(key));
		}

		
	}
}
