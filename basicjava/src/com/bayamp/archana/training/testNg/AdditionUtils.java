package com.bayamp.archana.training.testNg;

public class AdditionUtils {

	public static int addNumbers(int[] inputData) {
		
		int sum =0;
		for (int i=0; i<inputData.length; i++) {
		sum = sum + inputData[i];
		}
		return sum;
	}
	
	public static int addNumbers(int num1 , int num2) {
		int total = num1+num2;
		return total;
		
	}

}
