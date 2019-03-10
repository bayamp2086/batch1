package com.bayamp.archana.training.utils;

public class MathUtil {

	public static int addTwoNumbers(int num1, int num2) {
		int total = num1 + num2;

		System.out.println(+total);
		return total;
	}

	public float addTwoNumbers(float num1, float num2) {
		float total = num1 + num2;
		System.out.println("Value for float addition " + total);
		return total;

	}

	public int addition(int[] num) {
		System.out.println(num);
		return 0;
		
	}
	
	public int numbers(int num1) {
		return num1;
		
	}
	
	
	public void printFor(int[] sampleArray) {
		for(int i=0; i<sampleArray.length; i++) {
			System.out.println(sampleArray[i]);
		}
		
		for(int temp : sampleArray) {
			System.out.println(temp);
		}
	}
	
	public void printString(String[] name) {
		
		
		for(String temp: name)
		{
			System.out.println(temp);
		}
		
	}
	
	
}
