package com.bayamp.archana.trainings.mathPrograms;

public class IterativeFactorial {
	
	public int fact(int n) {
		int fact =1;
		for (int i=1;i<=n;i++) {
		fact = fact * i;	
		}
		return fact;
		
		
	}

}
