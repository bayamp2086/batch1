package com.bayamp.akshatha.training.coding.programs;

public class LinearSearch {

	public static void main(String[] args) {

		int[] array = { 2, 4, 1, 8, 5 };

		int element = 5;

		int result = linearSearch(array, element);
		System.out.println(result);

	}

	public static int linearSearch(int[] a, int e) {
		for (int i = 0; i < a.length; i++) {

			if (a[i] == e) {
				return i;
			}

		}
		return -1;
	}
}
