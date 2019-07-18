package com.bayamp.archana.training.collections.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class treeSetAndListUtil {
	
	public static void setEg() {
		// to reverse order the fruitSet
		//Set<String> fruitSet = new TreeSet<String>(Collections.reverseOrder());
		
		// to put it in array list and call all the added fruit irrespective of duplicates array list is used
		List<String> fruitSet = new ArrayList<String>();
		//Set<String> fruitSet = new TreeSet<String>();
		fruitSet.add("apple");
		fruitSet.add("orange");
		fruitSet.add("banana");
		fruitSet.add("strawberry");
		fruitSet.add("apple");
		fruitSet.add("strawberrys");
		fruitSet.add("Strawberry");
		
		//no duplicates allowed apple is eliminated 
		// to print the size of the fruit set
		//enchanced for loop 
		System.out.println("The size of the  fruitset is " +fruitSet.size());
		for (String fruit : fruitSet) {
			System.out.println(fruit);
		}
		
		System.out.println("\n");
		
		//iterator for loop 
		  Iterator itr=fruitSet.iterator();
		  
		  while(itr.hasNext()){
			  System.out.println(itr.next());
		  }
		  
		  System.out.println("\n");
		 //Regular iteration
		  for(int i=0; i<fruitSet.size(); i++) {
			  System.out.println(fruitSet.get(i));
		  }
	}

}
