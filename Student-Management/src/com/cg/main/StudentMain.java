package com.cg.main;

import java.util.Scanner;

import com.cg.bean.Student;
import com.cg.service.StudentService;
import com.cg.service.StudentServiceImpl;

public class StudentMain {

	public static void main(String[] args) {
		StudentService ser=new StudentServiceImpl();
		Scanner s=new Scanner(System.in);
		System.out.println("1 For Create Student");
		System.out.println("2 For Find Student");
		System.out.println("3 For display All Student");
		System.out.println("Enter Choice");
		int ch=s.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter Name");
			String name=s.next();
			System.out.println("Enter Marks");
			int marks=s.nextInt();
			Student s1=new Student(name, marks);
			String result=ser.saveStudent(s1);
			System.out.println(result);
			break;
		case 2:
			System.out.println("Enter Student ID");
			String sid=s.next();
			Student stu=ser.findStudent(sid);
			if(stu!=null)
				System.out.println(stu.getName()+"\t"+stu.getMarks()+"\t"+stu.getGrade());
			else
				System.out.println("Student Not available");
			break;
		default :
			System.out.println("Enter Valid Option");
		}
			
		s.close();
	}

}
