package com.ak.EmployeePromotion;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Employee {

	int empId;
	String empName;
	double empSal;
	int experience;
	String qualificatoin;
	
	public Employee(int empId,String empName,double empSal,int experience,String qualificatoin) {
		this.empId=empId;
		this.empName=empName;
		this.empSal=empSal;
		this.experience=experience;
		this.qualificatoin=qualificatoin;
	}
	
	public static List<Employee> promote(List<Employee> list,Predicate<Employee> p){
		List<Employee> promotedList= new ArrayList<Employee>();
		for(Employee emp:list) {
			//if(emp.experience>=5)----------------------->not useful
			//if(ClientOne.isEligibleToPromote(emp))------>not useful
			if(p.test(emp))
				promotedList.add(emp);
		}
		return promotedList;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", experience=" + experience
				+ ", qualificatoin=" + qualificatoin + "]";
	}
	
}
