package com.bayamp.archana.trainings.mathPrograms;

import java.util.Arrays;


public class AllNumbers {

	public static void main(String[] args) {
		int[] num = { -1, 9, 0, -1, 4, 6, 5 };
		System.out.println(printSecondSmallest(num));

		IterativeFactorial f = new IterativeFactorial();
		int fa = f.fact(5);
		System.out.println("Factorial of 5 is " + fa);

		RecursiveFactorial r = new RecursiveFactorial();
		int rf = r.reFact(4);
		System.out.println("Factorial of 4 is " + rf);
		
		FibonacciSeries fib = new FibonacciSeries();
		int z = fib.fib(8);
		System.out.println("FibonacciSerires "+z);
		
	}

	static int printSecondSmallest(int[] num) {
		Arrays.sort(num);
		if (num.length == 1)
			return num[0];
		return num[1];
	}

	
}
