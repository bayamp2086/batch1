package com.bayamp.chaya.training.string.util;

public class DuplicateCharacter {

	public static void main(String[] args) {
		duplicateCharacter("string");
	}

	public static void duplicateCharacter(String word) {
		char[] wordArray = word.toCharArray();
		if (wordArray.length > 0) {
			for (int i = 0; i < wordArray.length; i++) {
				for (int j = i + 1; j < wordArray.length; j++) {
					if (wordArray[i] == wordArray[j]) {
						System.out.println(wordArray[i]);
					}
				}
			}
			System.out.println("Thers are no duplicates");

		} else
			System.out.println("Its an empty string");

	}
}
