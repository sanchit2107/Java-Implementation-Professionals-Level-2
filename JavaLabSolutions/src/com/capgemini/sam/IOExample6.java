package com.capgemini.sam;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class IOExample6 {

	public static void main(String[] args) {
		
		IOExample6 ex = new IOExample6();
		ex.execute();
	}
	
	public void execute() {
		Reader reader = null;
		Writer writer  = null;
		
		try {
			InputStream in = System.in;
			OutputStream out = System.out;
			reader = new InputStreamReader(in);
			writer = new OutputStreamWriter(out);
			
			int read;
			char[]charsRead = new char[1000];
			while((read = reader.read(charsRead)) > 0) {
				boolean endFound = false;
				for(char ch: charsRead) {  // ch=='\n' will exit on next line
					if(ch == 'z')
						endFound = true;
					break;
				}
				writer.write(charsRead,0, read);
				if(endFound)
					break;
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
