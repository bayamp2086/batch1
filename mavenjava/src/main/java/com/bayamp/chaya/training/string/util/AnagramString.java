package com.bayamp.chaya.training.string.util;

public class AnagramString {

	public static void main(String[] args) {
		boolean result = isAnagram("ijj", "jij");
		System.out.println("Is it anagaram: " + result);
		boolean result1 = isAnagram("ijk", "jij");
		System.out.println("Is it anagaram: " + result1);

	}

	public static boolean isAnagram(String word, String anagram) {
		if (word.length() != anagram.length()) {
			return false;
		}
		char[] chars = word.toCharArray();
		for (char c : chars) {
			int index = anagram.indexOf(c);
			if (index != -1) {
				anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
			} else {
				return false;
			}
		}

		return anagram.isEmpty();
	}

	public static boolean isAnagramStringBuilder(String word, String anagram) {
		StringBuilder sbAnagram = new StringBuilder(anagram);
		char[] wordarray = word.toCharArray();
		for (char c : wordarray) {
			int index = sbAnagram.indexOf("" + c);
			if (index != -1) {
				sbAnagram.deleteCharAt(c);
			}
			else
				return false;

		}
		if(sbAnagram.length()==0){
			return true;
		}
		else
			return false;
	}
}
