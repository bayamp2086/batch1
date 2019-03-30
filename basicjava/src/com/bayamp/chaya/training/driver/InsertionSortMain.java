package com.bayamp.chaya.training.driver;

import com.bayamp.chaya.training.arrayutils.InsertionSort;

public class InsertionSortMain {

	public static void main(String[] args) {
		int[] numbers = { 1, 3, 2, 5, 6, 9 };
		int[] display=InsertionSort.insertionSort(numbers);
		InsertionSort.printArray(display);
		
	}

}
