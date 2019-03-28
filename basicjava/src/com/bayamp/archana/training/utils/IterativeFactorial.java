package com.bayamp.archana.training.utils;

public class IterativeFactorial {
	
	public int fact(int n) {
		int fact =1;
		for (int i=1;i<=n;i++) {
		fact = fact * i;	
		}
		return fact;
		
		
	}

}
