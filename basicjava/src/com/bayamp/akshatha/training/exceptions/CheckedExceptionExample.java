package com.bayamp.akshatha.training.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author akshathamahale
 * Class to test Checked Exceptions
 */

public class CheckedExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		catchException();
		catchIOException();

	}
	
	public static void testException(String className) throws ClassNotFoundException {
		
		Class.forName(className);		
	}
	
	public static void catchException() {
		try {
			// Doesnt throw Exception
			testException("com.bayamp.akshatha.training.exceptions.CheckedExceptionExample");
			// Throws Exception
			testException("MyClass");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Class " + e.getMessage() + " not found");
		}
	}
	
	public static void catchIOException() {
		FileInputStream inputStream = null;
		try {
			File file = new File("./test.txt");
			inputStream = new FileInputStream(file);
			
			// use the inputStream to read a file
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
	}

}
