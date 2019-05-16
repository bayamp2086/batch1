package com.bayamp.archana.training.programs;

public class MissingNo {
	public void missingNo(int[] input) {
		
		int temp =0;
		
		for (int i =0; i<input.length -1; i++) {
			
			temp = temp+1;
			if(temp != input[i]) {
			System.out.println("The missing no is: " +temp);	
			}			
		}	
		//return temp;	
	}
}
