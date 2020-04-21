package com.capgemini.sam;

class Apple {
	public String color = "red";
}

public class PassbyValueDemo {
	public static void main(String args[]) {
		Apple apple = new Apple();
		System.out.println("Old color= " + apple.color);

		changeColor(apple);
		System.out.println("New changed color= " + apple.color);
	}

	public static void changeColor(Apple apple) { // passing the object
		apple.color = "green";
	}
}
