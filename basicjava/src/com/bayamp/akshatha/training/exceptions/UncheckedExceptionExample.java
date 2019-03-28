package com.bayamp.akshatha.training.exceptions;

public class UncheckedExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int result = 1 / 0;
			System.out.println(result);

		} catch (ArithmeticException e) {

			System.out.println("ArithmeticException: " + e.getMessage());

		}

		try {
			int a[] = new int[10];
			// Array has only 10 elements
			a[11] = 9;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds");
		}

		try {
			int num = Integer.parseInt("XYZ");
			System.out.println(num);
		} catch (NumberFormatException e) {
			System.out.println("Number format exception occurred");
		}

		try {
			String str = null;
			System.out.println(str.length());
		} catch (NullPointerException e) {
			System.out.println("NullPointerException");
		}

		

	}

	
}
