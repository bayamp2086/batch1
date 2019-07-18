package com.bayamp.sonia.training.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.bayamp.sonia.training.utils.CollectionsUtils;

public class HashMapProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  Map<String,String>countryCapitalMap=new HashMap<String,String>();
		  countryCapitalMap.put("India", "Delhi"); 
		  countryCapitalMap.put("USA","Washington"); 
		  countryCapitalMap.put("China", "Beijing");
		  countryCapitalMap.put("France", "Paris"); 
		  countryCapitalMap.put("India","Delhi");
		  
		  //System.out.println(countryCapitalMap.size());
		  
		  Set<String> keySet=countryCapitalMap.keySet();
		  
		  
		  //System.out.println(keySet);
		  
		  
		  for(String key:keySet) { System.out.println(key); }
		  
		 Iterator<String> it=keySet.iterator();
		  
		  while(it.hasNext()) 
		  { 
			  System.out.println(it.next()); 
		  }
		  
		  
		  Set<Entry<String,String>> entryset=countryCapitalMap.entrySet();
		  
		  for(Entry<String,String> entry:entryset) {
			  
			  String key=entry.getKey();
			  String keyValue=entry.getValue();
		  }
		 
		
		
		String value=CollectionsUtils.getCountry("India");
		System.out.println(value);
		

	}

}
