package com.bayamp.chaya.training.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapSortingExample {

	public static void main(String[] args) {
Map<String,Integer> countryMedalCount = new HashMap<String,Integer>();
countryMedalCount.put("India", 100);
countryMedalCount.put("USA", 10);
countryMedalCount.put("Australia", 11);
countryMedalCount.put("Combodia", 120);
countryMedalCount.put("Germany", 2);
countryMedalCount.put("China", 2);

Map<String,Integer> treeMapCount = new TreeMap<String,Integer>(countryMedalCount);
System.out.println(treeMapCount);

//Set<Integer> medalCountSetOnly = new TreeSet<Integer>(Collections.reverseOrder());
List<Integer> medalCountSetOnly =new LinkedList<Integer>();
Set<String> keySetOfCountrys = countryMedalCount.keySet();

for(String key:keySetOfCountrys){
	int medalCount = countryMedalCount.get(key);
	medalCountSetOnly.add(medalCount);
	
}
Collections.sort(medalCountSetOnly,Collections.reverseOrder());
System.out.println(medalCountSetOnly);





	}

}
