package com.bayamp.archana.training.mathPrograms;

public class FindMaxAndMin {

	private int s;
	private int[] num = {2,3,4};

	public void highest2Nos(int[] numbers) {
		int max = numbers[0];
		int secondHighest = numbers[0];
		int numLength = numbers.length;

		for (int i = 0; i < numLength; i++) {

			if (max < numbers[i]) {
				max = numbers[i];
				s = i;
			}

		}

		for (int i = 0; i < numLength; i++) {
			if (secondHighest > numbers[i] && numbers[i] > max)
				secondHighest = numbers[i];

		}

		System.out.println("The highest element is: " + max);

		System.out.println("The index of the highest element is:" + s);
		System.out.println("The highest element is: " + secondHighest);

	}

	public void smallest2No(int[] numbers) {
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		int numLength = numbers.length;

		for (int i = 0; i < numLength; i++) {
			if (smallest > numbers[i])
				smallest = numbers[i];
		}
		for (int i = 0; i < numLength; i++) {
			if (secondSmallest > numbers[i] && numbers[i] > smallest)
				secondSmallest = numbers[i];

		}
		System.out.println("The smallest no is: " + smallest + " The second smallest no is: " + secondSmallest);

	}

}
