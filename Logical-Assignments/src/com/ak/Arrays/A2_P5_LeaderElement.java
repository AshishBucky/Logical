package com.ak.Arrays;

import java.util.HashMap;
import java.util.Map;

public class A2_P5_LeaderElement {

	public static String findLeaderElement(int[] arr) {
		int l=arr.length;
		Map<Integer,Integer> map=new HashMap();
		for(int n:arr) {
			if(!map.containsKey(n)) {
				map.put(n,1);
			}
			else {
				map.put(n, map.get(n)+1);
				if(map.get(n)>l/2) {
					return "leader element is :"+n;
				}
			}
		}
		return "Leader element doesn't exist!";
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,2,2,3,4,5,6,2,2,2,2,2};
		System.out.println(findLeaderElement(arr));
		int[] arr2= {1,2,3,2,2,3,4,5,6,5,5,2,5};
		System.out.println(findLeaderElement(arr2));
	}

}
