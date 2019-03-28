package com.bayamp.akshatha.training.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class HashMapSortComparator {

	public static void main(String[] args) {
		Map<String,Integer> countryOlympicMedalCount=new HashMap();
		countryOlympicMedalCount.put("India", 100);
		countryOlympicMedalCount.put("USA", 10);
		countryOlympicMedalCount.put("Australia", 50);
		countryOlympicMedalCount.put("Combodia", 100);
		countryOlympicMedalCount.put("China", 2);
		countryOlympicMedalCount.put("Germany", 5);
		System.out.println(sortByValue(countryOlympicMedalCount));

	}
	
	private static List<Map.Entry<String, Integer>> sortByValue(Map<String, Integer> unsortMap) {

        // 1. Convert Map to List of Map
        List<Map.Entry<String, Integer>> list =
                new LinkedList<Map.Entry<String, Integer>>(unsortMap.entrySet());

        // 2. Sort list with Collections.sort(), provide a custom Comparator
        //    Try switch the o1 o2 position for a different order
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
		return list;

}
}
