package com.bayamp.chaya.training.math.util;

public class Fibonacci {

	public void fibonacci(int n) {
		int n1 = 0;
		int n2 = 1;
		int n3;
		System.out.print(n1 + " " + n2);

		for (int i = 2; i < n; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;

		}
	}

}


//other way
/***
public int fib(int n)
n1=0,n2=1
for(int i =1;i<n;i++){
n2=n1+n2;
n1=n2-n1;
}
return y;
***/