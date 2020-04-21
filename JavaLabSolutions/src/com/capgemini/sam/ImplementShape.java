package com.capgemini.sam;

public class ImplementShape {
	public static void main(String args[]) {
		
		Rectangle r = new Rectangle(10, 20);
		int area = r.getArea();
		String name = r.getName();
		String Draw = r.draw();
		System.out.println(area);
		System.out.println(name);
		System.out.println(Draw);
		
	}
}
