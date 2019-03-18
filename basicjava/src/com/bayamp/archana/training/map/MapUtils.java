package com.bayamp.archana.training.map;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class MapUtils {
	
	private static Map<String, String> countryCapitals = new HashMap<String,String>();
	static {
		countryCapitals.put("India", "Delhi");
		countryCapitals.put("USA", "Washington");
		countryCapitals.put("Australia", "Canberra");
		countryCapitals.put("Pakistan", "Islamabad");
		countryCapitals.put("China", "Beijing");
		countryCapitals.put("France", "Paris");
	}

	public static String getCapital(String country){
		return countryCapitals.get(country);
		
	}
	
	// i want to see if the country exist 
	
	public static String getCapital1(String country){
		Set<String> keyOfcountryCapitalsMap = countryCapitals.keySet();
		for (String key: keyOfcountryCapitalsMap) {
		if(key.equals(country))	{
			System.out.println();
			return countryCapitals.get(country);
		}
		
		}
		return null;
	
	}
}

