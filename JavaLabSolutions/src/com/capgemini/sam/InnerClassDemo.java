package com.capgemini.sam;

public class InnerClassDemo {
	public static void main(String args[]) {
		IMul multiplier = new IMul() {
			
			@Override
			public int mul(int a, int b) {
				return a*b;
			}
			
			public void someMethod() {
						// Only visible for inner class and cannot be accessed outside this inner class
			}
		};
		
		int result = multiplier.mul(2, 3);
	}
}
