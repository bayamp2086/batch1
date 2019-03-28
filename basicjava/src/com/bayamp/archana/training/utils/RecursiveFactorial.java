package com.bayamp.archana.training.utils;

public class RecursiveFactorial {

	public int reFact(int n) {
		
		if(n==1)
		return 1;
		
		int result;
		 result = reFact(n-1)*n;
		 return result;
		
	}
}
