package com.bayamp.sonia.training.utils;

public class NumberUtility {

	public static void swapNumber(int numb1, int numb2) {

		numb2 = numb1 + numb2;
		numb1 = numb2 - numb1;
		numb2 = numb2 - numb1;

		System.out.println("Swap Numbers are Number1:" + numb1 + " Number2 :" + numb2);

	}

	public static void swapNumberwithTemp(int numb1, int numb2) {

		int temp = numb1 + numb2;
		numb2 = numb1;
		numb1 = temp - numb1;

		System.out.println("Swap Numbers with Temp are Number1:" + numb1 + " Number2 :" + numb2);

	}

	public static int findFactorialbyIteration(int inputNo) {

		if (inputNo == 0) {
			return 0;
		} else {

			int fact = 1;
			for (int i = inputNo; i > 1; i--) {

				fact = fact * i;
			}
			return fact;
		}
	}

	public static int findfactorialbyrecusrion(int inputNo, int k) {

		k = inputNo * k;

		return k;
	}

	public static int findfactorialbyrecusrionParam(int inputNo) {

		int factorial = 1;
		if (inputNo == 0) {
			return 0;
		} else {
			while (inputNo >= 1) {

				factorial = findfactorialbyrecusrion(inputNo, factorial);
				inputNo--;
			}
			return factorial;
		}
	}

	public static boolean findPrimeNumber(int number) {

		boolean isnotPrime = false;

		for (int j = 2; j <= number / 2; j++) {

			if (number != j && number % j == 0) {

				isnotPrime = true;
				break;
			}
		}

		return isnotPrime;

	}

	public static void generateFibSeries(int max) {

		int k = 0;
		int kn = 1;
		int kn1;

		System.out.println(k);
		System.out.println(kn);
		for (int i = 0; i <= max; i++) {

			kn1 = k + kn;
			k = kn;
			kn = kn1;

			System.out.println(kn1);

		}
	}
	
	public static int[] findMissingNumber(int[] inputArr) {

		int missingArr[] = new int[inputArr.length];

		int k = 0;
		int count = inputArr[0];

		for (int i = 0; i < inputArr.length; i++) {

			if (inputArr[i] == count) {

			} else {
				missingArr[k] = count;
				k++;
				count++;

			}
			count++;
		}

		return missingArr;
	}
	
	
	
	
}
