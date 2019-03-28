package com.bayamp.chaya.training.arrayutils;

public class SmallestNumberUtil {
	int firstSmallestNumber = Integer.MAX_VALUE;
	int secondSmallestNumber = Integer.MAX_VALUE;
	
	
	public int smallnum(int [] numbers){
		for(int element:numbers){
			if(element<firstSmallestNumber){
				secondSmallestNumber = firstSmallestNumber;
				firstSmallestNumber = element;
				
			}
			else if(element<secondSmallestNumber ){
				secondSmallestNumber = element;
			}
		}
		System.out.println("First Smallest number is: " + firstSmallestNumber);
		System.out.println("Second Smallest number is: " + secondSmallestNumber);

		return firstSmallestNumber;

		
	}

}
