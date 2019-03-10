package com.bayamp.sonia.training.programs;

import com.bayamp.sonia.training.utils.NumberUtility;

public class FindFactorialProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int inputNo = 6;
		int factorial = NumberUtility.findFactorialbyIteration(inputNo);

		System.out.println("Factorial by Itertion:" + factorial);

		int factorialbyRec = NumberUtility.findfactorialbyrecusrionParam(inputNo);

		System.out.println("Factorial By Recursion :" + factorialbyRec);

	}

}
