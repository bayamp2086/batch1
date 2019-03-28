package com.bayamp.akshatha.training.coding.programs;

import java.util.Arrays;

/**
 * Find common elements for 2 sorted arrays.
 * 
 * @author akshathamahale
 *
 */
public class CommonElementsArray {

	public static void main(String[] args) {
		int a1[] = { 1, 2, 2, 2, 3 };
		int a2[] = { 2, 3, 4, 5 };
		int[] result = commonElements(a1, a2);
		System.out.println(Arrays.toString(result));

	}

	private static int[] commonElements(int[] a1, int[] a2) {
		int counter = 0;

		int[] result = new int[a1.length];
		int i = 0, j = 0;
		while (i < a1.length && j < a2.length) {
			if (a1[i] < a2[j]) {
				i++;
			} else if (a1[i] > a2[j]) {
				j++;
			} else {
				result[counter] = a1[i];
				System.out.println(i);
				counter++;
				i++;
				j++;
			}

		}
		return Arrays.copyOf(result, counter);
	}

}
