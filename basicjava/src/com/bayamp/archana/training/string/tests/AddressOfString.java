package com.bayamp.archana.training.string.tests;

public class AddressOfString {
	public static void main(String[] args) {
		
		int age = 10;
		System.out.println(age);
		
		AddressOfString.address();
	}

	public static void address() {

		String name1 = "archana";
		String name2 = new String("archana");
		String name3 = "archana";
		String name4 = new String("archana");
		String name5 = "";
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

		
		System.out.println(name1);
	}
}
