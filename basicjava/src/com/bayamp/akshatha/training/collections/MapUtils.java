package com.bayamp.akshatha.training.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public class MapUtils {
	private static Map<String,String> countryCapitalsMap=new HashMap<String,String>();

	static {
		  countryCapitalsMap.put("India", "Delhi");
		  countryCapitalsMap.put("USA", "Washington");
		  countryCapitalsMap.put("China", "Beijing");
		  countryCapitalsMap.put("France", "Paris");
		  countryCapitalsMap.put("India", "New Delhi");
	}
	public static String getCapital(String country) throws Exception{
		 
		//if (countryCapitalsMap.containsKey(key))
		
		
		//2 ways to get key,value from map
		//1.get keys from set and then use it to get value
		
		/*
		 * Set<String> keysofCountryCapitalsMap=countryCapitalsMap.keySet();
		 * 
		 * 
		 * Iterator itr=keysofCountryCapitalsMap.iterator(); while(itr.hasNext()){
		 * if(itr.next().equals(country)) {
		 * System.out.println("Found the country in the Map database"); return
		 * countryCapitalsMap.get(country); }
		 * 
		 * }
		 */
		
		//2.using Entry
		Set<Entry<String,String>> entrySet=countryCapitalsMap.entrySet();
		//This is similar to Set<Map<String,String>>
		
		for(Entry<String,String> entry:entrySet) {
			String key=entry.getKey();
			if(key.equals(country)) {
			String value=entry.getValue();
			return value;
			}
		}
		
		
		
		//developers mistake
		if("Germany".equals(country)) {
			return "Hyderabad";
		}
		
		
		throw new RuntimeException(country+ " does not exist in the map data base");
	}

}
