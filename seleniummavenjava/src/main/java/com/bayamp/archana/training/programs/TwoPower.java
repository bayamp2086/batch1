package com.bayamp.archana.training.programs;

public class TwoPower {
	
	//Examples 2^n = 2*2*2*2 if n =4

	public static void main(String[] args) {
		TwoPower.get2Power(4);
	}

	public static int get2Power(int n) {
		int temp = 1;
		
		for (int i =1; i<=n ; i++) {	
		temp = temp*2;		
		}
		System.out.println("The power of 2 for 4 times is :   "+ temp);
		return n;
		
	}
}
