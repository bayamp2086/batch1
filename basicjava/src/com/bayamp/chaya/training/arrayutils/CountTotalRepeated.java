package com.bayamp.chaya.training.arrayutils;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountTotalRepeated {
	private static void stringTotalReaptedCount(String[] stringCount) {
		int count = 0;
		Map<String, Integer> countString = new LinkedHashMap<String, Integer>();
		for (int i = 0; i < stringCount.length; i++) {
			countString.put(stringCount[i], count);
			for (int j = 0; j < stringCount.length; j++) {
				if (stringCount[i] == stringCount[j]) {
					count++;
					countString.replace(stringCount[i], count);
				}
			}
			count = 0;
		}
		for (Map.Entry<String, Integer> map : countString.entrySet()) {
			System.out.println(map.getKey() + ":" + map.getValue());
		}
	}

	private static void integerRepeatedCount(int[] integerCount) {
		int count = 0;
		Map<Integer, Integer> countInteger = new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < integerCount.length; i++) {
			countInteger.put(integerCount[i], count);
			for (int j = 0; j < integerCount.length; j++) {
				if (integerCount[i] == integerCount[j]) {
					count++;
					countInteger.replace(integerCount[i], count);
				}
			}
			count = 0;
		}
		for (Map.Entry<Integer, Integer> entry : countInteger.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
	private static void charCountRepeat(String s){
		char[] charCount =s.toCharArray();
		int count=0;
		Map<Character,Integer> charMap = new LinkedHashMap<Character,Integer>();
		for (int i = 0; i < charCount.length; i++) {
			charMap.put(charCount[i], count);
			for (int j = 0; j < charCount.length; j++) {
				if(charCount[i]==charCount[j]){
					count++;
					charMap.replace(charCount[i], count);
				}
				
			}
			count=0;
		}
		for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
	}

	public static void main(String[] args) {
		String[] fruits = { "apple", "banana", "apple", "grapes", "banana", "banana", "Apple" };
		stringTotalReaptedCount(fruits);

		int[] numbers = { 5, 5, 6, 2, 7, 2, 8, 8 };
		integerRepeatedCount(numbers);
		
		String characters = "aaabbcdddddd";
		charCountRepeat(characters);
	}
}
