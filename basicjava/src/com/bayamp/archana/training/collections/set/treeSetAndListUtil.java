package com.bayamp.archana.training.collections.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class treeSetAndListUtil {
	
	public static void setEg() {
		// to reverse order the fruitSet
		//Set<String> fruitSet = new TreeSet<String>(Collections.reverseOrder());
		//Set<String> fruitSet = new TreeSet<String>();
		// to put it in array list and call all the added fruit irrespective of duplicates array list is used
		
		List<String> fruitSet = new ArrayList<String>();
		fruitSet.add("apple");
		fruitSet.add("orange");
		fruitSet.add("banana");
		fruitSet.add("strawberry");
		fruitSet.add("apple");
		fruitSet.add("strawberrys");
		fruitSet.add("Strawberry");
		
		//no duplicates allowed apple is eliminated 
		// to print the size of the fruit set
		System.out.println("The size of the  fruitset is " +fruitSet.size());
		for (String fruit : fruitSet) {
			System.out.println(fruit);
		}
	}

}
