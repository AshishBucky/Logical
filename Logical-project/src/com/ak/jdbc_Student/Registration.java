package com.ak.jdbc_Student;

import java.util.ArrayList;

public interface Registration {
	void save(Student student);
	void delete(int sNo);
	Student search(int id);
	void update(int sNo,String mob);
	ArrayList<Student> select();
}
