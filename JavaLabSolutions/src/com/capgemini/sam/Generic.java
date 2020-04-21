package com.capgemini.sam;

public class Generic {

	public static void main(String[] args) {

		Store<Integer> sin = new Store<>();
		sin.setElement(10);
		
		int i = sin.getElement();
	}

}
