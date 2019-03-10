package com.bayamp.akshatha.training.basics;

import java.util.Arrays;

public class MathUtilityClass {

	
	public static int factorialByIteration(int n) {
		int fact=n;
		for (int i = n - 1; i > 0; i--) {
			fact = fact * i;
		
		}
		return fact;
	}
	
	public static int factorialByRecursion(int n) {
		
		if (n == 0 ) {
			return 1;
		} else {
			return n * factorialByRecursion(n - 1);
		}
	}
	
	public static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		} else {

			for (int i = 2; i < Math.sqrt(n); i++) {

				if (n % i == 0) {
					return false;
				}
				
			}
		}
		return true;
	}
	
	public static int[] swapTemp(int[] nums) {
		
		int temp=nums[0];
		nums[0]=nums[1];
		nums[1]=temp;
		return nums;
}
	
public static int[] swap(int[] nums) {
	
	nums[0]=nums[0]+nums[1];
	nums[1]=nums[0]-nums[1];
	nums[0]=nums[0]-nums[1];
	
	return nums;
}
}

