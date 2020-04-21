package com.capgemini.sam;


import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class IOExample2 {

	public static void main(String[] args) {
		
		IOExample2 ex = new IOExample2();
		ex.execute();
	}
	
	public void execute() {
		Reader reader = null;
		Writer writer  = null;
		
		try {
			reader = new InputStreamReader(System.in);
			writer = new OutputStreamWriter(System.out);
			
			int read;
			while((read = reader.read()) > 0) {
				char ch = (char)read;
				if(ch == 'z')     // ch=='\n' will exit on next line
					break;
				writer.write(read);
				writer.flush();
			}


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
