package com.capgemini.sam;

import java.util.Scanner;
public class SwitchString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Month:");
		String s = sc.next();
		
		switch(s)
		{
		case "January":
			System.out.println("Having 31 days");
			break;
		case "March":
			System.out.println("Having 31 days");
			break;
			
		case "May":
			System.out.println("Having 31 days");
			break;
			
		case "July":
			System.out.println("Having 31 days");
			break;
			
		case "August":
			System.out.println("Having 31 days");
			break;
			
		case "October":
			System.out.println("Having 31 days");
			break;
			
		case "December":
			System.out.println("Having 31 days");
			break;
			
		case "February":
			System.out.println("Having 28 days");
			break;
			
		case "April":
			System.out.println("Having 30 days");
			break;
			
		case "June":
			System.out.println("Having 30 days");
			break;
			
		case "September":
			System.out.println("Having 30 days");
			break;
			
		case "November":
			System.out.println("Having 30 days");
			break;
			
		default:
			System.out.println("Inavlid Month");
			break;
		
		}
	}

}
