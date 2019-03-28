package com.bayamp.akshatha.training.coding.programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountOfOccurence {

	public static void main(String[] args) {
		String s = "aaabbnaaiy";

		Map<Character, Integer> countMap = countDictionary(s);
		String result1 = "";
		// Append unique characters along with count
		for (Character c : countMap.keySet()) {
			result1 = result1 + c + countMap.get(c);
		}
		System.out.println("Total Count of each characters : " + result1);

		String result2 = countChar(s);
		System.out.println("Total Count of preceeding character : " + result2);
	}

	private static String countChar(String s) {

		if (s == null | s == "") {
			return "0";
		}
		char[] charArray = s.toCharArray();
		StringBuffer result = new StringBuffer();

		result.append(charArray[0]);
		int count = 1;

		for (int j = 0; j < charArray.length - 1; j++) {

			if (charArray[j] != charArray[j + 1]) {
				result.append(count);
				result.append(charArray[j + 1]);
				count = 1;
			} else {

				count++;

			}
		}
		result.append(count);

		return result.toString();
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
