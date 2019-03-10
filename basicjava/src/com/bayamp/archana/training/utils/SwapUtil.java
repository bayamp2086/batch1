package com.bayamp.archana.training.utils;

public class SwapUtil {
	
	public void swap(int x, int y) {
		System.out.println("Before Swapping:" + "\n" + "First No:" + x + " Second No:" + y);
		x= x+y;
		y=x-y;
		x = x-y;
		
		System.out.println("After Swapping:" + "\n" + "First No:" + x + " Second No:" + y);
		
		
	}

}
