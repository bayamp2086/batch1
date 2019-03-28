package com.bayamp.sonia.training.collections;

import java.util.Map;

import com.bayamp.sonia.training.utils.CollectionsUtils;

public class HashMapSortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] fruitArray = { "apple", "apple", "banana", "cherry", "apple", "apple", "cherry", "strawberry", "apple",
				"cherry", "banana" };
		
		Map<String, Integer> fruitMap = CollectionsUtils.getFruitArrayCountMap(fruitArray);
		
		System.out.println("Input Map :" +fruitMap);
		
		Map<String,Integer> fruitSortedMapbyMaxfruitCount=CollectionsUtils.getSortedHashMap(fruitMap);
		
		System.out.println("Sorted Map by max fruit count desc :"+ fruitSortedMapbyMaxfruitCount);

	}

}
