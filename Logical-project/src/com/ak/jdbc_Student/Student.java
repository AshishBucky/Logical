package com.ak.jdbc_Student;

public class Student {
	int sId;
	String sName;
	String email;
	String mobNo;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", email=" + email + ", mobNo=" + mobNo + "]";
	}
	
	
}
