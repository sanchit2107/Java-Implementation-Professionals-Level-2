package com.cg.bean;

public class Student {
	private String sid;
	private String name;
	private int marks;
	private String grade;
	
	public Student() {
		
	}
	public Student(String name, int marks) {
		this.name=name;
		this.marks=marks;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
}
