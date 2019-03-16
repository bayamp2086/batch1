package com.bayamp.akshatha.training.collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortLaptops {

	public static void main(String[] args) {
		
		ArrayList<Laptop> laptopList=new ArrayList<Laptop>();
		
		laptopList.add(new Laptop("Mac 6",64,"Black"));
		laptopList.add(new Laptop("Mac 8",32,"Grey"));
		laptopList.add(new Laptop("Mac 7",128,"White"));
		LaptopModelComparator lmc=new LaptopModelComparator();
		Collections.sort(laptopList,lmc);
		
		for(Laptop l:laptopList) {
			System.out.println(l);
		}

	}

}
