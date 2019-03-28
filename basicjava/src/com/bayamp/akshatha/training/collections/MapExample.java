package com.bayamp.akshatha.training.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MapExample {

	public static void main(String[] args) {
		Map<String,String> countryCapitalsMap=new HashMap<String,String>();
		  countryCapitalsMap.put("India", "Delhi");
		  countryCapitalsMap.put("USA", "Washington");
		  countryCapitalsMap.put("China", "Beijing");
		  countryCapitalsMap.put("France", "Paris");
		  countryCapitalsMap.put("India", "New Delhi");
		  
		  System.out.println(countryCapitalsMap.size());
		  
		  Set<String> keys=countryCapitalsMap.keySet();
		 
		  //By default keySet() returns HashSet.
		  //2  ways to order the keys from the Set
		  
		/* Using Collections.sort(list)
		 * List<String> myList=new ArrayList<String>(keys); Collections.sort(myList);
		 */
		  
		  //Using TreeSet
		  
		  Set<String> treeSetKeys=new TreeSet<String>(keys);
		  
		  for (String key:treeSetKeys) {
			  System.out.println(key);
		  }
		  
		  Iterator itr=treeSetKeys.iterator();
		  
		  while(itr.hasNext()){
			  System.out.println(itr.next());
		  }
		  
	//	  System.out.println(MapUtils.getCapital("Germany"));

		  	Set<String> fruitSet=new TreeSet<String>(Collections.reverseOrder());
		  	fruitSet.add("Apple");
		  	fruitSet.add("Papaya");
		  	fruitSet.add("Berry");
		  	
		  	
		  	for (String s:fruitSet) {
				System.out.println(s);
			}
		  	
		  	
	}

}
