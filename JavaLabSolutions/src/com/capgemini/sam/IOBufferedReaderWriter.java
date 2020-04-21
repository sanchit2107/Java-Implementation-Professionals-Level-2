package com.capgemini.sam;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class IOBufferedReaderWriter {

	public static void main(String[] args) {
		
		IOBufferedReaderWriter ex = new IOBufferedReaderWriter();
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
			
			BufferedReader br = new BufferedReader(reader);
			BufferedWriter bw = new BufferedWriter(writer);
			
			String read;
			while(!(read = br.readLine()).isEmpty()) {
				System.out.println("Readline: "+ read);
				bw.write(read);
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
