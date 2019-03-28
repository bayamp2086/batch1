package com.bayamp.akshatha.training.coding.programs;

public class BinarySearch {

	public static void main(String[] args) {

		int[] array = { 2, 4, 7, 8, 16 };

		int element = 2;

		int resultIterative = binarySearch(array, element);
		int resultRecursive = binarySearchRecursive(array, element, 0, array.length - 1);
		System.out.println("Using Iterative: "+resultIterative);
		System.out.println("Using Recursive: "+resultRecursive);

	}

	private static int binarySearch(int[] array, int element) {
		int first = 0;
		int last = array.length - 1;

		while (first <= last) {
			int mid = (first + last) / 2;

			if (element == array[mid]) {
				return mid;

			} else if (element < array[mid]) {

				last = mid - 1;

			} else {
				first = mid + 1;
			}

		}
		return -1;

	}

	public static int binarySearchRecursive(int[] array, int element, int first, int last) {

		int mid = (first + last) / 2;

		if (first > last) {
			return -1;
		}
		if (element == array[mid]) {

			return mid;

		} else if (element < array[mid]) {

			return binarySearchRecursive(array, element, first, mid - 1);

		} else {
			return binarySearchRecursive(array, element, mid + 1, last);
		}

	}
}
