package com.bayamp.archana.training.collections.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class LaptopPrograms {
	
	public static void main(String[] args) {
		Laptop l1 = new Laptop("Dell G7", 1079, 8, "Intel Core i7", "15.6");
		Laptop l2 = new Laptop("Asus", 159, 4, "Intel Celeron", "11.6");
		Laptop l3= new Laptop("Dell G5", 899, 8, "Intel Core i6", "15.6");
		
		ArrayList<Laptop> lp = new ArrayList<Laptop>();
		lp.add(l1);
		lp.add(l2);
		lp.add(l3);
		
		Collections.sort(lp);
		for(Laptop lap:lp )
		{
			System.out.println(lap.getModel()+" "+lap.getPrice()+" "+lap.getColor()+" "+lap.getMemory()+" "+lap.getSize());
		}
		
		
	}

}
