package com.ak.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort {

	public static void main(String[] args) {

		ArrayList<Student> arr=new ArrayList<>();
		arr.add(new Student(101,"ashish",29));
		arr.add(new Student(102,"suresh",25));
		arr.add(new Student(103,"mukesh",27));
		arr.add(new Student(104,"bikash",19));
		arr.add(new Student(105,"jonshon",22));
		
		arr.sort(new AgeComparator());
		//Collections.sort(arr,new AgeComparator());
		
		System.out.println("Sorting as age:");
		for(Student s:arr) {
			System.out.println(s.sno+" "+s.name+" "+s.age);
		}
		
		arr.sort(new NameComparator());
		//Collections.sort(arr, new NameComparator());

		System.out.println("\nSorting as name:");
		for(Student s:arr) {
			System.out.println(s.sno+" "+s.name+" "+s.age);
		}
	}

}
