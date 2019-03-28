package com.bayamp.archana.training.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class CheckedException {
	//can not complie with compile time exceptions  or CheckedException
	
	//the file is not found so it has to throw the exception or surround by try catch 
	/*public static void main(String[] args) {
		FileReader reader = new FileReader("main/resources/Data/addition.csv");
		BufferedReader fileInput = new BufferedReader(reader);
		
		for (int i =0; i<3 ; i++) {
			System.out.println(fileInput.readLine());
			fileInput.close();
		}
	}*/
	
	// Add throws exception now the exception is gone but the file not found it seen when u complie 
	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("/Users/mohanakarthikeyan/github-workspace/newbatch1/basicjava/src/Untitled1.txt");
		BufferedReader fileInput = new BufferedReader(reader);
		
		String line = fileInput.readLine();
		while(line != null) {
			System.out.println(line);
			line = fileInput.readLine();
		}
	
		
//		for (int i =0; i<4; i++) {
//			System.out.println(fileInput.readLine());
//			
//		}
		fileInput.close();
	}
	
	// Add try and catch now the exception is gone but the file not found it seen when u complie 
	/*public static void main(String[] args) {
		FileReader reader;
		try {
			reader = new FileReader("main/resources/Data/addition.csv");
			BufferedReader fileInput = new BufferedReader(reader);
			for (int i =0; i<3 ; i++) {
				try {
					System.out.println(fileInput.readLine());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					fileInput.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		/*public static void main(String[] args)   {
			
			try {
				
			
			FileReader reader = new FileReader("/Users/mohanakarthikeyan/github-workspace/newbatch1/basicjava/src/Untitled1.txt");
	
			BufferedReader fileInput = new BufferedReader(reader);
			
			for (int counter = 0; counter < 3; counter++)  
	            System.out.println(fileInput.readLine()); 
	          
	        fileInput.close(); 
	        
			}
			
			
			catch(IOException e) {
				e.printStackTrace();
			}
		}*/
}


