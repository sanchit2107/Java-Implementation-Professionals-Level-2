package com.capgemini.sam;

import java.util.Scanner;

public class ScannerUI {

	public static void main(String[] args) {
		String name= "", city= "";
		int age= 0;
		int i = 0;
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press -1 to quit..");
		System.out.println("1. Enter Inputs");	
		System.out.println("2. Display Inputs");	
		System.out.println("3. Exit Dashboard");	
		

		int n = sc.nextInt();
		sc.nextLine();
		
		switch(n)
		{
		case 1:
			System.out.println("Enter the name: ");
			name = sc.nextLine();

			System.out.println("Enter the Age: ");
			age = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter the city: ");
			city = sc.nextLine();
			break;
		
		case 2:
			if(name=="" && age == 0)
				break;
			System.out.println("Name is : " + name + "  and Age is :  " + age);
			break;
		
		case 3:
			System.exit(0);
			break;
		default:
			System.out.println("Invalid Input... Please try again");
			break;
		}
		}while(i != -1);
	}
}
