package com.bayamp.archana.training.exception;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class CheckedExcep {
	
	// handing the exception with try catch block
	public static void main(String[] args) {
		FileReader reader;
		try {
			reader = new FileReader("/Users/mohanakarthikeyan/github-workspace/newbatch1/basicjava/src/Untitled1.txt");
			BufferedReader fileInput = new BufferedReader(reader);
			String line;
			line = fileInput.readLine();
			while(line != null) {
				System.out.println(line);
				line = fileInput.readLine();
			}
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// throwing exception
		/*public static void main(String[] args) throws IOException {
			FileReader reader = new FileReader("/Users/mohanakarthikeyan/github-workspace/newbatch1/basicjava/src/Untitled1.txt");
			BufferedReader fileInput = new BufferedReader(reader);
			
			String line = fileInput.readLine();
			while(line != null) {
				System.out.println(line);
				line = fileInput.readLine();
			}
			fileInput.close();
		}*/
		
		
	}
}
