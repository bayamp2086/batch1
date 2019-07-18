package com.bayamp.chaya.training.arrayutils;

public class HighestNumberUtil {
	int firstHighNumber = Integer.MIN_VALUE;
	int secondHighNumber = Integer.MIN_VALUE;

	/*
	 * public int highNum(int [] number){
	 * 
	 * 
	 * for (int element:number){ if(element >firstHighNumber){ firstHighNumber
	 * =element; }
	 * 
	 * 
	 * } System.out.println("First highest number in an array"+ number+ "is :" +
	 * firstHighNumber);
	 * 
	 * return firstHighNumber;
	 * 
	 * 
	 * }
	 */

	public int secondHighestNum(int[] number) {

		for (int element : number) {
			if (element > firstHighNumber) {
				secondHighNumber = firstHighNumber;
				firstHighNumber = element;

			}

		}

		System.out.println("First highest number in an array: " + firstHighNumber);
		System.out.println("Second highest number in an array: " + secondHighNumber);
		return secondHighNumber;
	}
}
