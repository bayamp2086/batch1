package com.bayamp.akshatha.training.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortLaptops {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		ArrayList<Laptop> laptopList = new ArrayList<Laptop>();

		laptopList.add(new Laptop("MacBook Pro", 64, "Black"));
		laptopList.add(new Laptop("Lenovo Thinkpad", 32, "Grey"));
		laptopList.add(new Laptop("Microsoft Surface Book", 128, "White"));

		Comparator<Laptop> c1 = new LaptopModelComparator();
		Comparator<Laptop> c2 = new LaptopSizeComparator();
		Comparator<Laptop> c3 = new LaptopColorComparator();

		System.out.println("Sorting By Model");
		Collections.sort(laptopList, c1);
		for (Laptop l : laptopList) {
			System.out.println(l);
		}

		System.out.println("Sorting By Size");
		Collections.sort(laptopList, c2);
		for (Laptop l : laptopList) {
			System.out.println(l);
		}

		System.out.println("Sorting By Color");
		Collections.sort(laptopList, c3);
		for (Laptop l : laptopList) {
			System.out.println(l);
		}

	}

}
