package com.ak.jdbc_Student;

import java.util.ArrayList;

public class RegistrationService {

	/*StudentDAOImpl dao=null;
	RegistrationService(StudentDAOImpl dao) {
		this.dao=dao;
	}
	*///tightly coupled
	
	Registration rs=null;
	public RegistrationService(Registration rs) {
		this.rs = rs;
	}
	void save(Student student) {
		 rs.save(student);
	}
	void delete(int sNo) {
		rs.delete(sNo);
	}
	void update(int sNo,String mob) {
		rs.update(sNo,mob);
	}
	ArrayList select() {
		return rs.select();
	}
	Student search(int sNo) {
		return rs.search(sNo);
	}

	

}
