package com.bayamp.sonia.training.programs;

import com.bayamp.sonia.training.utils.NumberUtility;

public class SwapNumberProgram {

	public static void main(String[] args) {

		int number1 = 5;
		int number2 = 6;
		NumberUtility.swapNumber(number1, number2);

		NumberUtility.swapNumberwithTemp(number2, number1);

	}

}
