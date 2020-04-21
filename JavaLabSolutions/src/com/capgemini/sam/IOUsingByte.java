package com.capgemini.sam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOUsingByte {

	public static void main(String[] args) {
		
		long before = System.currentTimeMillis();
		IOUsingByte ex = new IOUsingByte();
		ex.execute();
		long after = System.currentTimeMillis();
		long executionTime = after-before;
		System.out.println("Execution time in mills: "+executionTime);

	}

	private void execute() {
		// TODO Auto-generated method stub
		
		InputStream is = null;
		OutputStream os = null;
		
		try {
			String inputFilePath= "C:\\Capgemini\\demo.txt";
			String outFilePath = "C:\\Capgemini\\output.txt";
			
			File inputFile = new File(inputFilePath);
			File outputFile = new File(outFilePath);
			is = new FileInputStream(inputFile);
			os = new FileOutputStream(outputFile);
			
			int read;
			int size = 0;
			byte bytesRead[] = new byte[1000];
			while((read = is.read(bytesRead)) > 0) {
				os.write(bytesRead, 0, read);
				size=size+read;
			}
			System.out.println("Size: "+ size);
		}			
		catch(IOException io) {
			io.printStackTrace();
		}
		finally {
			try {
				if(is!=null)
					is.close();
			}
			catch(IOException io) {
				io.printStackTrace();
			}
		}
	}

}
