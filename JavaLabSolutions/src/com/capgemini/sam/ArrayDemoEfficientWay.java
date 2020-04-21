package com.capgemini.sam;
import java.util.Arrays;

public class ArrayDemoEfficientWay { 
	int intNumbers[];
	ArrayDemoEfficientWay(int i) { 
		intNumbers = new int[i]; 
	} 
	void populateArray() {
		for(int i = 0; i < intNumbers.length; ++i)
			intNumbers[i] = i; 
	}
	void displayContents() { 
			for(int i = 0; i < intNumbers.length; ++i)
				System.out.println("Number " + i + ": " + intNumbers[i]); 
	} 
	
	void copyAndStore() {
		int beg=4, end=5;
		int subarray[] = new int[end-beg+1];
		System.arraycopy(intNumbers, beg, subarray, 0, subarray.length);
		
		System.out.println(Arrays.toString(subarray));
		
	}
		public static void main(String[] args) { 
			
			//Accepting array length as command line argument. 
			try {
			int intArg = Integer.parseInt(args[0]);
			ArrayDemoEfficientWay ad = new ArrayDemoEfficientWay(intArg);
//			ad.displayContents();
			ad.populateArray();
			ad.displayContents();
			System.out.println("Elements between 5th and 6th are stored as in efficient way: ");
			ad.copyAndStore();
			
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("The index you have entered is invalid");
			}
	}
}
