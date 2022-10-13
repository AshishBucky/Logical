package com.ak.jdbc_Student;

import java.util.Scanner;

public class ClientApp {
	
	public static void main(String[] args) {
		int choice=0;
		do {
		Scanner sc=new Scanner(System.in);
		System.out.println("...MENU...");
		System.out.println("1:Save");
		System.out.println("2:Delete");
		System.out.println("3:Update");
		System.out.println("4:Select");
		System.out.println("5:Search");
		System.out.println("Enter your choice:");
		choice=sc.nextInt();
		switch(choice) {
			case 1:
				saveStudent();
				break;
			case 2:
				deleteStudent();
				break;
			case 3:
				updateStudent();
				break;
			case 4:
				selectStudent();
				break;
			case 5:
				searchStudent();
				break;
			default:
				System.out.println("Invalid choice!");
			sc.close();
		}
		}
		while(choice!=8);
	}
		public static void saveStudent() {
			StudentDAOImpl s1=new StudentDAOImpl();
			RegistrationService rs=new RegistrationService(s1);

			Student student=new Student();
			int sNo;
			String sName,email,mobNo;
			
			Scanner sc=new Scanner(System.in);
			sc=new Scanner(System.in);
			System.out.println("Enter sudent no:");
			sNo=sc.nextInt();
			System.out.println("Enter student name:");
			sName=sc.next();
			System.out.println("Enter email:");
			email=sc.next();
			System.out.println("Enter mob no:");
			mobNo=sc.next();
			student.setsId(sNo);
			student.setsName(sName);
			student.setEmail(email);
			student.setMobNo(mobNo);
			rs.save(student);
			
		}
		public static void deleteStudent() {
			StudentDAOImpl s1=new StudentDAOImpl();
			RegistrationService rs=new RegistrationService(s1);
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter student no. to be deleted:");
			int sNo=sc.nextInt();
			rs.delete(sNo);
			
		}
		public static void updateStudent() {
			StudentDAOImpl s1=new StudentDAOImpl();
			RegistrationService rs=new RegistrationService(s1);
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter student no. to be updated:");
			int sNo=sc.nextInt();
			System.out.println("Enter new mob number:");
			String mob=sc.next();
			rs.update(sNo,mob);
		}
		public static void selectStudent() {
			StudentDAOImpl s1=new StudentDAOImpl();
			RegistrationService rs=new RegistrationService(s1);
			System.out.println(rs.select());
		}
		public static void searchStudent() {
			StudentDAOImpl s1=new StudentDAOImpl();
			RegistrationService rs=new RegistrationService(s1);
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter student no. to be searched:");
			int sNo=sc.nextInt();
			System.out.println(rs.search(sNo));
		}
}
