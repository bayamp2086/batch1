package com.bayamp.chaya.training.arrayutils;

public class LinearSearch {
	public int searchLinear(int[] array, int num) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num)
				return i;
		}

		return -1;

	}

}
