package com.bayamp.archana.training.collections.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapUtils {
    // making map private 
	private static Map<String, String> countryAndCapitals = new HashMap<String, String>();
	static{
		countryAndCapitals.put("India", "Delhi");
		countryAndCapitals.put("USA", "Washington");
		countryAndCapitals.put("Australia", "Canberra");
		countryAndCapitals.put("Pakistan", "Islamabad");
		countryAndCapitals.put("China", "Beijing");
		countryAndCapitals.put("France", "Paris");
	}
	// to return capital of the given coutry 
	public static String Capital(String country) {
		return countryAndCapitals.get(country);
	}

	// changing map to set
    // if negative test case is written in this the country germany will throw null if not found in expected 
	public static void printCountryOfSet() {
		Set<String> keyOfcountryCapitalsMap = countryAndCapitals.keySet();
		System.out.println("The list of countries are ");
		for (String setKey : keyOfcountryCapitalsMap) {
			System.out.println(setKey);	
		}	
	}
	
	// to check if the country is present (Neg testcase)
	public static String checkCountry(String country) {
		Set<String> keyOfcountryCapitalsMap = countryAndCapitals.keySet();
		if(keyOfcountryCapitalsMap.contains(country))	{
			System.out.println("The country is present");
		} else 
		{
			System.out.println("The country is not present");
		}
		return countryAndCapitals.get(country);
	}
	// to return capital of the given coutry 
	public static String getCapital1(String country) {
		Set<String> keyOfcountryCapitalsMap = countryAndCapitals.keySet();
		for (String key : keyOfcountryCapitalsMap) {
			if (key.equals(country)) 
				//return countryAndCapitals.get(country);
			System.out.println("The country is present");
		}
		return countryAndCapitals.get(country);
	}

	//(looping both key and value) entry set is used
	// Set< Entry<String,String> >
	// Set< Map<String,String> >
//p
	public static void printEntrySet() {
		
	 Set<Entry<String,String>> mapEntrySet = countryAndCapitals.entrySet();
	 
	  for( Entry<String, String>  Entry : mapEntrySet) { 
		  System.out.println(Entry);
		  String key = Entry.getKey(); 
	      String value = Entry.getValue(); 
	      System.out.println("The key in the entrySet : " +key);
	  	  System.out.println("the value in the entrySet : " +value);
	  }
	}
	 // changing map to set to list and doing sorting in collections 
	  public static void mapSetListColl() {
		  Set<String> keyOfcountryCapitalsMap = countryAndCapitals.keySet();
		  List<String> listOfKeys = new ArrayList<String>(keyOfcountryCapitalsMap);
		  Collections.sort(listOfKeys);
		  System.out.println(listOfKeys);
	  }
	  
	//to convert the hash set to tree set 
	//pic last 525
	  
	}

