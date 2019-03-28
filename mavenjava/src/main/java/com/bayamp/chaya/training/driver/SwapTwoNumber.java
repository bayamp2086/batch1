package com.bayamp.chaya.training.driver;

import com.bayamp.chaya.training.math.util.SwapNumber;

public class SwapTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapNumber swap = new SwapNumber();
		System.out.println("SWAPING WITH TEMPORARY VARIABLE");
		swap.withTemp(-10, 5);
		System.out.println("SWAPING WITHOUT TEMPORARY VARIABLE");

		swap.withoutTemp(12, -9);

	}

}
