package com.capgemini.sam;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {

	/**
	 * @param args
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Vector  vec=new Vector(5,4);
		
		int length = 10;
		
		for (int i = 0; i < length; i++) {
			vec.addElement( new String(" TestString " + i));
		}
		System.out.println(vec);
		
		System.out.println("size:"+vec.size());
		System.out.println("capicity:"+vec.capacity());
		vec.ensureCapacity(50);
		System.out.println("capicity:"+vec.capacity());
		vec.ensureCapacity(50);								//you cant decrease the capicity
		System.out.println("capicity:"+vec.capacity());
		

		Enumeration en=vec.elements();
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		
	}

}
