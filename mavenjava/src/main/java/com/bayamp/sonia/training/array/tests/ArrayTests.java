package com.bayamp.sonia.training.array.tests;

import com.bayamp.sonia.training.utils.ArrayUtil;

public class ArrayTests {

	public static void TestCaseToFindHighestNumber() {

		int numbArr[] = { 20, 16, 10, 17, 5, 6, 8, 1, 15 };
		ArrayUtil arrayUtilobj = new ArrayUtil();
		int outputArr[] = arrayUtilobj.findHighNumbAndIndex(numbArr);
		if (outputArr != null) {

			System.out.println("Highest Number is " + outputArr[0]);
			System.out.println("Highest Number Index is " + outputArr[1]);
		}

	}

	public static void TestCaseToFindLowestNumber() {

		int numbArr[] = { 20, 16, 10, 17, 5, 6, 8, 1, 15 };
		ArrayUtil arrayUtilobj = new ArrayUtil();
		int outputArr[] = arrayUtilobj.findlowestNumbAndIndex(numbArr);
		if (outputArr != null) {

			System.out.println("\nLowest Number is " + outputArr[0]);
			System.out.println("Lowest Number Index is " + outputArr[1]);
		}

	}

	public static void TestCaseToFindSecondHighNumber() {

		int numbArr[] = { 20, 16, 10, 17, 5, 6, 8, 1, 15 };
		ArrayUtil arrayUtilobj = new ArrayUtil();
		int outputArr[] = arrayUtilobj.findSecondHighNumbAndIndex(numbArr);
		// second highest number
		if (outputArr != null) {

			System.out.println("\nSecond Highest Number is " + outputArr[0]);
			System.out.println("Second Highest Number Index is " + outputArr[1]);
		}

	}

	public static void TestCaseToFindSecondLowestNumber() {

		int numbArr[] = { 20, 16, 10, 17, 5, 6, 8, 1, 15 };
		ArrayUtil arrayUtilobj = new ArrayUtil();
		int outputArr[] = arrayUtilobj.findSecondLowestNumbAndIndex(numbArr);
		if (outputArr != null) {

			System.out.println("\nSecond Lowest Number is " + outputArr[0]);
			System.out.println("Second Lowest Number Index is " + outputArr[1]);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestCaseToFindHighestNumber();
		TestCaseToFindLowestNumber();
		TestCaseToFindSecondHighNumber();
		TestCaseToFindSecondLowestNumber();

	}

}
