package com.bayamp.akshatha.training.collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortPhones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Iphone> iphoneList=new ArrayList<Iphone>();
		
		iphoneList.add(new Iphone("Iphone6s",64,"Black"));
		iphoneList.add(new Iphone("Iphone8s",32,"Grey"));
		iphoneList.add(new Iphone("Iphone7s",128,"White"));
		Collections.sort(iphoneList);
		
		for(Iphone i:iphoneList) {
			System.out.println(i);
		}
		
	}

}
