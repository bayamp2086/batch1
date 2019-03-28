package com.bayamp.sonia.training.collections;

import java.util.Iterator;
import java.util.Set;

import com.bayamp.sonia.training.objects.Laptop;
import com.bayamp.sonia.training.utils.CollectionsUtils;

public class TreeSetExample {

	public static void main(String[] args) {
		
		/*
		 * No Duplicate only unique Element
		 * Order by default Asc
		 * No Null value as internally it use compareTo method to comapre each object.
		 * 
		 * */

		Set<String> treeSet = CollectionsUtils.treeSet;
		// print treeSet
		System.out.println(treeSet);

		// adding null value in TreeSet

		/* this line will give null pointer exception , TreeSet cannot have null value
		 bcoz internally it compare object withn CompareTo method
		 */
		
		// treeSet.add(null);

		// retrieving by loop

		for (String treeSetVal : treeSet) {
			System.out.println(treeSetVal);
		}

		// retieving ny iterator

		Iterator<String> itr = treeSet.iterator();

		System.out.println("*********Iterate by Iterator************");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		//TreeSet of Laptop Object
		
		Set<Laptop> lapToptreeSet = CollectionsUtils.lapToptreeSet;
		// print treeSet
		System.out.println("LapTop TreeSet :" +lapToptreeSet);

	}
}
