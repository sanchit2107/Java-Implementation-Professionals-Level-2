package com.capgemini.sam;

import java.io.InputStream;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		InputStream in = System.in;
		Scanner sc = new Scanner(in);
		
		System.out.println("Enter the name: ");
		String name = sc.next();
		
		System.out.println("Enter the Age: ");
		int age = sc.nextInt();
		
		System.out.println("Name is : "+ name + "  and Age is :  "+ age);

	}

}
