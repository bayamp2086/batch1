package com.bayamp.chaya.training.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class NewMapExample  {

	public static void addElements(Map<String, Integer> map) {
		map.put("Data Structure", 85);
		map.put("Java", 75);
		map.put("Math", 95);
		map.put("Operating System", 80);
		map.put("Networking", 88);
		map.put("Micro controller", 80);

	}

	public static void PrintElements(Map<String, Integer> map) {
		System.out.println("### Iterating over keys or values using a For-Each loop ###");
		for (String key : map.keySet()) {
			System.out.println("Key:" + key);
		}
		for (Integer value : map.values()) {
			System.out.println("Values:" + value);

		}

		System.out.println("### Iterating using For each over Map.Entry<K, V> ###");
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		System.out.println("### Iterating using iterators over Map.Entry<K, V> ###");
		Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<String, Integer> entry = itr.next();

			System.out.println("Key:" + entry.getKey() + " " + "Value:" + entry.getValue());
		}

	}

	public static void main(String[] args) {
		Map<String, Integer> hashMapScore = new HashMap<String, Integer>();
		Map<String, Integer> linkedHashMapScore = new LinkedHashMap<String, Integer>();
		Map<String, Integer> treeMapScore = new TreeMap<String, Integer>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}

		});

		addElements(hashMapScore);
		addElements(linkedHashMapScore);
		addElements(treeMapScore);

		System.out.println("****Printing HashMap****");
		PrintElements(hashMapScore);
		System.out.println();
		System.out.println("****Printing LinkedHashMap****");
		Map<String, Integer> sortedMap = sortedTreeMapByValue(linkedHashMapScore);
		PrintElements(sortedMap);
		System.out.println();
		System.out.println("****Printing TreeMap****");
		PrintElements(treeMapScore);

	}

	private static Map<String, Integer> sortedTreeMapByValue(Map<String, Integer> MapScore) {
		List<Map.Entry<String, Integer>> sortByValueTreeMap = new LinkedList<Map.Entry<String, Integer>>(
				MapScore.entrySet());
		Collections.sort(sortByValueTreeMap, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> map1, Entry<String, Integer> map2) {
				return (map1.getValue()).compareTo(map2.getValue());
			}

		});
		Map<String, Integer> SortedTree = new LinkedHashMap<String, Integer>();
		for (Map.Entry<String, Integer> entry : sortByValueTreeMap) {
			SortedTree.put(entry.getKey(), entry.getValue());
		}
		return SortedTree;
	}

}
