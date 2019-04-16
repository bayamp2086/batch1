package com.bayamp.chaya.training.math.util;

public class SwapNumber {
	int a;
	int b;
	int temp;

	public void withTemp(int x, int y) {
		System.out.println("Before swaping \n	a: " + x + " \n	b: " + y);
		temp = x;
		x = y;
		y = temp;
		System.out.println("After swaping \n	a: " + x + " \n	b: " + y);
	}

	public void withoutTemp(int x, int y) {
		System.out.println("Before swaping \n	a: " + x + " \n	b: " + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After swaping \n	a: " + x + " \n	b: " + y);
	}

}
