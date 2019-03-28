package com.bayamp.akshatha.training.coding.programs;

import java.util.Arrays;

public class MaxValue {

	public static void main(String[] args) {
		// int[] a = { 4, -6, 2, 3, 9 };
		int[] a = { 4, 4, 4, 4 };
		int[] result1 = maxValues(a);
		int[] result2 = minValues(a);

		System.out.println(Arrays.toString(result1));
		System.out.println(Arrays.toString(result2));

		int arr[] = { -12, -35, -1, -10, -34, -1 };

		int n = arr.length;
		print2largest(arr, n);

	}

	private static int[] maxValues(int[] a) {
		int maxFirst, maxSecond;

		maxFirst = maxSecond = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > maxFirst) {
				maxSecond = maxFirst;
				maxFirst = a[i];

			} else if (a[i] > maxSecond && a[i] < maxFirst) {
				maxSecond = a[i];
			}

		}

		if (maxSecond == Integer.MIN_VALUE) {
			System.out.print("There is no second largest" + " element\n");
			maxSecond = maxFirst;
		}

		return new int[] { maxFirst, maxSecond };
	}

	private static int[] minValues(int[] a) {
		/*
		 * int minFirst=a[0],minSecond=a[1]; if(a[1]<a[0]) { minFirst=a[1];
		 * minSecond=a[0]; }
		 */

		int minFirst, minSecond;
		minFirst = minSecond = Integer.MAX_VALUE;

		for (int i = 0; i < a.length; i++) {
			if (a[i] < minFirst) {
				minSecond = minFirst;
				minFirst = a[i];

			} else if (a[i] < minSecond && a[i] > minFirst) {
				minSecond = a[i];
			}

		}

		if (minSecond == Integer.MAX_VALUE) {
			System.out.print("There is no second smallest" + " element\n");
			minSecond = minFirst;
		}
		return new int[] { minFirst, minSecond };
	}

	//geeksforgeeks solution
	public static void print2largest(int arr[], int arr_size) {
		int i, first, second;

		/* There should be atleast two elements */
		if (arr_size < 2) {
			System.out.print(" Invalid Input ");
			return;
		}

		first = second = Integer.MIN_VALUE;
		for (i = 0; i < arr_size; i++) {
			/*
			 * If current element is smaller than first then update both first and second
			 */
			if (arr[i] > first) {
				second = first;
				first = arr[i];
			}

			/*
			 * If arr[i] is in between first and second then update second
			 */
			else if (arr[i] > second && arr[i] != first)
				second = arr[i];
		}

		if (second == Integer.MIN_VALUE)
			System.out.print("There is no second largest" + " element\n");
		else
			System.out.print("The second largest element" + " is " + second);
	}

}
