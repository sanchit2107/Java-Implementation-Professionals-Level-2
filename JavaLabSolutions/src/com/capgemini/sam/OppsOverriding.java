package com.capgemini.sam;

class ParentClass{
	   //Parent class constructor
	   ParentClass(){
		System.out.println("Constructor of Parent");
	   }
	   void disp(){
		System.out.println("Parent Method");
	   }
	}
public class OppsOverriding extends ParentClass{
	   OppsOverriding(){
		System.out.println("Constructor of Child");
	   }
	   void disp(){
		System.out.println("Child Method");
	        //Calling the disp() method of parent class
		super.disp();
	   }
	   public static void main(String args[]){
		//Creating the object of child class
		OppsOverriding obj = new OppsOverriding();
		obj.disp();
	   }
	}
