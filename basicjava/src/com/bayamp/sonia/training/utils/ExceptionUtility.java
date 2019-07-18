package com.bayamp.sonia.training.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.bayamp.sonia.training.objects.Laptop;
import com.bayamp.sonia.training.objects.Person;

public class ExceptionUtility extends RuntimeException {

	public static void GetNullPointerException(Laptop p) {

		try {
			if (p.getModelNo().equals("Sonia")) {
				System.out.println("Model No Name is Sonia");
			}
		} catch (NullPointerException e) {
			System.out.println("NullPointerException Occured " + e.getMessage());
			// e.printStackTrace();
		}

	}

	public static void GetArithmeticException() {

		try {

			int numb1 = 100;
			int numb2 = numb1 - 100;
			int numb3 = numb1 / numb2;
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException Occured " + e);
			// e.printStackTrace();
		}

	}

	public static void GetNumberFormatException() {

		try {

			String numb1 = "1234S";
			int numb2 = Integer.valueOf(numb1) - 100;
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException Occured " + e);
			// e.printStackTrace();
		}

	}

	public static void GetClassCastException(Object o) {

		try {

			Laptop lpt = (Laptop) o;
		} catch (ClassCastException e) {
			System.out.println("ClassCastException Occured " + e);
			// e.printStackTrace();
		}

	}

	public static void GetClassNotFoundException() {
	

		try {
			Class.forName("Laptop");
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException Occured " + e);
		}
	}

	public static void GetOutOfMemoryException(Person p) {

		int count=6;
		
		try {
			while(true)
			p.setCount(count);
		} catch (OutOfMemoryError e) {
			System.out.println("OutOfMemoryError Occured " + e);
		}
		
		
		
	}

	public static void GetArrayIndexOutofBoundException() {
		
		int input[]= {2,4,5,6,7};
		
		
		try {
			System.out.println(input[7]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException Occured " + e);
		}
		
	}
	
	public static void UncheckedException()  {
		
		String str=new String("Sonia");
		str=str.replace("Sonia", "Neha");
		//str=null;
		
		if(str.equals("Neha")) {
			throw new NullPointerException();
		}
       
	}
}
