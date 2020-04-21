package com.capgemini.sam;

class Apple2{
	public String color = "red";
	public int primValue = 5;
}


public class PrimitivePassByValue {
	public static void main(String[] args) {
		Apple2 apple=new Apple2();
		
		 
		System.out.println("color " + apple.color  + " Value :" + apple.primValue);
		changeColor(apple , apple.primValue);
		System.out.println("after change color " + apple.color  + " Value :" + apple.primValue);
		
	}
	
	
	public static void changeColor(Apple2  apple , int value) {
		value = 8;
		apple.color="green";
	}

}