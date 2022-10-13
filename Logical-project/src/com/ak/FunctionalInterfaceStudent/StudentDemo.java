package com.ak.FunctionalInterfaceStudent;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StudentDemo {

	public static void main(String[] args) {
		Student[] students= new Student[] {new Student(101,"ashish",90),
											new Student(102,"akash",50),
											new Student(103,"bikash",70),
											new Student(104,"biswas",60),
											new Student(105,"mukesh",30)
		};
		/*for(Student student:students) {
			String grade="";
			if(student.marks>=70)
				grade="A";
			else if(student.marks>=60)
				grade="B";
			else if(student.marks>=50)
				grade="C";
			else if(student.marks>=40)
				grade="D";
			else 
				grade="F";
			System.out.println(student.sId+", "+student.sName+", "+student.marks+", "+grade);
		}*/
		System.out.println("Using Function :");
		Function<Student,String> f=(student)->{
			String grade="";
			if(student.marks>=70)
				grade="A";
			else if(student.marks>=60)
				grade="B";
			else if(student.marks>=50)
				grade="C";
			else if(student.marks>=40)
				grade="D";
			else 
				grade="F";
			return grade;
		};
		for(Student student:students) {
			String grade=f.apply(student);
			System.out.println(student.sId+", "+student.sName+", "+student.marks+", "+grade);
		}
		
		System.out.println("====================");
		System.out.println("Using Function,Names starts with 'a':");
		Function <Student,String> f2=(student)->{
			String grade="";
			
				if(student.marks>=70)
					grade="A";
				else if(student.marks>=60)
					grade="B";
				else if(student.marks>=50)
					grade="C";
				else if(student.marks>=40)
					grade="D";
				else 
					grade="F";
				return grade;	
		};
		for(Student student:students) {
			if(student.sName.startsWith("a")) {
				String grade=f2.apply(student);
				System.out.println(student.sId+", "+student.sName+", "+student.marks+", "+grade);
			}
		}
		
		
		System.out.println("=====================");
		System.out.println("Using Pridicate ,Names starts with 'a':");
		Predicate<Student> p=(student)->student.sName.startsWith("a");
		for(Student student:students) {
			String grade="";
			if(p.test(student)) {
				if(student.marks>=70)
					grade="A";
				else if(student.marks>=60)
					grade="B";
				else if(student.marks>=50)
					grade="C";
				else if(student.marks>=40)
					grade="D";
				else 
					grade="F";
				System.out.println(student.sId+", "+student.sName+", "+student.marks+", "+grade);
			}
		}
		System.out.println("================");
		Consumer<Student> c=(student)->{
			System.out.println("Id :"+student.sId);
			System.out.println("Name :"+student.sName);
			System.out.println("Mark :"+student.marks);
		};
		for(Student student:students) {
			if(p.test(student)) {
				String grade=f.apply(student);
				c.accept(student);
				System.out.println("Grade :"+grade);
			}
		}
		System.out.println("======================");
		Supplier<String> s=()->{
			String otp="";
			for(int i=0;i<5;i++) {
				double val=Math.random()*10;
				otp=otp+(int)val;
			}
			return otp;
		};
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}
}
