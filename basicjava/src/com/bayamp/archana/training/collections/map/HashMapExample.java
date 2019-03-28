package com.bayamp.archana.training.collections.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


public class HashMapExample {

	public static void main(String[] args) {
		Map<String,Integer> countryOlympicMedalCount = new HashMap<String,Integer>();
		countryOlympicMedalCount.put("USA", 10);
		countryOlympicMedalCount.put("India", 100);
		countryOlympicMedalCount.put("USA", 11);
		countryOlympicMedalCount.put("Australia", 100);
		
		//to change hashmap to tree map
		Map<String,Integer> treemapCount = new TreeMap<String,Integer>();
		treemapCount.putAll(countryOlympicMedalCount);
		System.out.println(treemapCount);
		
		Set<Integer> medalCountonly = new TreeSet<Integer>(Collections.reverseOrder());
		
		//List<Integer> medalCountonly = new LinkedList<Integer>();
		
		// not to loose the record we are== using list 
		//only key is needed without loosing values so set is not used
		// changing to list cos of medalCount.add
		Set<String> keySetofCountry = countryOlympicMedalCount.keySet();
		for(String key :keySetofCountry ) {
			int medalCount = countryOlympicMedalCount.get(key);
		//	medalCount.add
		}
		// linked is used there is no collections so 
		// now we need to put the values in a map with the medal count as ascending 
		
		//for (Integer medalCopunt : )
	}
}
