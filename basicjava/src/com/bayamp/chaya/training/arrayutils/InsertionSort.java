package com.bayamp.chaya.training.arrayutils;

public class InsertionSort {
	public static int[] insertionSort(int[] listOfIntegers) {
		int key, j;
		for (int i = 1; i < listOfIntegers.length; i++) {
			key = listOfIntegers[i];
			j = i - 1;
			while (j >= 0 && key < listOfIntegers[j]) {
				listOfIntegers[j + 1] = listOfIntegers[j];
				j--;
			}
			listOfIntegers[j + 1] = key;
		}
		return listOfIntegers;
	}

	public static void printArray(int[] array) {
		for (int list : array) {
			System.out.print(list + " ");
		}

	}
}
