package com.bayamp.sonia.training.utils;

public class MathUtil {

	public static int addNumbers(int numb1, int numb2) {

		return numb1 + numb2;

	}

	public static int multiplyNumbers(int numb1, int numb2) {

		return numb1 * numb2;

	}

	public static int addNumbers(int[] arr) {

		int sum = 0;
		for (int element : arr) {

			sum = sum + element;
		}

		return sum;

	}

}
