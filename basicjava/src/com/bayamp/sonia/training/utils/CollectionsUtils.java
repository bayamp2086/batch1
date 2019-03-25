package com.bayamp.sonia.training.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.bayamp.sonia.training.objects.Laptop;

public class CollectionsUtils {

	public static Map<String, String> countryCapitalMap = new HashMap<String, String>();
	public static Map<String, Laptop> laptopMap = new HashMap<String, Laptop>();
	public static Set<String> treeSet = new TreeSet<String>();
	public static Set<Laptop> lapToptreeSet = new TreeSet<Laptop>();

	public static Set<String> hashSet = new HashSet<String>();

	static {

		countryCapitalMap.put("India", "Delhi");
		countryCapitalMap.put("USA", "Washington");
		countryCapitalMap.put("China", "Beijing");
		countryCapitalMap.put("France", "Paris");
		countryCapitalMap.put("India", "Delhi");

		String modelNo = new String("6s");
		String ModelColor = new String("Grey");
		;
		int modelMemory = 64;
		double modelPrice = 600;
		Laptop ltp = new Laptop(new String("HP"), modelNo, ModelColor, modelMemory, modelPrice);
		modelNo = new String("10x");
		ModelColor = new String("White");
		;
		modelMemory = 200;
		modelPrice = 100;
		Laptop ltp1 = new Laptop(new String("Mac"), modelNo, ModelColor, modelMemory, modelPrice);
		modelNo = new String("6s");
		ModelColor = new String("Grey");
		;
		modelMemory = 64;
		modelPrice = 1200;
		Laptop ltp2 = new Laptop(new String("IBM"), modelNo, ModelColor, modelMemory, modelPrice);

		laptopMap.put("HP", ltp);
		laptopMap.put("Mac", ltp1);
		laptopMap.put("IBM", ltp2);
		laptopMap.put(null, null);
		laptopMap.put(null, null);
		laptopMap.put(null, ltp);

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

		String value = countryCapitalMap.get(country);

		Set<String> keysOfcountryCapitalMap = countryCapitalMap.keySet();

		// Set=countryCapitalMap.entrySet();

		return value;

	}

	public static Map<String, Integer> getFruitArrayCountMap(String[] fruitArray) {

		Map<String, Integer> fruitMap = new HashMap<String, Integer>();

		for (String fruit : fruitArray) {

			if (fruitMap.containsKey(fruit)) {

				int fruitCount = fruitMap.get(fruit);
				fruitMap.put(fruit, fruitCount + 1);

			} else {
				fruitMap.put(fruit, 1);
			}

		}

		return fruitMap;

	}

	public static Map<String, Integer> getNumberArrayCountMap(int[] numbArray) {

		Map<String, Integer> numberMap = new HashMap<String, Integer>();

		for (int numb : numbArray) {

			if (numberMap.containsKey(String.valueOf(numb))) {

				int numbCount = numberMap.get(String.valueOf(numb));
				numberMap.put(String.valueOf(numb), numbCount + 1);

			} else {
				numberMap.put(String.valueOf(numb), 1);
			}

		}

		return numberMap;

	}

	public static String getCharCountString(String inputStr) {

		Map<String, Integer> charMap = new HashMap<String, Integer>();

		String outPutStr = new String();

		char[] charArray = inputStr.toCharArray();

		for (char charS : charArray) {

			if (charMap.containsKey(String.valueOf(charS))) {
				int charCount = charMap.get(String.valueOf(charS));
				charMap.put(String.valueOf(charS), charCount + 1);

			} else {
				charMap.put(String.valueOf(charS), 1);

			}
		}

		// display String

		Set<String> keySet = charMap.keySet();
		for (String key : keySet) {
			int keyVal = charMap.get(key);
			outPutStr = outPutStr + key + keyVal;
		}
		return outPutStr;

	}

	public static Map<String, Integer> getSortedHashMap(Map<String, Integer> fruitMap) {
		
		Set<String> fruitKeySet=fruitMap.keySet();
		
		List<Integer> fruitCountList=new LinkedList<Integer>();
		
		for(String fruit:fruitKeySet) {
			
			int fruitCount=fruitMap.get(fruit);
			fruitCountList.add(fruitCount);
		}
		
		Collections.sort(fruitCountList,Collections.reverseOrder());
		
		System.out.println(fruitCountList);
		
		Map<String,Integer> sortedFruitMap=new LinkedHashMap<String,Integer>();
		
		for(int fruitCount: fruitCountList) {
			
			for(String fruit:fruitKeySet) {
				
				int fruitCountfrmMap=fruitMap.get(fruit);
				if(fruitCountfrmMap==fruitCount) {
					sortedFruitMap.put(fruit, fruitCount);
				}
			}
		}
		
		return sortedFruitMap;
	}

	public static String getCharCountStringbySequenceList(String inputStr) {
		Map<String, Integer> charMap = new HashMap<String, Integer>();

		String outPutStr = new String();

		char[] charArray = inputStr.toCharArray();
		
		List<String> listTemp=new ArrayList<String>();


		for (char charS : charArray) {

			if (listTemp.contains(String.valueOf(charS))) {
				
				listTemp.add(String.valueOf(charS));

			} 
			
			else {
				
				if(listTemp.size()>0) {
				outPutStr=outPutStr+listTemp.get(0)+listTemp.size();
				}
				listTemp.clear();
				listTemp.add(String.valueOf(charS));

			}
		
		}
		
		if(listTemp.size()>0) {
			outPutStr=outPutStr+listTemp.get(0)+listTemp.size();
			}

		
		return outPutStr;

	}
	
	
	public static String getCharCountStringbySequence(String inputStr) {
		
		String outPutStr = new String();

		char[] charArray = inputStr.toCharArray();
		int counter=1;
		String first=String.valueOf(charArray[0]);
		for (int i=1;i<charArray.length;i++) {
			
			String second=String.valueOf(charArray[i]);
			if(first.equals(second)) {
				
				counter++;
				//outPutStr=char1+counter;
				
			}else if(!first.equals(second)) {
				
				
				outPutStr=outPutStr+first+counter;
				counter=1;
			}
			
			first=second;
			
		}
		outPutStr=outPutStr+first+counter;
		return outPutStr;

	}



}
