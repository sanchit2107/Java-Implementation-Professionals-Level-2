package com.capgemini.sam;

import java.util.Enumeration;
import java.util.Vector;

public class VectorBasicExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vector  vec=new Vector();
		
		int length = 10;
		
		for (int i = 0; i < length; i++) {
			vec.addElement( new String(" TestString " + i));
		}
		System.out.println(vec);
		
		
		Enumeration en=vec.elements();
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
	}
}
