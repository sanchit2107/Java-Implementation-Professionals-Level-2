package com.capgemini.sam;

public class ArrayIndexOutOfBoundCheckUsingLength {

	int intNumbers[]; 
	ArrayIndexOutOfBoundCheckUsingLength(int i) 
    {intNumbers = new int[i];
}
void populateArray() 
{ for(int i = 0; i < intNumbers.length; ++i) 
	intNumbers[i] = i;
} 
void displayContents() 
{ for(int i = 0; i <intNumbers.length; ++i) 
	System.out.println("Number " + i + ": " + intNumbers[i]); 
} 
public static void main(String[] args) 
{ 
	
	//Accepting array length as command line argument. 
	if(args.length==0) {
		System.out.println("Please pass the appropriate argument");
		System.exit(0);
		
}
	else {
		int intArg = Integer.parseInt(args[0]);
		ArrayIndexOutOfBoundCheckUsingLength ad = new ArrayIndexOutOfBoundCheckUsingLength(intArg); 
	ad.displayContents(); 
	ad.populateArray(); 
	ad.displayContents(); 
	} }
}