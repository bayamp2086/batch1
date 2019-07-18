package com.bayamp.sonia.training.collections;

import java.util.Iterator;
import java.util.Set;

import com.bayamp.sonia.training.utils.CollectionsUtils;

public class HashSetExample {

	public static void main(String[] args) {
		/*
		 * No Duplicate only unique Element
		 * UnOrdered
		 * Null Value allowed , internally it compares value by equals method.
		 * 
		 * */
		
		
		Set<String> hashSet=CollectionsUtils.hashSet;
		
		//adding null value
		
		hashSet.add(null);
		hashSet.add(null);
		
		//retrieving value of hashSet by foreach
		
		for(String hashSetVal:hashSet) {
			System.out.println(hashSetVal);
		}
		
		//retrieving by Iterator
		System.out.println("*********retrieving by Iterator**********");
		Iterator<String> itr=hashSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
