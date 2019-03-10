package com.bayamp.archana.training.utils;

public class FibonacciSeries {
	// 0 1 2 3 4 5 6 7
	// 0,1, 1, 2, 3, 5, 8, 13
	// value of 0: 0
	// value of 1: 1
	// value of 2:1+1=2
	// value of 3:1+2=3
	// value of 4:2+3=5
	// value of 5:3+5=8
	// value of 6:5+8=13

	 public int fib(int n) {
		int value = 0;
		int prevprevNo = 0;
		int prevNo = 1;

		if (n == 0)
			return n;
		if (n == 1)
			return n;
		
		for (int i = 2; i <= n; i++) {
			value = prevprevNo + prevNo;
			prevprevNo = prevNo;
			prevNo = value;
		}
		
		return value;

	}

}
