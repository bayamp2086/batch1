package com.bayamp.akshatha.training.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListExample {
	public static void main(String[] args) {
		List<String> listOfFruits = new LinkedList<String>();
		listOfFruits.add("Apple");
		listOfFruits.add("Papaya");
		listOfFruits.add("Berry");
		listOfFruits.add("Banana");

		System.out.println("Iterating Using basic for loop and index variable");
		for (int i = 0; i < listOfFruits.size(); i++) {
			String fruit = listOfFruits.get(i);
			System.out.println(fruit);
		}

		System.out.println("Iterating Using For-Each loop)");
		for (String fruit : listOfFruits) {
			System.out.println(fruit);
		}

		System.out.println("Iterating Using ListIterator/Iterator");
		ListIterator<String> li = listOfFruits.listIterator();

		while (li.hasNext()) {
			String fruit = li.next();
			System.out.println(fruit);
		}

		System.out.println("Iterating Using java 8 for each loop");
		listOfFruits.forEach(System.out::println);
	}
}
