package com.ak.EmployeePromotion;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ClientTwo {
	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<>();
		
		Employee emp1=new Employee(1001,"Ashish",20000,2,"Post Graduate");
		Employee emp2=new Employee(1002,"Sagar",50000,6,"Graduate");
		Employee emp3=new Employee(1003,"Haider",46000,5,"Graduate");
		Employee emp4=new Employee(1004,"Ashok",35000,4,"Post Graduate");
		Employee emp5=new Employee(1005,"Murali",60000,7,"Graduate");
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		Predicate<Employee> p=(emp)->emp.qualificatoin.equalsIgnoreCase("Post Graduate");
		
		List<Employee> promotedList=Employee.promote(empList,p);
		System.out.println(promotedList);
		
		
	}

}
