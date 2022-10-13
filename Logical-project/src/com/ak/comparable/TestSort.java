package com.ak.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort {

	public static void main(String[] args) {
		ArrayList<Student> sl=new ArrayList<>();
		sl.add(new Student(101,"ashish",21));
		sl.add(new Student(102,"bikash",32));
		sl.add(new Student(103,"suresh",54));
		sl.add(new Student(104,"mahesh",24));
		
		Collections.sort(sl);
		for(Student student:sl) {
			System.out.println(student.sno+" "+student.name+" "+student.age);
		}
		
	}
}
