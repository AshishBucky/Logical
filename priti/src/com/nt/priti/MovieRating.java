package com.nt.priti;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MovieRating {

	public static void main(String[] args) {
		
		Map<Integer,Float> ratingsMap=new HashMap<Integer,Float>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of movies:");
		int moviesCount=sc.nextInt();
		while(moviesCount>0) {
			System.out.println("Enter movie id:");
			int id=sc.nextInt();
			System.out.println("Enter average rating:");
			float rating=sc.nextFloat();
			ratingsMap.put(id, rating);
			moviesCount--;
		}
		ratingsMap=sortRatingWise(ratingsMap);
		
		for (Map.Entry<Integer,Float> en : ratingsMap.entrySet()) { 
            System.out.println(en.getKey() +" "+ en.getValue()); 
        } 
		
	}
	
	public static HashMap<Integer,Float> sortRatingWise(Map<Integer,Float> ratingsMap ) {
		
		        List<Map.Entry<Integer, Float> > list = 
		               new LinkedList<Map.Entry<Integer, Float> >(ratingsMap.entrySet()); 
		   
		        Collections.sort(list, new Comparator<Map.Entry<Integer, Float> >() { 
		            public int compare(Map.Entry<Integer, Float> o1,  
		                               Map.Entry<Integer, Float> o2) 
		            { 
		                return (o1.getValue()).compareTo(o2.getValue()); 
		            }

		        }); 
		          
		        HashMap<Integer, Float> temp = new LinkedHashMap<Integer, Float>(); 
		        for (Map.Entry<Integer, Float> aa : list) { 
		            temp.put(aa.getKey(), aa.getValue()); 
		        } 
			return temp;
		}
}
