package com.bayamp.archana.training.programs;
//Add data to Array
//delete data to Array
//print data of Array

public class MyArray {
	//declaring size
	static int[] input = new int[100];
	
	
//	public static void main(String[] args) {
//		MyArray obj = new MyArray();
//		obj.add(4);
//		obj.add(7);
//		obj.add(3);
//		obj.add(100);
//		obj.printAll();
//		obj.ChangePosArray();
//	}
//	
	
	public  void add(int num) {
		int length = getLength();
		input[length]=num;
	}
	public  void printAll() {
		for(int i =0; i<getLength(); i++) {
			System.out.println("The values in the Array: "+input[i]);
		}
		//		System.out.println("The length of the array: " +getLength());
	}

	public  void ChangePosArray() {
		int length = getLength();
		int temp = input[0];
		input[0] = input[length-1];
		input[length-1] = temp;
	}
	
	private int getLength() {
		int length = 0;
		for (int i =0; i<input.length; i++) {
			if(!(input[i] == 0)) {
				length = length +1;
			}
		}
		return length;
	}
}
