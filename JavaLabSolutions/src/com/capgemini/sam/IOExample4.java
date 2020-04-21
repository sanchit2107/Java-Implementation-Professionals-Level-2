package com.capgemini.sam;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;

public class IOExample4 {

	public static void main(String[] args) {
		
		IOExample4 ex = new IOExample4();
		ex.execute();
	}
	
	public void execute() {
		Reader reader = null;
		Writer writer  = null;
		
		try {
			reader = new InputStreamReader(System.in);
			String outfilePath = "C:\\Capgemini\\io.txt";
			File outfile = new File(outfilePath);
			writer = new FileWriter(outfile	);		
			
			int read;
			while((read = reader.read()) > 0) {
				char ch = (char)read;
				if(ch == 'z')     // ch=='\n' will exit on next line
					break;
				writer.write(read);
			}
			writer.flush();

		}			
		catch(IOException io) {
			io.printStackTrace();
		}
		
		finally {
			try {
				if(reader!=null)
					reader.close();
				if(writer!=null)
					writer.close();
			}
			catch(IOException io) {
				io.printStackTrace();
			}
		}
	}

}
