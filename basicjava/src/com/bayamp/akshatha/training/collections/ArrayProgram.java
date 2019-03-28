package com.bayamp.akshatha.training.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayProgram {

	public static void main(String[] args) {
		
		List<String> batch1List=new ArrayList<String>();
		
		String name1=new String("archana");
		String name2=new String("aks");
		batch1List.add(name1);
		batch1List.add(name2);
		
		for(String name:batch1List) {
			System.out.println(name);
		}
		
		Collections.sort(batch1List);
		for(String name:batch1List) {
			System.out.println(name);
		}
		List<Integer> agesList=new ArrayList<Integer>();
		agesList.add(10);
		agesList.add(20);
		
		
		


	}

}
