package com.bayamp.sonia.training.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.bayamp.sonia.training.objects.Laptop;
import com.bayamp.sonia.training.utils.CollectionsUtils;

public class HashMapExample {

	public static void main(String[] args) {
		
		
		/*
		 * No duplicate Key , if duplicated ovveride with last key added value
		 * Null key and value allowed
		 * duplicate null keys are allowed
		 * 
		 * */

		Map<String, Laptop> laptopMap = CollectionsUtils.laptopMap;

		// get null value from hashmap

		Laptop lpt = laptopMap.get(null);
		System.out.println("Null Key Value :"+lpt);

		// replacing null key value

		laptopMap.replace(null, new Laptop());

		// retrieving Keys of LaptopMap

		Set<String> laptopMapKeySet = laptopMap.keySet();
		System.out.println(laptopMapKeySet);

		// retrieving Keys by iterator

		Iterator<String> itr = laptopMapKeySet.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

		// getting Keyset value of Map

		Set<Entry<String, Laptop>> entrySet = laptopMap.entrySet();
		System.out.println(entrySet);

		Iterator<Entry<String, Laptop>> itrEntry = entrySet.iterator();
		while (itrEntry.hasNext()) {

			Entry<String, Laptop> entry = itrEntry.next();
			String key = entry.getKey();
			Laptop lapVal = entry.getValue();
			System.out.println("Laptop Map Key :" + key);
			System.out.println("Laptop Map Value :" + lapVal);
		}

	}

}
