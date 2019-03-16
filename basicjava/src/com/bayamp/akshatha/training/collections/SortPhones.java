package com.bayamp.akshatha.training.collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortPhones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Iphone> iphoneList=new ArrayList<Iphone>();
		
		iphoneList.add(new Iphone("Iphone 6",64,"Black"));
		iphoneList.add(new Iphone("Iphone 7",32,"Grey"));
		iphoneList.add(new Iphone("Iphone 8",128,"White"));
		Collections.sort(iphoneList);
		
		for(Iphone i:iphoneList) {
			System.out.println(i);
		}
		
	}

}
