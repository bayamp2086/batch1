package com.bayamp.akshatha.training.coding.programs;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		int a[] = { 3, 5, 4 };
		int b[] = { 4, 2, 6 };
		int[] result1 = merge1(a, b);
		int[] result2 = merge2(a, b);
		System.out.println(Arrays.toString(result1));
		System.out.println(Arrays.toString(result2));

	}

	private static int[] merge1(int[] a, int[] b) {
		int length = a.length + b.length;
		int result[] = new int[length];
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			result[k] = a[i];
			k++;
		}

		for (int i = 0; i < b.length; i++) {
			result[k] = b[i];
			k++;
		}

		return result;
	}

	private static int[] merge2(int[] a, int[] b) {
		int length = a.length + b.length;
		int result[] = new int[length];
		System.arraycopy(a, 0, result, 0, a.length);
		System.arraycopy(b, 0, result, a.length, b.length);
		return result;
	}

}
