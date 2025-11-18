package com.excelr;

public class Student {
	
	private Integer studentId=123;
	private String studentName="DurgaPrasad";
	private String studentDept="cse";
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Integer studentId, String studentName, String studentDept) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentDept = studentDept;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentDept() {
		return studentDept;
	}
	public void setStudentDept(String studentDept) {
		this.studentDept = studentDept;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentDept=" + studentDept
				+ ", getStudentId()=" + getStudentId() + ", getStudentName()=" + getStudentName()
				+ ", getStudentDept()=" + getStudentDept() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	

}
