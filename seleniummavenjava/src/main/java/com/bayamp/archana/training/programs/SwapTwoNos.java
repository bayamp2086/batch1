package com.bayamp.archana.training.programs;

public class SwapTwoNos {

	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		SwapTwoNos.swapTwoNos(5,10);
	}

	public static void swapTwoNos(int x ,int y) {
		int temp =0;
		temp = x;
		x=y;
		y=temp;
		System.out.println("After Swapping x: " + x +" After Swapping y: "+y);
	}
}
