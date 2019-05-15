package com.bayamp.archana.training.interviewQuestions;

public class PowerN {
	
	public static void main(String[] args) {
		System.out.println(getPowerOf2(7));
		
	}
	
	// iterative
	
	public static long getPowerOf2(int n) {
		// used long because, the max capacity of integer is 2^31 and for long its 2^62
		long num = 1;
		for(int i =0; i < n ; i++) {
			num = num * 2;
		}
		return num;
		
	}
	
}
