package com.bayamp.chaya.training.arrayutils;

public class BinarySearch {
	

	public int recursiveBinarySearch(int[] array, int leftIndex, int rightIndex, int num) {
		if (rightIndex >= leftIndex) {
			int mid = leftIndex + (rightIndex - leftIndex) / 2;

			if (array[mid] == num)
				return mid;

			if (array[mid] > num)
				return recursiveBinarySearch(array, leftIndex, mid - 1, num);
			else
				return recursiveBinarySearch(array, mid + 1, rightIndex, num);

		}
		return -1;
	}

	public int iterativeBinarySearch(int[] array, int num) {
		int leftIndex = 0;
		int rightIndex = array.length - 1;
		while (leftIndex <= rightIndex) {
			int mid = leftIndex + (rightIndex - leftIndex) / 2;
			if (array[mid] == num)
				return mid;
			if (array[mid] > num)
				rightIndex = mid - 1;
			else
				leftIndex = mid + 1;
		}
		return -1;

	}

}
