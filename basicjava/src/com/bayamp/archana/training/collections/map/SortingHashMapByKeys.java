package com.bayamp.archana.training.collections.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortingHashMapByKeys {

	public static void main(String[] args) {
	Map<String,Integer> countryOlympicMedalCount = new HashMap<String,Integer>();
	countryOlympicMedalCount.put("Australia", 11);
	countryOlympicMedalCount.put("India", 100);
	countryOlympicMedalCount.put("China", 2);
	countryOlympicMedalCount.put("Combodia", 120);
	countryOlympicMedalCount.put("Germany", 2);
	countryOlympicMedalCount.put("USA", 10);
	countryOlympicMedalCount.put("USA", 30);
	
	//System.out.println(countryOlympicMedalCount.entrySet());
	
	// Using TreeMap (Constructor) 
	// it will update the duplicates
	
	Map<String,Integer> TreeHEntry = new TreeMap<>(countryOlympicMedalCount);
	System.out.println("The USA value is updated below: ");
	for (Entry<String,Integer>  m: TreeHEntry.entrySet()) {
		System.out.println("Key = " + m.getKey() + ", Value = " + m.getValue());	
	}
	 
	//Using TreeMap (putAll method)
	// it will update the duplicates
	
	TreeHEntry.putAll(countryOlympicMedalCount);
	  	System.out.println(TreeHEntry);
	for (Entry<String,Integer>  m: TreeHEntry.entrySet()) {
		System.out.println("Key = " + m.getKey() + ", Value = " + m.getValue());	
	}
	
	//Using List
	// it will not update the duplicates
	List<String> listCount = new LinkedList<String>(TreeHEntry.keySet());
	Collections.sort(listCount);
	for(String countryKey : listCount) {
		Integer Value= TreeHEntry.get(countryKey);
		System.out.println("Key = " +countryKey +", Value = "+Value);
		
	}
	
}
}
