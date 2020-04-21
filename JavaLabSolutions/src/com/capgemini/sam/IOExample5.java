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

public class IOExample5 {

	public static void main(String[] args) {
		
		IOExample5 ex = new IOExample5();
		ex.execute();
	}
	
	public void execute() {
		Reader reader = null;
		Writer writer  = null;
		
		try {
			InputStream in = System.in;
			OutputStream out = System.out;
			reader = new InputStreamReader(in);
			String outfilePath = "C:\\Capgemini\\io.txt";
			File outfile = new File(outfilePath);
			writer = new FileWriter(outfile);
			
			int read;
			char[]charsRead = new char[1000];
			while((read = reader.read(charsRead)) > 0) {
				char ch = charsRead[read-3];
				if(ch == 'z')     // ch=='\n' will exit on next line
					break;
				writer.write(charsRead,0, read);
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
