package com.capgemini.sam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOFileExample {

	public static void main(String[] args) {
		
		IOFileExample ex = new IOFileExample();
		ex.execute();
	}
	
	public void execute() {
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
			while((read = is.read()) > 0) {
				os.write(read);
			}

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
