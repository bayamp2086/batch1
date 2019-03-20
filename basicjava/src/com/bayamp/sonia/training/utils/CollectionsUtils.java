package com.bayamp.sonia.training.utils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.bayamp.sonia.training.objects.Laptop;

public class CollectionsUtils {
	
	 public static Map<String,String> countryCapitalMap=new HashMap<String,String>();
	 public static Map<String,Laptop>laptopMap=new HashMap<String,Laptop>();
	 public static Set<String>treeSet=new TreeSet<String>();
	 public static Set<Laptop>lapToptreeSet=new TreeSet<Laptop>();
	 
	 public static Set<String>hashSet=new HashSet<String>();
	
	static{
		
		countryCapitalMap.put("India", "Delhi");
		countryCapitalMap.put("USA", "Washington");
		countryCapitalMap.put("China", "Beijing");
		countryCapitalMap.put("France", "Paris");
		countryCapitalMap.put("India", "Delhi");
		
		String modelNo=new String("6s");
		String ModelColor=new String("Grey");;
		int modelMemory=64;
		double modelPrice=600;
		Laptop ltp=new Laptop(new String("HP"),modelNo,ModelColor,modelMemory,modelPrice);
		modelNo=new String("10x");
		ModelColor=new String("White");;
		modelMemory=200;
		modelPrice=100;
		Laptop ltp1=new Laptop(new String("Mac"),modelNo,ModelColor,modelMemory,modelPrice);
		modelNo=new String("6s");
		ModelColor=new String("Grey");;
		modelMemory=64;
		modelPrice=1200;
		Laptop ltp2=new Laptop(new String("IBM"),modelNo,ModelColor,modelMemory,modelPrice);
		
		laptopMap.put("HP", ltp);
		laptopMap.put("Mac", ltp1);
		laptopMap.put("IBM", ltp2);
		laptopMap.put(null, null);
		laptopMap.put(null, null);
		laptopMap.put(null,ltp);
		
		treeSet.add("Sonia");
		treeSet.add("Sneha");
		treeSet.add("AArti");
		treeSet.add("Baby");
		treeSet.add("Baby");
		treeSet.add("Baby");
		
		lapToptreeSet.add(ltp);
		lapToptreeSet.add(ltp1);
		lapToptreeSet.add(ltp2);
		lapToptreeSet.add(ltp2);
		
		hashSet.addAll(treeSet);
		
		
		
		
		
	}
	
	public static String getCountry(String country) {
	
		
		String value=countryCapitalMap.get(country);
		
		
		Set<String> keysOfcountryCapitalMap=countryCapitalMap.keySet();
		
		 //Set=countryCapitalMap.entrySet();
		
		return value;
		
	}
	
	

}
