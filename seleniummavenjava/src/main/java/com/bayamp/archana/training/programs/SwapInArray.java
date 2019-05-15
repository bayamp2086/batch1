package com.bayamp.archana.training.programs;

public class SwapInArray {

	public static void main(String[] args) {
		MyArray myA = new MyArray();
		myA.add(1);
		myA.add(2);
		myA.add(3);
		myA.add(5);
		myA.printAll();
		myA.ChangePosArray();
		System.out.println("After Execution");
		myA.printAll();
	
//		int[] input = {1,2,3,5};
//		SwapInArray.swapArray(input);
	}
	public static void swapArray(int[] input) {
		int temp = 0;

		temp=input[0];
		input[0] = input[3];
		input[3] = temp;

		for (int i = 0 ; i<input.length ; i++) {
		System.out.println("The value of input after swapping: "+input[i]);
	}
}
}


