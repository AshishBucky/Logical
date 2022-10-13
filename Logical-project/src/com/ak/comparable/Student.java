package com.ak.comparable;

public class Student implements Comparable<Student> {

	int sno;
	String name;
	int age;
	public Student(int sno, String name, int age) {
		this.sno = sno;
		this.name = name;
		this.age = age;
	}
	public int compareTo(Student s) {
		if(age==s.age)
			return 0;
		else if(age>s.age)
			return 1;
		return -1;
	}
}
