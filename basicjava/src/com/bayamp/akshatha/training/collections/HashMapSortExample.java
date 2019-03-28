package com.bayamp.akshatha.training.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class HashMapSortExample {

	public static void main(String[] args) {
		Map<String,Integer> countryOlympicMedalCount=new HashMap();
		countryOlympicMedalCount.put("India", 100);
		countryOlympicMedalCount.put("USA", 10);
		countryOlympicMedalCount.put("Australia", 50);
		countryOlympicMedalCount.put("Combodia", 100);
		countryOlympicMedalCount.put("China", 2);
		countryOlympicMedalCount.put("Germany", 5);
		
		
		Map<String,Integer> treeMapCount=new TreeMap<String,Integer>(countryOlympicMedalCount);
		System.out.println(treeMapCount);
		
		//Set<Integer> medalCountOnly=new TreeSet<Integer>(Collections.reverseOrder());
		
		List<Integer> medalCountOnly=new LinkedList<Integer>();
		Set<String> keySetOfCountries=countryOlympicMedalCount.keySet();
		
		for(String key:keySetOfCountries) {
			int medalCount=countryOlympicMedalCount.get(key);
			medalCountOnly.add(medalCount);
			
		}
		
		Collections.sort(medalCountOnly);
		System.out.println(medalCountOnly);
		Map<String,Integer> linkedHashMap=new LinkedHashMap<String,Integer>();
		
		System.out.println(linkedHashMap);
		for(Integer i:medalCountOnly) {
		  for(String key:keySetOfCountries) { 
			if(countryOlympicMedalCount.get(key).equals(i)) {
				linkedHashMap.put(key, i);
			}
		  }
		}
		 
		System.out.println(linkedHashMap);
		
	}
	

}
