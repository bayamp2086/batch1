package com.bayamp.chaya.training.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.bayamp.chaya.training.constructorandinheritence.Laptop;

public class LaptopMain {

	public static void main(String[] args) {
		List<Laptop> laptop = new ArrayList<Laptop>();
		laptop.add(new Laptop("MacBook Air", "13.3'", 16, 800));
		laptop.add(new Laptop("Dell", "15.5'", 8, 650));
		laptop.add(new Laptop("Lenovo", "11.6'", 8, 600));

		Comparator<Laptop> lap = new Comparator<Laptop>() {
			@Override
			public int compare(Laptop lap1, Laptop lap2) {
				if (lap1.getRam() > lap2.getRam())
					return 1;
				else
					return -1;

			}
		};

		Collections.sort(laptop, lap);

		for (Laptop list : laptop) {
			System.out.println(list);
		}
	}

}
