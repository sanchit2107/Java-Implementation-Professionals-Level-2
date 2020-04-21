package com.capgemini.sam;

class ArrayDemoParameterPassing { 
	int intNumbers[];
	ArrayDemoParameterPassing(int i) { 
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
		public static void main(String[] args) { 
			
			//Accepting array length as command line argument. 
			try {
			int intArg = Integer.parseInt(args[0]);
			ArrayDemoParameterPassing ad = new ArrayDemoParameterPassing(intArg);
			ad.displayContents();
			ad.populateArray();
			ad.displayContents();
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("The index you have entered is invalid");
			}
	}
}