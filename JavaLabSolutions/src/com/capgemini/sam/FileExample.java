package com.capgemini.sam;

import java.io.File;

public class FileExample {
	public static void main(String args[]) {
		String path = "C:\\Capgemini";
		File file = new File(path);
		boolean isDir = file.isDirectory();
		boolean isFile = file.isFile();
		System.out.println("is dir ="+ isDir + " is file = "+ isFile);
		File child = new File(file, "newdir");
		boolean exists = child.mkdir();
		System.out.println(exists);
		FileExample example = new FileExample();
		example.listFiles(file);
	}

	private void listFiles(File parent) {
		
		File files[] = parent.listFiles();
		for(File file:files) {
			System.out.println(file.getName());
		}
		
	}
}
