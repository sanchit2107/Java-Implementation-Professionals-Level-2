package com.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StudentDetails")
public class Student {

	@Id
	@Column(name="StudentID")
	private int sid; 
	
	@Column(name="StudentName")
	private String name;
	private int marks;
	private int age;
	
	public Student() {
		
	}
	
	/**
	 * @param sid
	 * @param name
	 * @param marks
	 * @param age
	 */
	public Student(int sid, String name, int marks, int age) {
		super();
		this.sid = sid;
		this.name = name;
		this.marks = marks;
		this.age = age;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
