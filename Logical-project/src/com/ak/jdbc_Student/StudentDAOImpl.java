package com.ak.jdbc_Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentDAOImpl implements Registration {

	public static Connection getConnection() {
		Connection con=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	@Override
	public void save(Student student) {
		final String SAVE_STUDENT="INSERT INTO STUDENT1 VALUES(?,?,?,?)";
		Scanner sc=null;
		
		try {
		//get connection
		Connection con=StudentDAOImpl.getConnection();
		//read query param values
		int result=0;
		PreparedStatement ps=null;
		ps=con.prepareStatement(SAVE_STUDENT);
		//set query param values
		ps.setInt(1, student.getsId());
		ps.setString(2, student.getsName());
		ps.setString(3, student.getEmail());
		ps.setString(4, student.getMobNo());
		result=ps.executeUpdate();
		if(result!=0)
			System.out.println("Student is Saved !");
		else
			System.out.println("Student not saved !");
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int sNo) {
		try {
			//get connection 
			Connection con=StudentDAOImpl.getConnection();
			PreparedStatement ps=con.prepareStatement("DELETE FROM STUDENT1 WHERE SNO="+sNo);
			int result=ps.executeUpdate();
			if (result!=0)
				System.out.println("1 student record deleted");
			else 
				System.out.println("Deletion failed !");
		}
		catch (SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Student search(int sNo) {
		Student student=null;
		try {
			//get connection 
			Connection con=StudentDAOImpl.getConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("SELECT * FROM STUDENT1 WHERE SNO="+sNo);
			
			while(rs.next()) {
				student=new Student();
				student.setsId(rs.getInt(1));
				student.setsName(rs.getString(2));
				student.setEmail(rs.getString(3));
				student.setMobNo(rs.getString(4));
			}
		}catch (SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			return student;
		}
	}

	@Override
	public void update(int sNo,String mob) {
		try {
			//get connection 
			Connection con=StudentDAOImpl.getConnection();
			PreparedStatement ps=con.prepareStatement("UPDATE STUDENT1 SET MOB="+mob+"WHERE SNO="+sNo);
			int result=ps.executeUpdate();
			if (result!=0)
				System.out.println("1 student record updated");
			else 
				System.out.println("Updation failed !");
		}
		catch (SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList select() {
		ArrayList<Student> students=new ArrayList<>();
		try {
			//get connection 
			Connection con=StudentDAOImpl.getConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("SELECT * FROM STUDENT1");
			Student student=null;
			while(rs.next()) {
				student=new Student();
				student.setsId(rs.getInt(1));
				student.setsName(rs.getString(2));
				student.setEmail(rs.getString(3));
				student.setMobNo(rs.getString(4));
				students.add(student);
			}
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			return students;
		}
	}
}
