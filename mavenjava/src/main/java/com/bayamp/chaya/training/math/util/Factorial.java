package com.bayamp.chaya.training.math.util;

public class Factorial {

	public int factorialIterative(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;

		}
		return fact;

	}

	public int factorialRecursive(int n) {
		if (n == 1) {
			return 1;
		}

		else {
			return n * factorialRecursive(n - 1);
		}

	}
}
