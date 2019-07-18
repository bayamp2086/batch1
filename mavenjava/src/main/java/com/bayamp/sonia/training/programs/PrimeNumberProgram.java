package com.bayamp.sonia.training.programs;

import com.bayamp.sonia.training.utils.NumberUtility;

public class PrimeNumberProgram {


	public static void main(String[] args) {

		int inputNumber = 13;
		boolean isnotPrime = NumberUtility.findPrimeNumber(inputNumber);

		if (!isnotPrime) {
			System.out.println(inputNumber + " is a prime number.");
		} else {
			System.out.println(inputNumber + " is not a prime number.");
		}

	}

}
