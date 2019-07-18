package com.bayamp.chaya.training.driver;

import com.bayamp.chaya.training.arrayutils.LinearSearch;

public class LinearSearchMain {

	public static void main(String[] args) {
		LinearSearch number = new LinearSearch();
		int[] array1 = { 10, 20, 30, 50 };
		int result = number.searchLinear(array1, 60);
		if (result == -1)
			System.out.print("Element is not present in an array");
		else
			System.out.print("Element is present at index " + result);

	}

}
