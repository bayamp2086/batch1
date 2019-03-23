package com.bayamp.akshatha.training.coding.programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountOfOccurence {

	public static void main(String[] args) {
		String s = "aaabbnaa";

		Map<Character, Integer> countMap = countDictionary(s);
		String result = "";
		// Append unique characters along with count
		for (Character c : countMap.keySet()) {
			result = result + c + countMap.get(c);
		}
		System.out.println(result);

		// count of occurences of all characters in sorted array without map
		int[] result1 = countSortedArray(s);

		System.out.println(Arrays.toString(result1));
	}

	private static int[] countSortedArray(String s) {
		String sorted = BubbleSort.bubbleSortString(s);

		String str[] = sorted.split("");
		int i = 0;
		int[] count = new int[str.length];

		count[0] = 1;

		for (int j = 0; j < str.length - 1; j++) {

			if (!str[j].equalsIgnoreCase(str[j + 1])) {

				i++;
				count[i] = 1;
			} else {
				// System.out.println(count[i]);
				count[i] = count[i] + 1;

			}
		}

		return Arrays.copyOf(count, i + 1);
	}

	private static Map<Character, Integer> countDictionary(String s) {
		Map<Character, Integer> countMap = new LinkedHashMap<Character, Integer>();
		char[] charArray = s.toCharArray();

		for (char c : charArray) {
			if (!countMap.containsKey(c)) {
				countMap.put(c, 1);
			} else {
				int count = countMap.get(c);
				countMap.put(c, count + 1);
			}
		}
		return countMap;
	}

}
