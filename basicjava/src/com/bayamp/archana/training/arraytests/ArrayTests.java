package com.bayamp.archana.training.arraytests;

import com.bayamp.archana.trainings.mathPrograms.FindMaxAndMin;

public class ArrayTests {

	public static void main(String[] args) {

		int[] numbers = { 10, 12, 0, -1, -3 };

		FindMaxAndMin obj = new FindMaxAndMin();

		obj.highest2Nos(numbers);
		obj.smallest2No(numbers);


	}
}