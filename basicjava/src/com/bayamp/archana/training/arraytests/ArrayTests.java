package com.bayamp.archana.training.arraytests;

import com.bayamp.archana.trainings.mathPrograms.FindMaxAndMin;

public class ArrayTests {

	public static void main(String[] args) {

		int[] numbers = { 10, 12, 0, -1, -3 };

		FindMaxAndMin obj = new FindMaxAndMin();

		obj.highest2Nos(numbers);
		obj.smallest2No(numbers);

		ArrayTests.address();

	}

	public static void address() {
	  
		String name1 = "archana";
		String name2 = new String("archana");
		String name3 = "archana";
		String name4 = new String("archana");

		if (name1 == name2) {
			System.out.println("Same names with same address");
		} else {
			System.out.println("Not same names different address have saved in the heap");
		}
//same
		if (name1 == name3) {
			System.out.println("Same names with same address");
		} else {
			System.out.println("Not same names different address have saved in the heap");
		}

		if (name2 == name4) {
			System.out.println("Same names with same address");
		} else {
			System.out.println("Not same names different address have saved in the heap");
		}
		
		

		int age = 10;

		System.out.println(age);
		System.out.println(name2);

		
	}
}
