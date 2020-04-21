package com.capgemini.java8;

import java.util.Date;

@FunctionalInterface
interface Demo {
	public void getcode();
	public default Date getDate() {
		return new Date();
	}
	public default Date getDate1() {
		return new Date();
	}
}


public class InnerDemo {

	public static void main(String[] args) {
		
		Demo d12 = () -> System.out.println("Code Called..");
		d12.getcode();
	}

}
